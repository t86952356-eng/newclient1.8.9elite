#!/usr/bin/env python3
"""
Generate the standalone Minecraft client-version manifest for Rise 6.9.9.

The manifest mirrors the official Mojang 1.8.9 version JSON (same libraries,
same minecraftArguments, same assets index) but ships Rise's bootstrap entry
point (OfflineBootstrap) so any standards-compliant launcher (FoldCraft
Launcher, PojavLauncher, Zalith, vanilla-style desktop launchers) can treat
"Rise-6.9.9" as a regular, self-contained client version of Minecraft 1.8.9.

Usage:
    python3 scripts/generate_version_json.py [output.json]

Reads the official manifest from piston-meta.mojang.com (network required).
"""
import json
import sys
import urllib.request

VANILLA_1_8_9_URL = (
    "https://piston-meta.mojang.com/v1/packages/"
    "d546f1707a3f2b7d034eece5ea2e311eda875787/1.8.9.json"
)
VERSION_ID = "Rise-6.9.9"
MAIN_CLASS = "OfflineBootstrap"
RELEASE_TIME = "2026-11-12T12:00:00+00:00"

# Via stack (GPL, official ViaVersion maven repository) — required at runtime by
# the client's protocol-translation layer (de.florianmichael.vialoadingbase is
# compiled INTO the client; these three are the external API jars).
VIA_LIBRARIES = [
    ("com.viaversion:viaversion", "5.12.2"),
    ("com.viaversion:viabackwards", "5.12.2"),
    ("com.viaversion:viarewind", "4.2.0"),
]
VIA_REPO = "https://repo.viaversion.com"


def via_library_entries():
    """Maven library entries for the Via stack, with sha1/size resolved from the
    official repository (cached under build/libs so repeat builds are offline)."""
    import hashlib
    import os

    entries = []
    os.makedirs("build/libs", exist_ok=True)
    for coords, version in VIA_LIBRARIES:
        group, artifact = coords.split(":")
        path = f"{group.replace('.', '/')}/{artifact}/{version}/{artifact}-{version}.jar"
        url = f"{VIA_REPO}/{path}"
        cache = os.path.join("build/libs", f"{artifact}-{version}.jar")
        if os.path.exists(cache) and os.path.getsize(cache) > 0:
            data = open(cache, "rb").read()
        else:
            req = urllib.request.Request(url, headers={"User-Agent": "rise-version-builder"})
            with urllib.request.urlopen(req, timeout=180) as response:
                data = response.read()
            open(cache, "wb").write(data)
        entries.append({
            "name": coords + ":" + version,
            "downloads": {
                "artifact": {
                    "path": path,
                    "url": url,
                    "sha1": hashlib.sha1(data).hexdigest(),
                    "size": len(data),
                }
            },
        })
    return entries


def fetch(url: str):
    req = urllib.request.Request(url, headers={"User-Agent": "rise-version-builder"})
    with urllib.request.urlopen(req, timeout=30) as response:
        return json.loads(response.read().decode("utf-8"))


def load_vanilla() -> dict:
    """Prefer the vendored copy of the official manifest; fetch only as fallback."""
    vendored = "scripts/vendor/1.8.9-official.json"
    try:
        with open(vendored, encoding="utf-8") as handle:
            return json.load(handle)
    except FileNotFoundError:
        return fetch(VANILLA_1_8_9_URL)


def main() -> int:
    output = sys.argv[1] if len(sys.argv) > 1 else "versions/Rise-6.9.9/Rise-6.9.9.json"
    vanilla = load_vanilla()

    manifest = {
        "id": VERSION_ID,
        "type": "release",
        "time": RELEASE_TIME,
        "releaseTime": RELEASE_TIME,
        "assets": vanilla.get("assets", "1.8"),
        "assetIndex": vanilla.get("assetIndex"),
        "mainClass": MAIN_CLASS,
        "minimumLauncherVersion": vanilla.get("minimumLauncherVersion", 21),
        # 1.8.9 uses the legacy single-string argument format. Launchers on
        # Android (FCL/Pojav/Zalith) expand these tokens themselves.
        "minecraftArguments": vanilla["minecraftArguments"],
        # Same libraries as vanilla 1.8.9 (LWJGL 2, guava 17, gson, netty...)
        # plus the Via stack the client's protocol layer needs at runtime.
        # Android launchers substitute their own LWJGL/OpenGL compatibility
        # layer for the LWJGL entries automatically.
        "libraries": vanilla["libraries"] + via_library_entries(),
        # Rise-specific metadata (informational; launchers ignore it).
        "rise": {
            "clientVersion": "6.9.9",
            "baseMinecraft": "1.8.9",
            "entry": MAIN_CLASS,
            "renderer": "OpenGL 2.1 (Gl4ES compatible on Android)",
            "notes": (
                "Standalone client version built from the Rise 6.9.9 restored "
                "client JAR. Blur features removed and vanilla main menu "
                "restored. Windows-only components stripped."
            ),
        },
    }

    with open(output, "w", encoding="utf-8") as handle:
        json.dump(manifest, handle, indent=2, sort_keys=False)
        handle.write("\n")

    print(f"wrote {output}")
    print(f"  id               = {manifest['id']}")
    print(f"  mainClass        = {manifest['mainClass']}")
    print(f"  assets           = {manifest['assets']}")
    print(f"  libraries        = {len(manifest['libraries'])} entries")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
