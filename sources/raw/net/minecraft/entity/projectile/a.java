/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ag;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.network.play.server.av;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class a
extends c
implements ag {
    private int cJQ = -1;
    private int cJR = -1;
    private int cJS = -1;
    private Block cJT;
    private int cJU;
    private boolean cJV;
    public int cJW;
    public int cJX;
    public c cJY;
    private int cJZ;
    private int cKa;
    private double cKb = 2.0;
    private int cKc;

    public a(w w2) {
        super(w2);
        this.cry = 10.0;
        this.o(0.5f, 0.5f);
    }

    public a(w w2, double d2, double d3, double d4) {
        super(w2);
        this.cry = 10.0;
        this.o(0.5f, 0.5f);
        this.setPosition(d2, d3, d4);
    }

    public a(w w2, r r2, r r3, float f2, float f3) {
        super(w2);
        this.cry = 10.0;
        this.cJY = r2;
        if (r2 instanceof net.minecraft.entity.player.a) {
            this.cJW = 1;
        }
        this.gX = r2.gX + (double)r2.getEyeHeight() - (double)0.1f;
        double d2 = r3.gW - r2.gW;
        double d3 = r3.Us().dtI + (double)(r3.height / 3.0f) - this.gX;
        double d4 = r3.gY - r2.gY;
        double d5 = bt.aD(d2 * d2 + d4 * d4);
        if (d5 >= 1.0E-7) {
            float f4 = (float)(bt.y(d4, d2) * 180.0 / Math.PI) - 90.0f;
            float f5 = (float)(-(bt.y(d3, d5) * 180.0 / Math.PI));
            double d6 = d2 / d5;
            double d7 = d4 / d5;
            this.b(r2.gW + d6, this.gX, r2.gY + d7, f4, f5);
            float f6 = (float)(d5 * (double)0.2f);
            this.c(d2, d3 + (double)f6, d4, f2, f3);
        }
    }

    public a(w w2, r r2, float f2) {
        super(w2);
        this.cry = 10.0;
        this.cJY = r2;
        if (r2 instanceof net.minecraft.entity.player.a) {
            this.cJW = 1;
        }
        this.o(0.5f, 0.5f);
        this.b(r2.gW, r2.gX + (double)r2.getEyeHeight(), r2.gY, r2.pl, r2.pm);
        this.gW -= (double)(bt.bB(this.pl / 180.0f * (float)Math.PI) * 0.16f);
        this.gX -= (double)0.1f;
        this.gY -= (double)(bt.bx(this.pl / 180.0f * (float)Math.PI) * 0.16f);
        this.setPosition(this.gW, this.gX, this.gY);
        this.ud = -bt.bx(this.pl / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI);
        this.uf = bt.bB(this.pl / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI);
        this.ue = -bt.bx(this.pm / 180.0f * (float)Math.PI);
        this.c(this.ud, this.ue, this.uf, f2 * 1.5f, 1.0f);
    }

    @Override
    protected void IA() {
        this.csD.a(16, (byte)0);
    }

    @Override
    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = bt.aD(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.ta.nextGaussian() * (double)(this.ta.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f3;
        d3 += this.ta.nextGaussian() * (double)(this.ta.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f3;
        d4 += this.ta.nextGaussian() * (double)(this.ta.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f3;
        this.ud = d2 *= (double)f2;
        this.ue = d3 *= (double)f2;
        this.uf = d4 *= (double)f2;
        float f5 = bt.aD(d2 * d2 + d4 * d4);
        this.crM = this.pl = (float)(bt.y(d2, d4) * 180.0 / Math.PI);
        this.crO = this.pm = (float)(bt.y(d3, f5) * 180.0 / Math.PI);
        this.cJZ = 0;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.setPosition(d2, d3, d4);
        this.setRotation(f2, f3);
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
            this.crO = this.pm;
            this.crM = this.pl;
            this.b(this.gW, this.gX, this.gY, this.pl, this.pm);
            this.cJZ = 0;
        }
    }

    @Override
    public void Dm() {
        Object object;
        b b2;
        IBlockState iBlockState;
        Block block;
        super.Dm();
        if (this.crO == 0.0f && this.crM == 0.0f) {
            float f2 = bt.aD(this.ud * this.ud + this.uf * this.uf);
            this.crM = this.pl = (float)(bt.y(this.ud, this.uf) * 180.0 / Math.PI);
            this.crO = this.pm = (float)(bt.y(this.ue, f2) * 180.0 / Math.PI);
        }
        if ((block = (iBlockState = this.baU.L(b2 = new b(this.cJQ, this.cJR, this.cJS))).df()).xb() != Material.beo) {
            block.c((l)this.baU, b2);
            object = block.a(this.baU, b2, iBlockState);
            if (object != null && ((net.minecraft.util.a)object).o(new da(this.gW, this.gX, this.gY))) {
                this.cJV = true;
            }
        }
        if (this.cJX > 0) {
            --this.cJX;
        }
        if (this.cJV) {
            int n2 = block.c(iBlockState);
            if (block == this.cJT && n2 == this.cJU) {
                ++this.cJZ;
                if (this.cJZ >= 1200) {
                    this.Tt();
                }
            } else {
                this.cJV = false;
                this.ud *= (double)(this.ta.nextFloat() * 0.2f);
                this.ue *= (double)(this.ta.nextFloat() * 0.2f);
                this.uf *= (double)(this.ta.nextFloat() * 0.2f);
                this.cJZ = 0;
                this.cKa = 0;
            }
        } else {
            Object object2;
            float f3;
            Object object3;
            int n3;
            ++this.cKa;
            object = new da(this.gW, this.gX, this.gY);
            da da2 = new da(this.gW + this.ud, this.gX + this.ue, this.gY + this.uf);
            ce ce2 = this.baU.a((da)object, da2, false, true, false);
            object = new da(this.gW, this.gX, this.gY);
            da2 = new da(this.gW + this.ud, this.gX + this.ue, this.gY + this.uf);
            if (ce2 != null) {
                da2 = new da(ce2.daS.dAG, ce2.daS.dAH, ce2.daS.dAI);
            }
            Object object4 = null;
            List<c> list = this.baU.b(this, this.Us().ac(this.ud, this.ue, this.uf).ad(1.0, 1.0, 1.0));
            double d2 = 0.0;
            for (n3 = 0; n3 < list.size(); ++n3) {
                double d3;
                object3 = list.get(n3);
                if (!((c)object3).TO() || object3 == this.cJY && this.cKa < 5) continue;
                f3 = 0.3f;
                object2 = ((c)object3).Us().ad(0.3f, 0.3f, 0.3f);
                ce ce3 = ((net.minecraft.util.a)object2).c((da)object, da2);
                if (ce3 == null || !((d3 = ((da)object).y(ce3.daS)) < d2) && d2 != 0.0) continue;
                object4 = object3;
                d2 = d3;
            }
            if (object4 != null) {
                ce2 = new ce((c)object4);
            }
            if (ce2 != null && ce2.dzw != null && ce2.dzw instanceof net.minecraft.entity.player.a) {
                net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)ce2.dzw;
                if (a2.cIt.cJJ || this.cJY instanceof net.minecraft.entity.player.a && !((net.minecraft.entity.player.a)this.cJY).D(a2)) {
                    ce2 = null;
                }
            }
            if (ce2 != null) {
                if (ce2.dzw != null) {
                    float f4 = bt.aD(this.ud * this.ud + this.ue * this.ue + this.uf * this.uf);
                    int n4 = bt.aI((double)f4 * this.cKb);
                    if (this.acL()) {
                        n4 += this.ta.nextInt(n4 / 2 + 2);
                    }
                    ad ad2 = this.cJY == null ? ad.a(this, (c)this) : ad.a(this, this.cJY);
                    if (this.isBurning() && !(ce2.dzw instanceof net.minecraft.entity.monster.e)) {
                        ce2.dzw.ev(5);
                    }
                    if (ce2.dzw.a(ad2, (float)n4)) {
                        if (ce2.dzw instanceof r) {
                            float f5;
                            object2 = (r)ce2.dzw;
                            if (!this.baU.dDw) {
                                ((r)object2).eN(((r)object2).VT() + 1);
                            }
                            if (this.cKc > 0 && (f5 = bt.aD(this.ud * this.ud + this.uf * this.uf)) > 0.0f) {
                                ce2.dzw.N(this.ud * (double)this.cKc * (double)0.6f / (double)f5, 0.1, this.uf * (double)this.cKc * (double)0.6f / (double)f5);
                            }
                            if (this.cJY instanceof r) {
                                net.minecraft.enchantment.l.a((r)object2, this.cJY);
                                net.minecraft.enchantment.l.b((r)this.cJY, (c)object2);
                            }
                            if (this.cJY != null && ce2.dzw != this.cJY && ce2.dzw instanceof net.minecraft.entity.player.a && this.cJY instanceof e) {
                                ((e)this.cJY).cIX.B(new av(6, 0.0f));
                            }
                        }
                        this.a("random.bowhit", 1.0f, 1.2f / (this.ta.nextFloat() * 0.2f + 0.9f));
                        if (!(ce2.dzw instanceof net.minecraft.entity.monster.e)) {
                            this.Tt();
                        }
                    } else {
                        this.ud *= (double)-0.1f;
                        this.ue *= (double)-0.1f;
                        this.uf *= (double)-0.1f;
                        this.pl += 180.0f;
                        this.crM += 180.0f;
                        this.cKa = 0;
                    }
                } else {
                    b b3 = ce2.dg();
                    this.cJQ = b3.wt();
                    this.cJR = b3.wu();
                    this.cJS = b3.wx();
                    object3 = this.baU.L(b3);
                    this.cJT = object3.df();
                    this.cJU = this.cJT.c((IBlockState)object3);
                    this.ud = (float)(ce2.daS.dAG - this.gW);
                    this.ue = (float)(ce2.daS.dAH - this.gX);
                    this.uf = (float)(ce2.daS.dAI - this.gY);
                    f3 = bt.aD(this.ud * this.ud + this.ue * this.ue + this.uf * this.uf);
                    this.gW -= this.ud / (double)f3 * (double)0.05f;
                    this.gX -= this.ue / (double)f3 * (double)0.05f;
                    this.gY -= this.uf / (double)f3 * (double)0.05f;
                    this.a("random.bowhit", 1.0f, 1.2f / (this.ta.nextFloat() * 0.2f + 0.9f));
                    this.cJV = true;
                    this.cJX = 7;
                    this.bL(false);
                    if (this.cJT.xb() != Material.beo) {
                        this.cJT.a(this.baU, b3, (IBlockState)object3, this);
                    }
                }
            }
            if (this.acL()) {
                for (n3 = 0; n3 < 4; ++n3) {
                    this.baU.a(as.dxf, this.gW + this.ud * (double)n3 / 4.0, this.gX + this.ue * (double)n3 / 4.0, this.gY + this.uf * (double)n3 / 4.0, -this.ud, -this.ue + 0.2, -this.uf, new int[0]);
                }
            }
            this.gW += this.ud;
            this.gX += this.ue;
            this.gY += this.uf;
            float f6 = bt.aD(this.ud * this.ud + this.uf * this.uf);
            this.pl = (float)(bt.y(this.ud, this.uf) * 180.0 / Math.PI);
            this.pm = (float)(bt.y(this.ue, f6) * 180.0 / Math.PI);
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
            float f7 = 0.99f;
            float f8 = 0.05f;
            if (this.isInWater()) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    float f9 = 0.25f;
                    this.baU.a(as.dxa, this.gW - this.ud * 0.25, this.gX - this.ue * 0.25, this.gY - this.uf * 0.25, this.ud, this.ue, this.uf, new int[0]);
                }
                f7 = 0.6f;
            }
            if (this.TG()) {
                this.Tx();
            }
            this.ud *= (double)f7;
            this.ue *= (double)f7;
            this.uf *= (double)f7;
            this.ue -= (double)0.05f;
            this.setPosition(this.gW, this.gX, this.gY);
            this.TD();
        }
    }

    @Override
    public void d(n n2) {
        n2.a("xTile", (short)this.cJQ);
        n2.a("yTile", (short)this.cJR);
        n2.a("zTile", (short)this.cJS);
        n2.a("life", (short)this.cJZ);
        cm cm2 = (cm)Block.aRV.y(this.cJT);
        n2.R("inTile", cm2 == null ? "" : cm2.toString());
        n2.a("inData", (byte)this.cJU);
        n2.a("shake", (byte)this.cJX);
        n2.a("inGround", (byte)(this.cJV ? 1 : 0));
        n2.a("pickup", (byte)this.cJW);
        n2.b("damage", this.cKb);
    }

    @Override
    public void e(n n2) {
        this.cJQ = n2.eF("xTile");
        this.cJR = n2.eF("yTile");
        this.cJS = n2.eF("zTile");
        this.cJZ = n2.eF("life");
        this.cJT = n2.C("inTile", 8) ? Block.cq(n2.eK("inTile")) : Block.aK(n2.eE("inTile") & 0xFF);
        this.cJU = n2.eE("inData") & 0xFF;
        this.cJX = n2.eE("shake") & 0xFF;
        boolean bl2 = this.cJV = n2.eE("inGround") == 1;
        if (n2.C("damage", 99)) {
            this.cKb = n2.eJ("damage");
        }
        if (n2.C("pickup", 99)) {
            this.cJW = n2.eE("pickup");
        } else if (n2.C("player", 99)) {
            this.cJW = n2.eO("player") ? 1 : 0;
        }
    }

    @Override
    public void n(net.minecraft.entity.player.a a2) {
        if (!this.baU.dDw && this.cJV && this.cJX <= 0) {
            boolean bl2;
            boolean bl3 = bl2 = this.cJW == 1 || this.cJW == 2 && a2.cIt.cJM;
            if (this.cJW == 1 && !a2.cHV.ah(new co(Items.cPk, 1))) {
                bl2 = false;
            }
            if (bl2) {
                this.a("random.pop", 0.2f, ((this.ta.nextFloat() - this.ta.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                a2.c(this, 1);
                this.Tt();
            }
        }
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    public void at(double d2) {
        this.cKb = d2;
    }

    public double acK() {
        return this.cKb;
    }

    public void fK(int n2) {
        this.cKc = n2;
    }

    @Override
    public boolean IC() {
        return false;
    }

    @Override
    public float getEyeHeight() {
        return 0.0f;
    }

    public void bL(boolean bl2) {
        byte by2 = this.csD.el(16);
        if (bl2) {
            this.csD.b(16, (byte)(by2 | 1));
        } else {
            this.csD.b(16, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    public boolean acL() {
        byte by2 = this.csD.el(16);
        return (by2 & 1) != 0;
    }
}

