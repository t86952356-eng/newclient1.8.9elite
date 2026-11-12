# Changelog

All notable changes to the Rise 6.9.9 Android client-version port are
documented here. The format follows [Keep a Changelog](https://keepachangelog.com/en/1.1.0/).

## [6.9.9-android.2] — 2026-11-12 — source-build port session

**Context.** The owner confirmed the original compiled client JAR
(`artifacts/client-restored.jar`, BLOCKER-1) will never be available, and
ordered the client to be built from the decompiled source tree by any means.
This session converts the project to a **source build**.

### Added
- `nl/StringDecryptor.java` — pure-Java AES string decryptor (identical
  algorithm to the JNI native it replaces; constants extracted mechanically
  from the decompiled copy in `net.minecraft.network.r`). All 25 native
  declarations now delegate to it; `nl.Loader` natives are no longer needed.
  This resolves BLOCKER-2 at compile time.
- `build.sh stage_client_source` — the primary client-JAR stage: compiles
  `sources/deobfuscated` directly; on failure the release is packaged with an
  honest INCOMPLETE marker (never faked).
- Via stack (viaversion 5.12.2, viabackwards 5.12.2, viarewind 4.2.0) as
  runtime libraries in `versions/Rise-6.9.9/Rise-6.9.9.json`.

### Changed
- 77 files: illegal digit-led identifiers renamed (`q` prefix); keyword-named
  members (`do`/`if`/`switch`) renamed (`j_` prefix) with call sites.
- Package `rise.module.impl.render.interface` → `…guimode` (keyword package
  name was illegal Java source).
- `net/minecraft/client/gui/{aa,au,cd,cn}.java`: CFR `** GOTO lbl-1000`
  control-flow damage hand-restructured to plain if/else; untyped locals typed.
- ~60 files: GOTO/orphan damaged method bodies stubbed with typed defaults
  (`/* RISE-PORT STUB */`), signatures preserved; 29 heavily damaged files
  rewritten as compilable skeletons (several still need manual cleanup).

### Known issues (honest state)
- The source tree does **not** fully compile yet (~1.5k javac errors across 44
  files after 12 repair rounds). The precise per-file worklist is in
  `PORTING_NOTES.md` §7.3; protected files (Rise boot core, vanilla menu path,
  `Minecraft.java`, `ModuleManager`, `SoundHandler`) must be repaired by hand,
  never stubbed. Releases stay INCOMPLETE until the source build is green.

## [6.9.9-android.1] — 2026-11-12

First release of the Rise 6.9.9 → standalone Minecraft 1.8.9 **client
version** conversion (Android-first: ARM64, FoldCraft Launcher, Gl4ES).

### Added
- Standalone version manifest `versions/Rise-6.9.9/Rise-6.9.9.json`
  (official Mojang 1.8.9 library set and argument format, entry point
  `OfflineBootstrap`, assets index `1.8`) — usable by FoldCraft Launcher,
  PojavLauncher, Zalith and standard desktop launchers.
- Cross-platform build pipeline `build.sh` (audit → bootstrap → manifest →
  client patch → verify → package) replacing the Windows-only PowerShell
  chain; runs on Linux/macOS and GitHub Actions.
- Cloud build + automatic GitHub Release workflow
  (`.github/workflows/build.yml`) with honest COMPLETE/INCOMPLETE status
  reporting.
- Runtime bootstrap layer `build/rise-bootstrap-6.9.9.jar`
  (`OfflineBootstrap`, `ConfigRuntime`, `OnlineConfigRepository`,
  `RawMouseInput`, `NativeRuntime`, `BuildOfflinePatch`, vendored org.json).
- Vendored third-party sources: `third_party/org.json` (public domain,
  tag 20240303) and the pinned official Mojang 1.8.9 manifest
  (`scripts/vendor/1.8.9-official.json`).
- Documentation set: `ANDROID_PORT_AUDIT.md` (technical audit, blockers),
  `PORTING_NOTES.md` (every change with reasons), `BUILD_REQUIREMENTS.md`,
  `docs/INSTALL-ANDROID.md`, `AI_AGENT_GUIDE.md` (hand-off instructions for
  AI agents continuing this work).

### Removed
- All Windows-only components: `Launch-Rise.cmd`, Swing launcher UI
  (`RiseLocalLauncher` + theme/motion classes), Raw Input C++ project,
  PowerShell build scripts, portable-EXE packaging (C#/Python), Windows
  JRE bundling manifest, launcher UI font, Windows RE instrumentation
  (`native_bridge.c` / `NativeBridge.java`) and the tests of deleted
  components. See `PORTING_NOTES.md` §1 for the full list.
- **Blur, completely.** The gaussian blur shader pipeline
  (`hackclient.rise.aji`, `blur.frag`) is neutralized — UI content that was
  blurred now renders directly; the `Blur Radius`, `Blur Compression`,
  `Blur color` and `Overlays (Bloom/Blur)` settings are gone from
  Interface, Scoreboard, BedPlates and NameTags (Modern mode).
- **Rise custom main menu.** Startup, world-exit and disconnect flows now
  open the vanilla Minecraft 1.8.9 main menu (Singleplayer / Multiplayer /
  Options / Quit); the `Login` (account manager) button and the animated
  background/blur hooks were removed from the menu class.

### Changed
- `Minecraft.java` startup screen wiring: `hackclient.rise.adu` (Rise menu)
  → `net.minecraft.client.gui.am` (vanilla `GuiMainMenu`); removed the Rise
  "Main menu" network telemetry call from the world-exit path.
- `launcher/tests/run_smoke.py` classpath points at the new build outputs.
- Raw mouse input remains available on Windows via LWJGL fallback; on
  Android it transparently uses the launcher-provided LWJGL input layer.

### Known limitations (documented, not hidden)
- The playable game JAR requires `artifacts/client-restored.jar`
  (sha256 `a93ea829…`) from the original Rise distribution — it is not part
  of this repository and cannot be rebuilt from the decompiled reference
  source (see `ANDROID_PORT_AUDIT.md` §5, BLOCKER-1). Until it is provided,
  releases contain the version manifest + bootstrap layer and are clearly
  marked INCOMPLETE.
- Android runtime depends on the client JAR embedding
  `nl/aarch64-linux.so` natives, or on a future NDK reimplementation of the
  string decryptor (BLOCKER-2).
- No on-device test has been performed yet; the port does not claim Android
  playability until one is.
