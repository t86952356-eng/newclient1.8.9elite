/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import net.minecraft.util.da;

final class xo {
    private final da apr;
    private double aps;
    private float apt;

    private xo(da da2, double d2, float f2) {
        this.apr = da2;
        this.aps = d2;
        this.apt = f2;
    }

    public void y(double d2) {
        this.aps += d2;
    }

    public da mr() {
        return this.apr;
    }

    public double ms() {
        return this.aps;
    }

    public float mt() {
        return this.apt;
    }

    public void p(float f2) {
        this.apt = f2;
    }
}

