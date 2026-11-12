/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.community;

import org.json.JSONArray;
import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.api.abstracts.b;

public class a
extends b {
    private JSONArray eQm;
    private JSONArray eQn;
    private final String type;

    public a(JSONObject jSONObject) {
        super((byte)11);
        try {
            this.eQm = jSONObject.getJSONArray("a");
        }
        catch (Exception exception) {
            this.eQm = new JSONArray();
        }
        try {
            this.eQn = jSONObject.getJSONArray("b");
        }
        catch (Exception exception) {
            this.eQn = new JSONArray();
        }
        this.type = jSONObject.getString("c");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eQm);
        jSONObject.put("b", (Object)this.eQn);
        jSONObject.put("c", (Object)this.type);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public JSONArray aKb() {
        return this.eQm;
    }

    public JSONArray aKc() {
        return this.eQn;
    }

    public String getType() {
        return this.type;
    }
}

