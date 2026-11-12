/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.r;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.a;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.world.w;

public abstract class c
extends net.minecraft.entity.c {
    private int cJQ = -1;
    private int cJR = -1;
    private int cJS = -1;
    private Block cJT;
    private boolean cJV;
    public r cKd;
    private int cKe;
    private int cKa;
    public double cKf;
    public double cKg;
    public double cKh;

    public c(w w2) {
        super(w2);
        this.o(1.0f, 1.0f);
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

    public c(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2);
        this.o(1.0f, 1.0f);
        this.b(d2, d3, d4, this.pl, this.pm);
        this.setPosition(d2, d3, d4);
        double d8 = bt.aD(d5 * d5 + d6 * d6 + d7 * d7);
        this.cKf = d5 / d8 * 0.1;
        this.cKg = d6 / d8 * 0.1;
        this.cKh = d7 / d8 * 0.1;
    }

    public c(w w2, r r2, double d2, double d3, double d4) {
        super(w2);
        this.cKd = r2;
        this.o(1.0f, 1.0f);
        this.b(r2.gW, r2.gX, r2.gY, r2.pl, r2.pm);
        this.setPosition(this.gW, this.gX, this.gY);
        this.uf = 0.0;
        this.ue = 0.0;
        this.ud = 0.0;
        double d5 = bt.aD((d2 += this.ta.nextGaussian() * 0.4) * d2 + (d3 += this.ta.nextGaussian() * 0.4) * d3 + (d4 += this.ta.nextGaussian() * 0.4) * d4);
        this.cKf = d2 / d5 * 0.1;
        this.cKg = d3 / d5 * 0.1;
        this.cKh = d4 / d5 * 0.1;
    }

    @Override
    public void Dm() {
        if (this.baU.dDw || (this.cKd == null || !this.cKd.csb) && this.baU.aJ(new b(this))) {
            super.Dm();
            this.ev(1);
            if (this.cJV) {
                if (this.baU.L(new b(this.cJQ, this.cJR, this.cJS)).df() == this.cJT) {
                    ++this.cKe;
                    if (this.cKe == 600) {
                        this.Tt();
                    }
                    return;
                }
                this.cJV = false;
                this.ud *= (double)(this.ta.nextFloat() * 0.2f);
                this.ue *= (double)(this.ta.nextFloat() * 0.2f);
                this.uf *= (double)(this.ta.nextFloat() * 0.2f);
                this.cKe = 0;
                this.cKa = 0;
            } else {
                ++this.cKa;
            }
            da da2 = new da(this.gW, this.gX, this.gY);
            da da3 = new da(this.gW + this.ud, this.gX + this.ue, this.gY + this.uf);
            ce ce2 = this.baU.d(da2, da3);
            da2 = new da(this.gW, this.gX, this.gY);
            da3 = new da(this.gW + this.ud, this.gX + this.ue, this.gY + this.uf);
            if (ce2 != null) {
                da3 = new da(ce2.daS.dAG, ce2.daS.dAH, ce2.daS.dAI);
            }
            net.minecraft.entity.c c2 = null;
            List<net.minecraft.entity.c> list = this.baU.b(this, this.Us().ac(this.ud, this.ue, this.uf).ad(1.0, 1.0, 1.0));
            double d2 = 0.0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d3;
                net.minecraft.entity.c c3 = list.get(i2);
                if (!c3.TO() || c3.W(this.cKd) && this.cKa < 25) continue;
                float f2 = 0.3f;
                a a2 = c3.Us().ad(0.3f, 0.3f, 0.3f);
                ce ce3 = a2.c(da2, da3);
                if (ce3 == null || !((d3 = da2.y(ce3.daS)) < d2) && d2 != 0.0) continue;
                c2 = c3;
                d2 = d3;
            }
            if (c2 != null) {
                ce2 = new ce(c2);
            }
            if (ce2 != null) {
                this.f(ce2);
            }
            this.gW += this.ud;
            this.gX += this.ue;
            this.gY += this.uf;
            float f3 = bt.aD(this.ud * this.ud + this.uf * this.uf);
            this.pl = (float)(bt.y(this.uf, this.ud) * 180.0 / Math.PI) + 90.0f;
            this.pm = (float)(bt.y(f3, this.ue) * 180.0 / Math.PI) - 90.0f;
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
            float f4 = this.acM();
            if (this.isInWater()) {
                for (int i3 = 0; i3 < 4; ++i3) {
                    float f5 = 0.25f;
                    this.baU.a(as.dxa, this.gW - this.ud * 0.25, this.gX - this.ue * 0.25, this.gY - this.uf * 0.25, this.ud, this.ue, this.uf, new int[0]);
                }
                f4 = 0.8f;
            }
            this.ud += this.cKf;
            this.ue += this.cKg;
            this.uf += this.cKh;
            this.ud *= (double)f4;
            this.ue *= (double)f4;
            this.uf *= (double)f4;
            this.baU.a(as.dxh, this.gW, this.gX + 0.5, this.gY, 0.0, 0.0, 0.0, new int[0]);
            this.setPosition(this.gW, this.gX, this.gY);
        } else {
            this.Tt();
        }
    }

    protected float acM() {
        return 0.95f;
    }

    protected abstract void f(ce var1);

    @Override
    public void d(n n2) {
        n2.a("xTile", (short)this.cJQ);
        n2.a("yTile", (short)this.cJR);
        n2.a("zTile", (short)this.cJS);
        cm cm2 = (cm)Block.aRV.y(this.cJT);
        n2.R("inTile", cm2 == null ? "" : cm2.toString());
        n2.a("inGround", (byte)(this.cJV ? 1 : 0));
        n2.b("direction", this.b(this.ud, this.ue, this.uf));
    }

    @Override
    public void e(n n2) {
        this.cJQ = n2.eF("xTile");
        this.cJR = n2.eF("yTile");
        this.cJS = n2.eF("zTile");
        this.cJT = n2.C("inTile", 8) ? Block.cq(n2.eK("inTile")) : Block.aK(n2.eE("inTile") & 0xFF);
        boolean bl2 = this.cJV = n2.eE("inGround") == 1;
        if (n2.C("direction", 9)) {
            v v2 = n2.D("direction", 6);
            this.ud = v2.gk(0);
            this.ue = v2.gk(1);
            this.uf = v2.gk(2);
        } else {
            this.Tt();
        }
    }

    @Override
    public boolean TO() {
        return true;
    }

    @Override
    public float TX() {
        return 1.0f;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        this.TM();
        if (ad2.dk() != null) {
            da da2 = ad2.dk().TY();
            if (da2 != null) {
                this.ud = da2.dAG;
                this.ue = da2.dAH;
                this.uf = da2.dAI;
                this.cKf = this.ud * 0.1;
                this.cKg = this.ue * 0.1;
                this.cKh = this.uf * 0.1;
            }
            if (ad2.dk() instanceof r) {
                this.cKd = (r)ad2.dk();
            }
            return true;
        }
        return false;
    }

    @Override
    public float ag(float f2) {
        return 1.0f;
    }

    @Override
    public int af(float f2) {
        return 0xF000F0;
    }
}

