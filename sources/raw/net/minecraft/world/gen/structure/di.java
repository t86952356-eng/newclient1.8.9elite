/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import net.minecraft.world.gen.structure.dm;

public class di {
    public Class<? extends dm> dSH;
    public final int dSI;
    public int dSJ;
    public int dSK;

    public di(Class<? extends dm> clazz, int n2, int n3) {
        this.dSH = clazz;
        this.dSI = n2;
        this.dSK = n3;
    }

    public boolean iL(int n2) {
        return this.dSK == 0 || this.dSJ < this.dSK;
    }

    public boolean azl() {
        return this.dSK == 0 || this.dSJ < this.dSK;
    }
}

