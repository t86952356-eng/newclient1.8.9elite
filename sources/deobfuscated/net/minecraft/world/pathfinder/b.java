/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.pathfinder;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.c;
import net.minecraft.pathfinding.h;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.util.g;
import net.minecraft.world.l;
import net.minecraft.world.pathfinder.a;

public class b
extends a {
    @Override
    public void a(l l2, c c2) {
        super.a(l2, c2);
    }

    @Override
    public void azm() {
        super.azm();
    }

    @Override
    public h aF(c c2) {
        return this.ag(bt.aF(c2.Us().dtH), bt.aF(c2.Us().dtI + 0.5), bt.aF(c2.Us().dtJ));
    }

    @Override
    public h b(c c2, double d2, double d3, double d4) {
        return this.ag(bt.aF(d2 - (double)(c2.width / 2.0f)), bt.aF(d3 + 0.5), bt.aF(d4 - (double)(c2.width / 2.0f)));
    }

    @Override
    public int a(h[] hArray, c c2, h h2, h h3, float f2) {
        int n2 = 0;
        for (ao ao2 : ao.values()) {
            h h4 = this.a(c2, h2.dgk + ao2.asH(), h2.dgl + ao2.asI(), h2.dgm + ao2.asJ());
            if (h4 == null || h4.dgs || !(h4.b(h3) < f2)) continue;
            hArray[n2++] = h4;
        }
        return n2;
    }

    private h a(c c2, int n2, int n3, int n4) {
        int n5 = this.b(c2, n2, n3, n4);
        return n5 == -1 ? this.ag(n2, n3, n4) : null;
    }

    private int b(c c2, int n2, int n3, int n4) {
        g g2 = new g();
        for (int i2 = n2; i2 < n2 + this.dSY; ++i2) {
            for (int i3 = n3; i3 < n3 + this.dSZ; ++i3) {
                for (int i4 = n4; i4 < n4 + this.dTa; ++i4) {
                    Block block = this.dSW.L(g2.E(i2, i3, i4)).df();
                    if (block.xb() == Material.bev) continue;
                    return 0;
                }
            }
        }
        return -1;
    }
}

