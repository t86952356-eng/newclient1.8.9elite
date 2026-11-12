/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.src.a;
import net.minecraft.util.da;

public class q {
    private da dXR = null;
    private long dXS = System.currentTimeMillis();

    public da ar(double d2, double d3, double d4) {
        if (this.dXR == null) {
            this.dXR = new da(d2, d3, d4);
            return this.dXR;
        }
        long l2 = System.currentTimeMillis();
        long l3 = l2 - this.dXS;
        if (l3 == 0L) {
            return this.dXR;
        }
        this.dXS = l2;
        if (Math.abs(d2 - this.dXR.dAG) < 0.004 && Math.abs(d3 - this.dXR.dAH) < 0.004 && Math.abs(d4 - this.dXR.dAI) < 0.004) {
            return this.dXR;
        }
        double d5 = (double)l3 * 0.001;
        d5 = a.ab(d5, 0.0, 1.0);
        double d6 = d2 - this.dXR.dAG;
        double d7 = d3 - this.dXR.dAH;
        double d8 = d4 - this.dXR.dAI;
        double d9 = this.dXR.dAG + d6 * d5;
        double d10 = this.dXR.dAH + d7 * d5;
        double d11 = this.dXR.dAI + d8 * d5;
        this.dXR = new da(d9, d10, d11);
        return this.dXR;
    }
}

