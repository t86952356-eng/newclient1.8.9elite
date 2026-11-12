/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import net.optifine.shaders.ah;
import net.optifine.shaders.config.o;

public class s
extends o {
    public s(String string) {
        super(string, null, null, new String[0], null, null);
    }

    @Override
    public String aIh() {
        return ah.ak("screen." + this.getName(), this.getName());
    }

    @Override
    public String aId() {
        return ah.ak("screen." + this.getName() + ".comment", null);
    }
}

