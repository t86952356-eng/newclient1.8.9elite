/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.packet;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import rip.vantage.commons.packet.api.interfaces.b;

public class a {
    public static String a(b<?> b2, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        try {
            String string = b2.aJz();
            return rip.vantage.commons.util.encryption.a.a(string, secretKey, ivParameterSpec);
        }
        catch (Exception exception) {
            System.out.println("Failed to encrypt packet, usually this is because Rise doesn't have access to the internet.");
            return "";
        }
    }
}

