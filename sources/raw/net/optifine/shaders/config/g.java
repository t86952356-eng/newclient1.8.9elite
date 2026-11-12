/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import net.minecraft.src.a;
import net.optifine.shaders.config.f;

public class g
extends f {
    public static final String[] eGx = new String[]{"default", "fast", "fancy", "off"};
    public static final String[] eGy = new String[]{"Default", "Fast", "Fancy", "OFF"};

    public g(String string, String string2, int n2) {
        super(string, eGx, string2, eGy, n2);
    }

    public boolean aBJ() {
        return this.aHt() == 0;
    }

    public boolean aHz() {
        return this.aHt() == 1;
    }

    public boolean aHA() {
        return this.aHt() == 2;
    }

    public boolean aHB() {
        return this.aHt() == 3;
    }

    @Override
    public boolean je(String string) {
        if (a.a((Object)string, (Object)"none")) {
            string = "off";
        }
        return super.je(string);
    }
}

