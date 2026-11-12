/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.protection;

import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.impl.client.protection.b;

public class a
extends rip.vantage.commons.packet.api.abstracts.b {
    private final String eQN;
    private final String eQO;
    private final String eQP;
    private final String eQQ;
    private String ePB;

    public a(String string, String string2, String string3, String string4) {
        super((byte)4);
        this.eQN = string;
        this.eQO = string2;
        this.eQP = string3;
        this.eQQ = string4;
    }

    public a(JSONObject jSONObject) {
        super((byte)4);
        this.eQN = jSONObject.getString("a");
        this.eQO = jSONObject.getString("b");
        this.eQP = jSONObject.getString("c");
        this.eQQ = jSONObject.getString("d");
        if (jSONObject.has("e")) {
            this.ePB = new b(jSONObject.getString("e")).toString();
        }
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.eQN);
        jSONObject.put("b", (Object)this.eQO);
        jSONObject.put("c", (Object)this.eQP);
        jSONObject.put("d", (Object)this.eQQ);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String bX() {
        return this.eQN;
    }

    public String sx() {
        return this.eQO;
    }

    public String sy() {
        return this.eQP;
    }

    public String sE() {
        return this.eQQ;
    }

    public String aJG() {
        return this.ePB;
    }
}

