/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.client.d;
import net.minecraft.util.bt;
import rip.vantage.commons.util.time.a;

public class cv {
    float dAn;
    private double dAo;
    public int In;
    public float bWY;
    public float dAp = 1.0f;
    public float dAq;
    private long dAr;
    private long dAs;
    private long dAt;
    private double dAu = 1.0;
    private a dAv = new a();

    public void cancel() {
        this.dAv.aX();
    }

    public cv(float f2) {
        this.dAn = f2;
        this.dAr = d.Bj();
        this.dAs = System.nanoTime() / 1000000L;
    }

    public void atM() {
        long l2 = d.Bj();
        long l3 = l2 - this.dAr;
        long l4 = System.nanoTime() / 1000000L;
        double d2 = (double)l4 / 1000.0;
        if (l3 <= 1000L && l3 >= 0L) {
            this.dAt += l3;
            if (this.dAt > 1000L) {
                long l5 = l4 - this.dAs;
                double d3 = (double)this.dAt / (double)l5;
                this.dAu += (d3 - this.dAu) * (double)0.2f;
                this.dAs = l4;
                this.dAt = 0L;
            }
            if (this.dAt < 0L) {
                this.dAs = l4;
            }
        } else {
            this.dAo = d2;
        }
        this.dAr = l2;
        double d4 = (d2 - this.dAo) * this.dAu;
        this.dAo = d2;
        d4 = bt.ah(d4, 0.0, 1.0);
        this.dAq = (float)((double)this.dAq + d4 * (double)this.dAp * (double)this.dAn);
        this.In = (int)this.dAq;
        this.dAq -= (float)this.In;
        if (this.In > 10) {
            this.In = 10;
        }
        if (this.dAv.T(50L)) {
            this.bWY = this.dAq;
        }
    }
}

