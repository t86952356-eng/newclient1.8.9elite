#!/usr/bin/env python3
"""Nuclear repair: rewrite a damaged file as a compilable skeleton.
Keeps: package, imports, class/enum header (extends/implements), annotations,
field declarations (initializers simplified), every method/ctor signature
(bodies stubbed with typed defaults). Used for files whose structural damage
survives normal stubbing. Selection: files with errors in the given round JSON
that are NOT in the protected set."""
import json, os, re, sys

MY = '/home/z/my-project'
CACHE = MY + '/.build_cache'
TREE = CACHE + '/repo/sources/deobfuscated'

PROTECTED = {
    'rise/Client.java', 'rise/module/ModuleManager.java', 'net/minecraft/client/Minecraft.java',
    'net/minecraft/client/gui/aa.java', 'net/minecraft/client/gui/au.java', 'net/minecraft/client/gui/bl.java',
    'net/minecraft/client/gui/cd.java', 'net/minecraft/client/gui/cn.java', 'net/minecraft/client/gui/s.java',
    'net/minecraft/client/multiplayer/b.java', 'net/minecraft/util/bv.java', 'net/minecraft/entity/item/a.java',
    'net/minecraft/client/audio/SoundHandler.java', 'net/minecraft/network/r.java', 'nl/StringDecryptor.java',
}

TYPE_DECL = re.compile(r'^([ \t]*)(public|protected|private)?[ \t]*(final[ \t]+)?(class|enum|interface)[ \t]+([\w$]+)([^\{]*)\{[ \t]*$')
FIELD = re.compile(r'^([ \t]*)((?:(?:public|private|protected|static|final|transient|volatile|synchronized|native|strictfp|abstract)[ \t]+)*)'
                   r'([\w$.]+(?:\[\])?)[ \t]+([\w$]+)([ \t]*=[ \t]*(.*))?[ \t]*;[ \t]*$')
METH = re.compile(r'^([ \t]*)((?:(?:public|private|protected|static|final|synchronized|native|strictfp|abstract)[ \t]+)*)'
                  r'([\w$.]+(?:\[\])?)[ \t]+([\w$]+)[ \t]*\(([^)]*)\)[ \t]*(?:throws [^\{]*)?\{[ \t]*$')
CTOR = re.compile(r'^([ \t]*)((?:(?:public|private|protected)[ \t]+)+)([\w$]+)[ \t]*\(([^)]*)\)[ \t]*(?:throws [^\{]*)?\{[ \t]*$')
ANNOT = re.compile(r'^[ \t]*@[A-Za-z]')
SIMPLE_INIT = re.compile(r"""^[ \t]*(?:"[^"]*"|'[^']*'|null|true|false|-?\d+[LlFfDd]?)$""")

def default_body(t):
    if not t: return ''
    t = t.strip()
    if t == 'void': return ''
    if t == 'boolean': return 'return false;'
    if t in ('int', 'short', 'byte', 'char', 'long'): return 'return 0;'
    if t == 'float': return 'return 0.0F;'
    if t == 'double': return 'return 0.0D;'
    if t == 'String': return 'return "";'
    return 'return null;'

def default_init(t):
    t = t.strip()
    if t.endswith(']'): return 'null'
    return {'boolean': 'false', 'int': '0', 'short': '0', 'byte': '0', 'char': "0",
            'long': '0L', 'float': '0.0F', 'double': '0.0D', 'String': '""'}.get(t, 'null')

def skeleton(path):
    text = open(path, encoding='utf-8', errors='replace').read()
    lines = text.split('\n')
    out = []
    out.append('/* RISE-PORT SKELETON: structural CFR damage beyond method-stub repair. */')
    out.append('/* Original bodies/flow lost; signatures kept so the class graph links. */')
    i = 0
    n = len(lines)
    # header: comments+package+imports until type decl
    header_done = False
    pending_annots = []
    kind = None
    while i < n:
        ln = lines[i]
        if not header_done:
            if ln.startswith('package ') or ln.startswith('import ') or ln.strip().startswith(('/*', '*', '//')):
                out.append(ln)
                i += 1
                continue
            m = TYPE_DECL.match(ln)
            if m:
                kind = m.group(4)
                out.append(ln)
                header_done = True
                i += 1
                continue
            # no recognizable type decl (file may start with class at line 1 w/o modifiers)
            m2 = re.match(r'^[ \t]*(class|enum|interface)[ \t]+([\w$]+)([^\{]*)\{[ \t]*$', ln)
            if m2:
                kind = m2.group(1)
                out.append(ln)
                header_done = True
                i += 1
                continue
            # wrapped header: `public class X` alone on a line, extends/implements on the next
            m3 = re.match(r'^[ \t]*(?:(?:public|private|protected|final|abstract|strictfp)[ \t]+)*(class|enum|interface)[ \t]+([\w$]+)[ \t]*$', ln)
            if m3:
                header = [ln]
                kind = m3.group(1)
                j2 = i + 1
                while j2 < n and '{' not in lines[j2] and j2 - i < 12:
                    header.append(lines[j2])
                    j2 += 1
                if j2 < n and '{' in lines[j2]:
                    header.append(lines[j2])
                    out.extend(header)
                    header_done = True
                    i = j2 + 1
                    continue
            i += 1
            continue
        # inside type body
        s = ln.strip()
        if not s or s.startswith(('/*', '*', '//')):
            i += 1
            continue
        if ANNOT.match(ln):
            pending_annots.append(ln)
            i += 1
            continue
        if kind == 'enum':
            # enum constants until first ';' at member level
            m = re.match(r'^([ \t]*)([\w$]+)(\([^\)]*\))?[ \t]*(,|;)?[ \t]*$', ln)
            if m and m.group(2):
                name = m.group(2)
                if name in ('if', 'for', 'while', 'switch', 'return', 'new', 'do', 'try', 'else', 'break', 'continue', 'throw', 'case', 'default'):
                    i += 1
                    continue
                # is it a constant (all-caps heuristic) or a method? constants first section only
                if not re.match(r'^(M?[A-Z_0-9]+)$', name):
                    i += 1
                    continue
                out.append(('    ' if not out[-1].strip().endswith('{') else '        ') + name + ',')
                i += 1
                continue
        mc = CTOR.match(ln) or METH.match(ln)
        if mc:
            isctor = bool(CTOR.match(ln))
            mm = CTOR.match(ln) if isctor else METH.match(ln)
            indent = mm.group(1)
            mods = mm.group(2) or ''
            name = mm.group(3 if isctor else 4)
            rett = None if isctor else mm.group(3)
            if not isctor and name in ('if', 'for', 'while', 'switch', 'return', 'new', 'do', 'try', 'catch', 'else', 'break', 'continue', 'throw', 'case', 'default', 'assert', 'class', 'enum'):
                pending_annots = []
                i += 1
                continue
            out.extend(pending_annots); pending_annots = []
            if isctor:
                out.append(f'{indent}{mods.strip()} {name}() {{ /* SKELETON */ }}')
            else:
                db = default_body(rett)
                body = f' {{ /* SKELETON */ {db} }}' if db else ' { /* SKELETON */ }'
                out.append(f'{indent}{mods.strip()} {rett} {name}(){body}')
            i += 1
            continue
        mf = FIELD.match(ln)
        if mf:
            indent, mods, ftype, fname, _, init = mf.groups()
            if fname in ('if', 'for', 'while', 'switch', 'return', 'new', 'do', 'try', 'catch', 'else', 'break', 'continue', 'throw', 'case', 'default', 'assert', 'class', 'enum', 'this', 'super'):
                pending_annots = []
                i += 1
                continue
            keep_init = init and SIMPLE_INIT.match(init.strip() or '')
            val = init.strip() if keep_init else default_init(ftype)
            mods2 = mods.replace('final ', '').replace('final', '') or 'public '
            out.extend(pending_annots); pending_annots = []
            out.append(f'{indent}{mods2.strip() or "public"} {ftype} {fname} = {val};')
            pending_annots = []
            i += 1
            continue
        pending_annots = []
        i += 1
    # close type
    if out and not out[-1].strip() == '}':
        out.append('}')
    # trim trailing comma of enum constants -> semicolon before methods? crude: leave as-is
    new = '\n'.join(out) + '\n'
    if 'class' not in new.split('\n')[3 if len(new.split(chr(10)))>3 else 0] and kind is None:
        return None
    return new

def main():
    round_json = sys.argv[1]
    d = json.load(open(round_json))
    files = sorted({e['file'] for e in d['errors']} - PROTECTED)
    done = []
    for rel in files:
        p = os.path.join(TREE, rel)
        if not os.path.exists(p):
            continue
        sk = skeleton(p)
        if sk:
            open(p, 'w', encoding='utf-8').write(sk)
            done.append(rel)
        else:
            print('SKIP (no type decl):', rel)
    print('skeleton-rewritten:', len(done))
    for f in done: print('  ', f)

if __name__ == '__main__':
    main()
