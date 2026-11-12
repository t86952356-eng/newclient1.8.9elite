#!/usr/bin/env python3
"""Generic repair pass: stub every syntactically-broken method (body containing
CFR GOTO/orphan damage, or hit by javac error lines) with a typed-default body.
Keeps signatures/fields intact so the class graph and runtime links stay whole.
Skips REAL_REPAIR files (repaired by hand instead). Iterates until stable."""
import json, os, re, sys

MY = '/home/z/my-project'
CACHE = MY + '/.build_cache'
REPO = CACHE + '/repo'
TREE = REPO + '/sources/deobfuscated'

# Files that must stay REAL (boot/menu path) - never stubbed here.
REAL_REPAIR = {
    'rise/Client.java',
    'rise/module/ModuleManager.java',
    'net/minecraft/client/Minecraft.java',
    'net/minecraft/client/gui/aa.java',
    'net/minecraft/client/gui/au.java',
    'net/minecraft/client/gui/bl.java',
    'net/minecraft/client/gui/cd.java',
    'net/minecraft/client/gui/cn.java',
    'net/minecraft/client/gui/s.java',
    'net/minecraft/client/multiplayer/b.java',
    'net/minecraft/util/bv.java',
    'net/minecraft/client/audio/SoundHandler.java',
    'net/minecraft/entity/item/a.java',
    # never stub the decryptor port:
    'net/minecraft/network/r.java',
    'nl/StringDecryptor.java',
}

# javac messages that indicate true PARSE damage (stub-eligible).
# Attribution errors (missing symbol/package, incompatible types, bad args)
# must NOT trigger stubbing - they resolve via classpath/code fixes instead.
SYNTAX_MARKERS = ('illegal start', 'not a statement', "';' expected", '<identifier> expected',
                  'illegal character', 'reached end of file', 'class, interface',
                  'orphaned', "'catch' without", "'try' without", 'unclosed',
                  'receiver type only', 'not a type', "\')' expected", 'illegal enumeration')

def is_syntax_error(msg):
    return any(k in msg for k in SYNTAX_MARKERS)

METHOD_START = re.compile(r'^([ \t]*)(?:(?:public|private|protected|static|final|synchronized|abstract|native|strictfp|default|\*|/[^/\n]*)[ \t]*)*'
                          r'([A-Za-z_$][\w$.]*(?:\[\])*)[ \t]+([A-Za-z_$][\w$]*)[ \t]*\(([^)]*)\)[ \t]*(?:throws [^{]*)?\{[ \t]*$')
CTOR_START = re.compile(r'^([ \t]*)(?:(?:public|private|protected|default)[ \t]+)+([A-Za-z_$][\w$]*)[ \t]*\(([^)]*)\)[ \t]*(?:throws [^{]*)?\{[ \t]*$')
INIT_START = re.compile(r'^([ \t]*)(?:static[ \t]*)?\{[ \t]*$')

def sb(x):
    x &= 0xFF
    return x - 256 if x >= 128 else x

def strip_body_region(text, s, e):
    """Replace text[s:e] where s is index of '{' opening the body and e AFTER matching '}'.
    Returns replacement body string '' (caller builds new method text)."""
    return text[s:e]

def find_blocks(text):
    """Yield (kind, sig_start, sig_end, brace_start, brace_end_exclusive, indent, rettype, name)
    for methods/ctors/initializers at any single nesting level inside classes."""
    lines = text.split('\n')
    # map line -> char offset
    offsets = [0]
    for ln in lines:
        offsets.append(offsets[-1] + len(ln) + 1)
    blocks = []
    i = 0
    n = len(text)
    # simple scan: for each line start, try patterns
    for li, ln in enumerate(lines):
        m = METHOD_START.match(ln)
        mc = CTOR_START.match(ln) if not m else None
        mi = INIT_START.match(ln) if not (m or mc) else None
        if not (m or mc or mi):
            continue
        sig_start = offsets[li]
        brace_idx = text.index('{', offsets[li] + len(ln.rstrip()) - len(ln), offsets[li] + len(ln) + 2)
        # brace-match, string/comment aware
        depth = 1
        j = brace_idx + 1
        mode = None
        while j < n and depth:
            c = text[j]
            nxt = text[j+1] if j+1 < n else ''
            if mode is None:
                if c == '/' and nxt == '/':
                    k = text.find('\n', j)
                    j = k if k != -1 else n
                    continue
                if c == '/' and nxt == '*':
                    k = text.find('*/', j)
                    j = (k + 2) if k != -1 else n
                    continue
                if c == '"': mode = 's'; j += 1; continue
                if c == "'": mode = 'c'; j += 1; continue
                if c == '{': depth += 1
                elif c == '}': depth -= 1
                j += 1
            elif mode == 's':
                if c == '\\': j += 2; continue
                if c == '"': mode = None
                j += 1
            else:
                if c == '\\': j += 2; continue
                if c == "'": mode = None
                j += 1
        brace_end = j  # index AFTER closing brace (or EOF)
        if m:
            blocks.append(('method', sig_start, offsets[li] + len(ln), brace_idx, brace_end,
                           m.group(1), m.group(2), m.group(3), li + 1, brace_end))
        elif mc:
            blocks.append(('ctor', sig_start, offsets[li] + len(ln), brace_idx, brace_end,
                           mc.group(1), None, mc.group(2), li + 1, brace_end))
        else:
            blocks.append(('init', sig_start, offsets[li] + len(ln), brace_idx, brace_end,
                           mi.group(1), None, None, li + 1, brace_end))
    return blocks

def default_body(rettype):
    if rettype is None:
        return ''
    t = rettype.replace(' ', '')
    if t in ('void',):
        return ''
    if t in ('boolean',):
        return 'return false;'
    if t in ('int', 'short', 'byte', 'char', 'long', 'float', 'double'):
        return 'return 0;' if t != 'float' and t != 'double' else 'return 0.0F;' if t == 'float' else 'return 0.0D;'
    if t.endswith('[]'):
        return 'return null;'
    if t in ('String', 'java.lang.String'):
        return 'return "";'
    return 'return null;'

def line_of(blocks_entry_end, text):
    return text.count('\n', 0, blocks_entry_end) + 1

def process_file(path, err_lines, dry=False):
    text = open(path, encoding='utf-8', errors='replace').read()
    blocks = find_blocks(text)
    stubbed = []
    edits = []  # (brace_start, brace_end, replacement)
    for b in blocks:
        kind, sig_s, sig_e, br_s, br_e, indent, rettype, name, start_line, end_char = b
        end_line = text.count('\n', 0, br_e) + 1
        hit = any(start_line <= el <= end_line + 2 for el in err_lines)
        body = text[br_s:br_e]
        goto = '** GOTO' in body or '** continue' in body
        if not (hit or goto):
            continue
        # skip abstract/native methods without body (br_s matches next method?!) -
        # safety: body must contain at least one ';' or '}' beyond braces
        if kind == 'method':
            rep = (f'{{ /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); '
                   f'feature impact documented in PORTING_NOTES.md */\n{indent}    {default_body(rettype)}\n{indent}}}')
        elif kind == 'ctor':
            rep = ('{ /* RISE-PORT STUB: constructor body unrestored */ }')
        else:
            rep = '{ /* RISE-PORT STUB: initializer unrestored */ }'
        # anchored end: naive brace-counting overshoots on unbalanced CFR bodies;
        # use the first member-level `^    }$` at/after the LAST damage marker.
        anchor = br_s
        for dm in re.finditer(r'\*\* (?:GOTO|continue)', text[br_s:br_e]):
            anchor = br_s + dm.end()
        # error-line offsets inside the span also anchor
        for el in err_lines:
            if start_line <= el <= end_line + 2:
                off = text.find('\n', 0)
                # cheap line->offset: count via split once
                if not hasattr(process_file, '_lines') or process_file._text is not text:
                    process_file._lines = text.split('\n')
                    process_file._offs = []
                    o = 0
                    for ln in process_file._lines:
                        process_file._offs.append(o)
                        o += len(ln) + 1
                    process_file._text = text
                if el - 1 < len(process_file._offs):
                    anchor = max(anchor, process_file._offs[el - 1])
        mm = re.compile(r'^    \}$', re.M).search(text, anchor)
        mend = mm.end() if mm and mm.end() <= br_e + 400 else br_e
        edits.append((br_s, mend, rep))
        stubbed.append((name or kind, start_line))
    if not edits:
        return []
    # drop overlapping edits (keep the earliest, skip contained ones)
    edits.sort(key=lambda t: t[0])
    kept = []
    for s, e, rep in edits:
        if kept and s < kept[-1][1]:
            continue
        kept.append((s, e, rep))
    out, last = [], 0
    for s, e, rep in kept:
        out.append(text[last:s]); out.append(rep); last = e
    out.append(text[last:])
    new = ''.join(out)
    if not dry and new != text:
        open(path, 'w', encoding='utf-8').write(new)
    return stubbed

def main():
    round_json = sys.argv[1] if len(sys.argv) > 1 else CACHE + '/compile-rounds/round-2.json'
    dry = '--dry' in sys.argv
    d = json.load(open(round_json))
    per_file = {}
    for e in d['errors']:
        if not is_syntax_error(e['msg']):
            continue  # attribution-level error: NOT stub-eligible
        per_file.setdefault(e['file'], set()).add(e['line'])
    total = 0
    report = {}
    for rel, lines in sorted(per_file.items()):
        if rel in REAL_REPAIR:
            continue
        p = os.path.join(TREE, rel)
        if not os.path.exists(p):
            continue
        st = process_file(p, lines, dry)
        if st:
            total += len(st)
            report[rel] = [f'{n}@{l}' for n, l in st]
    print(json.dumps({'files_stubbed': len(report), 'methods_stubbed': total}, indent=1))
    for f, ms in report.items():
        print(' ', f, '->', len(ms), 'methods:', ', '.join(ms[:8]) + (' ...' if len(ms) > 8 else ''))
    json.dump(report, open(CACHE + '/compile-rounds/stub-report.json', 'w'), indent=1)

if __name__ == '__main__':
    main()
