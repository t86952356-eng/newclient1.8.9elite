import json
import os
from pathlib import Path
import subprocess
import sys

ROOT = Path(__file__).resolve().parents[2]


def main():
    name = sys.argv[1] if len(sys.argv) > 1 else "smoke"
    if not name.replace("-", "").isalnum():
        raise ValueError("Use a simple isolated profile name.")
    task = ROOT / "work/launcher-2.6-update" / name
    game = task / "game"
    game.mkdir(parents=True, exist_ok=True)
    (game / "options.txt").write_text("fullscreen:false\nenableVsync:false\nmaxFps:60\nrenderDistance:4\npauseOnLostFocus:false\n")
    (game / "standalone-smoke.json").write_text('{"complete":false}')
    java = next((ROOT / "work/temurin21").glob("*/bin/java.exe"))
    native = ROOT / "runtime/natives"
    assets = Path(os.environ["APPDATA"]) / ".minecraft/assets"
    launcher = Path(sys.argv[2]).resolve() if len(sys.argv) > 2 else ROOT
    classpath = ";".join(str(path) for path in [launcher / "build/offline-patches.jar", ROOT / "artifacts/client-restored.jar", ROOT / "build/rise-bootstrap-6.9.9.jar", ROOT / "artifacts/libraries.jar"])
    command = [str(java), "-Xmx2G", "--enable-native-access=ALL-UNNAMED", "-Djava.library.path=" + str(native),
               "-Drise.native.directory=" + str(native), "-Drise.offline.username=RiseTest", "-Dsmoke.game=" + str(game),
               "-Duser.home=" + str(task / "home"), "-cp", classpath, "StandaloneClientSmoke", "--gameDir", str(game),
               "--assetsDir", str(assets), "--assetIndex", "1.8", "--width", "1100", "--height", "700"]
    environment = dict(os.environ)
    environment["PATH"] = str(native) + ";" + str(java.parent) + ";" + environment.get("PATH", "")
    for key, suffix in [("APPDATA", "appdata"), ("LOCALAPPDATA", "localappdata"), ("TEMP", "tmp"), ("TMP", "tmp")]:
        path = task / suffix
        path.mkdir(parents=True, exist_ok=True)
        environment[key] = str(path)
    with (task / "output.log").open("wb") as log:
        process = subprocess.Popen(command, cwd=game, env=environment, stdout=log, stderr=subprocess.STDOUT)
        print("Standalone smoke PID", process.pid, flush=True)
        try:
            code = process.wait(150)
        except subprocess.TimeoutExpired:
            process.terminate()
            code = process.wait(15)
        print("Exit", code, flush=True)
    report = json.loads((game / "standalone-smoke.json").read_text())
    print(json.dumps(report, indent=2), flush=True)
    if code != 0 or not report.get("complete"):
        raise SystemExit(1)


if __name__ == "__main__":
    main()
