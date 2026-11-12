/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.protection;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class d
extends a {
    private final String ePH;
    private final int ePI;
    private final String ePJ;

    public d(String string, int n2, String string2) {
        super((byte)3);
        this.ePH = string;
        this.ePI = n2;
        this.ePJ = string2;
    }

    public d(JSONObject jSONObject) {
        super((byte)3);
        this.ePH = jSONObject.getString("a");
        this.ePI = jSONObject.getInt("b");
        this.ePJ = jSONObject.getString("c");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePH);
        jSONObject.put("b", this.ePI);
        jSONObject.put("c", (Object)this.ePJ);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getIp() {
        return this.ePH;
    }

    public int getPort() {
        return this.ePI;
    }
}

