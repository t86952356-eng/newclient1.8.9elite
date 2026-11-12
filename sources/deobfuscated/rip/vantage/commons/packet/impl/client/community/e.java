/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.community;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public final class e
extends a {
    public static final byte ePl = 31;
    private final String ePm;
    private final String ePn;
    private final int ePo;
    private final int amount;
    private final String ePq;
    private final boolean ePr;

    public e(String string, String string2, int n2, int n3, String string3, boolean bl2) {
        super((byte)31);
        this.ePm = string;
        this.ePn = string2;
        this.ePo = n2;
        this.amount = n3;
        this.ePq = string3;
        this.ePr = bl2;
    }

    public e(JSONObject jSONObject) {
        super((byte)31);
        this.ePm = jSONObject.getString("a");
        this.ePn = jSONObject.getString("b");
        this.ePo = jSONObject.getInt("c");
        this.amount = jSONObject.getInt("d");
        this.ePq = jSONObject.optString("e", "");
        this.ePr = jSONObject.optBoolean("f", false);
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePm);
        jSONObject.put("b", (Object)this.ePn);
        jSONObject.put("c", this.ePo);
        jSONObject.put("d", this.amount);
        jSONObject.put("e", (Object)this.ePq);
        jSONObject.put("f", this.ePr);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String bX() {
        return this.ePm;
    }

    public String aJC() {
        return this.ePn;
    }

    public int aJD() {
        return this.ePo;
    }

    public int getAmount() {
        return this.amount;
    }

    public String sF() {
        return this.ePq;
    }

    public boolean aJE() {
        return this.ePr;
    }
}

