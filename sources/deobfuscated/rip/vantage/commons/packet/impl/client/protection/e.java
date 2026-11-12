/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.protection;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class e
extends a {
    private final String ePK;

    public e(String string) {
        super((byte)2);
        this.ePK = string;
    }

    public e(JSONObject jSONObject) {
        super((byte)2);
        this.ePK = jSONObject.getString("a");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePK);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String aJL() {
        return this.ePK;
    }
}

