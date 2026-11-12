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
    private final String ip;
    private final int port;
    private final String ePJ;

    public d(String string, int n2, String string2) {
        super((byte)3);
        this.ip = string;
        this.port = n2;
        this.ePJ = string2;
    }

    public d(JSONObject jSONObject) {
        super((byte)3);
        this.ip = jSONObject.getString("a");
        this.port = jSONObject.getInt("b");
        this.ePJ = jSONObject.getString("c");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ip);
        jSONObject.put("b", this.port);
        jSONObject.put("c", (Object)this.ePJ);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getIp() {
        return this.ip;
    }

    public int getPort() {
        return this.port;
    }
}

