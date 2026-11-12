import hashlib
import json
from pathlib import Path
import zipfile


ROOT = Path(__file__).resolve().parent.parent
EXCLUDED = {"build", "work", "__pycache__", ".git", ".gradle", "node_modules", ".idea"}
TOOLS = ["build_source_reference.py", "package_latest_sources.py", "classfile.py", "normalize_classes.py",
         "ExtractArchive.java", "NativeBridge.java", "native_bridge.c", "RemapClient.java", "CleanBytecode.java",
         "VerifyBytecode.java", "cfr-0.152.jar"]


def sha256(path):
    with path.open("rb") as stream:
        return hashlib.file_digest(stream, "sha256").hexdigest()


def main():
    release = dict(line.split("=", 1) for line in (ROOT / "launcher/resources/client-release.properties").read_text().splitlines() if "=" in line)
    version = release["version"]
    base = ROOT / "work" / ("source-" + version)
    summary = json.loads((base / "reference/source-summary.json").read_text(encoding="utf-8"))
    if summary["clientVersion"] != version or sha256(ROOT / "artifacts/client-original.jar") != release["client.sha256"]:
        raise RuntimeError("The source version differs from the current release.")
    with zipfile.ZipFile(base / "client-core.jar") as core, zipfile.ZipFile(ROOT / "artifacts/client-restored.jar") as restored:
        for name in core.namelist():
            if core.read(name) != restored.read(name):
                raise RuntimeError("The source input differs from the current client: " + name)

    files = {}
    generated = {}

    def tree(folder, prefix):
        for path in sorted(folder.rglob("*")):
            if not path.is_file() or path.is_symlink() or any(part in EXCLUDED for part in path.relative_to(folder).parts):
                continue
            files[prefix + path.relative_to(folder).as_posix()] = path

    tree(base / "raw", "sources/raw/")
    tree(base / "deobfuscated", "sources/deobfuscated/")
    tree(ROOT / "work/launcher-2.6-source", "sources/launcher/")
    tree(base / "reference", "reference/")
    for folder in ["launcher/src", "launcher/native", "launcher/tests", "launcher/resources"]:
        tree(ROOT / folder, folder + "/")
    for name in ["build.ps1", "build-native.ps1", "build-portable.ps1", "pack_portable.py", "snapshot_configs.py", "launcher.mf", "PORTABLE.txt", "temurin.json"]:
        files["launcher/" + name] = ROOT / "launcher" / name
    for name in ["standalone-update-2.6.json", "launcher-motion.json", "portable-build.json"]:
        record = json.loads((ROOT / "reference" / name).read_text(encoding="utf-8"))
        if name == "portable-build.json":
            record["executable"] = "dist/RiseLauncher.exe"
        generated["reference/" + name] = json.dumps(record, indent=2).encode("utf-8")
    for name in TOOLS:
        files["tools/" + name] = ROOT / "tools" / name
    for path in (ROOT / "tools").glob("asm*-9.9.jar"):
        files["tools/" + path.name] = path
    for name in ["Launch-Rise.cmd", "Inter_18pt-Regular.ttf"]:
        files[name] = ROOT / name
    generated["launcher/settings.properties.example"] = b"username=User\nmemory=2048\njava=bundled\nassets=bundled\nrawMouse=true\nanimations=true\n"

    modules = json.loads((base / "reference/modules.json").read_text(encoding="utf-8"))
    required = {
        "sources/deobfuscated/rise/Client.java", "sources/deobfuscated/rise/module/Module.java",
        "sources/deobfuscated/rise/module/Mode.java", "sources/deobfuscated/rise/value/Value.java",
        "sources/deobfuscated/rise/ui/clickgui/ModernClickGui.java",
        "sources/deobfuscated/rise/ui/clickgui/DropdownClickGui.java",
        "launcher/src/rise/local/ui/Motion.java", "launcher/src/rise/local/ui/MotionPanel.java",
        "launcher/src/rise/local/ui/MotionLabel.java", "launcher/src/rise/local/ui/LauncherTheme.java",
        "launcher/src/RiseLocalLauncher.java", "launcher/src/OfflineBootstrap.java",
        "launcher/src/BuildOfflinePatch.java", "launcher/resources/client-release.properties",
        "launcher/resources/cas-configs/hypixel1.8.json", "reference/modules.md",
    }
    for module in modules:
        required.add("sources/deobfuscated/" + module["class"] + ".java")
        required.update("sources/deobfuscated/" + mode["class"] + ".java" for mode in module["modes"])
    missing = required - files.keys()
    if missing:
        raise RuntimeError("Required latest sources are missing: " + ", ".join(sorted(missing)))

    diagnostics = []
    for path in (base / "deobfuscated").rglob("*.java"):
        text = path.read_text(encoding="utf-8", errors="replace")
        warnings = [message for message in ["Decompilation failed", "Could not decompile", "Unable to fully structure code", "Exception performing whole class analysis"] if message in text]
        if warnings:
            diagnostics.append({"file": "sources/deobfuscated/" + path.relative_to(base / "deobfuscated").as_posix(), "warnings": warnings})
    generated["reference/source-diagnostics.json"] = json.dumps(diagnostics, indent=2).encode("utf-8")
    origin = {"clientVersion": version, "sourceLauncher": release["launcher"], "clientOriginalSha256": release["client.sha256"],
              "clientRestoredSha256": sha256(ROOT / "artifacts/client-restored.jar"), "coreSha256": sha256(base / "client-core.jar"),
              "classes": summary["classes"], "rawSourceFiles": sum(1 for _ in (base / "raw").rglob("*.java")),
              "renamedSourceFiles": sum(1 for _ in (base / "deobfuscated").rglob("*.java")),
              "moduleClasses": summary["moduleClasses"], "semanticClassNames": summary["semanticClassNames"],
              "decompiler": "CFR 0.152", "diagnosticFiles": len(diagnostics), "nativeImplementationsRestored": False}
    generated["reference/source-version.json"] = json.dumps(origin, indent=2).encode("utf-8")
    readme = f"""# Rise {version} ソースコード

Rise Launcher 2.6で取得したクライアント本体から、最新版の復元ソースを生成しています。
ランチャーはPlayer nameの初期値User、UIアニメーション、非同期Config読み込み、ログ更新の改善を含む最新版です。
Ornithe版・Arcadium対応用のコードは含めていません。

## 読み始める場所

- `reference/modules.md`: モジュール・モード一覧とソースへのリンク。
- `sources/deobfuscated/rise/module/Module.java`: モジュールの有効化・イベント・設定。
- `sources/deobfuscated/rise/module/ModuleManager.java`: 登録処理。
- `sources/deobfuscated/rise/ui/clickgui/ModernClickGui.java`: Modern GUI。
- `sources/deobfuscated/rise/ui/clickgui/DropdownClickGui.java`: Dropdown GUI。
- `sources/deobfuscated/rise/value/`: 設定値の基盤。
- `sources/raw/`: 元のクラス名による{version}の逆コンパイル結果。
- `sources/launcher/`: 提供された2.6ランチャーの逆コンパイル結果。
- `launcher/src/`: 現在のランチャーと起動・Config連携処理。
- `launcher/src/rise/local/ui/`: アニメーションとUI共通処理。
- `launcher/native/`: Raw Mouse InputのC++実装。
- `launcher/resources/`: クライアントの版情報と同梱CAS Config。

本体は{summary['classes']}クラスを復元し、{summary['moduleClasses']}個のモジュールクラスと{summary['modes']}個のモードを索引化しています。
実行時に登録されるモジュール数は検証時146個です。索引には未登録のクラスも含まれます。
クラス名を{summary['semanticClassNames']}個整理しています。モード名が確定していない箇所は元の識別子を残しています。
対応表は `reference/class-mappings.tsv` と `reference/member-mappings.tsv` にあります。
入力のハッシュと版情報は `reference/source-version.json` を参照してください。

## 復元コードについて

本体は逆コンパイルした参照用コードです。そのままjavacで本体全体を再ビルドできる元の開発プロジェクトではありません。
暗号化文字列、複雑な制御フロー、JNIのnative宣言が残っています。ネイティブ実装全体をJavaへ復元したものではありません。
逆コンパイル時の診断は `reference/source-diagnostics.json` に記録しています。

## ランチャーのビルド

Windows x64、JDK 21以上、Visual Studio C++ Build Tools、Pythonが必要です。
このZIPにはゲーム実行用Jar、Javaランタイム、個人設定、アカウント、ワールド、ログ、作業キャッシュを含めていません。
次の入力を元の相対パスに別途配置してください。

- `artifacts/client-restored.jar`: {version}の復元済みJar。
- `artifacts/libraries.jar`: クライアントの依存ライブラリ。
- 元のランチャー用ネイティブライブラリとMinecraft 1.8アセット。

```powershell
New-Item -ItemType Directory -Force work/agent-classes
javac --release 17 -cp 'tools/asm-9.9.jar;tools/asm-tree-9.9.jar;tools/asm-analysis-9.9.jar' -d work/agent-classes tools/CleanBytecode.java
.\\launcher\\build.ps1
```

1ファイルEXEは `launcher/build-portable.ps1` で生成します。ランチャーは既存のユーザー設定を保持します。
初期設定の例は `launcher/settings.properties.example`、Configの初期適用は `launcher/src/rise/local/config/ConfigRuntime.java` です。
検証結果は `reference/standalone-update-2.6.json` と `reference/launcher-motion.json` にあります。
"""
    generated["README.md"] = readme.encode("utf-8")
    name = "Rise-Sources-" + version
    output = ROOT / "dist" / (name + ".zip")
    temporary = output.with_suffix(".building")
    manifest = {}
    with zipfile.ZipFile(temporary, "w", zipfile.ZIP_DEFLATED, compresslevel=6) as archive:
        for index, (relative, path) in enumerate(sorted(files.items()), 1):
            payload = path.read_bytes()
            archive.writestr(name + "/" + relative, payload)
            manifest[relative] = hashlib.sha256(payload).hexdigest()
            if index % 1000 == 0:
                print(f"Packaged {index}/{len(files)} source files", flush=True)
        for relative, payload in sorted(generated.items()):
            archive.writestr(name + "/" + relative, payload)
            manifest[relative] = hashlib.sha256(payload).hexdigest()
        archive.writestr(name + "/SOURCE-MANIFEST.json", json.dumps(manifest, indent=2))

    with zipfile.ZipFile(temporary) as archive:
        if archive.testzip():
            raise RuntimeError("ZIP integrity check failed.")
        names = {entry.removeprefix(name + "/") for entry in archive.namelist()}
        if names != set(manifest) | {"SOURCE-MANIFEST.json"} or required - names:
            raise RuntimeError("The ZIP contents do not match the selection.")
        forbidden = {"settings.properties", "accounts.json", "auth.dat", "user_data.db", ".env"}
        if any(Path(entry).name.lower() in forbidden or "ornithe" in entry.lower() or "arcadium" in entry.lower() for entry in names):
            raise RuntimeError("The ZIP contains an excluded file.")
        for relative in ["launcher/src/RiseLocalLauncher.java", "launcher/src/rise/local/ui/Motion.java", "launcher/resources/client-release.properties"]:
            if archive.read(name + "/" + relative) != (ROOT / relative).read_bytes():
                raise RuntimeError("The packaged launcher source is stale.")
    temporary.replace(output)
    print(json.dumps({"file": str(output), "files": len(manifest) + 1, "bytes": output.stat().st_size,
                      "MiB": round(output.stat().st_size / 1048576, 2), "sha256": sha256(output),
                      "version": version, "sourceFiles": origin["renamedSourceFiles"]}, ensure_ascii=False), flush=True)


if __name__ == "__main__":
    main()
