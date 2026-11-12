/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.community;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class c
extends a {
    private final String ePg;

    public c(String string) {
        super((byte)10);
        this.ePg = string;
    }

    public c(JSONObject jSONObject) {
        super((byte)10);
        this.ePg = jSONObject.getString("a");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePg);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String aJA() {
        return this.ePg;
    }
}

