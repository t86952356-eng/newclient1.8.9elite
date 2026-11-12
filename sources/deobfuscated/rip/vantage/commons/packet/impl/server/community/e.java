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

public class e
extends b {
    private final boolean eQy;
    private final boolean eQz;

    public e(boolean bl2, boolean bl3) {
        super((byte)10);
        this.eQy = bl2;
        this.eQz = bl3;
    }

    public e(JSONObject jSONObject) {
        super((byte)10);
        this.eQy = jSONObject.getBoolean("a");
        this.eQz = jSONObject.getBoolean("b");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public boolean aKe() {
        return this.eQy;
    }

    public boolean aKf() {
        return this.eQz;
    }
}

