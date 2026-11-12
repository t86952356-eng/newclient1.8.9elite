/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import net.minecraft.world.gen.structure.av;

class aw {
    public Class<? extends av> dRd;
    public final int dRe;
    public int dRf;
    public int dRg;
    public boolean dRh;

    public aw(Class<? extends av> clazz, int n2, int n3, boolean bl2) {
        this.dRd = clazz;
        this.dRe = n2;
        this.dRg = n3;
        this.dRh = bl2;
    }

    public aw(Class<? extends av> clazz, int n2, int n3) {
        this(clazz, n2, n3, false);
    }

    public boolean iI(int n2) {
        return this.dRg == 0 || this.dRf < this.dRg;
    }

    public boolean ayW() {
        return this.dRg == 0 || this.dRf < this.dRg;
    }
}

