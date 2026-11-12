/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ac {
    private static final Logger dva = LogManager.getLogger();

    public static SecretKey arV() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            return keyGenerator.generateKey();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
    }

    public static KeyPair arW() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            dva.error("Key pair generation failed!");
            return null;
        }
    }

    public static byte[] a(String string, PublicKey publicKey, SecretKey secretKey) {
        try {
            return ac.a("SHA-1", string.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    private static byte[] a(String string, byte[] ... byArray) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string);
            for (byte[] byArray2 : byArray) {
                messageDigest.update(byArray2);
            }
            return messageDigest.digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }

    public static PublicKey l(byte[] byArray) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            // empty catch block
        }
        dva.error("Public key reconstitute failed!");
        return null;
    }

    public static SecretKey a(PrivateKey privateKey, byte[] byArray) {
        return new SecretKeySpec(ac.b(privateKey, byArray), "AES");
    }

    public static byte[] a(Key key, byte[] byArray) {
        return ac.a(1, key, byArray);
    }

    public static byte[] b(Key key, byte[] byArray) {
        return ac.a(2, key, byArray);
    }

    private static byte[] a(int n2, Key key, byte[] byArray) {
        try {
            return ac.a(n2, key.getAlgorithm(), key).doFinal(byArray);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        dva.error("Cipher data failed!");
        return null;
    }

    private static Cipher a(int n2, String string, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(string);
            cipher.init(n2, key);
            return cipher;
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        dva.error("Cipher creation failed!");
        return null;
    }

    public static Cipher a(int n2, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
            cipher.init(n2, key, new IvParameterSpec(key.getEncoded()));
            return cipher;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException(generalSecurityException);
        }
    }
}

