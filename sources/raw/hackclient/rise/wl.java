/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akd;
import hackclient.rise.wo;

class wl {
    private final akd amx;
    private final double amy;
    private final wo amz;
    private boolean amA = true;
    private double[] amB = null;
    private int amC = 999;

    wl(akd akd2, double d2, wo wo2) {
        this.amx = akd2;
        this.amy = d2;
        this.amz = wo2;
    }

    public akd lk() {
        return this.amx;
    }

    public double ll() {
        return this.amy;
    }

    public wo lm() {
        return this.amz;
    }

    public boolean ln() {
        return this.amA;
    }

    public void v(boolean bl2) {
        this.amA = bl2;
    }

    public double[] lo() {
        return this.amB;
    }

    public void a(double[] dArray) {
        this.amB = dArray;
        this.amC = 0;
    }

    public int lp() {
        return this.amC;
    }

    public void lq() {
        ++this.amC;
    }
}

