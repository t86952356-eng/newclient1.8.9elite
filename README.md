# Rise 6.9.9 — Android Client Version (Minecraft 1.8.9)

Rise 6.9.9 converted from a Windows-launcher-bound client into a
**standalone Minecraft Java Edition 1.8.9 client version** — not a Forge
mod, not an APK. Target profile: Android ARM64 (Helio G99), **FoldCraft
Launcher** with the **Gl4ES** renderer; desktop launchers work too.

- Audit & blockers: [`ANDROID_PORT_AUDIT.md`](ANDROID_PORT_AUDIT.md)
- Every change & why: [`PORTING_NOTES.md`](PORTING_NOTES.md)
- What you need to build: [`BUILD_REQUIREMENTS.md`](BUILD_REQUIREMENTS.md)
- **AI agent hand-off (read this first in a new session):**
  [`AI_AGENT_GUIDE.md`](AI_AGENT_GUIDE.md)
- Install on Android: [`docs/INSTALL-ANDROID.md`](docs/INSTALL-ANDROID.md)
- History: [`CHANGELOG.md`](CHANGELOG.md)

## Build status at a glance

| Artifact | Status |
|---|---|
| Version manifest `Rise-6.9.9.json` (official 1.8.9 libraries, `mainClass: OfflineBootstrap`) | Building |
| Bootstrap runtime layer (`OfflineBootstrap`, config/input/runtime) | Building |
| Playable `Rise-6.9.9.jar` | **Waiting for `artifacts/client-restored.jar`** (owner must provide; sha256 `a93ea829…`) — see `ANDROID_PORT_AUDIT.md` BLOCKER-1 |

## Quick start (Android)

1. Download `Rise-6.9.9-client-version.zip` from
   [Releases](../../releases) (pick a release marked COMPLETE).
2. Follow [`docs/INSTALL-ANDROID.md`](docs/INSTALL-ANDROID.md).

## Build yourself

```bash
./build.sh          # full pipeline; needs JDK 17+, Python 3, curl
./build.sh audit    # environment + artifact report
```

Every push to `main` triggers the cloud build and publishes a GitHub
Release automatically (`.github/workflows/build.yml`).

## Feature changes in this port (owner's decisions)

- Blur removed completely (engine + all module settings).
- Vanilla Minecraft 1.8.9 main menu (Rise custom menu removed).
- All Windows-only components deleted (launcher UI, Raw Input C++, PowerShell
  build chain, portable-EXE packaging, Windows RE tooling).
- Module system, ClickGUI, events and CAS configs are preserved.

## Provenance & license notes

- `sources/` is a CFR 0.152 decompilation of the Rise 6.9.9 client obtained
  from Rise Launcher 2.6, packaged as reference source by its original
  author (see the original package README in git history and
  `reference/source-version.json`). It is reference material — the playable
  JAR is produced by patching the owner-provided
  `artifacts/client-restored.jar`.
- `third_party/org.json/` is the public-domain org.json library (upstream
  tag 20240303, see its LICENSE file).
- `tools/asm-*.jar` (ASM 9.9, BSD) and `tools/cfr-0.152.jar` (CFR, MIT) ship
  with the original package.
- This repository does not redistribute Minecraft assets, the vanilla client
  JAR, or any file the owner does not have the right to distribute.
- No DRM/authentication bypass is included or will be accepted: the client
  uses the launching launcher's official Minecraft session.
