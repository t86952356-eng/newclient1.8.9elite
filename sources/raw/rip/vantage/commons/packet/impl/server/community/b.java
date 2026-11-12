/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.community;

import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;

public class b
extends rip.vantage.commons.packet.api.abstracts.b {
    private final String eQp;
    private final int eQq;
    private final String eQr;

    public b(String string, int n2, String string2) {
        super((byte)4);
        this.eQp = string;
        this.eQq = n2;
        this.eQr = string2;
    }

    public b(JSONObject jSONObject) {
        super((byte)4);
        this.eQp = jSONObject.getString("a");
        this.eQq = jSONObject.getInt("b");
        this.eQr = jSONObject.getString("c");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eQp);
        jSONObject.put("b", this.eQq);
        jSONObject.put("c", (Object)this.eQr);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getAuthor() {
        return this.eQp;
    }

    public int aJK() {
        return this.eQq;
    }

    public String getMessage() {
        return this.eQr;
    }
}

