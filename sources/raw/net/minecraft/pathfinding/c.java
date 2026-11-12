/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import net.minecraft.pathfinding.a;
import net.minecraft.pathfinding.b;
import net.minecraft.pathfinding.h;
import net.minecraft.world.l;

public class c {
    private final a dfX = new a();
    private final h[] dfY = new h[32];
    private final net.minecraft.world.pathfinder.a dfZ;

    public c(net.minecraft.world.pathfinder.a a2) {
        this.dfZ = a2;
    }

    public b a(l l2, net.minecraft.entity.c c2, net.minecraft.entity.c c3, float f2) {
        return this.a(l2, c2, c3.gW, c3.Us().dtI, c3.gY, f2);
    }

    public b a(l l2, net.minecraft.entity.c c2, net.minecraft.util.b b2, float f2) {
        return this.a(l2, c2, (float)b2.wt() + 0.5f, (float)b2.wu() + 0.5f, (float)b2.wx() + 0.5f, f2);
    }

    private b a(l l2, net.minecraft.entity.c c2, double d2, double d3, double d4, float f2) {
        this.dfX.aiy();
        this.dfZ.a(l2, c2);
        h h2 = this.dfZ.aF(c2);
        h h3 = this.dfZ.b(c2, d2, d3, d4);
        b b2 = this.a(c2, h2, h3, f2);
        this.dfZ.azm();
        return b2;
    }

    private b a(net.minecraft.entity.c c2, h h2, h h3, float f2) {
        h2.dgo = 0.0f;
        h2.dgq = h2.dgp = h2.c(h3);
        this.dfX.aiy();
        this.dfX.a(h2);
        h h4 = h2;
        while (!this.dfX.aiA()) {
            h h5 = this.dfX.aiz();
            if (h5.equals(h3)) {
                return this.a(h2, h3);
            }
            if (h5.c(h3) < h4.c(h3)) {
                h4 = h5;
            }
            h5.dgs = true;
            int n2 = this.dfZ.a(this.dfY, c2, h5, h3, f2);
            for (int i2 = 0; i2 < n2; ++i2) {
                h h6 = this.dfY[i2];
                float f3 = h5.dgo + h5.c(h6);
                if (!(f3 < f2 * 2.0f) || h6.aiU() && !(f3 < h6.dgo)) continue;
                h6.dgr = h5;
                h6.dgo = f3;
                h6.dgp = h6.c(h3);
                if (h6.aiU()) {
                    this.dfX.a(h6, h6.dgo + h6.dgp);
                    continue;
                }
                h6.dgq = h6.dgo + h6.dgp;
                this.dfX.a(h6);
            }
        }
        if (h4 == h2) {
            return null;
        }
        return this.a(h2, h4);
    }

    private b a(h h2, h hArray) {
        int n2 = 1;
        h[] hArray2 = hArray;
        while (hArray2.dgr != null) {
            ++n2;
            hArray2 = hArray2.dgr;
        }
        hArray2 = new h[n2];
        Object object = hArray;
        hArray2[--n2] = hArray;
        while (object.dgr != null) {
            object = object.dgr;
            hArray2[--n2] = object;
        }
        return new b(hArray2);
    }
}

