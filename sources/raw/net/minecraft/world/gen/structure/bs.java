/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import net.minecraft.util.ao;

class bs {
    int dRI;
    bs[] dRJ = new bs[6];
    boolean[] dRK = new boolean[6];
    boolean dRL;
    boolean dRM;
    int dRN;

    public bs(int n2) {
        this.dRI = n2;
    }

    public void a(ao ao2, bs bs2) {
        this.dRJ[ao2.OY()] = bs2;
        bs2.dRJ[ao2.asC().OY()] = this;
    }

    public void ayZ() {
        for (int i2 = 0; i2 < 6; ++i2) {
            this.dRK[i2] = this.dRJ[i2] != null;
        }
    }

    public boolean iJ(int n2) {
        if (this.dRM) {
            return true;
        }
        this.dRN = n2;
        for (int i2 = 0; i2 < 6; ++i2) {
            if (this.dRJ[i2] == null || !this.dRK[i2] || this.dRJ[i2].dRN == n2 || !this.dRJ[i2].iJ(n2)) continue;
            return true;
        }
        return false;
    }

    public boolean aza() {
        return this.dRI >= 75;
    }

    public int azb() {
        int n2 = 0;
        for (int i2 = 0; i2 < 6; ++i2) {
            if (!this.dRK[i2]) continue;
            ++n2;
        }
        return n2;
    }
}

