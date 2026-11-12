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
    private final String message;
    private final int fadeInTime;
    private final int displayTime;
    private final int fadeOutTime;
    private final String eQx;

    public d(String string, int n2, int n3, int n4, String string2) {
        super((byte)9);
        this.message = string;
        this.fadeInTime = n2;
        this.displayTime = n3;
        this.fadeOutTime = n4;
        this.eQx = string2;
    }

    public d(JSONObject jSONObject) {
        super((byte)9);
        this.message = jSONObject.getString("a");
        this.fadeInTime = jSONObject.getInt("b");
        this.displayTime = jSONObject.getInt("c");
        this.fadeOutTime = jSONObject.getInt("d");
        this.eQx = jSONObject.getString("e");
    }

    @Override
    public void a(c c2) {
        c2.a(this);
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

    public int getFadeInTime() {
        return this.fadeInTime;
    }

    public int getDisplayTime() {
        return this.displayTime;
    }

    public int getFadeOutTime() {
        return this.fadeOutTime;
    }

    public String aKd() {
        return this.eQx;
    }
}

