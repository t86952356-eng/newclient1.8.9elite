/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.bk;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.k;
import net.minecraft.util.a;
import net.minecraft.util.bt;

class o
extends bk {
    private final k cEp;
    private int cEq;

    public o(k k2) {
        super(k2);
        this.cEp = k2;
    }

    @Override
    public void Xm() {
        if (this.cAu) {
            double d2 = this.x - this.cEp.gW;
            double d3 = this.y - this.cEp.gX;
            double d4 = this.z - this.cEp.gY;
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            if (this.cEq-- <= 0) {
                this.cEq += this.cEp.VB().nextInt(5) + 2;
                if (this.m(this.x, this.y, this.z, d5 = (double)bt.aD(d5))) {
                    this.cEp.ud += d2 / d5 * 0.1;
                    this.cEp.ue += d3 / d5 * 0.1;
                    this.cEp.uf += d4 / d5 * 0.1;
                } else {
                    this.cAu = false;
                }
            }
        }
    }

    private boolean m(double d2, double d3, double d4, double d5) {
        double d6 = (d2 - this.cEp.gW) / d5;
        double d7 = (d3 - this.cEp.gX) / d5;
        double d8 = (d4 - this.cEp.gY) / d5;
        a a2 = this.cEp.Us();
        int n2 = 1;
        while ((double)n2 < d5) {
            if (!this.cEp.baU.a((c)this.cEp, a2 = a2.ae(d6, d7, d8)).isEmpty()) {
                return false;
            }
            ++n2;
        }
        return true;
    }
}

