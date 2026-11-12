/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.community;

import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class g
extends a {
    private final String message;

    public g(String string) {
        super((byte)6);
        this.message = string;
    }

    public g(JSONObject jSONObject) {
        super((byte)6);
        this.message = jSONObject.getString("a");
    }

    @Override
    public void a(rip.vantage.commons.handler.api.a a2) {
        a2.a(this);
    }

    @Override
    public String aJz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", (Object)this.message);
        jSONObject.put("id", (int)this.aeF());
        return jSONObject.toString();
    }

    public String getMessage() {
        return this.message;
    }
}

