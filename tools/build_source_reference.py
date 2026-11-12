import argparse
from collections import Counter
import json
from pathlib import Path
import re
import zipfile

from classfile import annotations, parse_class


def identifier(value):
    name = "".join(part[0].upper() + part[1:] for part in re.findall(r"[A-Za-z0-9]+", value))
    return name if name and not name[0].isdigit() else "Module" + name


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--core", type=Path, required=True)
    parser.add_argument("--client", type=Path, required=True)
    parser.add_argument("--raw", type=Path, required=True)
    parser.add_argument("--output", type=Path, required=True)
    parser.add_argument("--version", required=True)
    args = parser.parse_args()
    args.output.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(args.core) as archive:
        classes = {entry[:-6]: parse_class(archive.read(entry)) for entry in archive.namelist() if entry.endswith(".class")}
    with zipfile.ZipFile(args.client) as archive:
        language = archive.read("assets/minecraft/rise/text/en_US.properties").decode("utf-8", errors="replace")
    translations = dict(line.split("=", 1) for line in language.splitlines() if "=" in line and not line.startswith("#"))
    (args.output / "en_US.properties").write_text(language, encoding="utf-8")
    mapping = {
        "hackclient/rise/a": "rise/Client", "hackclient/rise/gi": "rise/module/Module",
        "hackclient/rise/gl": "rise/module/ModuleInfo", "hackclient/rise/gj": "rise/module/Category",
        "hackclient/rise/dk": "rise/event/Listener", "hackclient/rise/dm": "rise/event/EventLink",
        "net/minecraft/client/d": "net/minecraft/client/Minecraft",
        "net/minecraft/client/gui/bp": "net/minecraft/client/gui/GuiScreen",
        "net/minecraft/util/cv": "net/minecraft/util/Timer", "net/minecraft/util/cb": "net/minecraft/util/MouseHelper",
    }
    core = classes["hackclient/rise/a"]
    for method, target in [("g", "rise/module/ModuleManager"), ("e", "rise/event/EventBus"),
                           ("v", "rise/ui/clickgui/ModernClickGui"), ("z", "rise/ui/clickgui/DropdownClickGui"),
                           ("p", "rise/config/ConfigManager"), ("d", "rise/util/Language")]:
        match = next(item for item in core["methods"] if item["name"] == method and item["descriptor"].startswith("()L"))
        mapping[match["descriptor"][3:-1]] = target

    def anchor(owner, target, constructor):
        metadata = classes[owner]
        if not any(method["name"] == "<init>" and constructor in method["descriptor"] for method in metadata["methods"]):
            raise RuntimeError("Source anchor does not match: " + owner)
        mapping[owner] = target

    anchor("hackclient/rise/akg", "rise/module/Mode", "(Ljava/lang/String;Ljava/lang/Object;)V")
    anchor("hackclient/rise/akh", "rise/value/Value", "(Ljava/lang/String;Lhackclient/rise/gi;Ljava/lang/Object;)V")
    anchor("hackclient/rise/aki", "rise/value/BooleanValue", "Ljava/lang/Boolean;")
    anchor("hackclient/rise/akp", "rise/value/ModeValue", "(Ljava/lang/String;Lhackclient/rise/gi;)V")
    anchor("hackclient/rise/akq", "rise/value/NumberValue", "Ljava/lang/Number;")
    anchor("hackclient/rise/abe", "rise/ui/clickgui/dropdown/CategoryPanel", "Lhackclient/rise/gj;")
    anchor("hackclient/rise/abg", "rise/ui/clickgui/ModuleComponent", "(Lhackclient/rise/gi;)V")
    anchor("hackclient/rise/abo", "rise/ui/clickgui/value/ValueComponent", "(Lhackclient/rise/akh;)V")
    anchor("hackclient/rise/aka", "rise/util/math/Vector2d", "(DD)V")
    anchor("hackclient/rise/akb", "rise/util/math/Vector2f", "(FF)V")
    instance_access = next(owner for owner, metadata in classes.items() if metadata["access"] & 0x200
                           and any(field["descriptor"] == "Lnet/minecraft/client/d;" for field in metadata["fields"]))
    mapping[instance_access] = "rise/util/InstanceAccess"

    modules = []
    for owner, metadata in classes.items():
        info = next((item["values"] for item in annotations(metadata) if item["type"] == "Lhackclient/rise/gl;"), None)
        if info is None:
            continue
        aliases = info.get("aliases", [])
        name = translations.get(aliases[0], aliases[0]) if aliases else owner.rsplit("/", 1)[-1]
        category = info.get("category", {}).get("value", "UNKNOWN")
        target = "rise/module/impl/" + category.lower() + "/" + identifier(name)
        if target in mapping.values():
            target += "_" + owner.rsplit("/", 1)[-1]
        mapping[owner] = target
        modes = []
        source = args.raw / (owner + ".java")
        text = source.read_text(encoding="utf-8", errors="replace") if source.exists() else ""
        for child, child_meta in classes.items():
            if child_meta["super"] != "hackclient/rise/akg" or not any("L" + owner + ";" in method["descriptor"] for method in child_meta["methods"]):
                continue
            label = re.search(r"new\s+" + re.escape(child.rsplit("/", 1)[-1]) + r'\("([^"\r\n]+)"', text)
            mode_name = label[1] if label else child.rsplit("/", 1)[-1]
            mode_target = target.rsplit("/", 1)[0] + "/" + identifier(name).lower() + "/" + identifier(mode_name) + "Mode"
            if mode_target in mapping.values():
                mode_target += "_" + child.rsplit("/", 1)[-1]
            mapping[child] = mode_target
            modes.append({"name": mode_name, "original": child, "class": mode_target,
                          "nativeMethods": sum(bool(method["access"] & 256) for method in child_meta["methods"])})
        modules.append({"name": name, "category": category, "original": owner, "class": target,
                        "description": translations.get(info.get("description", ""), info.get("description", "")),
                        "aliases": aliases, "nativeMethods": sum(bool(method["access"] & 256) for method in metadata["methods"]), "modes": modes})

    for owner, metadata in classes.items():
        if owner in mapping or not owner.startswith("hackclient/rise/"):
            continue
        referenced = [metadata["pool"][item[1]][1] for item in metadata["pool"] if item and item[0] == 7]
        wrappers = [name.rsplit("/", 1)[-1] for name in referenced if name.startswith("com/alan/clients/script/api/wrapper/impl/event/impl/Script")]
        if len(wrappers) == 1 and any(method["descriptor"].endswith("Lcom/alan/clients/script/api/wrapper/impl/event/ScriptEvent;") for method in metadata["methods"]):
            mapping[owner] = "rise/event/impl/" + wrappers[0].removeprefix("Script")

    members = []
    for owner, metadata in classes.items():
        renamed = {}
        for method in metadata["methods"]:
            attribute = dict(method["attributes"]).get("Code", b"")
            code = attribute[8:8 + int.from_bytes(attribute[4:8], "big")]
            if len(code) != 5 or code[:2] != b"\x2a\xb4" or not method["name"].startswith(("get", "is")):
                continue
            reference = metadata["pool"][int.from_bytes(code[2:4], "big")]
            if reference[0] != 9:
                continue
            pair = metadata["pool"][reference[2]]
            name = metadata["pool"][pair[1]][1]
            property_name = method["name"][3 if method["name"].startswith("get") else 2:]
            if property_name:
                renamed[name] = property_name[0].lower() + property_name[1:]
        for field in metadata["fields"]:
            if field["name"] in renamed and field["name"] != renamed[field["name"]]:
                members.append(["F", owner, field["name"], field["descriptor"], renamed[field["name"]]])
        if owner == "net/minecraft/client/d":
            for method in metadata["methods"]:
                if method["access"] & 8 and method["descriptor"] == "()Lnet/minecraft/client/d;":
                    members.append(["M", owner, method["name"], method["descriptor"], "getMinecraft"])

    modules.sort(key=lambda item: (item["category"], item["name"]))
    (args.output / "modules.json").write_text(json.dumps(modules, indent=2, ensure_ascii=False), encoding="utf-8")
    (args.output / "class-mappings.json").write_text(json.dumps(mapping, indent=2), encoding="utf-8")
    (args.output / "class-mappings.tsv").write_text("".join(source + "\t" + target + "\n" for source, target in sorted(mapping.items())), encoding="utf-8")
    (args.output / "member-mappings.tsv").write_text("".join("\t".join(row) + "\n" for row in members), encoding="utf-8")
    lines = ["# Rise " + args.version + " モジュール索引", "", "登録の有無を問わず、最新版のModuleInfo注釈から抽出しています。", ""]
    for category in sorted({item["category"] for item in modules}):
        lines.extend(["## " + category, ""])
        for module in (item for item in modules if item["category"] == category):
            lines.append("- [" + module["name"] + "](../sources/deobfuscated/" + module["class"] + ".java): " + module["description"].replace("\n", " "))
            for mode in module["modes"]:
                lines.append("  - [" + mode["name"] + "](../sources/deobfuscated/" + mode["class"] + ".java)")
        lines.append("")
    (args.output / "modules.md").write_text("\n".join(lines), encoding="utf-8")
    summary = {"clientVersion": args.version, "classes": len(classes), "moduleClasses": len(modules),
               "modes": sum(len(module["modes"]) for module in modules), "semanticClassNames": len(mapping),
               "nativeDeclarations": sum(bool(method["access"] & 256) for metadata in classes.values() for method in metadata["methods"]),
               "categories": dict(Counter(module["category"] for module in modules))}
    (args.output / "source-summary.json").write_text(json.dumps(summary, indent=2), encoding="utf-8")
    print(json.dumps(summary), flush=True)


if __name__ == "__main__":
    main()
