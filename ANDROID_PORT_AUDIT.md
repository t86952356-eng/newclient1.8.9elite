# ANDROID_PORT_AUDIT.md — Rise 6.9.9 Technical Audit

> Phase 1 deliverable of the Rise 6.9.9 → standalone Minecraft 1.8.9 Client
> Version conversion, with an Android (ARM64 / FoldCraft Launcher / Gl4ES)
> target profile.
>
> Audit date: 2026-11-12 · Auditor: AI build agent · All findings verified
> directly against the repository files.

---

## 1. Package inventory

Source package: `Rise-Sources-6.9.9.zip` (12,489,915 bytes, from Rise Launcher
2.6). Extracted contents (59 MB):

| Path | Contents | Count / size |
|---|---|---|
| `sources/deobfuscated/` | CFR 0.152 decompiled client, mixed obfuscated + 482 semantic-renamed classes | 4,125 `.java` |
| `sources/raw/` | Same classes under original obfuscated names | 4,125 `.java` |
| `sources/launcher/` | Decompiled Rise Launcher 2.6 (`de.brownie.*`) | 4 `.java` |
| `launcher/src/` | Clean, hand-maintained local launcher + bootstrap layer (Java 17) | 14 `.java` (9 kept after Windows purge) |
| `launcher/native/` | Windows Raw Input C++ (`RawMouseInput.cpp` etc.) | 3 files — **DELETED (Windows-only)** |
| `launcher/resources/` | `client-release.properties` + 34 CAS anti-cheat config JSONs | 35 files — kept |
| `launcher/tests/` | Smoke tests for the Windows launcher runtime | 6 kept / 2 deleted |
| `reference/` | Mappings (TSV), module index, diagnostics, version metadata | 11 files — kept |
| `tools/` | ASM 9.9 jars, CFR 0.152 jar, bytecode tooling, packaging scripts | kept (2 Windows analysis files deleted) |
| root | `README.md` (Japanese, package provenance), `SOURCE-MANIFEST.json`, `Launch-Rise.cmd` (**deleted**), `Inter_18pt-Regular.ttf` (**deleted**, Windows launcher UI font) |

Native binaries present in the ZIP: **none** (no `.dll`, `.so`, `.dylib`, no
`.jar` other than ASM/CFR tooling).

## 2. Component classification

| Component | Class | Reason |
|---|---|---|
| `sources/deobfuscated/**` (net/minecraft patched by Rise, hackclient/rise, rip/vantage, com.alan, rise/*) | `CORE` (reference source of the client) | Entire client; required for any recompile — but **not directly recompilable** (see §5) |
| `launcher/src/OfflineBootstrap.java` | `CORE` | Version entry point; prepares runtime, then invokes `net.minecraft.client.main.Main` |
| `launcher/src/rise/local/config/ConfigRuntime.java` + `OnlineConfigRepository.java` | `CORE` | Installs/refreshes CAS configs into `Rise/configs` |
| `launcher/src/ClientRelease.java` + `resources/client-release.properties` | `CORE` | Version metadata |
| `launcher/src/NativeRuntime.java` | `CORE` (guarded) | Loads OpenSSL/OpenAL DLLs **only when `os.name` contains "win"**; no-op on Android/Linux |
| `launcher/src/rise/local/input/RawMouseInput.java` | `CORE` (guarded) | Windows Raw Input via JNI; falls back to LWJGL mouse on non-Windows — LWJGL is exactly what FCL provides on Android |
| `launcher/src/BuildOfflinePatch.java` | `CORE` (build-time) | ASM patcher that stubs Rise's network/auth core (`rip.vantage.network.*`) into offline mode |
| `launcher/src/VerifyOfflineRuntime.java` | OPTIONAL | Runtime verification helper |
| `RiseLocalLauncher.java`, `rise/local/ui/*`, `OnlineConfigDialog.java` | `DESKTOP_ONLY` — **DELETED** | Swing launcher GUI, Windows-centric |
| `Launch-Rise.cmd`, `build.ps1`, `build-native.ps1`, `build-portable.ps1`, `pack_portable.py`, `PortableLauncher.cs`, `temurin.json`, `PORTABLE.txt`, `launcher.mf`, `settings.properties.example`, `launcher/native/*`, `Inter_18pt-Regular.ttf` | `DESKTOP_ONLY` — **DELETED** | Windows launcher packaging pipeline |
| `tools/native_bridge.c`, `tools/NativeBridge.java` | `DESKTOP_ONLY` — **DELETED** | Windows-only RE instrumentation (hardcoded offsets into the Windows DLL) |
| `launcher/resources/cas-configs/**` | `CORE` | Plain-JSON CAS configs used by ConfigRuntime |
| `reference/**` | OPTIONAL | Provenance, mappings, diagnostics |
| `sources/launcher/**` (de.brownie) | OPTIONAL (reference) | Original launcher 2.6 decompilation, kept for documentation |
| `versions/Rise-6.9.9/Rise-6.9.9.json` (new) | `ANDROID_REQUIRED` | Standalone version manifest, official 1.8.9 libraries, `mainClass: OfflineBootstrap` |
| `third_party/org.json/**` (new) | `ANDROID_REQUIRED` | Public-domain org.json source, compiled into the bootstrap layer so the version JAR is self-contained |

No component is classified `UNUSED_CONFIRMED`: every remaining file has a
verified consumer in the build or the runtime path.

## 3. Entry points and boot chain

**Original (Windows, pre-port):**

```
Launch-Rise.cmd
  └─ javaw -jar RiseLocalLauncher.jar        (Swing UI, Windows)
       └─ java 21 -cp offline-patches.jar;artifacts/client-restored.jar;
                  RiseLocalLauncher.jar;artifacts/libraries.jar
                -Djava.library.path=runtime/natives  OfflineBootstrap
```

```
OfflineBootstrap.main()
  ├─ NativeRuntime.prepare()          → System.load libcrypto-3-x64.dll,
  │                                     libssl-3-x64.dll, OpenAL64.dll (Windows only)
  ├─ RawMouseInput.initialize()       → System.load rise_raw_input.dll (Windows only,
  │                                     LWJGL fallback elsewhere)
  ├─ ConfigRuntime.configure(gameDir) → export CAS configs → Rise/configs,
  │                                     install latest.json (Hypixel 1.8 default)
  └─ net.minecraft.client.main.Main.main(--username … --uuid … --accessToken 0
                                         --userType legacy --version 6.9.9-offline
                                         + launcher args)
```

The client JAR itself boots its own natives through `nl/Loader`, which extracts
`/nl/<arch>-<os>` (e.g. `nl/x64-windows.dll`, `nl/aarch64-linux.so`) from the
classpath into a temp file and `System.load`s it. The network/auth core
(`rip.vantage.network.core.a` + handlers) is stubbed at build time by
`BuildOfflinePatch` (offline mode).

**New (standalone client version, this port):**

```
FCL / Pojav / Zalith / any launcher
  └─ versions/Rise-6.9.9/Rise-6.9.9.json  (mainClass: OfflineBootstrap,
                                            libraries: official 1.8.9 set,
                                            assets: 1.8)
       └─ Rise-6.9.9.jar  =  client JAR (offline-patched)
                           + bootstrap layer (OfflineBootstrap, ConfigRuntime,
                             RawMouseInput, NativeRuntime, org.json)
       └─ Android launchers substitute their LWJGL 2 / OpenGL compat layer
          (FCL: JREGL + Gl4ES) exactly as they do for vanilla 1.8.9
```

Launcher-supplied auth args (`--username/--uuid/--accessToken` from the
launcher session) override the offline defaults because `OfflineBootstrap`
prepends its arguments before the launcher's; `Main`'s parser applies the last
occurrence. Official launcher authentication is used — no DRM bypass exists in
this pipeline.

## 4. JNI / native inventory

| Class | Native member | Library | Purpose | Boot-critical? | Android path |
|---|---|---|---|---|---|
| `hackclient.rise.bq`, `zo`, `cu`, `rip.vantage.network.core.a`, 74 more | `o0Oo000O0oO(int, String) -> String` + per-class natives | `rise_native` (registered via `nl/Loader.registerNativesForClass`) | **String decryption** (126 call sites across the client) | Yes — first encrypted string crashes without it | See BLOCKER-2 |
| `nl/Loader` | `registerNativesForClass(int, Class)` | `/nl/<arch>-<os>` embedded in client JAR | JNI registration bootstrap | Yes (when natives used) | Loader already supports `aarch64-linux.so`; whether that file is embedded depends on the client JAR (BLOCKER-2) |
| `com.alan.clients.security.NativeDecryptor` | decrypt via `System.load` | bundled DLL | config/asset decryption | Unknown (runtime) | BLOCKER-2 |
| `rise.local.input.RawMouseInput` | `nStart/nCapture/nPoll/nRegistered/nStop` | `rise_raw_input.dll` | Raw mouse (Windows) | No | Falls back to LWJGL input (FCL-provided); guarded by `os.name` check |
| `launcher/src/NativeRuntime` | — (System.load only) | OpenSSL/OpenAL DLLs | TLS/audio preload | No | No-op off-Windows |

The original Windows analysis bridge (`tools/native_bridge.c`) proved strings
are decrypted natively (`ZIP_RiseDecrypt` at a fixed offset) — there is no
Java reimplementation in the package, and `reference/source-version.json`
records `nativeImplementationsRestored: false`.

## 5. Recompile feasibility (why the client JAR cannot be rebuilt from source)

Verified empirically and from `reference/source-diagnostics.json`:

1. **67 source files contain identifiers that are illegal in Java** (e.g.
   method `0OOOoo00o0()` — legal in bytecode, illegal in source). These files
   cannot even be parsed by `javac`.
2. **77 classes declare the JNI string-decryptor** whose implementation lives
   only in the native library; a recompiled client would throw
   `UnsatisfiedLinkError` at the first decrypted string even if it compiled.
3. CFR reference output for an obfuscated client: encrypted strings, complex
   control flow, 57 diagnostic files recorded by the package author.
4. The original build itself depends on `artifacts/client-restored.jar`
   (sha256 `a93ea829…db3e17`) — the *compiled* client — which the package
   explicitly does not contain.

Conclusion (consistent with the package's own README): the decompiled tree is
a reference; the **only** path to a playable client version is patching the
original compiled JAR. Source-level edits made in this port are therefore
implemented as either (a) build-time bytecode patches of overlayable classes
(`net/minecraft/client/gui/am`, `net/minecraft/client/Minecraft`,
`hackclient/rise/aji` — same names as the JAR entries) or (b) reference edits
documented for future ASM patching (module setting removals).

## 6. Blockers

### BLOCKER-1 — `artifacts/client-restored.jar` is missing (severity: release-blocking for the game JAR)

Everything else in this repository builds and is shipped. To produce the
playable `Rise-6.9.9.jar`, place the restored client JAR at
`artifacts/client-restored.jar` (expected sha256
`a93ea829dcc0869173a7c3aad8a466b6790bb46d0a6f4eaf772b5bcf756d3e17`, recorded
in `reference/source-version.json`). The next build run then automatically:
patches it offline, overlays the vanilla-menu/blur-removal classes, merges the
bootstrap layer and packages the complete release. It must be supplied by the
repository owner from their original Rise distribution; it is not
redistributable by this project and must not be downloaded from untrusted
sources.

### BLOCKER-2 — Android native string-decryption (severity: runtime, after BLOCKER-1)

The client decrypts strings through JNI natives originally shipped as Windows
DLLs. On Android the client's `nl/Loader` expects `nl/aarch64-linux.so`
embedded in the client JAR. Two outcomes once BLOCKER-1 is resolved:

- If the JAR embeds multi-platform natives (the loader code supports them):
  Android works out of the box.
- If it embeds only Windows natives: the decryptor must be reimplemented for
  Android (NDK, `arm64-v8a`) by reverse-engineering the original library —
  or the 77 decryptor classes must be stubbed with acceptable behavior. This
  is the first thing to diagnose with the real JAR in hand
  (`unzip -l artifacts/client-restored.jar | grep 'nl/'`).

### Non-blockers (already handled)

- Windows Raw Input → LWJGL fallback (guarded).
- OpenSSL/OpenAL preload → no-op off Windows.
- LWJGL 2 → Android launchers substitute their compat layer (FCL + Gl4ES),
  identical to how they run vanilla 1.8.9.
- Assets → launcher downloads the official 1.8 asset index automatically.

## 7. Verification status

| Check | Status |
|---|---|
| Bootstrap layer compiles (`javac --release 17`, ASM 9.9 + vendored org.json + official LWJGL 2.9.4-nightly) | PASS — `build/rise-bootstrap-6.9.9.jar`, 48 entries |
| Version manifest valid JSON, 37 official libraries, 1.8.9 argument format, `mainClass: OfflineBootstrap` | PASS |
| Build pipeline runs end-to-end on Linux (GitHub Actions parity) | PASS (local run) |
| Client JAR produced | **NOT POSSIBLE YET** — BLOCKER-1 |
| On-device FCL + Gl4ES run | **NOT TESTED** — requires the client JAR (BLOCKER-1/2); will be re-audited after it is provided |

Per the porting rules: nothing in this repository claims the client runs on
Android. That claim will only be made after a real device test.
