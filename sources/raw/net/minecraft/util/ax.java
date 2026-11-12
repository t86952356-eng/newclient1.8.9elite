/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public class ax {
    private final long[] dyf = new long[240];
    private int dyg;
    private int dyh;
    private int dyi;

    public void z(long l2) {
        this.dyf[this.dyi] = l2;
        ++this.dyi;
        if (this.dyi == 240) {
            this.dyi = 0;
        }
        if (this.dyh < 240) {
            this.dyg = 0;
            ++this.dyh;
        } else {
            this.dyg = this.hC(this.dyi + 1);
        }
    }

    public int c(long l2, int n2) {
        double d2 = (double)l2 / 1.6666666E7;
        return (int)(d2 * (double)n2);
    }

    public int atg() {
        return this.dyg;
    }

    public int ath() {
        return this.dyi;
    }

    public int hC(int n2) {
        return n2 % 240;
    }

    public long[] ati() {
        return this.dyf;
    }
}

