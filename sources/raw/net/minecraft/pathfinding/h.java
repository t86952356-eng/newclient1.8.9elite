/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import net.minecraft.util.bt;

public class h {
    public final int dgk;
    public final int dgl;
    public final int dgm;
    private final int dgn;
    int Ho = -1;
    float dgo;
    float dgp;
    float dgq;
    h dgr;
    public boolean dgs;

    public h(int n2, int n3, int n4) {
        this.dgk = n2;
        this.dgl = n3;
        this.dgm = n4;
        this.dgn = h.y(n2, n3, n4);
    }

    public static int y(int n2, int n3, int n4) {
        return n3 & 0xFF | (n2 & Short.MAX_VALUE) << 8 | (n4 & Short.MAX_VALUE) << 24 | (n2 < 0 ? Integer.MIN_VALUE : 0) | (n4 < 0 ? 32768 : 0);
    }

    public float b(h h2) {
        float f2 = h2.dgk - this.dgk;
        float f3 = h2.dgl - this.dgl;
        float f4 = h2.dgm - this.dgm;
        return bt.bK(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public float c(h h2) {
        float f2 = h2.dgk - this.dgk;
        float f3 = h2.dgl - this.dgl;
        float f4 = h2.dgm - this.dgm;
        return f2 * f2 + f3 * f3 + f4 * f4;
    }

    public boolean equals(Object object) {
        if (!(object instanceof h)) {
            return false;
        }
        h h2 = (h)object;
        return this.dgn == h2.dgn && this.dgk == h2.dgk && this.dgl == h2.dgl && this.dgm == h2.dgm;
    }

    public int hashCode() {
        return this.dgn;
    }

    public boolean aiU() {
        return this.Ho >= 0;
    }

    public String toString() {
        return this.dgk + ", " + this.dgl + ", " + this.dgm;
    }
}

