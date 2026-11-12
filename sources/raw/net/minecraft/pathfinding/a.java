/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import net.minecraft.pathfinding.h;

public class a {
    private h[] dfT = new h[1024];
    private int akW;

    public h a(h h2) {
        if (h2.Ho >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.akW == this.dfT.length) {
            h[] hArray = new h[this.akW << 1];
            System.arraycopy(this.dfT, 0, hArray, 0, this.akW);
            this.dfT = hArray;
        }
        this.dfT[this.akW] = h2;
        h2.Ho = this.akW;
        this.gE(this.akW++);
        return h2;
    }

    public void aiy() {
        this.akW = 0;
    }

    public h aiz() {
        h h2 = this.dfT[0];
        this.dfT[0] = this.dfT[--this.akW];
        this.dfT[this.akW] = null;
        if (this.akW > 0) {
            this.gF(0);
        }
        h2.Ho = -1;
        return h2;
    }

    public void a(h h2, float f2) {
        float f3 = h2.dgq;
        h2.dgq = f2;
        if (f2 < f3) {
            this.gE(h2.Ho);
        } else {
            this.gF(h2.Ho);
        }
    }

    private void gE(int n2) {
        h h2 = this.dfT[n2];
        float f2 = h2.dgq;
        while (n2 > 0) {
            int n3 = n2 - 1 >> 1;
            h h3 = this.dfT[n3];
            if (f2 >= h3.dgq) break;
            this.dfT[n2] = h3;
            h3.Ho = n2;
            n2 = n3;
        }
        this.dfT[n2] = h2;
        h2.Ho = n2;
    }

    private void gF(int n2) {
        h h2 = this.dfT[n2];
        float f2 = h2.dgq;
        while (true) {
            float f3;
            h h3;
            int n3 = 1 + (n2 << 1);
            int n4 = n3 + 1;
            if (n3 >= this.akW) break;
            h h4 = this.dfT[n3];
            float f4 = h4.dgq;
            if (n4 >= this.akW) {
                h3 = null;
                f3 = Float.POSITIVE_INFINITY;
            } else {
                h3 = this.dfT[n4];
                f3 = h3.dgq;
            }
            if (f4 < f3) {
                if (f4 >= f2) break;
                this.dfT[n2] = h4;
                h4.Ho = n2;
                n2 = n3;
                continue;
            }
            if (f3 >= f2) break;
            this.dfT[n2] = h3;
            h3.Ho = n2;
            n2 = n4;
        }
        this.dfT[n2] = h2;
        h2.Ho = n2;
    }

    public boolean aiA() {
        return this.akW == 0;
    }
}

