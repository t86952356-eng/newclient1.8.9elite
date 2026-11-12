#!/usr/bin/env python3
"""Compile driver for the Rise 6.9.9 source-build port.

- Fetches/verifies the compile classpath (official Mojang 1.8.9 library set,
  org.json vendored, Via stack from the official ViaVersion maven repo).
- Runs javac (Temurin 8) over sources/deobfuscated.
- Classifies errors into families and prints a compact report.
- Keeps per-round logs + JSON in .build_cache/compile-rounds/.

Usage: client_compile.py [--nolibs] [-- tag...]
"""
import hashlib, json, os, re, subprocess, sys, urllib.request

MY = '/home/z/my-project'
CACHE = MY + '/.build_cache'
REPO = CACHE + '/repo'
TREE = REPO + '/sources/deobfuscated'
LIBS = CACHE + '/libs'
JAVAC = CACHE + '/jdk8/bin/javac'
ROUNDS = CACHE + '/compile-rounds'
VIA_REPO = 'https://repo.viaversion.com'
os.makedirs(LIBS, exist_ok=True)
os.makedirs(ROUNDS, exist_ok=True)

def log(m): print('[compile]', m)

def fetch(url, dest, sha1=None, tries=3):
    if os.path.exists(dest) and os.path.getsize(dest) > 0:
        if sha1:
            h = hashlib.sha1(open(dest, 'rb').read()).hexdigest()
            if h != sha1:
                os.remove(dest)
        else:
            return dest
    if os.path.exists(dest) and os.path.getsize(dest) > 0:
        return dest
    for t in range(tries):
        try:
            req = urllib.request.Request(url, headers={'User-Agent': 'elite-legacy-build'})
            with urllib.request.urlopen(req, timeout=120) as r:
                data = r.read()
            open(dest, 'wb').write(data)
            if sha1:
                h = hashlib.sha1(data).hexdigest()
                if h != sha1:
                    os.remove(dest)
                    raise RuntimeError(f'sha1 mismatch for {url}')
            return dest
        except Exception as e:
            if t == tries - 1:
                raise
            log(f'retry {t+1} {url}: {e}')

def maven_latest(group_path, artifact):
    meta_url = f'{VIA_REPO}/{group_path}/{artifact}/maven-metadata.xml'
    req = urllib.request.Request(meta_url, headers={'User-Agent': 'elite-legacy-build'})
    with urllib.request.urlopen(req, timeout=60) as r:
        meta = r.read().decode()
    rel = re.search(r'<release>([^<]+)</release>', meta)
    if rel:
        return rel.group(1)
    versions = [v for v in re.findall(r'<version>([^<]+)</version>', meta)
                if not v.upper().endswith('-SNAPSHOT')]
    return versions[-1] if versions else None

def prep_libs():
    log('== classpath preparation ==')
    manifest = json.load(open(REPO + '/scripts/vendor/1.8.9-official.json'))
    jars = []
    for lib in manifest['libraries']:
        art = (lib.get('downloads') or {}).get('artifact')
        if not art or not art.get('url'):
            continue
        name = art['path'].split('/')[-1]
        dest = os.path.join(LIBS, name)
        fetch(art['url'], dest, art.get('sha1'))
        jars.append(dest)
    # org.json (vendored, public domain) -> classes dir
    oj_dir = os.path.join(LIBS, 'orgjson-classes')
    if not os.path.isdir(oj_dir) or not os.path.exists(oj_dir + '/org/json/JSONObject.class'):
        srcs = [os.path.join(dp, f) for dp, ds, fs in os.walk(REPO + '/third_party/org.json/org/json') for f in fs if f.endswith('.java')]
        out = oj_dir + '.tmp'
        os.makedirs(out, exist_ok=True)
        subprocess.run([JAVAC, '-encoding', 'UTF-8', '-nowarn', '-d', out] + srcs, check=True)
        if os.path.isdir(oj_dir):
            import shutil; shutil.rmtree(oj_dir)
        os.rename(out, oj_dir)
    jars.append(oj_dir)
    # Via stack (official maven, latest stable)
    via = [('com/viaversion', 'viaversion'), ('com/viaversion', 'viabackwards'), ('com/viaversion', 'viarewind')]
    for group, art in via:
        try:
            v = maven_latest(group, art)
        except Exception as e:
            log(f'via metadata failed for {art}: {e}')
            continue
        if not v:
            log(f'no versions found for {art}')
            continue
        url = f'{VIA_REPO}/{group}/{art}/{v}/{art}-{v}.jar'
        dest = os.path.join(LIBS, f'{art}-{v}.jar')
        try:
            fetch(url, dest)
            jars.append(dest)
            log(f'via: {art}-{v}')
        except Exception as e:
            log(f'via fetch failed {art}-{v}: {e}')
    # remove stale via versions of same artifact
    seen = {}
    for j in list(jars):
        base = os.path.basename(j)
        art = re.match(r'(viaversion|viabackwards|viarewind)-', base)
        if art:
            a = art.group(1)
            if a in seen and seen[a] != j:
                older = min(seen[a], j, key=os.path.getmtime)
                jars.remove(older)
                try: os.remove(older)
                except OSError: pass
                seen[a] = j if older == j else seen[a]
            else:
                seen[a] = j
    return jars

def build_source_list():
    srcs = []
    for dp, ds, fs in os.walk(TREE):
        ds.sort()
        for f in sorted(fs):
            if f.endswith('.java') and f != 'Start.java':
                srcs.append(os.path.join(dp, f))
    return srcs

def run_javac(cp, srcs, out_dir, round_no):
    lst = os.path.join(ROUNDS, f'sources-{round_no}.txt')
    open(lst, 'w').write('\n'.join(srcs))
    cmd = [JAVAC, '-encoding', 'UTF-8', '-nowarn', '-proc:none',
           '-Xmaxerrs', '20000', '-cp', os.pathsep.join(cp), '-d', out_dir, '@' + lst]
    p = subprocess.run(cmd, capture_output=True, text=True)
    return p.returncode, p.stdout + p.stderr

def classify(log_text, goto_files):
    err_re = re.compile(r'^(/[^:]+\.java):(\d+): (error|warning): (.*)$', re.M)
    errors = []
    for m in err_re.finditer(log_text):
        path, line, sev, msg = m.group(1), int(m.group(2)), m.group(3), m.group(4)
        if sev == 'warning':
            continue
        rel = os.path.relpath(path, TREE)
        errors.append({'file': rel, 'line': line, 'msg': msg})
    families = {}
    def fam(e, name):
        families.setdefault(name, []).append(e)
    for e in errors:
        msg = e['msg']
        rel = e['file']
        in_goto = rel in goto_files
        if in_goto and ('illegal start' in msg or 'not a statement' in msg or "';' expected" in msg
                        or '<identifier> expected' in msg or 'illegal character' in msg
                        or 'reached end of file' in msg or 'class, interface' in msg
                        or 'unclosed' in msg or 'expected' in msg[:40]):
            fam(e, 'SYNTAX_GOTO_FILE')
        elif 'package' in msg and 'does not exist' in msg:
            fam(e, 'MISSING_PKG')
        elif 'cannot find symbol' in msg:
            fam(e, 'MISSING_SYMBOL')
        elif 'cannot be applied to given types' in msg:
            fam(e, 'BAD_ARGS')
        elif 'incompatible types' in msg:
            fam(e, 'INCOMPATIBLE')
        elif 'already defined' in msg or 'duplicate' in msg:
            fam(e, 'DUPLICATE')
        elif 'is not abstract and does not override' in msg:
            fam(e, 'OVERRIDE_MISSING')
        elif 'unreachable' in msg:
            fam(e, 'UNREACHABLE')
        else:
            fam(e, 'OTHER')
    return errors, families

def main():
    goto_files = set()
    for dp, ds, fs in os.walk(TREE):
        for f in fs:
            if not f.endswith('.java'): continue
            p = os.path.join(dp, f)
            try:
                t = open(p, encoding='utf-8', errors='replace').read()
            except Exception:
                continue
            if 'GOTO lbl' in t:
                goto_files.add(os.path.relpath(p, TREE))
    n = len(goto_files)
    log(f'goto-damaged files: {n}')

    jars = prep_libs() if '--nolibs' not in sys.argv else [os.path.join(LIBS, x) for x in os.listdir(LIBS)]
    log(f'classpath entries: {len(jars)}')

    srcs = build_source_list()
    log(f'source files: {len(srcs)}')

    existing = [f for f in os.listdir(ROUNDS) if f.startswith('round-') and f.endswith('.log')]
    round_no = len(existing) + 1
    out_dir = os.path.join(CACHE, 'out', f'client-classes')
    os.makedirs(out_dir, exist_ok=True)

    rc, text = run_javac(jars, srcs, out_dir, round_no)
    logf = os.path.join(ROUNDS, f'round-{round_no}.log')
    open(logf, 'w').write(text)

    errors, families = classify(text, goto_files)
    summary = {'round': round_no, 'returncode': rc, 'total_errors': len(errors),
               'goto_files': sorted(goto_files)}
    for name, es in sorted(families.items(), key=lambda kv: -len(kv[1])):
        summary[name] = len(es)
    # missing packages tally
    pkgs = {}
    for e in families.get('MISSING_PKG', []):
        m = re.search(r'package ([\w.]+) does not exist', e['msg'])
        if m: pkgs[m.group(1)] = pkgs.get(m.group(1), 0) + 1
    syms = {}
    for e in families.get('MISSING_SYMBOL', []):
        m = re.search(r'symbol:\s*(?:class|variable|method) (\S+)', e['msg'])
        if not m:
            m = re.search(r'location: class ([\w.$]+)', e['msg'])
        key = (m.group(1) if m else e['msg'][:40])
        syms[key] = syms.get(key, 0) + 1
    json.dump({'summary': summary, 'pkgs': pkgs, 'top_syms': sorted(syms.items(), key=lambda kv: -kv[1])[:60],
               'errors': errors[:4000]},
              open(os.path.join(ROUNDS, f'round-{round_no}.json'), 'w'), indent=1)

    print(json.dumps({k: v for k, v in summary.items() if k != 'goto_files'}, indent=1))
    print('missing packages:', json.dumps(pkgs, indent=1, sort_keys=True))
    print('top missing symbols:', sorted(syms.items(), key=lambda kv: -kv[1])[:40])
    print('goto files:', ' | '.join(sorted(goto_files)[:50]))
    print('full log:', logf)
    return 0 if rc == 0 else 1

if __name__ == '__main__':
    sys.exit(main())
