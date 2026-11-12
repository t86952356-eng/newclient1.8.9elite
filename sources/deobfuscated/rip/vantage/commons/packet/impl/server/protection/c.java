/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.protection;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.b;
import rip.vantage.commons.packet.impl.client.protection.g;

public class c
extends b {
    private final List<g> eRe;
    private final int eRf;

    public c(List<g> list, int n2) {
        super((byte)7);
        this.eRe = list;
        this.eRf = n2;
    }

    public c(JSONObject jSONObject) {
        super((byte)7);
        JSONArray jSONArray = jSONObject.getJSONArray("a");
        ArrayList<g> arrayList = new ArrayList<g>();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            arrayList.add(new g(jSONObject2.getInt("a"), -1, false));
        }
        this.eRe = arrayList;
        this.eRf = jSONObject.getInt("b");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (g g2 : this.eRe) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("a", g2.getEntityId());
            jSONArray.put((Object)jSONObject2);
        }
        jSONObject.put("a", (Object)jSONArray);
        jSONObject.put("b", this.eRf);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public List<g> aJM() {
        return this.eRe;
    }

    public int aJR() {
        return this.eRf;
    }
}

