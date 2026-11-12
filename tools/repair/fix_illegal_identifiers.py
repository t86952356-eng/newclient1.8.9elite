#!/usr/bin/env python3
"""Fixer 1 — rename illegal Java identifiers (starting with digit, e.g. 0OOOoo00o0)
across the whole deobfuscated tree, outside strings/chars/comments.
Scheme: TOKEN -> 'q' + TOKEN  (injective, deterministic, collision-free)."""
import os, re, sys, json

ROOT = '/home/z/my-project/.build_cache/repo/sources/deobfuscated'
DRY = '--dry' in sys.argv

# identifier: starts with a digit -> illegal in Java, UNLESS the whole word-token
# is a valid numeric literal (int/long/hex/binary/float). Only the remainder
# (e.g. 0OOOoo00o0) is an illegal identifier and gets the 'q' prefix.
NUMERIC = re.compile(r'''(?x)
    0[xX][0-9a-fA-F_]+[lL]?
  | 0[bB][01_]+[lL]?
  | [0-9][0-9_]*(?:\.[0-9_]*)?(?:[eE][+-]?[0-9]+)?[lLfFdD]?
''')
WORDTOK = re.compile(r'[0-9][A-Za-z0-9_$]*')

def scan_code(text):
    """Yield (start, end) of identifier matches that are in CODE context
    (not inside string/char literals or comments)."""
    i, n = 0, len(text)
    mode = None  # None | 'line' | 'block' | 'str' | 'chr'
    while i < n:
        c = text[i]
        nxt = text[i+1] if i+1 < n else ''
        if mode is None:
            if c == '/' and nxt == '/': mode = 'line'; i += 2; continue
            if c == '/' and nxt == '*': mode = 'block'; i += 2; continue
            if c == '"': mode = 'str'; i += 1; continue
            if c == "'": mode = 'chr'; i += 1; continue
            if c.isdigit():
                prev = text[i-1] if i > 0 else ''
                if prev.isalnum() or prev in '_$':
                    i += 1; continue        # digit inside a larger identifier: legal token
                wt = WORDTOK.match(text, i)          # maximal word-run (identifier-shaped)
                nl = NUMERIC.match(text, i)          # maximal numeric-literal prefix
                # literal wins iff it spans at least the whole word-run
                # (covers 0.765625E-4f wholly; fails inside 0OOOoo00o0 -> illegal id)
                if wt and wt.start() == i and nl and nl.end() >= wt.end():
                    i = nl.end(); continue            # full numeric literal: leave as-is
                if wt and wt.start() == i:
                    yield wt.start(), wt.end()       # illegal identifier
                    i = wt.end(); continue
            i += 1
        elif mode == 'line':
            if c == '\n': mode = None
            i += 1
        elif mode == 'block':
            if c == '*' and nxt == '/': mode = None; i += 2; continue
            i += 1
        elif mode == 'str':
            if c == '\\': i += 2; continue
            if c == '"': mode = None
            i += 1
        elif mode == 'chr':
            if c == '\\': i += 2; continue
            if c == "'": mode = None
            i += 1

def main():
    stats = {'files': 0, 'tokens': {}, 'occurrences': 0}
    for dp, ds, fs in os.walk(ROOT):
        ds.sort()
        for f in sorted(fs):
            if not f.endswith('.java'): continue
            p = os.path.join(dp, f)
            text = open(p, encoding='utf-8', errors='replace').read()
            edits = []
            for s, e in scan_code(text):
                tok = text[s:e]
                edits.append((s, e, 'q' + tok))
                stats['tokens'][tok] = stats['tokens'].get(tok, 0) + 1
            if not edits: continue
            stats['files'] += 1
            stats['occurrences'] += len(edits)
            out = []
            last = 0
            for s, e, rep in edits:
                out.append(text[last:s]); out.append(rep); last = e
            out.append(text[last:])
            new = ''.join(out)
            if new != text and not DRY:
                open(p, 'w', encoding='utf-8').write(new)
    print(json.dumps({'files_touched': stats['files'],
                      'occurrences': stats['occurrences'],
                      'distinct_tokens': len(stats['tokens'])}, indent=1))
    print('top tokens:', sorted(stats['tokens'].items(), key=lambda kv: -kv[1])[:12])
    fix_keywords()

KEYWORDS = ('do', 'switch', 'if', 'else', 'for', 'while', 'case', 'default', 'new',
            'try', 'catch', 'throw', 'break', 'continue', 'assert', 'class', 'enum',
            'return', 'instanceof', 'extends', 'implements')
KW_ALT = '|'.join(KEYWORDS)

# method decl with a return type: ` mods TYPE name(args) [throws ...] {`
DECL_A = re.compile(rf'^([ \t]*(?:(?:public|private|protected|static|final|synchronized|native|strictfp|abstract)[ \t]+)*'
                    rf'[\w$.]+(?:\[\])?[ \t]+)({KW_ALT})[ \t]*\(([^)]*)\)[ \t]*(?:throws [^{{]*)?\{{[ \t]*$')
# ctor decl (no return type, modifier required): `public do(args) {`
DECL_B = re.compile(rf'^([ \t]*(?:(?:public|private|protected)[ \t]+)+)({KW_ALT})[ \t]*\(([^)]*)\)[ \t]*(?:throws [^{{]*)?\{{[ \t]*$')
# call sites: `.name(`
CALLSITE = re.compile(rf'\.({KW_ALT})[ \t]*\(')

def fix_keywords():
    """Phase B: methods/ctors named with Java keywords (CFR artifact) -> j_<kw>.
    Pass 1 renames declarations tree-wide and records which keywords were hit;
    pass 2 renames the dotted call sites of exactly those keywords in ALL files."""
    renamed = set()
    decl_edits = {}
    for dp, ds, fs in os.walk(ROOT):
        ds.sort()
        for f in sorted(fs):
            if not f.endswith('.java'): continue
            p = os.path.join(dp, f)
            text = open(p, encoding='utf-8', errors='replace').read()
            changed = False
            out_lines = []
            for ln in text.split('\n'):
                m = DECL_A.match(ln) or DECL_B.match(ln)
                if m:
                    kw = m.group(2)
                    renamed.add(kw)
                    out_lines.append(ln[:m.start(2)] + 'j_' + kw + ln[m.end(2):])
                    changed = True
                else:
                    out_lines.append(ln)
            if changed:
                decl_edits[p] = '\n'.join(out_lines)
    for p, text in decl_edits.items():
        open(p, 'w', encoding='utf-8').write(text)
    calls_files = 0
    if renamed:
        calls = re.compile(r'\.(' + '|'.join(sorted(renamed)) + r')[ \t]*\(')
        for dp, ds, fs in os.walk(ROOT):
            ds.sort()
            for f in sorted(fs):
                if not f.endswith('.java'): continue
                p = os.path.join(dp, f)
                text = open(p, encoding='utf-8', errors='replace').read()
                new = calls.sub(lambda m: '.j_' + m.group(1) + '(', text)
                if new != text:
                    open(p, 'w', encoding='utf-8').write(new)
                    calls_files += 1
    print('keyword-named members fixed: keywords =', sorted(renamed),
          '| decl files =', len(decl_edits), '| call-site files =', calls_files)

if __name__ == '__main__':
    main()
