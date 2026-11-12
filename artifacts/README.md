# artifacts/ — owner-provided build inputs

This directory holds binary inputs that cannot be rebuilt from the source
tree. They are NOT redistributed by this repository (git-ignored) and must
be provided by the repository owner from their original Rise distribution.

| File | Expected sha256 | Required for |
|---|---|---|
| `client-restored.jar` | `a93ea829dcc0869173a7c3aad8a466b6790bb46d0a6f4eaf772b5bcf756d3e17` | Producing the playable `Rise-6.9.9.jar` (BLOCKER-1) |
| `libraries.jar` | `2f9aeafcd5c9ddf01e65b88bd008e2736b016fa3f4c3c6c902588a9c8c4b88a0` | Legacy Windows smoke tests only (optional) |

Upload via the GitHub web UI (Add file → Upload files) or
`git add -f artifacts/client-restored.jar`. The next cloud build picks it up
automatically and flips releases from INCOMPLETE to COMPLETE.
