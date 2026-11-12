/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nl.hidden.Hidden0
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.client.protection;

import nl.Loader;
import nl.hidden.Hidden0;
import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.a;

public class c
extends a {
    private final String ePD;
    private final String ePE;
    private final String ePF;
    private final int ePG;

    public native String aJI();

    public c(String string, String string2, String string3, int n2) {
        super((byte)1);
        this.ePD = string;
        this.ePF = string2;
        this.ePE = string3;
        this.ePG = n2;
    }

    public c(JSONObject jSONObject) {
        super((byte)1);
        this.ePD = jSONObject.getString("a");
        this.ePF = jSONObject.getString("b");
        this.ePG = jSONObject.getInt("c");
        this.ePE = jSONObject.getString("d");
    }

    @Override
    public native void a(rip.vantage.commons.handler.api.a var1);

    @Override
    public native String aJz();

    public native String bX();

    public native String aJJ();

    public native int aJK();

    static {
        Loader.registerNativesForClass(7, c.class);
        Hidden0.special_clinit_7_90(c.class);
    }
}

