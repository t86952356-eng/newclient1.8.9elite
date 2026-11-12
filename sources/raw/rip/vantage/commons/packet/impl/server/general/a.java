/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.general;

import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.api.abstracts.b;

public class a
extends b {
    long eQA;

    public a() {
        super((byte)0);
        this.eQA = System.currentTimeMillis();
    }

    public a(JSONObject jSONObject) {
        super((byte)0);
        this.eQA = jSONObject.getLong("a");
    }

    @Override
    public void a(c c2) {
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (int)this.aeF());
        jSONObject.put("a", this.eQA);
        return jSONObject.toString();
    }

    public long aKg() {
        return this.eQA;
    }
}

