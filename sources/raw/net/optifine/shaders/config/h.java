/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import net.optifine.aw;
import net.optifine.shaders.config.f;

public class h
extends f {
    public static final String[] eGz = new String[]{"default", "true", "false"};
    public static final String[] eGA = new String[]{"Default", "ON", "OFF"};

    public h(String string, String string2, int n2) {
        super(string, eGz, string2, eGA, n2);
    }

    @Override
    public String aHu() {
        return this.aBJ() ? aw.aBF() : (this.aHC() ? aw.aBB() : (this.aHD() ? aw.aBC() : super.aHu()));
    }

    public boolean aBJ() {
        return this.aHt() == 0;
    }

    public boolean aHC() {
        return this.aHt() == 1;
    }

    public boolean aHD() {
        return this.aHt() == 2;
    }
}

