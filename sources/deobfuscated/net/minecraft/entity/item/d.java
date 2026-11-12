/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class d
extends c {
    private double alc;
    private double cwH;
    private double alb;
    private int cCg;
    private boolean cCh;

    public d(w w2) {
        super(w2);
        this.o(0.25f, 0.25f);
    }

    @Override
    protected void IA() {
    }

    @Override
    public boolean an(double d2) {
        double d3 = this.Us().aqV() * 4.0;
        if (Double.isNaN(d3)) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    public d(w w2, double d2, double d3, double d4) {
        super(w2);
        this.cCg = 0;
        this.o(0.25f, 0.25f);
        this.setPosition(d2, d3, d4);
    }

    public void ai(b b2) {
        double d2 = b2.wt();
        int n2 = b2.wu();
        double d3 = d2 - this.gW;
        double d4 = b2.wx();
        double d5 = d4 - this.gY;
        float f2 = bt.aD(d3 * d3 + d5 * d5);
        if (f2 > 12.0f) {
            this.alc = this.gW + d3 / (double)f2 * 12.0;
            this.alb = this.gY + d5 / (double)f2 * 12.0;
            this.cwH = this.gX + 8.0;
        } else {
            this.alc = d2;
            this.cwH = n2;
            this.alb = d4;
        }
        this.cCg = 0;
        this.cCh = this.ta.nextInt(5) > 0;
    }

    @Override
    public void P(double d2, double d3, double d4) {
        this.ud = d2;
        this.ue = d3;
        this.uf = d4;
        if (this.crO == 0.0f && this.crM == 0.0f) {
            float f2 = bt.aD(d2 * d2 + d4 * d4);
            this.crM = this.pl = (float)(bt.y(d2, d4) * 180.0 / Math.PI);
            this.crO = this.pm = (float)(bt.y(d3, f2) * 180.0 / Math.PI);
        }
    }

    @Override
    public void Dm() {
        this.csh = this.gW;
        this.csi = this.gX;
        this.csj = this.gY;
        super.Dm();
        this.gW += this.ud;
        this.gX += this.ue;
        this.gY += this.uf;
        float f2 = bt.aD(this.ud * this.ud + this.uf * this.uf);
        this.pl = (float)(bt.y(this.ud, this.uf) * 180.0 / Math.PI);
        this.pm = (float)(bt.y(this.ue, f2) * 180.0 / Math.PI);
        while (this.pm - this.crO < -180.0f) {
            this.crO -= 360.0f;
        }
        while (this.pm - this.crO >= 180.0f) {
            this.crO += 360.0f;
        }
        while (this.pl - this.crM < -180.0f) {
            this.crM -= 360.0f;
        }
        while (this.pl - this.crM >= 180.0f) {
            this.crM += 360.0f;
        }
        this.pm = this.crO + (this.pm - this.crO) * 0.2f;
        this.pl = this.crM + (this.pl - this.crM) * 0.2f;
        if (!this.baU.dDw) {
            double d2 = this.alc - this.gW;
            double d3 = this.alb - this.gY;
            float f3 = (float)Math.sqrt(d2 * d2 + d3 * d3);
            float f4 = (float)bt.y(d3, d2);
            double d4 = (double)f2 + (double)(f3 - f2) * 0.0025;
            if (f3 < 1.0f) {
                d4 *= 0.8;
                this.ue *= 0.8;
            }
            this.ud = Math.cos(f4) * d4;
            this.uf = Math.sin(f4) * d4;
            this.ue = this.gX < this.cwH ? (this.ue += (1.0 - this.ue) * (double)0.015f) : (this.ue += (-1.0 - this.ue) * (double)0.015f);
        }
        float f5 = 0.25f;
        if (this.isInWater()) {
            for (int i2 = 0; i2 < 4; ++i2) {
                this.baU.a(as.dxa, this.gW - this.ud * 0.25, this.gX - this.ue * 0.25, this.gY - this.uf * 0.25, this.ud, this.ue, this.uf, new int[0]);
            }
        } else {
            this.baU.a(as.dxu, this.gW - this.ud * 0.25 + this.ta.nextDouble() * 0.6 - 0.3, this.gX - this.ue * 0.25 - 0.5, this.gY - this.uf * 0.25 + this.ta.nextDouble() * 0.6 - 0.3, this.ud, this.ue, this.uf, new int[0]);
        }
        if (!this.baU.dDw) {
            this.setPosition(this.gW, this.gX, this.gY);
            ++this.cCg;
            if (this.cCg > 80 && !this.baU.dDw) {
                this.Tt();
                if (this.cCh) {
                    this.baU.G(new i(this.baU, this.gW, this.gX, this.gY, new co(Items.cRL)));
                } else {
                    this.baU.e(2003, new b(this), 0);
                }
            }
        }
    }

    @Override
    public void d(n n2) {
    }

    @Override
    public void e(n n2) {
    }

    @Override
    public float ag(float f2) {
        return 1.0f;
    }

    @Override
    public int af(float f2) {
        return 0xF000F0;
    }

    @Override
    public boolean IC() {
        return false;
    }
}

