/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.community;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.b;

public class c
extends b {
    private final String eQs;

    public c(String string) {
        super((byte)6);
        this.eQs = string;
    }

    public c(JSONObject jSONObject) {
        super((byte)6);
        this.eQs = jSONObject.getString("a");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eQs);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getMessage() {
        return this.eQs;
    }
}

