# BUILD_REQUIREMENTS.md

## What the CI (GitHub Actions) provides automatically

- Ubuntu runner, Temurin JDK 21 (`actions/setup-java`)
- Python 3 (manifest generation)
- Network access to `libraries.minecraft.net` (LWJGL 2.9.4-nightly, sha1-verified)

Everything else is vendored in the repository:
- ASM 9.9 jars — `tools/asm-*.jar`
- org.json (public domain) — `third_party/org.json/`
- Official Mojang 1.8.9 manifest — `scripts/vendor/1.8.9-official.json`

## What a developer needs locally

| Requirement | Version | Purpose |
|---|---|---|
| JDK | 17+ (21 recommended) | `javac --release 17` for the runtime layer |
| Python | 3.8+ | version manifest generation |
| curl | any | LWJGL download (cached in `build/libs/`) |
| POSIX shell + zip/unzip | any | `build.sh` |

Windows is NOT required. No PowerShell, no Visual Studio, no Android NDK for
the current pipeline (nothing native is compiled by this project — see the
audit, BLOCKER-2, for the future NDK path).

## Required artifact to unlock the playable client JAR

| File | Expected sha256 | Source |
|---|---|---|
| `artifacts/client-restored.jar` | `a93ea829dcc0869173a7c3aad8a466b6790bb46d0a6f4eaf772b5bcf756d3e17` | Your original Rise 6.9.9 distribution (restored by the same pipeline that produced this source package). Place it at that exact path and push (or upload via GitHub web UI). **Do not** download it from third parties. |
| `artifacts/libraries.jar` | `2f9aeafcd5c9ddf01e65b88bd008e2736b016fa3f4c3c6c902588a9c8c4b88a0` | Optional — only used by the legacy Windows smoke tests; the version manifest declares the official 1.8.9 libraries instead. |

`.gitignore` excludes `artifacts/*.jar`, so add it with
`git add -f artifacts/client-restored.jar` or upload through the GitHub web
UI (Add file → Upload files). Reminder: only upload files you have the right
to distribute; for a private repo this stays within your account.

## Build commands

```bash
./build.sh            # full pipeline; client stage activates when the JAR above exists
./build.sh audit      # environment + artifact report only
```

Outputs:
- `build/rise-bootstrap-6.9.9.jar` — runtime layer (always)
- `versions/Rise-6.9.9/Rise-6.9.9.json` — version manifest (always)
- `build/desktop/Rise-6.9.9.jar` — playable client version JAR (when the
  artifact is present)
- `dist/Rise-6.9.9-client-version.zip`, `dist/Rise-6.9.9-source.zip` —
  release bundles

## Release flow (automatic)

Every push to `main` runs `.github/workflows/build.yml`, which builds,
verifies, packages and publishes a GitHub Release tagged `v6.9.9-b<run>` with:
- `Rise-6.9.9-client-version.zip` (JSON + JAR when available, or JSON +
  bootstrap layer when not, clearly marked INCOMPLETE)
- `Rise-6.9.9-source.zip` (the modified source tree)
- `Rise-6.9.9.json` (standalone copy)
- English release notes generated from `CHANGELOG.md` plus the real build
  status — never a fabricated success claim.
