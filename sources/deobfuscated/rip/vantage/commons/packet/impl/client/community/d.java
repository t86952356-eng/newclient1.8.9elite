/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.community;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public final class d
extends a {
    public static final byte ePh = 33;
    private final String ePi;
    private final String ePj;
    private final String ePk;

    public d(String string, String string2, String string3) {
        super((byte)33);
        this.ePi = string;
        this.ePj = string2;
        this.ePk = string3;
    }

    public d(JSONObject jSONObject) {
        super((byte)33);
        this.ePi = jSONObject.getString("a");
        this.ePj = jSONObject.getString("b");
        this.ePk = jSONObject.optString("c", "");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePi);
        jSONObject.put("b", (Object)this.ePj);
        jSONObject.put("c", (Object)this.ePk);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String bX() {
        return this.ePi;
    }

    public String aJB() {
        return this.ePj;
    }

    public String np() {
        return this.ePk;
    }
}

