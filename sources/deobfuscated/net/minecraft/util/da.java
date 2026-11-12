/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.entity.player.a;
import net.minecraft.util.bt;
import net.minecraft.util.db;

public class da {
    public double dAG;
    public double dAH;
    public double dAI;

    public da(double d2, double d3, double d4) {
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        if (d4 == -0.0) {
            d4 = 0.0;
        }
        this.dAG = d2;
        this.dAH = d3;
        this.dAI = d4;
    }

    public da(db db2) {
        this(db2.wt(), db2.wu(), db2.wx());
    }

    public da s(da da2) {
        return new da(da2.dAG - this.dAG, da2.dAH - this.dAH, da2.dAI - this.dAI);
    }

    public da atR() {
        double d2 = bt.aD(this.dAG * this.dAG + this.dAH * this.dAH + this.dAI * this.dAI);
        return d2 < 1.0E-4 ? new da(0.0, 0.0, 0.0) : new da(this.dAG / d2, this.dAH / d2, this.dAI / d2);
    }

    public double t(da da2) {
        return this.dAG * da2.dAG + this.dAH * da2.dAH + this.dAI * da2.dAI;
    }

    public da u(da da2) {
        return new da(this.dAH * da2.dAI - this.dAI * da2.dAH, this.dAI * da2.dAG - this.dAG * da2.dAI, this.dAG * da2.dAH - this.dAH * da2.dAG);
    }

    public da v(da da2) {
        return this.ak(da2.dAG, da2.dAH, da2.dAI);
    }

    public da ak(double d2, double d3, double d4) {
        return this.al(-d2, -d3, -d4);
    }

    public da w(da da2) {
        return this.al(da2.dAG, da2.dAH, da2.dAI);
    }

    public da al(double d2, double d3, double d4) {
        return new da(this.dAG + d2, this.dAH + d3, this.dAI + d4);
    }

    public double x(da da2) {
        double d2 = da2.dAG - this.dAG;
        double d3 = da2.dAH - this.dAH;
        double d4 = da2.dAI - this.dAI;
        return bt.aD(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public double N(a a2) {
        return this.x(new da(a2.gW, a2.gX, a2.gY));
    }

    public double y(da da2) {
        double d2 = da2.dAG - this.dAG;
        double d3 = da2.dAH - this.dAH;
        double d4 = da2.dAI - this.dAI;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public double atS() {
        return bt.aD(this.dAG * this.dAG + this.dAH * this.dAH + this.dAI * this.dAI);
    }

    public da a(da da2, double d2) {
        double d3 = da2.dAG - this.dAG;
        double d4 = da2.dAH - this.dAH;
        double d5 = da2.dAI - this.dAI;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.dAG) / d3;
        return d6 >= 0.0 && d6 <= 1.0 ? new da(this.dAG + d3 * d6, this.dAH + d4 * d6, this.dAI + d5 * d6) : null;
    }

    public da b(da da2, double d2) {
        double d3 = da2.dAG - this.dAG;
        double d4 = da2.dAH - this.dAH;
        double d5 = da2.dAI - this.dAI;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.dAH) / d4;
        return d6 >= 0.0 && d6 <= 1.0 ? new da(this.dAG + d3 * d6, this.dAH + d4 * d6, this.dAI + d5 * d6) : null;
    }

    public da c(da da2, double d2) {
        double d3 = da2.dAG - this.dAG;
        double d4 = da2.dAH - this.dAH;
        double d5 = da2.dAI - this.dAI;
        if (d5 * d5 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.dAI) / d5;
        return d6 >= 0.0 && d6 <= 1.0 ? new da(this.dAG + d3 * d6, this.dAH + d4 * d6, this.dAI + d5 * d6) : null;
    }

    public String toString() {
        return "(" + this.dAG + ", " + this.dAH + ", " + this.dAI + ")";
    }

    public da bO(float f2) {
        float f3 = bt.bB(f2);
        float f4 = bt.bx(f2);
        double d2 = this.dAG;
        double d3 = this.dAH * (double)f3 + this.dAI * (double)f4;
        double d4 = this.dAI * (double)f3 - this.dAH * (double)f4;
        return new da(d2, d3, d4);
    }

    public da aM(double d2) {
        return new da(this.dAG * d2, this.dAH * d2, this.dAI * d2);
    }

    public da bP(float f2) {
        float f3 = bt.bB(f2);
        float f4 = bt.bx(f2);
        double d2 = this.dAG * (double)f3 + this.dAI * (double)f4;
        double d3 = this.dAH;
        double d4 = this.dAI * (double)f3 - this.dAG * (double)f4;
        return new da(d2, d3, d4);
    }
}

