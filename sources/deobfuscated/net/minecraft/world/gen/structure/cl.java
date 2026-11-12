/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import net.minecraft.world.gen.structure.cv;

class cl {
    public Class<? extends cv> dSh;
    public final int dSi;
    public int dSj;
    public int dSk;

    public cl(Class<? extends cv> clazz, int n2, int n3) {
        this.dSh = clazz;
        this.dSi = n2;
        this.dSk = n3;
    }

    public boolean iK(int n2) {
        return this.dSk == 0 || this.dSj < this.dSk;
    }

    public boolean azi() {
        return this.dSk == 0 || this.dSj < this.dSk;
    }
}

