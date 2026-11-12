/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class bh {
    private final p cAo;
    private float cAp;
    private float cAq;
    private boolean cAr;
    private double gW;
    private double gX;
    private double gY;

    public bh(p p2) {
        this.cAo = p2;
    }

    public void b(c c2, float f2, float f3) {
        this.gW = c2.gW;
        this.gX = c2 instanceof r ? c2.gX + (double)c2.getEyeHeight() : (c2.Us().dtI + c2.Us().dtL) / 2.0;
        this.gY = c2.gY;
        this.cAp = f2;
        this.cAq = f3;
        this.cAr = true;
    }

    public void d(double d2, double d3, double d4, float f2, float f3) {
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        this.cAp = f2;
        this.cAq = f3;
        this.cAr = true;
    }

    public void Xd() {
        this.cAo.pm = 0.0f;
        if (this.cAr) {
            this.cAr = false;
            double d2 = this.gW - this.cAo.gW;
            double d3 = this.gX - (this.cAo.gX + (double)this.cAo.getEyeHeight());
            double d4 = this.gY - this.cAo.gY;
            double d5 = bt.aD(d2 * d2 + d4 * d4);
            float f2 = (float)(bt.y(d4, d2) * 180.0 / Math.PI) - 90.0f;
            float f3 = (float)(-(bt.y(d3, d5) * 180.0 / Math.PI));
            this.cAo.pm = this.v(this.cAo.pm, f3, this.cAq);
            this.cAo.pn = this.v(this.cAo.pn, f2, this.cAp);
        } else {
            this.cAo.pn = this.v(this.cAo.pn, this.cAo.cuF, 10.0f);
        }
        float f4 = bt.bN(this.cAo.pn - this.cAo.cuF);
        if (!this.cAo.UU().aiK()) {
            if (f4 < -75.0f) {
                this.cAo.pn = this.cAo.cuF - 75.0f;
            }
            if (f4 > 75.0f) {
                this.cAo.pn = this.cAo.cuF + 75.0f;
            }
        }
    }

    private float v(float f2, float f3, float f4) {
        float f5 = bt.bN(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    public boolean Xe() {
        return this.cAr;
    }

    public double Xf() {
        return this.gW;
    }

    public double Xg() {
        return this.gX;
    }

    public double Xh() {
        return this.gY;
    }
}

