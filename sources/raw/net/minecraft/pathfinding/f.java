/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.p;
import net.minecraft.init.Blocks;
import net.minecraft.pathfinding.c;
import net.minecraft.pathfinding.d;
import net.minecraft.pathfinding.h;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class f
extends d {
    protected net.minecraft.world.pathfinder.c dgi;
    private boolean dgj;

    public f(p p2, w w2) {
        super(p2, w2);
    }

    @Override
    protected c aiF() {
        this.dgi = new net.minecraft.world.pathfinder.c();
        this.dgi.bS(true);
        return new c(this.dgi);
    }

    @Override
    protected boolean aiN() {
        return this.cxk.aO || this.aiT() && this.aiO() || this.cxk.isRiding() && this.cxk instanceof au && this.cxk.crC instanceof net.minecraft.entity.passive.d;
    }

    @Override
    protected da aiM() {
        return new da(this.cxk.gW, this.aiQ(), this.cxk.gY);
    }

    private int aiQ() {
        if (this.cxk.isInWater() && this.aiT()) {
            int n2 = (int)this.cxk.Us().dtI;
            Block block = this.baU.L(new b(bt.aF(this.cxk.gW), n2, bt.aF(this.cxk.gY))).df();
            int n3 = 0;
            while (block == Blocks.cLk || block == Blocks.cLl) {
                block = this.baU.L(new b(bt.aF(this.cxk.gW), ++n2, bt.aF(this.cxk.gY))).df();
                if (++n3 <= 16) continue;
                return (int)this.cxk.Us().dtI;
            }
            return n2;
        }
        return (int)(this.cxk.Us().dtI + 0.5);
    }

    @Override
    protected void aiP() {
        super.aiP();
        if (this.dgj) {
            if (this.baU.aM(new b(bt.aF(this.cxk.gW), (int)(this.cxk.Us().dtI + 0.5), bt.aF(this.cxk.gY)))) {
                return;
            }
            for (int i2 = 0; i2 < this.dga.aiD(); ++i2) {
                h h2 = this.dga.gG(i2);
                if (!this.baU.aM(new b(h2.dgk, h2.dgl, h2.dgm))) continue;
                this.dga.gH(i2 - 1);
                return;
            }
        }
    }

    @Override
    protected boolean a(da da2, da da3, int n2, int n3, int n4) {
        int n5 = bt.aF(da2.dAG);
        int n6 = bt.aF(da2.dAI);
        double d2 = da3.dAG - da2.dAG;
        double d3 = da3.dAI - da2.dAI;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 1.0E-8) {
            return false;
        }
        double d5 = 1.0 / Math.sqrt(d4);
        if (!this.a(n5, (int)da2.dAH, n6, n2 += 2, n3, n4 += 2, da2, d2 *= d5, d3 *= d5)) {
            return false;
        }
        n2 -= 2;
        n4 -= 2;
        double d6 = 1.0 / Math.abs(d2);
        double d7 = 1.0 / Math.abs(d3);
        double d8 = (double)(n5 * 1) - da2.dAG;
        double d9 = (double)(n6 * 1) - da2.dAI;
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        if (d3 >= 0.0) {
            d9 += 1.0;
        }
        d8 /= d2;
        d9 /= d3;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = d3 < 0.0 ? -1 : 1;
        int n9 = bt.aF(da3.dAG);
        int n10 = bt.aF(da3.dAI);
        int n11 = n9 - n5;
        int n12 = n10 - n6;
        while (n11 * n7 > 0 || n12 * n8 > 0) {
            if (d8 < d9) {
                d8 += d6;
                n11 = n9 - (n5 += n7);
            } else {
                d9 += d7;
                n12 = n10 - (n6 += n8);
            }
            if (this.a(n5, (int)da2.dAH, n6, n2, n3, n4, da2, d2, d3)) continue;
            return false;
        }
        return true;
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, da da2, double d2, double d3) {
        int n8 = n2 - n5 / 2;
        int n9 = n4 - n7 / 2;
        if (!this.b(n8, n3, n9, n5, n6, n7, da2, d2, d3)) {
            return false;
        }
        for (int i2 = n8; i2 < n8 + n5; ++i2) {
            for (int i3 = n9; i3 < n9 + n7; ++i3) {
                double d4 = (double)i2 + 0.5 - da2.dAG;
                double d5 = (double)i3 + 0.5 - da2.dAI;
                if (!(d4 * d2 + d5 * d3 >= 0.0)) continue;
                Block block = this.baU.L(new b(i2, n3 - 1, i3)).df();
                Material material = block.xb();
                if (material == Material.beo) {
                    return false;
                }
                if (material == Material.bev && !this.cxk.isInWater()) {
                    return false;
                }
                if (material != Material.bew) continue;
                return false;
            }
        }
        return true;
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7, da da2, double d2, double d3) {
        for (b b2 : b.b(new b(n2, n3, n4), new b(n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1))) {
            Block block;
            double d4;
            double d5 = (double)b2.wt() + 0.5 - da2.dAG;
            if (!(d5 * d2 + (d4 = (double)b2.wx() + 0.5 - da2.dAI) * d3 >= 0.0) || (block = this.baU.L(b2).df()).a((l)this.baU, b2)) continue;
            return false;
        }
        return true;
    }

    public void bQ(boolean bl2) {
        this.dgi.bQ(bl2);
    }

    public boolean aiR() {
        return this.dgi.aiR();
    }

    public void bR(boolean bl2) {
        this.dgi.bR(bl2);
    }

    public void bS(boolean bl2) {
        this.dgi.bS(bl2);
    }

    public boolean aiS() {
        return this.dgi.aiS();
    }

    public void bT(boolean bl2) {
        this.dgi.bT(bl2);
    }

    public boolean aiT() {
        return this.dgi.aiT();
    }

    public void bU(boolean bl2) {
        this.dgj = bl2;
    }
}

