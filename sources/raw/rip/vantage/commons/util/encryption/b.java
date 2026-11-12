/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.encryption;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class b {
    private static byte[] aKI() {
        char[] cArray = new char[]{'\u3075', '\u3075', '\u3041', '\u3075', '\u3043', '\u3075', '\u306b', '\u304b', '\u3093', '\u3044', '\u304b', '\u3058', '\u304e', '\u3056'};
        return new String(cArray).getBytes(StandardCharsets.UTF_8);
    }

    public static String ki(String string) {
        byte[] byArray = b.aKI();
        byte[] byArray2 = string.getBytes(StandardCharsets.UTF_8);
        byte[] byArray3 = new byte[byArray2.length];
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray3[i2] = (byte)(byArray2[i2] ^ byArray[i2 % byArray.length]);
        }
        return Base64.getEncoder().encodeToString(byArray3);
    }

    public static String kj(String string) {
        byte[] byArray = b.aKI();
        byte[] byArray2 = Base64.getDecoder().decode(string);
        byte[] byArray3 = new byte[byArray2.length];
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray3[i2] = (byte)(byArray2[i2] ^ byArray[i2 % byArray.length]);
        }
        return new String(byArray3, StandardCharsets.UTF_8);
    }
}

