/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.protection;

import java.util.Base64;
import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class k
extends a {
    private final byte[] eQl;

    public k(byte[] byArray) {
        super((byte)32);
        this.eQl = byArray;
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)Base64.getEncoder().encodeToString(this.eQl));
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public byte[] aKa() {
        return this.eQl;
    }
}

