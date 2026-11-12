/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.l;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.bd;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.a;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.util.de;
import net.minecraft.util.dh;
import net.minecraft.world.ai;
import net.minecraft.world.w;

public class d
extends c {
    private static final List<dh> cKi = Arrays.asList(new dh(new co(Items.cPX), 10).bQ(0.9f), new dh(new co(Items.cQJ), 10), new dh(new co(Items.cRb), 10), new dh(new co(Items.cRD), 10), new dh(new co(Items.cPJ), 5), new dh(new co(Items.cQV), 2).bQ(0.9f), new dh(new co(Items.cPD), 10), new dh(new co(Items.cPC), 5), new dh(new co(Items.cRa, 10, net.minecraft.item.b.cUR.ado()), 1), new dh(new co(Blocks.cNT), 10), new dh(new co(Items.cRx), 10));
    private static final List<dh> cKj = Arrays.asList(new dh(new co(Blocks.cNz), 1), new dh(new co(Items.cSs), 1), new dh(new co(Items.cQE), 1), new dh(new co(Items.cPj), 1).bQ(0.25f).atX(), new dh(new co(Items.cQV), 1).bQ(0.25f).atX(), new dh(new co(Items.cQP), 1).atX());
    private static final List<dh> cKk = Arrays.asList(new dh(new co(Items.cQY, 1, bd.cWe.yc()), 60), new dh(new co(Items.cQY, 1, bd.cWf.yc()), 25), new dh(new co(Items.cQY, 1, bd.cWg.yc()), 2), new dh(new co(Items.cQY, 1, bd.cWh.yc()), 13));
    private int cJQ = -1;
    private int cJR = -1;
    private int cJS = -1;
    private Block cJT;
    private boolean cJV;
    public int cKl;
    public net.minecraft.entity.player.a cKm;
    private int cJZ;
    private int cKa;
    private int cKn;
    private int cKo;
    private int cKp;
    private float cKq;
    public c cKr;
    private int cKs;
    private double cKt;
    private double cKu;
    private double cKv;
    private double cKw;
    private double cKx;
    private double cKy;
    private double cKz;
    private double cKA;

    public static List<dh> acN() {
        return cKk;
    }

    public d(w w2) {
        super(w2);
        this.o(0.25f, 0.25f);
        this.csK = true;
    }

    public d(w w2, double d2, double d3, double d4, net.minecraft.entity.player.a a2) {
        this(w2);
        this.setPosition(d2, d3, d4);
        this.csK = true;
        this.cKm = a2;
        a2.cIE = this;
    }

    public d(w w2, net.minecraft.entity.player.a a2) {
        super(w2);
        this.csK = true;
        this.cKm = a2;
        this.cKm.cIE = this;
        this.o(0.25f, 0.25f);
        this.b(a2.gW, a2.gX + (double)a2.getEyeHeight(), a2.gY, a2.pl, a2.pm);
        this.gW -= (double)(bt.bB(this.pl / 180.0f * (float)Math.PI) * 0.16f);
        this.gX -= (double)0.1f;
        this.gY -= (double)(bt.bx(this.pl / 180.0f * (float)Math.PI) * 0.16f);
        this.setPosition(this.gW, this.gX, this.gY);
        float f2 = 0.4f;
        this.ud = -bt.bx(this.pl / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI) * 0.4f;
        this.uf = bt.bB(this.pl / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI) * 0.4f;
        this.ue = -bt.bx(this.pm / 180.0f * (float)Math.PI) * 0.4f;
        this.e(this.ud, this.ue, this.uf, 1.5f, 1.0f);
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

    public void e(double d2, double d3, double d4, float f2, float f3) {
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
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.cKt = d2;
        this.cKu = d3;
        this.cKv = d4;
        this.cKw = f2;
        this.cKx = f3;
        this.cKs = n2;
        this.ud = this.cKy;
        this.ue = this.cKz;
        this.uf = this.cKA;
    }

    @Override
    public void P(double d2, double d3, double d4) {
        this.cKy = this.ud = d2;
        this.cKz = this.ue = d3;
        this.cKA = this.uf = d4;
    }

    @Override
    public void Dm() {
        super.Dm();
        if (this.cKs > 0) {
            double d2 = this.gW + (this.cKt - this.gW) / (double)this.cKs;
            double d3 = this.gX + (this.cKu - this.gX) / (double)this.cKs;
            double d4 = this.gY + (this.cKv - this.gY) / (double)this.cKs;
            double d5 = bt.aJ(this.cKw - (double)this.pl);
            this.pl = (float)((double)this.pl + d5 / (double)this.cKs);
            this.pm = (float)((double)this.pm + (this.cKx - (double)this.pm) / (double)this.cKs);
            --this.cKs;
            this.setPosition(d2, d3, d4);
            this.setRotation(this.pl, this.pm);
        } else {
            Object object;
            if (!this.baU.dDw) {
                object = this.cKm.abO();
                if (this.cKm.csb || !this.cKm.TS() || object == null || ((co)object).bP() != Items.cQV || this.T(this.cKm) > 1024.0) {
                    this.Tt();
                    this.cKm.cIE = null;
                    return;
                }
                if (this.cKr != null) {
                    if (!this.cKr.csb) {
                        this.gW = this.cKr.gW;
                        double d6 = this.cKr.height;
                        this.gX = this.cKr.Us().dtI + d6 * 0.8;
                        this.gY = this.cKr.gY;
                        return;
                    }
                    this.cKr = null;
                }
            }
            if (this.cKl > 0) {
                --this.cKl;
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
            object = new da(this.gW, this.gX, this.gY);
            da da2 = new da(this.gW + this.ud, this.gX + this.ue, this.gY + this.uf);
            ce ce2 = this.baU.d((da)object, da2);
            object = new da(this.gW, this.gX, this.gY);
            da2 = new da(this.gW + this.ud, this.gX + this.ue, this.gY + this.uf);
            if (ce2 != null) {
                da2 = new da(ce2.daS.dAG, ce2.daS.dAH, ce2.daS.dAI);
            }
            c c2 = null;
            List<c> list = this.baU.b(this, this.Us().ac(this.ud, this.ue, this.uf).ad(1.0, 1.0, 1.0));
            double d7 = 0.0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d8;
                c c3 = list.get(i2);
                if (!c3.TO() || c3 == this.cKm && this.cKa < 5) continue;
                float f2 = 0.3f;
                a a2 = c3.Us().ad(0.3f, 0.3f, 0.3f);
                ce ce3 = a2.c((da)object, da2);
                if (ce3 == null || !((d8 = ((da)object).y(ce3.daS)) < d7) && d7 != 0.0) continue;
                c2 = c3;
                d7 = d8;
            }
            if (c2 != null) {
                ce2 = new ce(c2);
            }
            if (ce2 != null) {
                if (ce2.dzw != null) {
                    if (ce2.dzw.a(ad.c(this, this.cKm), 0.0f)) {
                        this.cKr = ce2.dzw;
                    }
                } else {
                    this.cJV = true;
                }
            }
            if (!this.cJV) {
                double d9;
                this.y(this.ud, this.ue, this.uf);
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
                float f4 = 0.92f;
                if (this.aO || this.crR) {
                    f4 = 0.5f;
                }
                int n2 = 5;
                double d10 = 0.0;
                for (int i3 = 0; i3 < 5; ++i3) {
                    a a3 = this.Us();
                    double d11 = a3.dtL - a3.dtI;
                    double d12 = a3.dtI + d11 * (double)i3 / 5.0;
                    d9 = a3.dtI + d11 * (double)(i3 + 1) / 5.0;
                    a a4 = new a(a3.dtH, d12, a3.dtJ, a3.dtK, d9, a3.dtM);
                    if (!this.baU.c(a4, Material.bev)) continue;
                    d10 += 0.2;
                }
                if (!this.baU.dDw && d10 > 0.0) {
                    ai ai2 = (ai)this.baU;
                    int n3 = 1;
                    b b2 = new b(this).aqX();
                    if (this.ta.nextFloat() < 0.25f && this.baU.be(b2)) {
                        n3 = 2;
                    }
                    if (this.ta.nextFloat() < 0.5f && !this.baU.aM(b2)) {
                        --n3;
                    }
                    if (this.cKn > 0) {
                        --this.cKn;
                        if (this.cKn <= 0) {
                            this.cKo = 0;
                            this.cKp = 0;
                        }
                    } else if (this.cKp > 0) {
                        this.cKp -= n3;
                        if (this.cKp <= 0) {
                            this.ue -= (double)0.2f;
                            this.a("random.splash", 0.25f, 1.0f + (this.ta.nextFloat() - this.ta.nextFloat()) * 0.4f);
                            float f5 = bt.aF(this.Us().dtI);
                            ai2.a(as.dxa, this.gW, (double)(f5 + 1.0f), this.gY, (int)(1.0f + this.width * 20.0f), (double)this.width, 0.0, (double)this.width, (double)0.2f, new int[0]);
                            ai2.a(as.dxc, this.gW, (double)(f5 + 1.0f), this.gY, (int)(1.0f + this.width * 20.0f), (double)this.width, 0.0, (double)this.width, (double)0.2f, new int[0]);
                            this.cKn = bt.b(this.ta, 10, 30);
                        } else {
                            double d13;
                            this.cKq = (float)((double)this.cKq + this.ta.nextGaussian() * 4.0);
                            float f6 = this.cKq * ((float)Math.PI / 180);
                            float f7 = bt.bx(f6);
                            float f8 = bt.bB(f6);
                            d9 = this.gW + (double)(f7 * (float)this.cKp * 0.1f);
                            double d14 = (float)bt.aF(this.Us().dtI) + 1.0f;
                            Block block = ai2.L(new b((int)d9, (int)d14 - 1, (int)(d13 = this.gY + (double)(f8 * (float)this.cKp * 0.1f)))).df();
                            if (block == Blocks.cLl || block == Blocks.cLk) {
                                if (this.ta.nextFloat() < 0.15f) {
                                    ai2.a(as.dxa, d9, d14 - (double)0.1f, d13, 1, (double)f7, 0.1, (double)f8, 0.0, new int[0]);
                                }
                                float f9 = f7 * 0.04f;
                                float f10 = f8 * 0.04f;
                                ai2.a(as.dxc, d9, d14, d13, 0, (double)f10, 0.01, (double)(-f9), 1.0, new int[0]);
                                ai2.a(as.dxc, d9, d14, d13, 0, (double)(-f10), 0.01, (double)f9, 1.0, new int[0]);
                            }
                        }
                    } else if (this.cKo > 0) {
                        this.cKo -= n3;
                        float f11 = 0.15f;
                        if (this.cKo < 20) {
                            f11 = (float)((double)f11 + (double)(20 - this.cKo) * 0.05);
                        } else if (this.cKo < 40) {
                            f11 = (float)((double)f11 + (double)(40 - this.cKo) * 0.02);
                        } else if (this.cKo < 60) {
                            f11 = (float)((double)f11 + (double)(60 - this.cKo) * 0.01);
                        }
                        if (this.ta.nextFloat() < f11) {
                            double d15;
                            double d16;
                            float f12 = bt.b(this.ta, 0.0f, 360.0f) * ((float)Math.PI / 180);
                            float f13 = bt.b(this.ta, 25.0f, 60.0f);
                            d9 = this.gW + (double)(bt.bx(f12) * f13 * 0.1f);
                            Block block = ai2.L(new b((int)d9, (int)(d16 = (double)((float)bt.aF(this.Us().dtI) + 1.0f)) - 1, (int)(d15 = this.gY + (double)(bt.bB(f12) * f13 * 0.1f)))).df();
                            if (block == Blocks.cLl || block == Blocks.cLk) {
                                ai2.a(as.dxb, d9, d16, d15, 2 + this.ta.nextInt(2), (double)0.1f, 0.0, (double)0.1f, 0.0, new int[0]);
                            }
                        }
                        if (this.cKo <= 0) {
                            this.cKq = bt.b(this.ta, 0.0f, 360.0f);
                            this.cKp = bt.b(this.ta, 20, 80);
                        }
                    } else {
                        this.cKo = bt.b(this.ta, 100, 900);
                        this.cKo -= l.O(this.cKm) * 20 * 5;
                    }
                    if (this.cKn > 0) {
                        this.ue -= (double)(this.ta.nextFloat() * this.ta.nextFloat() * this.ta.nextFloat()) * 0.2;
                    }
                }
                double d17 = d10 * 2.0 - 1.0;
                this.ue += (double)0.04f * d17;
                if (d10 > 0.0) {
                    f4 = (float)((double)f4 * 0.9);
                    this.ue *= 0.8;
                }
                this.ud *= (double)f4;
                this.ue *= (double)f4;
                this.uf *= (double)f4;
                this.setPosition(this.gW, this.gX, this.gY);
            }
        }
    }

    @Override
    public void d(n n2) {
        n2.a("xTile", (short)this.cJQ);
        n2.a("yTile", (short)this.cJR);
        n2.a("zTile", (short)this.cJS);
        cm cm2 = (cm)Block.aRV.y(this.cJT);
        n2.R("inTile", cm2 == null ? "" : cm2.toString());
        n2.a("shake", (byte)this.cKl);
        n2.a("inGround", (byte)(this.cJV ? 1 : 0));
    }

    @Override
    public void e(n n2) {
        this.cJQ = n2.eF("xTile");
        this.cJR = n2.eF("yTile");
        this.cJS = n2.eF("zTile");
        this.cJT = n2.C("inTile", 8) ? Block.cq(n2.eK("inTile")) : Block.aK(n2.eE("inTile") & 0xFF);
        this.cKl = n2.eE("shake") & 0xFF;
        this.cJV = n2.eE("inGround") == 1;
    }

    public int acO() {
        if (this.baU.dDw) {
            return 0;
        }
        int n2 = 0;
        if (this.cKr != null) {
            double d2 = this.cKm.gW - this.gW;
            double d3 = this.cKm.gX - this.gX;
            double d4 = this.cKm.gY - this.gY;
            double d5 = bt.aD(d2 * d2 + d3 * d3 + d4 * d4);
            double d6 = 0.1;
            this.cKr.ud += d2 * 0.1;
            this.cKr.ue += d3 * 0.1 + (double)bt.aD(d5) * 0.08;
            this.cKr.uf += d4 * 0.1;
            n2 = 3;
        } else if (this.cKn > 0) {
            i i2 = new i(this.baU, this.gW, this.gX, this.gY, this.acP());
            double d7 = this.cKm.gW - this.gW;
            double d8 = this.cKm.gX - this.gX;
            double d9 = this.cKm.gY - this.gY;
            double d10 = bt.aD(d7 * d7 + d8 * d8 + d9 * d9);
            double d11 = 0.1;
            i2.ud = d7 * 0.1;
            i2.ue = d8 * 0.1 + (double)bt.aD(d10) * 0.08;
            i2.uf = d9 * 0.1;
            this.baU.G(i2);
            this.cKm.baU.G(new net.minecraft.entity.item.w(this.cKm.baU, this.cKm.gW, this.cKm.gX + 0.5, this.cKm.gY + 0.5, this.ta.nextInt(6) + 1));
            n2 = 1;
        }
        if (this.cJV) {
            n2 = 2;
        }
        this.Tt();
        this.cKm.cIE = null;
        return n2;
    }

    private co acP() {
        float f2 = this.baU.dDk.nextFloat();
        int n2 = l.N(this.cKm);
        int n3 = l.O(this.cKm);
        float f3 = 0.1f - (float)n2 * 0.025f - (float)n3 * 0.01f;
        float f4 = 0.05f + (float)n2 * 0.01f - (float)n3 * 0.01f;
        f3 = bt.I(f3, 0.0f, 1.0f);
        f4 = bt.I(f4, 0.0f, 1.0f);
        if (f2 < f3) {
            this.cKm.a(net.minecraft.stats.n.dqe);
            return de.a(this.ta, cKi).i(this.ta);
        }
        if ((f2 -= f3) < f4) {
            this.cKm.a(net.minecraft.stats.n.dqf);
            return de.a(this.ta, cKj).i(this.ta);
        }
        float f5 = f2 - f4;
        this.cKm.a(net.minecraft.stats.n.dqd);
        return de.a(this.ta, cKk).i(this.ta);
    }

    @Override
    public void Tt() {
        super.Tt();
        if (this.cKm != null) {
            this.cKm.cIE = null;
        }
    }
}

