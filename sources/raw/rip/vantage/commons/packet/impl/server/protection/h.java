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

public class h
extends b {
    private final byte[] eRs;

    public h(JSONObject jSONObject) {
        super((byte)32);
        this.eRs = Base64.getDecoder().decode(jSONObject.optString("a", ""));
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)Base64.getEncoder().encodeToString(this.eRs));
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public byte[] aKF() {
        return this.eRs;
    }
}

