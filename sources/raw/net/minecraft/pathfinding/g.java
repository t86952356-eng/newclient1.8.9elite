/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import net.minecraft.entity.p;
import net.minecraft.pathfinding.c;
import net.minecraft.pathfinding.d;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.pathfinder.b;
import net.minecraft.world.w;

public class g
extends d {
    public g(p p2, w w2) {
        super(p2, w2);
    }

    @Override
    protected c aiF() {
        return new c(new b());
    }

    @Override
    protected boolean aiN() {
        return this.aiO();
    }

    @Override
    protected da aiM() {
        return new da(this.cxk.gW, this.cxk.gX + (double)this.cxk.height * 0.5, this.cxk.gY);
    }

    @Override
    protected void aiJ() {
        da da2 = this.aiM();
        float f2 = this.cxk.width * this.cxk.width;
        int n2 = 6;
        if (da2.y(this.dga.d(this.cxk, this.dga.aiE())) < (double)f2) {
            this.dga.aiB();
        }
        for (int i2 = Math.min(this.dga.aiE() + 6, this.dga.aiD() - 1); i2 > this.dga.aiE(); --i2) {
            da da3 = this.dga.d(this.cxk, i2);
            if (!(da3.y(da2) <= 36.0) || !this.a(da2, da3, 0, 0, 0)) continue;
            this.dga.gI(i2);
            break;
        }
        this.n(da2);
    }

    @Override
    protected void aiP() {
        super.aiP();
    }

    @Override
    protected boolean a(da da2, da da3, int n2, int n3, int n4) {
        ce ce2 = this.baU.a(da2, new da(da3.dAG, da3.dAH + (double)this.cxk.height * 0.5, da3.dAI), false, true, false);
        return ce2 == null || ce2.dzu == cf.dzx;
    }
}

