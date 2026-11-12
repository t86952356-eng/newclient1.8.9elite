/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.entity.ag;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.a;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.world.ai;
import net.minecraft.world.w;

public abstract class i
extends c
implements ag {
    private int cJQ = -1;
    private int cJR = -1;
    private int cJS = -1;
    private Block cJT;
    protected boolean cJV;
    public int cKD;
    private r cKE;
    private String cKF;
    private int cJZ;
    private int cKa;

    public i(w w2) {
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

    public i(w w2, r r2) {
        super(w2);
        this.cKE = r2;
        this.o(0.25f, 0.25f);
        this.b(r2.gW, r2.gX + (double)r2.getEyeHeight(), r2.gY, r2.pl, r2.pm);
        this.gW -= (double)(bt.bB(this.pl / 180.0f * (float)Math.PI) * 0.16f);
        this.gX -= (double)0.1f;
        this.gY -= (double)(bt.bx(this.pl / 180.0f * (float)Math.PI) * 0.16f);
        this.setPosition(this.gW, this.gX, this.gY);
        float f2 = 0.4f;
        this.ud = -bt.bx(this.pl / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI) * 0.4f;
        this.uf = bt.bB(this.pl / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI) * 0.4f;
        this.ue = -bt.bx((this.pm + this.Yf()) / 180.0f * (float)Math.PI) * 0.4f;
        this.c(this.ud, this.ue, this.uf, this.Ye(), 1.0f);
    }

    public i(w w2, double d2, double d3, double d4) {
        super(w2);
        this.cJZ = 0;
        this.o(0.25f, 0.25f);
        this.setPosition(d2, d3, d4);
    }

    protected float Ye() {
        return 1.5f;
    }

    protected float Yf() {
        return 0.0f;
    }

    @Override
    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = bt.aD(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.ta.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.ta.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.ta.nextGaussian() * (double)0.0075f * (double)f3;
        this.ud = d2 *= (double)f2;
        this.ue = d3 *= (double)f2;
        this.uf = d4 *= (double)f2;
        float f5 = bt.aD(d2 * d2 + d4 * d4);
        this.crM = this.pl = (float)(bt.y(d2, d4) * 180.0 / Math.PI);
        this.crO = this.pm = (float)(bt.y(d3, f5) * 180.0 / Math.PI);
        this.cJZ = 0;
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
        if (this.cKD > 0) {
            --this.cKD;
        }
        if (this.cJV) {
            if (this.baU.L(new b(this.cJQ, this.cJR, this.cJS)).df() == this.cJT) {
                ++this.cJZ;
                if (this.cJZ == 1200) {
                    this.Tt();
                }
                return;
            }
            this.cJV = false;
            this.ud *= (double)(this.ta.nextFloat() * 0.2f);
            this.ue *= (double)(this.ta.nextFloat() * 0.2f);
            this.uf *= (double)(this.ta.nextFloat() * 0.2f);
            this.cJZ = 0;
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
        if (!this.baU.dDw) {
            c c2 = null;
            List<c> list = this.baU.b(this, this.Us().ac(this.ud, this.ue, this.uf).ad(1.0, 1.0, 1.0));
            double d2 = 0.0;
            r r2 = this.acR();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d3;
                c c3 = list.get(i2);
                if (!c3.TO() || c3 == r2 && this.cKa < 5) continue;
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
        }
        if (ce2 != null) {
            if (ce2.dzu == cf.dzy && this.baU.L(ce2.dg()).df() == Blocks.cNa) {
                this.ac(ce2.dg());
            } else {
                this.f(ce2);
            }
        }
        this.gW += this.ud;
        this.gX += this.ue;
        this.gY += this.uf;
        float f3 = bt.aD(this.ud * this.ud + this.uf * this.uf);
        this.pl = (float)(bt.y(this.ud, this.uf) * 180.0 / Math.PI);
        this.pm = (float)(bt.y(this.ue, f3) * 180.0 / Math.PI);
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
        float f4 = 0.99f;
        float f5 = this.Yd();
        if (this.isInWater()) {
            for (int i3 = 0; i3 < 4; ++i3) {
                float f6 = 0.25f;
                this.baU.a(as.dxa, this.gW - this.ud * 0.25, this.gX - this.ue * 0.25, this.gY - this.uf * 0.25, this.ud, this.ue, this.uf, new int[0]);
            }
            f4 = 0.8f;
        }
        this.ud *= (double)f4;
        this.ue *= (double)f4;
        this.uf *= (double)f4;
        this.ue -= (double)f5;
        this.setPosition(this.gW, this.gX, this.gY);
    }

    protected float Yd() {
        return 0.03f;
    }

    protected abstract void f(ce var1);

    @Override
    public void d(n n2) {
        n2.a("xTile", (short)this.cJQ);
        n2.a("yTile", (short)this.cJR);
        n2.a("zTile", (short)this.cJS);
        cm cm2 = (cm)Block.aRV.y(this.cJT);
        n2.R("inTile", cm2 == null ? "" : cm2.toString());
        n2.a("shake", (byte)this.cKD);
        n2.a("inGround", (byte)(this.cJV ? 1 : 0));
        if ((this.cKF == null || this.cKF.length() == 0) && this.cKE instanceof net.minecraft.entity.player.a) {
            this.cKF = this.cKE.xU();
        }
        n2.R("ownerName", this.cKF == null ? "" : this.cKF);
    }

    @Override
    public void e(n n2) {
        this.cJQ = n2.eF("xTile");
        this.cJR = n2.eF("yTile");
        this.cJS = n2.eF("zTile");
        this.cJT = n2.C("inTile", 8) ? Block.cq(n2.eK("inTile")) : Block.aK(n2.eE("inTile") & 0xFF);
        this.cKD = n2.eE("shake") & 0xFF;
        this.cJV = n2.eE("inGround") == 1;
        this.cKE = null;
        this.cKF = n2.eK("ownerName");
        if (this.cKF != null && this.cKF.length() == 0) {
            this.cKF = null;
        }
        this.cKE = this.acR();
    }

    public r acR() {
        if (this.cKE == null && this.cKF != null && this.cKF.length() > 0) {
            this.cKE = this.baU.gz(this.cKF);
            if (this.cKE == null && this.baU instanceof ai) {
                try {
                    c c2 = ((ai)this.baU).j(UUID.fromString(this.cKF));
                    if (c2 instanceof r) {
                        this.cKE = (r)c2;
                    }
                }
                catch (Throwable throwable) {
                    this.cKE = null;
                }
            }
        }
        return this.cKE;
    }
}

