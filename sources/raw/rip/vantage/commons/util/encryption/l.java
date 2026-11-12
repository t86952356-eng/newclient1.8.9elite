/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.encryption;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class l {
    private static final String eRC = "\u3075\u304e\u3075\u3075\u304b\u306b\u304b\u3041\u3075\u3043\u3044\u3093\u3058\u3056";

    public static String ki(String string) {
        byte[] byArray = eRC.getBytes(StandardCharsets.UTF_8);
        byte[] byArray2 = string.getBytes(StandardCharsets.UTF_8);
        byte[] byArray3 = new byte[byArray2.length];
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray3[i2] = (byte)(byArray2[i2] ^ byArray[i2 % byArray.length]);
        }
        return Base64.getEncoder().encodeToString(byArray3);
    }

    public static String kj(String string) {
        byte[] byArray = eRC.getBytes(StandardCharsets.UTF_8);
        byte[] byArray2 = Base64.getDecoder().decode(string);
        byte[] byArray3 = new byte[byArray2.length];
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray3[i2] = (byte)(byArray2[i2] ^ byArray[i2 % byArray.length]);
        }
        return new String(byArray3, StandardCharsets.UTF_8);
    }
}

