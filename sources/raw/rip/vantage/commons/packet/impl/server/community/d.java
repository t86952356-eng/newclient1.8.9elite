/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.community;

import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.api.abstracts.b;

public class d
extends b {
    private final String eQt;
    private final int eQu;
    private final int eQv;
    private final int eQw;
    private final String eQx;

    public d(String string, int n2, int n3, int n4, String string2) {
        super((byte)9);
        this.eQt = string;
        this.eQu = n2;
        this.eQv = n3;
        this.eQw = n4;
        this.eQx = string2;
    }

    public d(JSONObject jSONObject) {
        super((byte)9);
        this.eQt = jSONObject.getString("a");
        this.eQu = jSONObject.getInt("b");
        this.eQv = jSONObject.getInt("c");
        this.eQw = jSONObject.getInt("d");
        this.eQx = jSONObject.getString("e");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eQt);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getMessage() {
        return this.eQt;
    }

    public int getFadeInTime() {
        return this.eQu;
    }

    public int getDisplayTime() {
        return this.eQv;
    }

    public int getFadeOutTime() {
        return this.eQw;
    }

    public String aKd() {
        return this.eQx;
    }
}

