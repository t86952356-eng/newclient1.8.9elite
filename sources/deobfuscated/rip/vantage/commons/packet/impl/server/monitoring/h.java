/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.monitoring;

import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.api.abstracts.b;

public class h
extends b {
    private final String eQL;

    public h(String string) {
        super((byte)23);
        this.eQL = string;
    }

    public h(JSONObject jSONObject) {
        super((byte)23);
        this.eQL = jSONObject.getString("a");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eQL);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String ajB() {
        return this.eQL;
    }
}

