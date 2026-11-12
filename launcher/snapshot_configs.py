import datetime
import hashlib
import json
import pathlib
import subprocess

ROOT = pathlib.Path(__file__).resolve().parent.parent
REPO = ROOT / "work/RiseOnlineConfigs"
DEST = ROOT / "launcher/resources/cas-configs"


def git(*args):
    return subprocess.check_output(["git", "-C", str(REPO), *args])


def main():
    revision = git("rev-parse", "HEAD").decode().strip()
    date = git("show", "-s", "--format=%cI", "HEAD").decode().strip()
    filenames = git("ls-tree", "--name-only", "HEAD").decode().splitlines()
    index = json.loads(git("show", "HEAD:index.json"))
    featured = {str(item["name"]).casefold() + ".json": item for item in index}
    configs = []
    DEST.mkdir(parents=True, exist_ok=True)
    for name in filenames:
        if not name.endswith(".json") or name.casefold() in ("index.json", "latest.json"):
            continue
        content = git("show", "HEAD:" + name)
        document = json.loads(content)
        if not isinstance(document, dict) or not any(key.startswith("module.") for key in document):
            continue
        info = featured.get(name.casefold(), {})
        blob = hashlib.sha1(b"blob " + str(len(content)).encode() + b"\0" + content).hexdigest()
        record = {"name": info.get("name", name[:-5]), "file": name, "sha": blob, "ip": info.get("ip", ""), "updated": info.get("last updated", ""), "featured": bool(info)}
        configs.append(record)
        (DEST / name).write_bytes(content)
    catalog = {"repository": "risellc/RiseOnlineConfigs", "revision": revision, "committed_at": date, "fetched_at": datetime.datetime.now(datetime.timezone.utc).isoformat(), "configs": configs}
    (DEST / "catalog.json").write_text(json.dumps(catalog, ensure_ascii=False, indent=2), encoding="utf-8")
    print(f"Bundled CAS snapshot: {revision}, {len(configs)} configs, {sum(item['featured'] for item in configs)} featured", flush=True)


if __name__ == "__main__":
    main()
