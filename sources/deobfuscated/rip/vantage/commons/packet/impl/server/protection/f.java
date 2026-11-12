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

public class f
extends b {
    private final String eRp;

    public f(String string) {
        super((byte)2);
        this.eRp = string;
    }

    public f(JSONObject jSONObject) {
        super((byte)2);
        this.eRp = jSONObject.getString("a");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eRp);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String aJL() {
        return this.eRp;
    }
}

