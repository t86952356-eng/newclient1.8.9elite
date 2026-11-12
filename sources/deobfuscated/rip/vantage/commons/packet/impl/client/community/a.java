/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.community;

import org.json.JSONObject;

public class a
extends rip.vantage.commons.packet.api.abstracts.a {
    public a() {
        super((byte)11);
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }
}

