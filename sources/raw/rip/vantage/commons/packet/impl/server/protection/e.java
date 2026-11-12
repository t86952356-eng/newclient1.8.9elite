/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.protection;

import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.api.abstracts.b;

public class e
extends b {
    private final String eRn;
    private final int eRo;

    public e(String string, int n2) {
        super((byte)3);
        this.eRn = string;
        this.eRo = n2;
    }

    public e(JSONObject jSONObject) {
        super((byte)3);
        this.eRn = jSONObject.getString("a");
        this.eRo = jSONObject.getInt("b");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eRn);
        jSONObject.put("b", this.eRo);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getIp() {
        return this.eRn;
    }

    public int getPort() {
        return this.eRo;
    }
}

