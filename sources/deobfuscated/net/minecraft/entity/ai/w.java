/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class w
extends e {
    p cyi;
    r cyj;
    float cyk;

    public w(p p2, float f2) {
        this.cyi = p2;
        this.cyk = f2;
        this.eO(5);
    }

    @Override
    public boolean WC() {
        this.cyj = this.cyi.UW();
        if (this.cyj == null) {
            return false;
        }
        double d2 = this.cyi.T((c)this.cyj);
        return d2 >= 4.0 && d2 <= 16.0 && this.cyi.aO && this.cyi.VB().nextInt(5) == 0;
    }

    @Override
    public boolean WD() {
        return !this.cyi.aO;
    }

    @Override
    public void WG() {
        double d2 = this.cyj.gW - this.cyi.gW;
        double d3 = this.cyj.gY - this.cyi.gY;
        float f2 = bt.aD(d2 * d2 + d3 * d3);
        this.cyi.ud += d2 / (double)f2 * 0.5 * (double)0.8f + this.cyi.ud * (double)0.2f;
        this.cyi.uf += d3 / (double)f2 * 0.5 * (double)0.8f + this.cyi.uf * (double)0.2f;
        this.cyi.ue = this.cyk;
    }
}

