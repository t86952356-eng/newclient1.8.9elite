/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.encryption;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class x {
    public static final int eRO = 32;
    private static final int eRP = 12;
    private static final int eRQ = 128;
    private static final byte[] eRR = "rise-ws-v1".getBytes(StandardCharsets.UTF_8);
    private static final SecureRandom eRS = new SecureRandom();

    private x() {
    }

    private static byte[] aKK() {
        return new byte[]{56, -48, 104, 40, -91, -6, -24, 25, 54, -74, -18, 6, -86, 27, -110, -17, -16, -31, -91, -123, -38, 22, 6, 118, -76, 48, -47, 125, -44, -62, -98, -39};
    }

    public static byte[] aKL() {
        byte[] byArray = new byte[32];
        eRS.nextBytes(byArray);
        return byArray;
    }

    public static byte[] b(byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        byte[] byArray4 = x.e(byArray3, x.aKK());
        byte[] byArray5 = new byte[eRR.length + 1];
        System.arraycopy(eRR, 0, byArray5, 0, eRR.length);
        byArray5[x.eRR.length] = 1;
        return x.e(byArray4, byArray5);
    }

    public static byte[] c(byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = new byte[12];
        eRS.nextBytes(byArray3);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (Key)new SecretKeySpec(byArray, "AES"), new GCMParameterSpec(128, byArray3));
        byte[] byArray4 = cipher.doFinal(byArray2);
        byte[] byArray5 = new byte[12 + byArray4.length];
        System.arraycopy(byArray3, 0, byArray5, 0, 12);
        System.arraycopy(byArray4, 0, byArray5, 12, byArray4.length);
        return byArray5;
    }

    public static byte[] d(byte[] byArray, byte[] byArray2) {
        if (byArray2.length < 28) {
            throw new IllegalArgumentException("envelope too short");
        }
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (Key)new SecretKeySpec(byArray, "AES"), new GCMParameterSpec(128, byArray2, 0, 12));
        return cipher.doFinal(byArray2, 12, byArray2.length - 12);
    }

    public static String a(byte[] byArray, String string) {
        return Base64.getEncoder().encodeToString(x.c(byArray, string.getBytes(StandardCharsets.UTF_8)));
    }

    public static String b(byte[] byArray, String string) {
        return new String(x.d(byArray, Base64.getDecoder().decode(string)), StandardCharsets.UTF_8);
    }

    private static byte[] e(byte[] byArray, byte[] byArray2) {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(byArray, "HmacSHA256"));
        return mac.doFinal(byArray2);
    }
}

