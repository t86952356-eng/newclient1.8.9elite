/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.community;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class h
extends a {
    private final String ePu;
    private final int ePv;
    private final int ePw;
    private final int ePx;
    private final String ePy;
    private final String ePz;

    public h(String string, int n2, int n3, int n4, String string2, String string3) {
        super((byte)9);
        this.ePu = string;
        this.ePv = n2;
        this.ePw = n3;
        this.ePx = n4;
        this.ePy = string2;
        this.ePz = string3;
    }

    public h(JSONObject jSONObject) {
        super((byte)9);
        this.ePu = jSONObject.getString("a");
        this.ePv = jSONObject.getInt("b");
        this.ePw = jSONObject.getInt("c");
        this.ePx = jSONObject.getInt("d");
        this.ePy = jSONObject.getString("e");
        this.ePz = jSONObject.getString("f");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePu);
        jSONObject.put("b", this.ePv);
        jSONObject.put("c", this.ePw);
        jSONObject.put("d", this.ePx);
        jSONObject.put("e", (Object)this.ePy);
        jSONObject.put("f", (Object)this.ePz);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getMessage() {
        return this.ePu;
    }
}

