/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.protection;

import org.json.JSONObject;
import rip.vantage.commons.packet.impl.client.protection.b;

public class a
extends rip.vantage.commons.packet.api.abstracts.a {
    private final String ePA;
    private String ePB;

    public a(String string) {
        super((byte)4);
        this.ePA = string;
    }

    public a(JSONObject jSONObject) {
        super((byte)4);
        this.ePA = jSONObject.getString("a");
        if (jSONObject.has("b")) {
            this.ePB = new b(jSONObject.getString("b")).toString();
        }
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePA);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String sE() {
        return this.ePA;
    }

    public String aJG() {
        return this.ePB;
    }
}

