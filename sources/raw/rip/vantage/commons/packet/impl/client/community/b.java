/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.community;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class b
extends a {
    private final String ePe;
    private static final String ePf = "63d0f9bc46ca6bf7ad9572b7";

    public b(String string) {
        super((byte)4);
        this.ePe = string;
    }

    public b(JSONObject jSONObject) {
        super((byte)4);
        this.ePe = jSONObject.getString("a");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.ePe);
        jSONObject.put("b", (Object)ePf);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getMessage() {
        return this.ePe;
    }
}

