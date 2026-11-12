/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.protection;

import java.util.Arrays;
import java.util.Base64;
import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.api.abstracts.b;

public final class d
extends b {
    public static final byte eRg = 34;
    public static final int eRh = 1;
    public static final int eRi = 64;
    public static final int eRj = 4096;
    private final int eRk;
    private final byte[] eRl;
    private final byte[] eRm;

    public d(byte[] byArray, byte[] byArray2) {
        this(1, byArray, byArray2);
    }

    private d(int n2, byte[] byArray, byte[] byArray2) {
        super((byte)34);
        if (n2 != 1) {
            throw new IllegalArgumentException("unsupported JDK unlock protocol version: " + n2);
        }
        if (byArray == null || byArray.length == 0 || byArray.length > 4096) {
            throw new IllegalArgumentException("capability must contain 1-4096 bytes");
        }
        if (byArray2 == null || byArray2.length != 64) {
            throw new IllegalArgumentException("Ed25519 signature must be exactly 64 bytes");
        }
        this.eRk = n2;
        this.eRl = Arrays.copyOf(byArray, byArray.length);
        this.eRm = Arrays.copyOf(byArray2, byArray2.length);
    }

    public d(JSONObject jSONObject) {
        this(jSONObject.getInt("v"), d.a(jSONObject, "a"), d.a(jSONObject, "b"));
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", this.eRk);
        jSONObject.put("a", (Object)Base64.getEncoder().encodeToString(this.eRl));
        jSONObject.put("b", (Object)Base64.getEncoder().encodeToString(this.eRm));
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public int aJT() {
        return this.eRk;
    }

    public byte[] aKD() {
        return Arrays.copyOf(this.eRl, this.eRl.length);
    }

    public byte[] aKE() {
        return Arrays.copyOf(this.eRm, this.eRm.length);
    }

    private static byte[] a(JSONObject jSONObject, String string) {
        try {
            return Base64.getDecoder().decode(jSONObject.getString(string));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("invalid base64 field: " + string, illegalArgumentException);
        }
    }
}

