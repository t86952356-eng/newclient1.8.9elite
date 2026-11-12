/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.protection;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public final class j
extends a {
    public static final byte ePX = 34;
    public static final int ePY = 1;
    public static final int ePZ = 32;
    public static final int eQa = 32;
    public static final int eQb = 32;
    public static final int eQc = 64;
    private final int eQd;
    private final byte[] eQe;
    private final byte[] eQf;
    private final String eQg;
    private final byte[] eQh;

    public j(byte[] byArray, byte[] byArray2, String string, byte[] byArray3) {
        this(1, byArray, byArray2, string, byArray3);
    }

    private j(int n2, byte[] byArray, byte[] byArray2, String string, byte[] byArray3) {
        super((byte)34);
        j.kD(n2);
        j.a("challenge", byArray, 32);
        j.a("clientPublicKey", byArray2, 32);
        j.kg(string);
        j.a("hwidHash", byArray3, 32);
        this.eQd = n2;
        this.eQe = Arrays.copyOf(byArray, byArray.length);
        this.eQf = Arrays.copyOf(byArray2, byArray2.length);
        this.eQg = string;
        this.eQh = Arrays.copyOf(byArray3, byArray3.length);
    }

    public j(JSONObject jSONObject) {
        this(jSONObject.getInt("v"), j.a(jSONObject, "a"), j.a(jSONObject, "b"), jSONObject.getString("c"), j.a(jSONObject, "d"));
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", this.eQd);
        jSONObject.put("a", (Object)Base64.getEncoder().encodeToString(this.eQe));
        jSONObject.put("b", (Object)Base64.getEncoder().encodeToString(this.eQf));
        jSONObject.put("c", (Object)this.eQg);
        jSONObject.put("d", (Object)Base64.getEncoder().encodeToString(this.eQh));
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public int aJT() {
        return this.eQd;
    }

    public byte[] aJU() {
        return Arrays.copyOf(this.eQe, this.eQe.length);
    }

    public byte[] aJV() {
        return Arrays.copyOf(this.eQf, this.eQf.length);
    }

    public String aJW() {
        return this.eQg;
    }

    public byte[] aJX() {
        return Arrays.copyOf(this.eQh, this.eQh.length);
    }

    private static byte[] a(JSONObject jSONObject, String string) {
        try {
            return Base64.getDecoder().decode(jSONObject.getString(string));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("invalid base64 field: " + string, illegalArgumentException);
        }
    }

    private static void kD(int n2) {
        if (n2 != 1) {
            throw new IllegalArgumentException("unsupported JDK unlock protocol version: " + n2);
        }
    }

    private static void a(String string, byte[] byArray, int n2) {
        if (byArray == null || byArray.length != n2) {
            throw new IllegalArgumentException(string + " must be exactly " + n2 + " bytes");
        }
    }

    private static void kg(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("buildId must not be empty");
        }
        if (string.getBytes(StandardCharsets.UTF_8).length > 64) {
            throw new IllegalArgumentException("buildId exceeds 64 UTF-8 bytes");
        }
    }
}

