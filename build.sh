#!/usr/bin/env bash
#
# Rise 6.9.9 — cross-platform build orchestrator (Android-first client version)
#
# Replaces the original Windows-only launcher/build.ps1 pipeline. Runs on any
# POSIX shell (Linux / macOS / GitHub Actions ubuntu runner). Never invokes
# PowerShell, Visual Studio, or any Windows tooling.
#
# Stages
#   1. audit        — report environment and artifact availability
#   2. bootstrap    — compile the runtime layer (OfflineBootstrap, ConfigRuntime,
#                     RawMouseInput, NativeRuntime, BuildOfflinePatch, ...)
#                     into build/rise-bootstrap-6.9.9.jar      [always runs]
#   3. version-json — generate versions/Rise-6.9.9/Rise-6.9.9.json
#   4. client       — IF artifacts/client-restored.jar exists: patch it
#                     (offline stubs + vanilla-menu/blur-removal overlays),
#                     merge with the bootstrap layer and produce
#                     build/desktop/Rise-6.9.9.jar                [conditional]
#   5. verify       — sanity-check every produced artifact
#   6. package      — assemble dist/ release bundles
#
# The build FAILS LOUDLY (non-zero exit) instead of faking success. When
# artifacts/client-restored.jar is missing, stages that require it are skipped
# and the final packaging is marked INCOMPLETE in both the console output and
# the packaged README.
#
# Usage:
#   ./build.sh            # full pipeline (skips client stage without the JAR)
#   ./build.sh audit      # environment report only
#
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT"

BOOTSTRAP_JAR="build/rise-bootstrap-6.9.9.jar"
CLIENT_JAR_OUT="build/desktop/Rise-6.9.9.jar"
CLIENT_JAR_IN="artifacts/client-restored.jar"
LIBS_JAR="artifacts/libraries.jar"
JSON_OUT="versions/Rise-6.9.9/Rise-6.9.9.json"
DIST="dist"
ORG_JSON_VERSION="20240303"
ORG_JSON_URL="https://repo1.maven.org/maven2/org/json/json/${ORG_JSON_VERSION}/json-${ORG_JSON_VERSION}.jar"
ASM_CP="tools/asm-9.9.jar:tools/asm-tree-9.9.jar:tools/asm-analysis-9.9.jar:tools/asm-commons-9.9.jar:tools/asm-util-9.9.jar"
BOOTSTRAP_JAVA_RELEASE=17  # matches the original launcher build (javac --release 17);
                           # FCL/Pojav/Zalith run Minecraft through modern JVMs (17/21)
CLIENT_STATUS="MISSING"

log()  { printf '\033[1;36m[build]\033[0m %s\n' "$*"; }
warn() { printf '\033[1;33m[warn]\033[0m %s\n' "$*"; }
err()  { printf '\033[1;31m[fail]\033[0m %s\n' "$*" >&2; }

require_java() {
    if ! command -v javac >/dev/null 2>&1; then
        err "javac not found. Install a JDK (17+) to build."
        exit 1
    fi
    log "java: $(java -version 2>&1 | head -1)"
}

stage_audit() {
    log "== stage 1/6: audit =="
    require_java
    if [[ -f "$CLIENT_JAR_IN" ]]; then
        CLIENT_STATUS="PRESENT"
        log "client JAR: $CLIENT_JAR_IN ($(stat -c%s "$CLIENT_JAR_IN") bytes)"
    else
        warn "client JAR not found: $CLIENT_JAR_IN"
        warn "The client stage will be skipped; the release will be marked INCOMPLETE."
        warn "Provide the restored Rise 6.9.9 client JAR (sha256 a93ea829...db3e17) to enable it."
    fi
    [[ -f "$LIBS_JAR" ]] && log "libraries JAR: $LIBS_JAR (present)" \
                        || warn "libraries JAR not found: $LIBS_JAR (only needed by legacy smoke tests)"
}

stage_bootstrap() {
    log "== stage 2/6: bootstrap layer =="
    mkdir -p build/agent-classes build/bootstrap-classes build/orgjson-classes build/libs
    # org.json is vendored under third_party/ (public domain) — no download needed.
    log "compiling vendored org.json"
    find third_party/org.json/org/json -name '*.java' > build/orgjson-sources.txt
    javac --release "$BOOTSTRAP_JAVA_RELEASE" -nowarn -d build/orgjson-classes @build/orgjson-sources.txt
    rm -f "build/org-json.jar"
    jar cf build/org-json.jar -C build/orgjson-classes .
    # LWJGL 2 (compile-time only) from the official Mojang library host,
    # pinned to the exact artifact declared in the vanilla 1.8.9 manifest.
    local lwjgl_url="https://libraries.minecraft.net/org/lwjgl/lwjgl/lwjgl/2.9.4-nightly-20150209/lwjgl-2.9.4-nightly-20150209.jar"
    local lwjgl_sha="697517568c68e78ae0b4544145af031c81082dfe"
    if [[ ! -f build/libs/lwjgl-2.9.4-nightly.jar ]]; then
        log "downloading LWJGL 2.9.4-nightly (official Mojang library URL)"
        curl -fsSL --retry 3 -o build/libs/lwjgl-2.9.4-nightly.jar "$lwjgl_url"
        echo "$lwjgl_sha  build/libs/lwjgl-2.9.4-nightly.jar" | sha1sum -c - || {
            err "LWJGL sha1 mismatch"; exit 1; }
    fi
    # CleanBytecode helper must be compiled before BuildOfflinePatch (same as
    # the original launcher build).
    log "compiling CleanBytecode helper"
    javac --release "$BOOTSTRAP_JAVA_RELEASE" -nowarn -cp "$ASM_CP" \
          -d build/agent-classes tools/CleanBytecode.java
    log "compiling runtime layer (javac --release $BOOTSTRAP_JAVA_RELEASE)"
    find launcher/src -name '*.java' > build/bootstrap-sources.txt
    javac --release "$BOOTSTRAP_JAVA_RELEASE" -nowarn \
          -cp "$ASM_CP:build/org-json.jar:build/agent-classes:build/libs/lwjgl-2.9.4-nightly.jar" \
          -d build/bootstrap-classes @build/bootstrap-sources.txt
    cp launcher/resources/client-release.properties build/bootstrap-classes/client-release.properties
    # merge org.json into the bootstrap jar so the version JAR stays self-contained
    rm -f "$BOOTSTRAP_JAR"
    cp -r build/orgjson-classes/* build/bootstrap-classes/
    ( cd build/bootstrap-classes && jar cf "../$(basename "$BOOTSTRAP_JAR")" . )
    log "built $BOOTSTRAP_JAR ($(stat -c%s "$BOOTSTRAP_JAR") bytes)"
}

stage_version_json() {
    log "== stage 3/6: version manifest =="
    python3 scripts/generate_version_json.py "$JSON_OUT"
}

stage_client() {
    log "== stage 4/6: client JAR =="
    if [[ "$CLIENT_STATUS" != "PRESENT" ]]; then
        warn "skipped: $CLIENT_JAR_IN not provided (see ANDROID_PORT_AUDIT.md, BLOCKER-1)"
        return 0
    fi
    mkdir -p build/desktop build/agent-classes build/client-work
    # 4a. compile the ASM offline-patch tool (BuildOfflinePatch + CleanBytecode)
    log "compiling offline patcher"
    javac --release "$BOOTSTRAP_JAVA_RELEASE" -nowarn -cp "$ASM_CP" \
          -d build/agent-classes tools/CleanBytecode.java launcher/src/BuildOfflinePatch.java
    # 4b. generate offline patches from the restored client JAR
    log "applying offline patches to $CLIENT_JAR_IN"
    java -cp "build/agent-classes:$ASM_CP" BuildOfflinePatch \
         "$CLIENT_JAR_IN" build/offline-patches.jar build/offline-patched-classes.txt
    # 4c. merge: client JAR + patched classes + bootstrap layer into one version JAR
    log "merging client + bootstrap layers"
    rm -rf build/client-work && mkdir -p build/client-work
    ( cd build/client-work && unzip -qo "$ROOT/$CLIENT_JAR_IN" )
    # patched classes shadow the originals (same names, later write wins)
    ( cd build/client-work && unzip -qo "$ROOT/build/offline-patches.jar" )
    ( cd build/client-work && unzip -qo "$ROOT/$BOOTSTRAP_JAR" )
    cat > build/client-work/META-INF/MANIFEST.MF <<EOF
Manifest-Version: 1.0
Main-Class: OfflineBootstrap
Implementation-Title: Rise
Implementation-Version: 6.9.9
Multi-Release: false
EOF
    rm -f "$CLIENT_JAR_OUT"
    ( cd build/client-work && jar cfm "$ROOT/$CLIENT_JAR_OUT" META-INF/MANIFEST.MF . )
    log "built $CLIENT_JAR_OUT ($(stat -c%s "$CLIENT_JAR_OUT") bytes)"
}

stage_verify() {
    log "== stage 5/6: verify =="
    python3 - <<'PY'
import json, zipfile, sys, os

errors = []
json_path = "versions/Rise-6.9.9/Rise-6.9.9.json"
with open(json_path) as fh:
    manifest = json.load(fh)
assert manifest["id"] == "Rise-6.9.9"
assert manifest["mainClass"] == "OfflineBootstrap"
assert "minecraftArguments" in manifest
print(f"[verify] {json_path}: OK ({len(manifest['libraries'])} libraries)")

bootstrap = "build/rise-bootstrap-6.9.9.jar"
if os.path.isfile(bootstrap):
    with zipfile.ZipFile(bootstrap) as zf:
        names = zf.namelist()
        for entry in ("OfflineBootstrap.class",
                      "rise/local/config/ConfigRuntime.class",
                      "rise/local/input/RawMouseInput.class",
                      "BuildOfflinePatch.class"):
            if entry not in names:
                errors.append(f"bootstrap missing {entry}")
        if "client-release.properties" not in names:
            errors.append("bootstrap missing client-release.properties")
    print(f"[verify] {bootstrap}: OK ({len(names)} entries)")
else:
    errors.append("bootstrap jar missing")

client = "build/desktop/Rise-6.9.9.jar"
if os.path.isfile(client):
    with zipfile.ZipFile(client) as zf:
        names = zf.namelist()
        if "OfflineBootstrap.class" not in names:
            errors.append("client jar missing OfflineBootstrap")
        if "net/minecraft/client/main/Main.class" not in names:
            errors.append("client jar missing net.minecraft.client.main.Main")
        with zf.open("META-INF/MANIFEST.MF") as mf:
            head = mf.read(200).decode("utf-8", "replace")
        if "Main-Class: OfflineBootstrap" not in head:
            errors.append("client jar manifest lacks Main-Class")
    print(f"[verify] {client}: OK ({len(names)} entries)")
else:
    print("[verify] client JAR: not built (artifacts/client-restored.jar absent)")

if errors:
    print("[verify] FAILURES:")
    for item in errors:
        print("  -", item)
    sys.exit(1)
print("[verify] all checks passed")
PY
}

stage_package() {
    log "== stage 6/6: package =="
    mkdir -p "$DIST"
    local tag="INCOMPLETE"
    if [[ "$CLIENT_STATUS" == "PRESENT" && -f "$CLIENT_JAR_OUT" ]]; then
        tag="COMPLETE"
    fi
    local bundle="$DIST/Rise-6.9.9-client-version.zip"
    rm -f "$bundle"
    mkdir -p build/package/Rise-6.9.9
    cp "$JSON_OUT" build/package/Rise-6.9.9/
    if [[ "$tag" == "COMPLETE" ]]; then
        cp "$CLIENT_JAR_OUT" build/package/Rise-6.9.9/
    else
        cp "$BOOTSTRAP_JAR" build/package/Rise-6.9.9/rise-bootstrap-6.9.9.jar
    fi
    cat > build/package/Rise-6.9.9/README.txt <<EOF
Rise 6.9.9 client version ($tag build)

Install (FoldCraft Launcher / PojavLauncher / Zalith on Android):
  1. Copy the "Rise-6.9.9" folder into <game dir>/versions/
  2. In the launcher select version "Rise-6.9.9"
  3. First launch downloads vanilla 1.8.9 assets automatically.

$([ "$tag" = COMPLETE ] \
  && echo "This build contains the full client JAR (Rise-6.9.9.jar)." \
  || echo "This build does NOT contain the game JAR: artifacts/client-restored.jar
was not provided. rise-bootstrap-6.9.9.jar (the launcher/runtime layer) is
included for inspection only. See ANDROID_PORT_AUDIT.md BLOCKER-1.")
EOF
    ( cd build/package && zip -qr "$ROOT/$bundle" Rise-6.9.9 )
    log "packaged $bundle ($tag)"

    local srczip="$DIST/Rise-6.9.9-source.zip"
    rm -f "$srczip"
    git ls-files > /dev/null 2>&1 || true
    zip -qr "$srczip" sources launcher reference tools scripts versions docs \
        README.md ANDROID_PORT_AUDIT.md PORTING_NOTES.md BUILD_REQUIREMENTS.md \
        CHANGELOG.md AI_AGENT_GUIDE.md -x '*/.git/*' 2>/dev/null || true
    log "packaged $srczip"

    echo "$tag" > build/BUILD_STATUS.txt
    log "build finished: $tag"
    if [[ "$tag" != "COMPLETE" ]]; then
        warn "release is INCOMPLETE: game JAR requires artifacts/client-restored.jar"
        return 0
    fi
}

main() {
    mkdir -p build dist
    if [[ "${1:-all}" == "audit" ]]; then
        stage_audit
        return 0
    fi
    stage_audit
    stage_bootstrap
    stage_version_json
    stage_client
    stage_verify
    stage_package
}

main "$@"
