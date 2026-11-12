/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.protection;

import java.util.Base64;
import org.json.JSONObject;
import rip.vantage.commons.handler.api.c;
import rip.vantage.commons.packet.api.abstracts.b;

public class g
extends b {
    private final byte[] eRq;
    private final long eRr;

    public g(byte[] byArray, long l2) {
        super((byte)21);
        this.eRq = byArray;
        this.eRr = l2;
    }

    public g(JSONObject jSONObject) {
        super((byte)21);
        this.eRq = Base64.getDecoder().decode(jSONObject.getString("a"));
        this.eRr = jSONObject.getLong("b");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)Base64.getEncoder().encodeToString(this.eRq));
        jSONObject.put("b", this.eRr);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public byte[] aJU() {
        return this.eRq;
    }

    public long ns() {
        return this.eRr;
    }
}

