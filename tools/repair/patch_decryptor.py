#!/usr/bin/env python3
"""Fixer 2 — replace the JNI string-decryptor with a pure-Java AES implementation.

1. Mechanically extracts constants from r.java's decompiled method:
   - part1[16] + part2[32]  (PBE password bytes, from literal XOR expressions)
   - salt[16]               (PBE salt, direct constants)
   - iterations / keyBits   (from the PBEKeySpec call)
2. Emits nl/StringDecryptor.java (clean Java, faithful algorithm):
   PBKDF2 -> AES/CBC/PKCS5Padding, Base64 input, [16B IV][ciphertext].
3. Rewrites r.java's mangled method as a delegator.
4. Rewrites every `native o0Oo000O0oO(int,String)` declaration (24 classes) as a
   delegator to nl.StringDecryptor.
5. Removes Loader.registerNativesForClass(...) statements in those classes.
6. Stubs digit-named marker natives (e.g. q0OOOoo00o0) as empty methods.
"""
import os, re, sys

REPO = '/home/z/my-project/.build_cache/repo'
TREE = REPO + '/sources/deobfuscated'
R = TREE + '/net/minecraft/network/r.java'

def read(p): return open(p, encoding='utf-8').read()
def write(p, t): open(p, 'w', encoding='utf-8').write(t)

def sb(x):
    x &= 0xFF
    return x - 256 if x >= 128 else x

def main():
    src = read(R)
    # ---- locate the decryptor method region
    mstart = src.index('public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1)')
    # method end: first member-level close (`^    }$`) after the LAST damage marker
    # inside the method. Plain brace-counting is unreliable here (CFR body is
    # brace-unbalanced and swallows following members).
    last_goto = src.rfind('** GOTO', mstart)
    anchor = last_goto if last_goto > mstart else mstart
    m = re.compile(r'^    \}$', re.M).search(src, anchor)
    if not m:
        raise SystemExit('patch_decryptor: cannot locate method end in r.java')
    mend = m.end()
    region = src[mstart:mend]

    # ---- part1: ((byte[])var29_6[21])[A ^ B] = C ^ D;
    part1 = {}
    for a, b, c, d in re.findall(r'\(\(byte\[\]\)var29_6\[21\]\)\[(\d+) \^ (\d+)\] = (-?\d+) \^ (\d+);', region):
        part1[int(a) ^ int(b)] = sb(int(c) ^ int(d))
    # ---- part2: ((byte[])var29_6[9])[A ^ B] = C ^ D;
    part2 = {}
    for a, b, c, d in re.findall(r'\(\(byte\[\]\)var29_6\[9\]\)\[(\d+) \^ (\d+)\] = (-?\d+) \^ (\d+);', region):
        part2[int(a) ^ int(b)] = sb(int(c) ^ int(d))
    # ---- salt: ((byte[])var29_6[3])[i] = v;   (direct constants)
    salt = {}
    for a, b in re.findall(r'\(\(byte\[\]\)var29_6\[3\]\)\[(\d+)\] = (-?\d+);', region):
        salt[int(a)] = sb(int(b))
    # ---- PBE params
    it = re.search(r'var29_6\[3\], (\d+), (\d+)\)', region)
    iterations, keybits = int(it.group(1)), int(it.group(2))

    assert len(part1) == 16, f'part1={len(part1)}'
    assert len(part2) == 32, f'part2={len(part2)}'
    assert len(salt) == 16, f'salt={len(salt)}'
    assert sorted(part1) == list(range(16)) and sorted(part2) == list(range(32)) and sorted(salt) == list(range(16))

    password = bytes(part1[i] & 0xFF for i in range(16)) + bytes(part2[i] & 0xFF for i in range(32))

    def arrLit(bs):
        return '{' + ', '.join(str(x) for x in bs) + '}'

    decryptor = f'''package nl;

/*
 * ANDROID/VANILLA PORT NOTE (source-build port):
 * Pure-Java replacement for the original JNI string-decryptor
 * (`native String o0Oo000O0oO(int, String)`, registered via nl.Loader against
 * platform natives that are not shipped in this source package).
 * The algorithm was recovered mechanically from the decompiled Java copy in
 * net.minecraft.network.r (CFR 0.152 output): PBKDF2 (SecretKeyFactory) over a
 * 48-byte password and 16-byte salt, {iterations} iterations, {keybits}-bit key,
 * then AES/CBC/PKCS5Padding with a 16-byte IV prefix on the Base64 input.
 * All constants below are byte-identical to the original expressions.
 */
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class StringDecryptor {{
    private static final byte[] SALT = {arrLit([salt[i] for i in range(16)])};
    private static final byte[] PASSWORD_BYTES = {arrLit([b for b in password])};
    private static final int ITERATIONS = {iterations};
    private static final int KEY_BITS = {keybits};
    private static final char[] PASSWORD =
        new String(PASSWORD_BYTES, StandardCharsets.UTF_8).toCharArray();

    private static volatile SecretKeySpec key;
    private static final Map<Integer, String> cache = new HashMap<Integer, String>();

    private static SecretKeySpec key() throws Exception {{
        SecretKeySpec k = key;
        if (k != null) return k;
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        PBEKeySpec spec = new PBEKeySpec(PASSWORD, SALT, ITERATIONS, KEY_BITS);
        k = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
        key = k;
        return k;
    }}

    public static String decrypt(int slot, String input) {{
        synchronized (cache) {{
            String hit = cache.get(slot);
            if (hit != null) return hit;
        }}
        try {{
            byte[] all = Base64.getDecoder().decode(input);
            byte[] iv = Arrays.copyOfRange(all, 0, 16);
            byte[] ct = Arrays.copyOfRange(all, 16, all.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key(), new IvParameterSpec(iv));
            String out = new String(cipher.doFinal(ct), StandardCharsets.UTF_8);
            synchronized (cache) {{ cache.put(slot, out); }}
            return out;
        }} catch (Exception e) {{
            throw new IllegalStateException("string decrypt failed for slot " + slot, e);
        }}
    }}

    private StringDecryptor() {{}}
}}
'''
    write(TREE + '/nl/StringDecryptor.java', decryptor)
    print('written nl/StringDecryptor.java  password48 =', password.hex(), ' salt =',
          bytes(salt[i] & 0xFF for i in range(16)).hex(), f'  iters={iterations} bits={keybits}')

    # ---- rewrite r.java method as delegator
    new_method = (
        'public static String o0Oo000O0oO(int var0, String var1_1) {\n'
        '        /* ANDROID/VANILLA PORT NOTE: original CFR body (GOTO-mangled) replaced by\n'
        '           nl.StringDecryptor; identical algorithm, pure Java. */\n'
        '        return nl.StringDecryptor.decrypt(var0, var1_1);\n'
        '    }')
    # drop the leading comment block of the original method (the CFR warnings)
    cstart = src.rfind('/*', 0, mstart)
    src2 = src[:cstart] + new_method + src[mend:]
    write(R, src2)
    # post-write balance assertion (context aware)
    depth2, j, mode2 = 0, 0, None
    while j < len(src2):
        c = src2[j]; nx = src2[j+1] if j+1 < len(src2) else ''
        if mode2 is None:
            if c == '/' and nx == '/':
                k = src2.find('\n', j); j = k if k != -1 else len(src2); continue
            if c == '/' and nx == '*':
                k = src2.find('*/', j); j = k + 2 if k != -1 else len(src2); continue
            if c == '"': mode2 = 's'; j += 1; continue
            if c == "'": mode2 = 'c'; j += 1; continue
            if c == '{': depth2 += 1
            elif c == '}': depth2 -= 1
            j += 1
        elif mode2 == 's':
            if c == '\\': j += 2; continue
            if c == '"': mode2 = None
            j += 1
        else:
            if c == '\\': j += 2; continue
            if c == "'": mode2 = None
            j += 1
    if depth2 != 0:
        print(f'patch_decryptor WARNING: r.java residual imbalance depth={depth2} '
              f'(other CFR damage in tail members; the stubber pass will handle it)')
    print('r.java method rewritten as delegator '
          f'(region lines {src[:mstart].count(chr(10))+2}-{src[:mend].count(chr(10))+1}; '
          f'file now {src2.count(chr(10))+1} lines)')

    # ---- 24 other classes: native decl -> delegator; remove registerNatives calls
    nat_re = re.compile(
        r'([ \t]*)public static(?:[ \t]*/\*[^*]*\*/)*[ \t]*native(?:[ \t]*/\*[^*]*\*/)*[ \t]*(?:strictfp[ \t]*)?(?:/\* synthetic \*/[ \t]*)?String o0Oo000O0oO\(int var0, String var1\);')
    changed = []
    for dp, ds, fs in os.walk(TREE):
        ds.sort()
        for f in sorted(fs):
            if not f.endswith('.java') or f == 'StringDecryptor.java': continue
            p = os.path.join(dp, f)
            t = read(p)
            orig = t
            def repl(m):
                return (f'{m.group(1)}public static String o0Oo000O0oO(int var0, String var1) {{\n'
                        f'{m.group(1)}    /* ANDROID/VANILLA PORT NOTE: JNI native replaced by pure-Java nl.StringDecryptor. */\n'
                        f'{m.group(1)}    return nl.StringDecryptor.decrypt(var0, var1);\n'
                        f'{m.group(1)}}}')
            t = nat_re.sub(repl, t)
            t = re.sub(r'^[ \t]*Loader\.registerNativesForClass\([^)]*\);\n', '', t, flags=re.M)
            # stub digit-named marker natives: native ... void q0OOOoo00o0();
            t = re.sub(r'private static native ([^\n]*?)void (q[0-9][A-Za-z0-9_$]*)\(\);',
                       r'private static void \2() {}', t)
            if t != orig:
                write(p, t)
                changed.append(os.path.relpath(p, TREE))
    print('native-decl classes patched:', len(changed))
    for c in changed: print('  -', c)

if __name__ == '__main__':
    main()
