/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.protection;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;
import rip.vantage.commons.packet.impl.client.protection.g;

public class f
extends a {
    private final List<g> ePL;
    private final boolean ePM;
    private final boolean ePN;
    private final boolean ePO;
    private final boolean ePP;
    private final int ePQ;

    public f(List<g> list, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n2) {
        super((byte)8);
        this.ePL = list;
        this.ePM = bl2;
        this.ePN = bl3;
        this.ePO = bl4;
        this.ePP = bl5;
        this.ePQ = n2;
    }

    public f(JSONObject jSONObject) {
        super((byte)8);
        JSONArray jSONArray = jSONObject.getJSONArray("a");
        ArrayList<g> arrayList = new ArrayList<g>();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            arrayList.add(new g(jSONObject2.getInt("a"), jSONObject2.getInt("b"), jSONObject2.getBoolean("c")));
        }
        this.ePL = arrayList;
        this.ePM = jSONObject.getBoolean("b");
        this.ePN = jSONObject.getBoolean("c");
        this.ePO = jSONObject.getBoolean("d");
        this.ePP = jSONObject.getBoolean("e");
        this.ePQ = jSONObject.getInt("f");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (g g2 : this.ePL) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("a", g2.getEntityId());
            jSONObject2.put("b", g2.agG());
            jSONObject2.put("c", g2.isInvisible());
            jSONArray.put((Object)jSONObject2);
        }
        jSONObject.put("a", (Object)jSONArray);
        jSONObject.put("b", this.ePM);
        jSONObject.put("c", this.ePN);
        jSONObject.put("d", this.ePO);
        jSONObject.put("e", this.ePP);
        jSONObject.put("f", this.ePQ);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public List<g> aJM() {
        return this.ePL;
    }

    public boolean aJN() {
        return this.ePM;
    }

    public boolean aJO() {
        return this.ePN;
    }

    public boolean aJP() {
        return this.ePO;
    }

    public boolean aJQ() {
        return this.ePP;
    }

    public int aJR() {
        return this.ePQ;
    }
}

