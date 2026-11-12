/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.bc;

public class cx {
    private int dAy;
    private bc dAz;

    public int atN() {
        return this.dAy;
    }

    public void hV(int n2) {
        this.dAy = n2;
    }

    public <T extends bc> T atO() {
        return (T)this.dAz;
    }

    public void a(bc bc2) {
        this.dAz = bc2;
    }
}

