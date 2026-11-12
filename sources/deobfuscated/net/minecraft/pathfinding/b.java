/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import net.minecraft.entity.c;
import net.minecraft.pathfinding.h;
import net.minecraft.util.da;

public class b {
    private final h[] dfU;
    private int dfV;
    private int dfW;

    public b(h[] hArray) {
        this.dfU = hArray;
        this.dfW = hArray.length;
    }

    public void aiB() {
        ++this.dfV;
    }

    public boolean kM() {
        return this.dfV >= this.dfW;
    }

    public h aiC() {
        return this.dfW > 0 ? this.dfU[this.dfW - 1] : null;
    }

    public h gG(int n2) {
        return this.dfU[n2];
    }

    public int aiD() {
        return this.dfW;
    }

    public void gH(int n2) {
        this.dfW = n2;
    }

    public int aiE() {
        return this.dfV;
    }

    public void gI(int n2) {
        this.dfV = n2;
    }

    public da d(c c2, int n2) {
        double d2 = (double)this.dfU[n2].dgk + (double)((int)(c2.width + 1.0f)) * 0.5;
        double d3 = this.dfU[n2].dgl;
        double d4 = (double)this.dfU[n2].dgm + (double)((int)(c2.width + 1.0f)) * 0.5;
        return new da(d2, d3, d4);
    }

    public da at(c c2) {
        return this.d(c2, this.dfV);
    }

    public boolean a(b b2) {
        if (b2 == null) {
            return false;
        }
        if (b2.dfU.length != this.dfU.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.dfU.length; ++i2) {
            if (this.dfU[i2].dgk == b2.dfU[i2].dgk && this.dfU[i2].dgl == b2.dfU[i2].dgl && this.dfU[i2].dgm == b2.dfU[i2].dgm) continue;
            return false;
        }
        return true;
    }

    public boolean m(da da2) {
        h h2 = this.aiC();
        return h2 != null && h2.dgk == (int)da2.dAG && h2.dgm == (int)da2.dAI;
    }
}

