/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;

public class a {
    public final double dtH;
    public final double dtI;
    public final double dtJ;
    public final double dtK;
    public final double dtL;
    public final double dtM;

    public a(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.dtH = Math.min(d2, d5);
        this.dtI = Math.min(d3, d6);
        this.dtJ = Math.min(d4, d7);
        this.dtK = Math.max(d2, d5);
        this.dtL = Math.max(d3, d6);
        this.dtM = Math.max(d4, d7);
    }

    public a(b b2, b b3) {
        this.dtH = b2.wt();
        this.dtI = b2.wu();
        this.dtJ = b2.wx();
        this.dtK = b3.wt();
        this.dtL = b3.wu();
        this.dtM = b3.wx();
    }

    public a ac(double d2, double d3, double d4) {
        double d5 = this.dtH;
        double d6 = this.dtI;
        double d7 = this.dtJ;
        double d8 = this.dtK;
        double d9 = this.dtL;
        double d10 = this.dtM;
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        if (d4 < 0.0) {
            d7 += d4;
        } else if (d4 > 0.0) {
            d10 += d4;
        }
        return new a(d5, d6, d7, d8, d9, d10);
    }

    public a ad(double d2, double d3, double d4) {
        double d5 = this.dtH - d2;
        double d6 = this.dtI - d3;
        double d7 = this.dtJ - d4;
        double d8 = this.dtK + d2;
        double d9 = this.dtL + d3;
        double d10 = this.dtM + d4;
        return new a(d5, d6, d7, d8, d9, d10);
    }

    public a p(a a2) {
        double d2 = Math.min(this.dtH, a2.dtH);
        double d3 = Math.min(this.dtI, a2.dtI);
        double d4 = Math.min(this.dtJ, a2.dtJ);
        double d5 = Math.max(this.dtK, a2.dtK);
        double d6 = Math.max(this.dtL, a2.dtL);
        double d7 = Math.max(this.dtM, a2.dtM);
        return new a(d2, d3, d4, d5, d6, d7);
    }

    public static a h(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = Math.min(d2, d5);
        double d9 = Math.min(d3, d6);
        double d10 = Math.min(d4, d7);
        double d11 = Math.max(d2, d5);
        double d12 = Math.max(d3, d6);
        double d13 = Math.max(d4, d7);
        return new a(d8, d9, d10, d11, d12, d13);
    }

    public a ae(double d2, double d3, double d4) {
        return new a(this.dtH + d2, this.dtI + d3, this.dtJ + d4, this.dtK + d2, this.dtL + d3, this.dtM + d4);
    }

    public double a(a a2, double d2) {
        if (a2.dtL > this.dtI && a2.dtI < this.dtL && a2.dtM > this.dtJ && a2.dtJ < this.dtM) {
            double d3;
            if (d2 > 0.0 && a2.dtK <= this.dtH) {
                double d4 = this.dtH - a2.dtK;
                if (d4 < d2) {
                    d2 = d4;
                }
            } else if (d2 < 0.0 && a2.dtH >= this.dtK && (d3 = this.dtK - a2.dtH) > d2) {
                d2 = d3;
            }
            return d2;
        }
        return d2;
    }

    public double b(a a2, double d2) {
        if (a2.dtK > this.dtH && a2.dtH < this.dtK && a2.dtM > this.dtJ && a2.dtJ < this.dtM) {
            double d3;
            if (d2 > 0.0 && a2.dtL <= this.dtI) {
                double d4 = this.dtI - a2.dtL;
                if (d4 < d2) {
                    d2 = d4;
                }
            } else if (d2 < 0.0 && a2.dtI >= this.dtL && (d3 = this.dtL - a2.dtI) > d2) {
                d2 = d3;
            }
            return d2;
        }
        return d2;
    }

    public double c(a a2, double d2) {
        if (a2.dtK > this.dtH && a2.dtH < this.dtK && a2.dtL > this.dtI && a2.dtI < this.dtL) {
            double d3;
            if (d2 > 0.0 && a2.dtM <= this.dtJ) {
                double d4 = this.dtJ - a2.dtM;
                if (d4 < d2) {
                    d2 = d4;
                }
            } else if (d2 < 0.0 && a2.dtJ >= this.dtM && (d3 = this.dtM - a2.dtJ) > d2) {
                d2 = d3;
            }
            return d2;
        }
        return d2;
    }

    public boolean q(a a2) {
        return a2.dtK > this.dtH && a2.dtH < this.dtK && a2.dtL > this.dtI && a2.dtI < this.dtL && a2.dtM > this.dtJ && a2.dtJ < this.dtM;
    }

    public boolean o(da da2) {
        return da2.dAG > this.dtH && da2.dAG < this.dtK && da2.dAH > this.dtI && da2.dAH < this.dtL && da2.dAI > this.dtJ && da2.dAI < this.dtM;
    }

    public double aqV() {
        double d2 = this.dtK - this.dtH;
        double d3 = this.dtL - this.dtI;
        double d4 = this.dtM - this.dtJ;
        return (d2 + d3 + d4) / 3.0;
    }

    public a af(double d2, double d3, double d4) {
        double d5 = this.dtH + d2;
        double d6 = this.dtI + d3;
        double d7 = this.dtJ + d4;
        double d8 = this.dtK - d2;
        double d9 = this.dtL - d3;
        double d10 = this.dtM - d4;
        return new a(d5, d6, d7, d8, d9, d10);
    }

    public ce c(da da2, da da3) {
        da da4 = da2.a(da3, this.dtH);
        da da5 = da2.a(da3, this.dtK);
        da da6 = da2.b(da3, this.dtI);
        da da7 = da2.b(da3, this.dtL);
        da da8 = da2.c(da3, this.dtJ);
        da da9 = da2.c(da3, this.dtM);
        if (!this.p(da4)) {
            da4 = null;
        }
        if (!this.p(da5)) {
            da5 = null;
        }
        if (!this.q(da6)) {
            da6 = null;
        }
        if (!this.q(da7)) {
            da7 = null;
        }
        if (!this.r(da8)) {
            da8 = null;
        }
        if (!this.r(da9)) {
            da9 = null;
        }
        da da10 = null;
        if (da4 != null) {
            da10 = da4;
        }
        if (da5 != null && (da10 == null || da2.y(da5) < da2.y(da10))) {
            da10 = da5;
        }
        if (da6 != null && (da10 == null || da2.y(da6) < da2.y(da10))) {
            da10 = da6;
        }
        if (da7 != null && (da10 == null || da2.y(da7) < da2.y(da10))) {
            da10 = da7;
        }
        if (da8 != null && (da10 == null || da2.y(da8) < da2.y(da10))) {
            da10 = da8;
        }
        if (da9 != null && (da10 == null || da2.y(da9) < da2.y(da10))) {
            da10 = da9;
        }
        if (da10 == null) {
            return null;
        }
        ao ao2 = null;
        ao2 = da10 == da4 ? ao.dwu : (da10 == da5 ? ao.dwv : (da10 == da6 ? ao.dwq : (da10 == da7 ? ao.dwr : (da10 == da8 ? ao.dws : ao.dwt))));
        return new ce(da10, ao2);
    }

    private boolean p(da da2) {
        return da2 != null && da2.dAH >= this.dtI && da2.dAH <= this.dtL && da2.dAI >= this.dtJ && da2.dAI <= this.dtM;
    }

    private boolean q(da da2) {
        return da2 != null && da2.dAG >= this.dtH && da2.dAG <= this.dtK && da2.dAI >= this.dtJ && da2.dAI <= this.dtM;
    }

    private boolean r(da da2) {
        return da2 != null && da2.dAG >= this.dtH && da2.dAG <= this.dtK && da2.dAH >= this.dtI && da2.dAH <= this.dtL;
    }

    public String toString() {
        return "box[" + this.dtH + ", " + this.dtI + ", " + this.dtJ + " -> " + this.dtK + ", " + this.dtL + ", " + this.dtM + "]";
    }

    public boolean aqW() {
        return Double.isNaN(this.dtH) || Double.isNaN(this.dtI) || Double.isNaN(this.dtJ) || Double.isNaN(this.dtK) || Double.isNaN(this.dtL) || Double.isNaN(this.dtM);
    }
}

