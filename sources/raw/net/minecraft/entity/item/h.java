/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.c;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class h
extends c {
    private int bGw;
    private int bGR;

    public h(w w2) {
        super(w2);
        this.o(0.25f, 0.25f);
    }

    @Override
    protected void IA() {
        this.csD.am(8, 5);
    }

    @Override
    public boolean an(double d2) {
        return d2 < 4096.0;
    }

    public h(w w2, double d2, double d3, double d4, co co2) {
        super(w2);
        this.bGw = 0;
        this.o(0.25f, 0.25f);
        this.setPosition(d2, d3, d4);
        int n2 = 1;
        if (co2 != null && co2.aej()) {
            this.csD.b(8, co2);
            n n3 = co2.aek();
            n n4 = n3.eN("Fireworks");
            if (n4 != null) {
                n2 += n4.eE("Flight");
            }
        }
        this.ud = this.ta.nextGaussian() * 0.001;
        this.uf = this.ta.nextGaussian() * 0.001;
        this.ue = 0.05;
        this.bGR = 10 * n2 + this.ta.nextInt(6) + this.ta.nextInt(7);
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
        this.ud *= 1.15;
        this.uf *= 1.15;
        this.ue += 0.04;
        this.y(this.ud, this.ue, this.uf);
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
        if (this.bGw == 0 && !this.TE()) {
            this.baU.a(this, "fireworks.launch", 3.0f, 1.0f);
        }
        ++this.bGw;
        if (this.baU.dDw && this.bGw % 2 < 2) {
            this.baU.a(as.dwZ, this.gW, this.gX - 0.3, this.gY, this.ta.nextGaussian() * 0.05, -this.ue * 0.5, this.ta.nextGaussian() * 0.05, new int[0]);
        }
        if (!this.baU.dDw && this.bGw > this.bGR) {
            this.baU.a((c)this, (byte)17);
            this.Tt();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 17 && this.baU.dDw) {
            co co2 = this.csD.eq(8);
            n n2 = null;
            if (co2 != null && co2.aej()) {
                n2 = co2.aek().eN("Fireworks");
            }
            this.baU.a(this.gW, this.gX, this.gY, this.ud, this.ue, this.uf, n2);
        }
        super.a(by2);
    }

    @Override
    public void d(n n2) {
        n2.B("Life", this.bGw);
        n2.B("LifeTime", this.bGR);
        co co2 = this.csD.eq(8);
        if (co2 != null) {
            n n3 = new n();
            co2.t(n3);
            n2.b("FireworksItem", n3);
        }
    }

    @Override
    public void e(n n2) {
        co co2;
        this.bGw = n2.eG("Life");
        this.bGR = n2.eG("LifeTime");
        n n3 = n2.eN("FireworksItem");
        if (n3 != null && (co2 = co.s(n3)) != null) {
            this.csD.b(8, co2);
        }
    }

    @Override
    public float ag(float f2) {
        return super.ag(f2);
    }

    @Override
    public int af(float f2) {
        return super.af(f2);
    }

    @Override
    public boolean IC() {
        return false;
    }
}

