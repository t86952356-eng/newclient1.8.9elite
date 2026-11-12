/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.encryption;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

public class w {
    private static final String eRN = "RSA/ECB/PKCS1Padding";

    public static KeyPair aKJ() {
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048, secureRandom);
        return keyPairGenerator.generateKeyPair();
    }

    public static String aF(String string, String string2) {
        try {
            byte[] byArray = string.getBytes();
            byte[] byArray2 = string2.getBytes();
            PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(byArray2)));
            Cipher cipher = Cipher.getInstance(eRN);
            cipher.init(1, publicKey);
            byte[] byArray3 = Base64.getEncoder().encode(cipher.doFinal(byArray));
            return new String(byArray3);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static String aG(String string, String string2) {
        try {
            byte[] byArray = Base64.getDecoder().decode(string);
            byte[] byArray2 = string2.getBytes();
            PrivateKey privateKey = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder().decode(byArray2)));
            Cipher cipher = Cipher.getInstance(eRN);
            cipher.init(2, privateKey);
            byte[] byArray3 = cipher.doFinal(byArray);
            return new String(byArray3, StandardCharsets.UTF_8);
        }
        catch (Exception exception) {
            return null;
        }
    }
}

