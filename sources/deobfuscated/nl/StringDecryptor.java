package nl;

/*
 * ANDROID/VANILLA PORT NOTE (source-build port):
 * Pure-Java replacement for the original JNI string-decryptor
 * (`native String o0Oo000O0oO(int, String)`, registered via nl.Loader against
 * platform natives that are not shipped in this source package).
 * The algorithm was recovered mechanically from the decompiled Java copy in
 * net.minecraft.network.r (CFR 0.152 output): PBKDF2 (SecretKeyFactory) over a
 * 48-byte password and 16-byte salt, 19 iterations, 256-bit key,
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

public final class StringDecryptor {
    private static final byte[] SALT = {37, 52, 57, 68, 75, 3, -27, 102, -64, -14, -117, 99, -7, -128, -74, 92};
    private static final byte[] PASSWORD_BYTES = {210, 79, 33, 145, 30, 78, 46, 161, 207, 86, 204, 35, 138, 72, 134, 194, 85, 139, 141, 0, 152, 140, 203, 163, 92, 148, 22, 185, 246, 64, 36, 171, 57, 163, 170, 11, 248, 243, 85, 152, 32, 47, 55, 168, 149, 73, 70, 136};
    private static final int ITERATIONS = 19;
    private static final int KEY_BITS = 256;
    private static final char[] PASSWORD =
        new String(PASSWORD_BYTES, StandardCharsets.UTF_8).toCharArray();

    private static volatile SecretKeySpec key;
    private static final Map<Integer, String> cache = new HashMap<Integer, String>();

    private static SecretKeySpec key() throws Exception {
        SecretKeySpec k = key;
        if (k != null) return k;
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        PBEKeySpec spec = new PBEKeySpec(PASSWORD, SALT, ITERATIONS, KEY_BITS);
        k = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
        key = k;
        return k;
    }

    public static String decrypt(int slot, String input) {
        synchronized (cache) {
            String hit = cache.get(slot);
            if (hit != null) return hit;
        }
        try {
            byte[] all = Base64.getDecoder().decode(input);
            byte[] iv = Arrays.copyOfRange(all, 0, 16);
            byte[] ct = Arrays.copyOfRange(all, 16, all.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key(), new IvParameterSpec(iv));
            String out = new String(cipher.doFinal(ct), StandardCharsets.UTF_8);
            synchronized (cache) { cache.put(slot, out); }
            return out;
        } catch (Exception e) {
            throw new IllegalStateException("string decrypt failed for slot " + slot, e);
        }
    }

    private StringDecryptor() {}
}
