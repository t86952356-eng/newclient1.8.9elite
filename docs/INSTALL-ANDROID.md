# Installing Rise 6.9.9 on Android (FoldCraft Launcher / PojavLauncher / Zalith)

## Requirements

- Android 8+ (ARM64), e.g. Helio G99 class devices
- FoldCraft Launcher (FCL) with the **Gl4ES** renderer (owner's profile),
  or PojavLauncher / Zalith Launcher
- The release file `Rise-6.9.9-client-version.zip` from this repository's
  GitHub Releases

> The release must be marked **COMPLETE** (it contains `Rise-6.9.9.jar`).
> INCOMPLETE releases contain the manifest + bootstrap layer only and will
> not start the game — check the release notes first.

## FoldCraft Launcher (owner's launcher)

1. Unzip `Rise-6.9.9-client-version.zip`; you get a folder `Rise-6.9.9/`
   containing `Rise-6.9.9.json` and `Rise-6.9.9.jar`.
2. Copy that folder into FCL's game directory:
   `<FCL game dir>/versions/Rise-6.9.9/`
   - FCL's default game dir is usually
     `/storage/emulated/0/games/FoldCraftLauncher/` (check
     Settings → Global game directory if unsure).
3. In FCL: **Versions** → the list should now show `Rise-6.9.9`. Select it.
4. Renderer: **Gl4ES** (recommended on Helio G99). Memory: 2–3 GB is plenty
   for 1.8.9.
5. Launch. On first start the launcher downloads the official 1.8 assets
   and libraries automatically (needs internet once).

## PojavLauncher / Zalith Launcher

Same layout: copy the `Rise-6.9.9` folder into
`<game dir>/versions/`, then select version `Rise-6.9.9` in the launcher.
Renderer: Gl4ES (or Zink as a fallback test). Both launchers read the
manifest's `minecraftArguments` (legacy 1.8.9 format) and substitute their
LWJGL/OpenGL compatibility layer automatically.

## What to expect

- **Main menu:** the standard vanilla Minecraft 1.8.9 menu
  (Singleplayer / Multiplayer / Options / Quit). The Rise custom menu is
  gone by design.
- **Blur:** removed everywhere by design; UI elements render with plain
  translucent backgrounds (lighter on the GPU — better for Gl4ES).
- **ClickGUI / modules:** Rise's module system stays (open its GUI from the
  in-game controls).
- **Login:** use your launcher account as usual (FCL handles
  Microsoft/offline sessions); the client does not touch authentication.

## If it crashes

1. Grab the log: FCL → Logs (or `latest.log` inside the game dir), plus
   logcat if FCL shows a native crash.
2. Open the repository's `AI_AGENT_GUIDE.md` §5 — known crashes and fixes
   are listed there. If yours is new, report it to the repository owner so
   the AI agent can append the diagnosis and solution.

## Desktop (optional)

The same `Rise-6.9.9` version folder works in any launcher that accepts
custom local versions (e.g. MultiMC/Prism: *Add instance → Import from
ZIP*, or copy into `versions/` for vanilla-style launchers). Java 17+
required.
