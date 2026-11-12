# PORTING_NOTES.md — Android / Vanilla Port Change Log

Every change made to convert Rise 6.9.9 from a Windows-launcher-bound client
into a standalone Minecraft 1.8.9 client version (Android-first: ARM64,
FoldCraft Launcher, Gl4ES). Each entry states the exact file, the change and
the reason. Nothing was deleted without a documented reason.

## 1. Permanent removal of Windows-only components

| Removed | Reason |
|---|---|
| `Launch-Rise.cmd` | `javaw -jar RiseLocalLauncher.jar` shim — replaced by the standard launcher version flow |
| `launcher/native/` (`RawMouseInput.cpp`, `RawMotion.h`, `RawMotionTest.cpp`) | Windows Raw Input API (`user32.lib`, `RegisterRawInputDevices`) — unavailable on Android; the Java side falls back to LWJGL input which FCL provides |
| `launcher/build.ps1`, `build-native.ps1`, `build-portable.ps1`, `pack_portable.py` | Windows/PowerShell/Visual Studio build chain — replaced by cross-platform `build.sh` |
| `launcher/src/PortableLauncher.cs` | C# single-file-EXE packaging (Windows) |
| `launcher/src/RiseLocalLauncher.java` | Swing launcher UI — the whole point of the port is to use standard launchers (FCL/Pojav/Zalith) |
| `launcher/src/rise/local/ui/` (`LauncherTheme`, `Motion`, `MotionLabel`, `MotionPanel`) | Swing UI helpers used only by the deleted launcher window |
| `launcher/src/rise/local/config/OnlineConfigDialog.java` | Swing dialog used only by the deleted launcher window |
| `launcher/temurin.json`, `launcher/PORTABLE.txt`, `launcher/launcher.mf`, `launcher/settings.properties.example` | Windows launcher packaging metadata |
| `Inter_18pt-Regular.ttf` (repo root) | Windows launcher UI font asset (the client bundles its own fonts inside its JAR) |
| `launcher/tests/RawMouseProbe.java`, `launcher/tests/LauncherMotionTest.java` | Tests of deleted Windows-only components |
| `tools/native_bridge.c`, `tools/NativeBridge.java` | Windows-only RE instrumentation (`windows.h`, hardcoded DLL offsets) — analysis artifact, not needed for the port |
| `hackclient/rise/adu.java` (source tree) | Rise custom main menu screen — **replaced by the vanilla menu** (see §3); unreferenced after the menu rewiring |

All removals are recoverable from git history (`git log --diff-filter=D`).

## 2. Blur removal (feature permanently disabled)

Blur was implemented as a two-pass gaussian shader (`blur.frag` +
`vertex.vsh`) drawing queued UI content through offscreen framebuffers — a
heavy effect that Helio G99 / Gl4ES cannot afford and that the port owner
asked to remove completely.

| File | Change |
|---|---|
| `sources/deobfuscated/hackclient/rise/aji.java` | The blur handler no longer creates framebuffers or runs the shader. Its render entry `a(ajc, float, List<Runnable>)` now draws the queued content **directly to the screen** (content that used to be blurred is still rendered, unblurred); the resize hook is a no-op. This single change disables blur globally (main menu, ClickGUI, HUD elements) because all blur layers route through this class. |
| `sources/deobfuscated/rise/module/impl/render/Interface.java` | Removed the `Blur Radius` and `Blur Compression` settings and their getters (`lP()` / `lQ()` — only ever read by the blur handler). |
| `sources/deobfuscated/rise/module/impl/render/Scoreboard.java` | Removed the `Blur color` setting; the scoreboard backdrop keeps the fixed non-blur tint. |
| `sources/deobfuscated/rise/module/impl/render/BedPlates.java` | Removed the `Overlays (Bloom/Blur)` gate; the plate backdrop moved from the blur layer (`gg.kU`) to the plain overlay layer (`gg.kV`). Module still renders identically minus the blur. |
| `sources/deobfuscated/rise/module/impl/render/nametags/ModernMode.java` | Same treatment as BedPlates for the nametag health backdrop. |
| `com/alan/clients/script/api/RenderAPI.blur(...)` | Left in place for script API compatibility, but its layer now renders unblurred through the neutralized handler. |

Note: bloom (a separate glow effect, `gg.kT`) was **not** removed — only blur
was requested. It can be disabled per-module in the ClickGUI.

## 3. Vanilla main menu (Rise custom menu removed)

The Rise custom menu (`hackclient.rise.adu` — animated background shader,
custom buttons, account manager entry) was shown at startup and after leaving
worlds/disconnects. The vanilla `GuiMainMenu` (`net.minecraft.client.gui.am`)
was kept in the client but carried Rise hooks. Changes:

| File | Change |
|---|---|
| `net/minecraft/client/Minecraft.java` | Startup screen decision (`a(GuiScreen)`): `new adu()` → `new am()` (vanilla `GuiMainMenu`); removed the `instanceof adu` Rise side-effects block; world-exit path (`BN()`): `new adu()` → `new am()`; removed the Rise "Main menu" network telemetry call. |
| `net/minecraft/client/gui/am.java` | Removed Rise's overlay-screen hooks (`bps`/`bpu` fields, `EK()`, their `initGui`/`drawScreen`/`mouseClicked`/`onGuiClosed`/`updateScreen` blocks), the `Login` (account manager) button, and the animated-background/blur shader call `aiy.aQy.a(ajc.aQF, …)`. The vanilla panorama, title, splash text, Singleplayer/Multiplayer/Options/Quit/Language buttons and demo-mode flow are untouched. |
| `net/minecraft/client/gui/{q,an,x,aa,r}.java`, `net/minecraft/client/network/h.java`, `hackclient/rise/{adv,aap}.java`, `com/alan/clients/ui/menu/impl/account/AccountManagerScreen.java` | All "return to main menu" flows now open the vanilla menu (`new adu()` → `new am()`). |

The account manager remains reachable from its other in-game entry points
(Rise UI), but the main menu itself is now fully vanilla.

## 4. Launcher → client version conversion

- **New `versions/Rise-6.9.9/Rise-6.9.9.json`** (generated by
  `scripts/generate_version_json.py` from the vendored official Mojang 1.8.9
  manifest): standalone version — no `inheritsFrom`, `id: Rise-6.9.9`,
  `mainClass: OfflineBootstrap`, the exact official 1.8.9 `minecraftArguments`
  and 37-library list, `assets: 1.8`.
- **New `build.sh`** — cross-platform build (POSIX sh) replacing all
  PowerShell scripts. Stages: audit → bootstrap → version JSON → client
  (offline patch + overlays + merge, only when
  `artifacts/client-restored.jar` exists) → verify → package. Produces
  `dist/Rise-6.9.9-client-version.zip` and `dist/Rise-6.9.9-source.zip`.
- **New `.github/workflows/build.yml`** — cloud build on every push to
  `main` (+ manual dispatch), artifact upload and automatic GitHub Release
  (`v6.9.9-b<N>`) with an honest COMPLETE/INCOMPLETE status line derived from
  the real build result.
- **Runtime layer compiles at `--release 17`** like the original launcher
  build; Android launchers run the game on modern JVMs (17/21).
- **`launcher/tests/run_smoke.py`** classpath updated to the new build
  outputs.
- **Vendored `third_party/org.json`** (public domain, upstream tag 20240303)
  so `ConfigRuntime` compiles without network access.
- **Vendored `scripts/vendor/1.8.9-official.json`** (official Mojang manifest,
  pinned package URL) so version JSON generation is deterministic.

## 5. Security redaction (added during the first push)

- `com/alan/clients/util/account/auth/MicrosoftLogin.java` (+ `$Handler`)
  in both source trees contained Rise's own Microsoft OAuth application
  `CLIENT_SECRET` hardcoded by the original developers (decompiled verbatim).
  GitHub push protection correctly refuses it, and the standing rule forbids
  secrets in the repository, so the secret value is replaced with the
  placeholder `REDACTED_MICROSOFT_CLIENT_SECRET` (12 occurrences across both
  trees). The `CLIENT_ID` (a public OAuth app id, not a secret) is kept.
  Effect: the in-client Microsoft login flow cannot authenticate until a
  valid secret is supplied at runtime — irrelevant for this port, which uses
  the launching launcher's official session.

## 6. Intentionally NOT changed

- `NativeRuntime.java` — already guarded by `os.name` (no-op on Android).
- `RawMouseInput.java` — already falls back to LWJGL input off-Windows; the
  reflective `dzp`/`dzq` mouse-helper fields belong to the client JAR and stay
  compatible with it.
- CAS configs, module system, ClickGUI, events — untouched feature set.
- `sources/raw/` and `reference/` — provenance kept intact (except the security
  redaction in §5).
- Authentication: the port uses the launching launcher's official session;
  no DRM/login bypass was added anywhere.

## 7. Session 6.9.9-android.2 — source-build port (owner ordered: "build the
## client by any means, even with heavy modification"; the original compiled
## JAR `client-restored.jar` does not exist and will never be provided)

Everything below was applied to `sources/deobfuscated/` (the compilable tree)
and is reproducible with the tools in this session's toolchain (see
AI_AGENT_GUIDE §2b).

### 7.1 Mechanical repairs (scripted, deterministic)

| Change | Files | Tool |
|---|---|---|
| Illegal digit-led identifiers (`0OOOoo00o0`, `0o0o0Oo0o0`, … 72 distinct tokens, 2193 sites) renamed to `q<token>` — context-aware (skips numeric literals, strings, comments; scientific literals like `4.8828125E-4f` preserved) | 77 | `fix_illegal_identifiers.py` phase A |
| Keyword-named members (`do`, `if`, `switch` as method/ctor names — CFR artifact) renamed to `j_<kw>` + all dotted call sites | 8 decl + 6 call files | same, phase B |
| Package `rise.module.impl.render.interface` (a Java keyword as package name — illegal in source) renamed to `rise.module.impl.render.guimode`; all imports rewritten | 12 files + dir rename | inline script |
| **String-decryptor ported to pure Java** — the JNI native `o0Oo000O0oO(int,String)` (25 classes, registered via `nl/Loader` against natives that are not in this package) replaced by a new `nl/StringDecryptor` (AES-128*/CBC/PKCS5Padding; Base64 input; 16-byte IV prefix). Constants extracted mechanically from the decompiled Java copy in `net.minecraft.network.r` (CFR output): password = 48 bytes `d24f2191…494688` (part1[16] ‖ part2[32] from the literal XOR cascades), salt = `253439444b03e566c0f28b63f980b65c`, PBKDF2 iterations 19, key 256-bit. The 25 native declarations became 1-line delegators; `Loader.registerNativesForClass(...)` statements removed; `r.java`'s mangled method body replaced by a delegator (region lines 1035–1289, first member-level close after the last `** GOTO`). **This kills BLOCKER-2 at compile time.** | 30 files + new `nl/StringDecryptor.java` | `patch_decryptor.py` |
| Damaged method bodies (GOTO/orphaned switch/try) replaced by typed-default stubs marked `/* RISE-PORT STUB */` — signatures kept so the class graph links. | ~100 methods / ~60 files | `stub_broken_methods.py` |
| Files whose damage survived stubbing rewritten as compilable skeletons (signatures + fields kept, bodies stubbed) — **the skeleton emitter still needs manual cleanup on several of them (they compile worse than intended); see §7.3** | 29 files | `skeleton_rewrite.py` |
| `net/minecraft/client/gui/aa|au|cd|cn.java`: the `** GOTO lbl-1000` idiom hand-restructured to plain if/else (semantics preserved, noted inline); untyped CFR locals typed (`int var1_1`, `boolean v0`, …) | 4 files | hand edits |

### 7.2 Build system

- `build.sh`: new primary stage `stage_client_source` — compiles the whole
  `sources/deobfuscated` tree (classpath: the official 1.8.9 library set from
  `libraries.minecraft.net` + Via stack from `repo.viaversion.com` + vendored
  org.json). On javac failure it logs honestly and the release is packaged
  INCOMPLETE (never faked). Binary patch mode (`artifacts/client-restored.jar`)
  is kept only as a fallback that will never trigger.
- `scripts/generate_version_json.py`: the version manifest now also carries the
  Via stack as runtime libraries (viaversion 5.12.2, viabackwards 5.12.2,
  viarewind 4.2.0 — pinned, sha1/size embedded) so FCL/Pojav download them
  into `libraries/` automatically.

### 7.3 Known remaining work (compile not yet green — last full compile: 12
### rounds, ~1545 javac errors)

Hand-repair pending (protected files, must stay REAL — never stub them):

| File | Damage | Needed |
|---|---|---|
| `net/minecraft/client/gui/bl.java` | 1 GOTO (`if (cTE < 40) ** GOTO lbl-1000` with the label block missing) + untyped locals (var3_3/var4_4/var5_5 int/boolean/String) | restructure + type locals |
| `net/minecraft/client/gui/s.java` | 1 GOTO + many untyped locals (var14_14…var23_23) | same |
| `net/minecraft/client/Minecraft.java` | 1 construct: `void var13_18;` (line ~1015) + its uses | drop the void local, keep flow |
| `rise/Client.java` | 1 GOTO in static init (24 errors) | restructure |
| `rise/module/ModuleManager.java` | 10 GOTOs across ~3 methods (97 errors) | restructure (Rise boot core) |
| `net/minecraft/client/multiplayer/b.java` | 3 GOTOs (44 errors) | restructure |
| `net/minecraft/util/bv.java` | 2 `** continue` (57 errors) | restructure |
| `net/minecraft/entity/item/a.java` | 1 GOTO (5 errors) | restructure |
| `net/minecraft/client/audio/SoundHandler.java` | orphaned case/catch (29 errors) | restructure |

Skeleton-emitter cleanup pending (my `skeleton_rewrite.py` output compiles
worse than the damage it replaced on these — rewrite them as clean minimal
classes by hand or improve the emitter): `ahm`, `yi`, `ak`, `bg`, `cx`,
`Scaffold`, `Spotify`, `ChannelMode`, `monitoring/f`, plus re-check `abs`,
`do`, `BlockPart`, the `RenderItem$1..4`/`TextureMap$1..3` anonymous classes,
`SkinManager$2`, `RenderGlobal$1`, `Bootstrap$5$1`, `network/a`,
`BlockSilverfish$EnumType` (enum), `Clipper`, `SafeWalk`.

After all files parse: an attribution round will surface missing-symbol errors
(via API drift etc.) — resolve by classpath/code, then the smoke test
(decrypt a real ciphertext constant through `nl.StringDecryptor`; PKCS#5
padding success on a multi-block payload proves key+algorithm), then package.
