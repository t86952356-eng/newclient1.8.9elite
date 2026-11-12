/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.encryption;

import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class a {
    public static SecretKey aKG() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    public static SecretKeySpec kh(String string) {
        SecureRandom secureRandom = SecureRandom.getInstanceStrong();
        byte[] byArray = new byte[100];
        secureRandom.nextBytes(byArray);
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        PBEKeySpec pBEKeySpec = new PBEKeySpec(string.toCharArray(), byArray, 65536, 256);
        return new SecretKeySpec(secretKeyFactory.generateSecret(pBEKeySpec).getEncoded(), "AES");
    }

    public static IvParameterSpec aKH() {
        byte[] byArray = new byte[16];
        new SecureRandom().nextBytes(byArray);
        return new IvParameterSpec(byArray);
    }

    public static String a(String string, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, (Key)secretKey, ivParameterSpec);
        byte[] byArray = cipher.doFinal(string.getBytes());
        return Base64.getEncoder().encodeToString(byArray);
    }

    public static String b(String string, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, (Key)secretKey, ivParameterSpec);
        byte[] byArray = cipher.doFinal(Base64.getDecoder().decode(string));
        return new String(byArray);
    }
}

