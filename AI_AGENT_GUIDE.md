# AI_AGENT_GUIDE.md — Hand-off Instructions for AI Agents

> **Purpose.** This file is the persistent memory of the Rise 6.9.9 Android
> client-version project. If you are an AI agent (or a new contributor)
> starting a fresh conversation on this repository, read this file FIRST and
> follow it. It contains: what this client is, how to build it successfully
> on GitHub, the errors already encountered and their solutions, how to add
> future changes, a growing crash-log knowledge base, and the standing rules
> that must never be broken.
>
> Last updated: 2026-11-12 (build 6.9.9-android.2)

---

## 1. Client information (what this project is)

- **Product:** Rise 6.9.9 — a Minecraft Java Edition **1.8.9** PvP client,
  converted from a Windows-launcher distribution into a **standalone
  Minecraft client version** (NOT a Forge mod, NOT a Fabric mod, NOT an APK).
- **Target device profile:** Android phone, MediaTek Helio G99, ARM64
  (`arm64-v8a`).
- **Launcher used by the owner:** **FoldCraft Launcher (FCL)**.
- **Renderer used by the owner:** **Gl4ES** (OpenGL 2.1 desktop GL → GLES
  translation layer).
- **How it runs:** the launcher sees a normal version named `Rise-6.9.9`
  (`versions/Rise-6.9.9/Rise-6.9.9.json` + `Rise-6.9.9.jar`), with
  `mainClass: OfflineBootstrap`, the official Mojang 1.8.9 library list and
  asset index `1.8`. `OfflineBootstrap` prepares the runtime (CAS configs,
  input) and calls `net.minecraft.client.main.Main` with the launcher's
  official session arguments.
- **Repository layout:**
  - `sources/deobfuscated/` — the client reference source (CFR 0.152,
    4,125 classes). Read-only reference except for the port edits listed in
    `PORTING_NOTES.md`. **It cannot be wholesale-recompiled** (see §5).
  - `launcher/src/` — the compilable runtime/bootstrap layer (Java 17).
  - `launcher/resources/cas-configs/` — anti-cheat config JSONs.
  - `tools/` — ASM 9.9 jars + bytecode tooling.
  - `third_party/org.json/` — vendored public-domain org.json.
  - `scripts/` — version manifest generator + vendored official 1.8.9
    manifest.
  - `versions/Rise-6.9.9/` — the generated version manifest.
  - `build.sh` — the build (replaces all PowerShell scripts).
  - `.github/workflows/build.yml` — cloud build + automatic release.
- **Applied feature changes (owner's orders):** blur removed completely;
  vanilla main menu instead of the Rise custom menu; all Windows-only
  components deleted. Details: `PORTING_NOTES.md`.
- **Critical known state (updated 6.9.9-android.2):**
  - BLOCKER-1 is CLOSED BY DECISION: the owner confirmed the original compiled
    JAR (`artifacts/client-restored.jar`) does not exist and will never be
    provided. The client is now built FROM SOURCE (`build.sh stage_client_source`).
  - BLOCKER-2 is SOLVED AT COMPILE TIME: the JNI string decryptor was ported to
    pure Java (`nl/StringDecryptor`, AES/CBC with the constants recovered from
    the decompiled copy in `net.minecraft.network.r`); the 25 native
    declarations delegate to it and `nl.Loader` is never touched.
  - CURRENT BLOCKER: the source tree does not fully compile yet (~1.5k javac
    errors, 44 files, after 12 repair rounds). The precise worklist is in
    `PORTING_NOTES.md` §7.3. Protected files (Rise boot core, vanilla menu
    path, `Minecraft.java`, `ModuleManager`, `SoundHandler`) must be repaired
    by hand — never stubbed. Releases stay INCOMPLETE until the source build
    is green; never fake otherwise.
  - Repair toolchain: `tools/repair/` (reference copies) — see §2b below.

## 2. How to build successfully on GitHub (verified procedure)

The cloud build is already wired: every push to `main` (and manual
*Run workflow*) runs `.github/workflows/build.yml`:

1. Checkout → Temurin JDK 21 → `./build.sh`
   (audit → bootstrap → version JSON → client [if artifact present] →
   verify → package).
2. On success it uploads artifacts and publishes a GitHub Release tagged
   `v6.9.9-b<run_number>` containing:
   - `Rise-6.9.9-client-version.zip` — the deliverable (version folder:
     JSON + game JAR, or JSON + bootstrap layer marked INCOMPLETE)
   - `Rise-6.9.9-source.zip` — the modified source tree
   - `Rise-6.9.9.json` — standalone copy
   - English release notes from `CHANGELOG.md` + real build status.

**To make a change:** edit files → commit to `main` → push. The release
happens automatically. Local reproduction: `./build.sh` (needs JDK 17+,
Python 3, curl, POSIX shell).

**To enable the playable JAR:** the owner uploads
`artifacts/client-restored.jar` (GitHub web UI → *Add file → Upload files*,
or `git add -f`). The next build automatically patches it (offline stubs +
vanilla-menu/blur overlays) and produces `Rise-6.9.9.jar`.

**Release status semantics (never fake these):**
- `COMPLETE` = game JAR built and packaged.
- `INCOMPLETE` = manifest + bootstrap only (client JAR absent).
The workflow derives this from `build/BUILD_STATUS.txt` — do not override.

### 2b. Source-build toolchain (session 6.9.9-android.2)

The sandbox keeps a local toolchain (persistent between sessions):
`/home/z/my-project/.build_cache/` — `repo/` (git clone), `jdk8/` (Temurin 8),
`libs/` (official 1.8.9 artifacts + Via 5.12.2/5.12.2/4.2.0), and
`/home/z/my-project/scripts/` — the live repair tools (copies in
`tools/repair/` of this repository). Compile rounds + per-file error JSONs are
in `.build_cache/compile-rounds/round-N.{log,json}`. Procedure per round:
`client_compile.py` -> classify -> `stub_broken_methods.py round-N.json` (or
hand-repair for protected files) -> recompile. Details in PORTING_NOTES.md §7
and tools/repair/README.md.

## 3. Errors already encountered and their solutions (verified)

| # | Error | Cause | Solution applied |
|---|---|---|---|
| 1 | `javac` missing on the build host | Sandbox/runner had a JRE only | Install Temurin JDK 21 (Actions: `actions/setup-java`); locally download a portable JDK |
| 2 | `pattern matching in instanceof is not supported in -source 8` / `records are not supported in -source 8` (`BuildOfflinePatch.java`, `OnlineConfigRepository.java`) | Runtime layer uses Java 16+ features; initial build targeted `--release 8` | Build the runtime layer with `--release 17` (matches the original launcher build; Android launchers run modern JVMs 17/21) |
| 3 | `cannot find symbol: Mouse / Display` in `RawMouseInput.java` | LWJGL 2 missing from the compile classpath | `build.sh` downloads `lwjgl-2.9.4-nightly-20150209.jar` from the official Mojang library host (`libraries.minecraft.net`, pinned sha1 `697517568c68e78ae0b4544145af031c81082dfe`) and caches it in `build/libs/` |
| 4 | `package CleanBytecode does not exist` when compiling `BuildOfflinePatch.java` | The helper lives in `tools/` | Compile `tools/CleanBytecode.java` to `build/agent-classes` first and put it on the classpath (same order as the original `build.ps1`) |
| 5 | HTTP `429` from `repo1.maven.org` when fetching org.json | Rate-limited network in the build sandbox | org.json is now vendored at `third_party/org.json/` (public domain) — the build no longer downloads it |
| 6 | Version JSON generation needs the Mojang manifest | Network dependency made builds non-deterministic | Official 1.8.9 manifest vendored at `scripts/vendor/1.8.9-official.json`; generator uses it first, network only as fallback |
| 7 | 67 decompiled files fail to even parse (`0OOOoo00o0()` etc.) | CFR faithfully emits bytecode-legal but Java-illegal identifiers | This is expected and unfixable at source level — these classes can only be patched at bytecode level against `client-restored.jar`. Never attempt a full recompile of `sources/deobfuscated/` |
| 8 | `UnsatisfiedLinkError` classes of errors on Android at runtime (anticipated) |
| 9 | Whole-tree javac: 3.5k errors, 2.7k in 46 GOTO-damaged files | CFR `** GOTO` pseudo-syntax is not Java | Repaired by the stub/skeleton/hand toolchain; see PORTING_NOTES.md §7 (worklist for the remainder) |
| 10 | Renaming illegal identifiers corrupted numeric literals (`0f`, `1000L`, `4.8828125E-4f`) | first scanner version treated literals as identifiers | numeric-literal grammar check + token-boundary (prev word-char) check; scientific literals survive — verified by grep |
| 11 | `r.java` lost its whole tail after the decryptor rewrite (`reached end of file`) | CFR body is brace-unbalanced; naive brace counting swallowed the following members | method end = first member-level `^    }$` after the last `** GOTO` (line 1289 of the pristine file) |
| 12 | `import rise.module.impl.render.interface.YyMode` — "class, interface, or enum expected" | a Java KEYWORD was used as a package segment (legal in bytecode, illegal in source) | package renamed to `rise.module.impl.render.guimode` (12 files) |
| 13 | Via stack 404 from `repo.viaversion.com/releases/...` | wrong repo base path | correct base: `https://repo.viaversion.com/<group path>`; pinned 5.12.2 / 5.12.2 / 4.2.0 |
| 14 | `native o0Oo000O0oO` in 25 classes would crash at runtime (BLOCKER-2) | JNI implementation only exists in natives not shipped in this package | pure-Java port `nl/StringDecryptor` (AES-128/CBC/PKCS5, Base64, 16-byte IV prefix; PBKDF2 19 iterations / 256-bit over the recovered 48-byte password + 16-byte salt) — see §7.1 of PORTING_NOTES | JNI string-decryptor natives shipped only for Windows | NOT YET SOLVED — this is BLOCKER-2. First diagnostic when the client JAR arrives: `unzip -l artifacts/client-restored.jar | grep 'nl/'` to see which platform natives are embedded. Reimplement via NDK (arm64-v8a) or stub the 77 decryptor classes via ASM in `BuildOfflinePatch` |

## 4. Adding new changes (future work protocol)

1. **Read first:** this guide, `PORTING_NOTES.md`, `ANDROID_PORT_AUDIT.md`.
2. **Source edits** to the decompiled client: edit the file under
   `sources/deobfuscated/` **keeping the original class name and package**
   (that is what makes the class overlayable onto the client JAR). Add a
   comment block `/* ANDROID/VANILLA PORT NOTE: ... */` explaining the
   change, then document it in `PORTING_NOTES.md` §-matching section.
3. **If the edited class is referenced by the version JAR build** (same
   fully-qualified name as a JAR entry), add its compilation to the client
   stage of `build.sh` (compile against the client JAR, overlay the
   resulting `.class` files). Classes renamed in the reference tree (e.g.
   `rise/module/...` copies) cannot be overlaid — they are documentation
   only; implement their change as an ASM patch in `BuildOfflinePatch.java`
   instead.
4. **Update `CHANGELOG.md`** under a new `[6.9.9-android.N]` heading
   (English) — the release notes are generated from it.
5. **Commit to `main`** and let the workflow build + release. Never claim
   success the workflow did not verify.
6. **After any device test**, append results to §5 below and to
   `ANDROID_PORT_AUDIT.md` §7.

## 5. Crash-log knowledge base (append-only)

When the owner reports a crash, add an entry here: the exception signature,
one representative stack line, the diagnosis, and the fix that worked. Keep
entries short and factual. Mark `STATUS: FIXED` only after a verified fix.

```
No on-device crashes recorded yet — the client JAR has not been produced
(BLOCKER-1). This section will grow from real FoldCraft Launcher /
PojavLauncher logs after the first device runs.
```

Expected first crash candidates (pre-analysis, from the audit):
- `UnsatisfiedLinkError` mentioning `nl/Loader` or `o0Oo000O0oO` →
  BLOCKER-2 (missing aarch64 natives) — see §3 row 8.
- `ClassNotFoundException: OfflineBootstrap` → version folder installed
  without the JAR or vice versa; check `versions/Rise-6.9.9/` contents.
- `NoClassDefFoundError: org/json/JSONObject` → bootstrap jar merged
  incorrectly; re-run `build.sh` (org.json is compiled into it).
- GL errors / black screen on Gl4ES → collect the full logcat +
  `latest.log`, look for `GL_INVALID_*` around shader compilation; note
  that blur shaders were removed and should not appear anymore.

## 6. Standing instructions (fixed rules from the owner)

1. **All work happens on GitHub.** Edits are committed to this repository's
   `main` branch; the deliverable is published as a GitHub Release
   automatically by the workflow — no manual release packaging.
2. **After completing any change:** build must run through
   `.github/workflows/build.yml`, and the release must contain
   `Rise-6.9.9-client-version.zip` (JAR + JSON together in one archive when
   possible) and `Rise-6.9.9-source.zip` (modified source), plus an English
   changelog.
3. **This guide is part of every delivery.** Update it (client info, build
   knowledge, errors, crash solutions, standing instructions) whenever
   reality changes — a future AI conversation must be able to continue
   seamlessly from it.
4. **Never fake build success.** INCOMPLETE releases stay INCOMPLETE until
   the real artifact exists. Never present a bootstrap-only JAR as a
   playable client.
5. **Windows-only components stay deleted.** Do not reintroduce PowerShell
   build steps, the Swing launcher, or Windows native code into the client
   path. Raw Input / DLL loading keeps its non-Windows fallbacks.
6. **Blur stays removed; the main menu stays vanilla.** Re-adding either
   requires an explicit new owner instruction.
7. **No DRM/auth bypass.** The client uses the launching launcher's official
   Minecraft session. Never add credential storage, session spoofing, or
   piracy-enabling code; never commit accounts, tokens, or secrets.
8. **Do not redistribute game files you do not own.**
   `artifacts/client-restored.jar` stays out of git history unless the owner
   explicitly force-adds it to their own private repository.
9. **Language:** code comments and docs in English; conversation with the
   owner in Arabic.
10. **When blocked by a missing file**, state exactly which file is missing,
    its expected sha256, and what becomes possible once it arrives — then
    continue with everything that is NOT blocked.
