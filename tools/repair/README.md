# tools/repair — source-build repair toolchain (session 6.9.9-android.2)

Reference copies of the deterministic repair tools used on
`sources/deobfuscated/`. The live working copies (with the local build cache
paths: JDK 8 at .build_cache/jdk8, libs at .build_cache/libs) live in the
build sandbox at /home/z/my-project/scripts/ — see AI_AGENT_GUIDE §2b.

Run order on a pristine tree (git checkout -- sources/ first):
1. fix_illegal_identifiers.py  — phase A: digit-led illegal ids -> q<tok>;
                                  phase B: keyword-named members -> j_<kw>.
2. patch_decryptor.py          — port the JNI string decryptor to pure Java
                                  (nl/StringDecryptor), rewrite the 25 native
                                  decls as delegators, drop registerNatives.
3. stub_broken_methods.py <round.json>  — stub GOTO/orphan-damaged method
                                  bodies with typed defaults (parse errors only).
4. skeleton_rewrite.py <round.json>     — last resort for structurally broken
                                  files (NEVER on the protected list).
5. client_compile.py            — javac driver + error classification
                                  (rounds logged to .build_cache/compile-rounds).

Iterate 3-5 until green; hand-repair the protected files (see
PORTING_NOTES.md §7.3) — never stub or skeleton them.
