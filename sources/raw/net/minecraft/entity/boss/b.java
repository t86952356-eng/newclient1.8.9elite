/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.entity.boss;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ac;
import net.minecraft.entity.aj;
import net.minecraft.entity.boss.c;
import net.minecraft.entity.boss.f;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.a;
import net.minecraft.util.ad;
import net.minecraft.util.af;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class b
extends p
implements ac,
f,
aw {
    public double alc;
    public double cwH;
    public double alb;
    public double[][] cBa = new double[64][3];
    public int cBb = -1;
    public c[] cBc;
    public c cBd = new c(this, "head", 6.0f, 6.0f);
    public c cBe = new c(this, "body", 8.0f, 8.0f);
    public c cBf = new c(this, "tail", 4.0f, 4.0f);
    public c cBg = new c(this, "tail", 4.0f, 4.0f);
    public c cBh = new c(this, "tail", 4.0f, 4.0f);
    public c cBi = new c(this, "wing", 4.0f, 4.0f);
    public c cBj = new c(this, "wing", 4.0f, 4.0f);
    public float cBk;
    public float cBl;
    public boolean cBm;
    public boolean cBn;
    private net.minecraft.entity.c by;
    public int cBo;
    public net.minecraft.entity.item.c cBp;

    public b(w w2) {
        super(w2);
        this.cBc = new c[]{this.cBd, this.cBe, this.cBf, this.cBg, this.cBh, this.cBi, this.cBj};
        this.aY(this.getMaxHealth());
        this.o(16.0f, 8.0f);
        this.csp = true;
        this.csC = true;
        this.cwH = 100.0;
        this.csK = true;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(200.0);
    }

    @Override
    protected void IA() {
        super.IA();
    }

    public double[] g(int n2, float f2) {
        if (this.getHealth() <= 0.0f) {
            f2 = 0.0f;
        }
        f2 = 1.0f - f2;
        int n3 = this.cBb - n2 * 1 & 0x3F;
        int n4 = this.cBb - n2 * 1 - 1 & 0x3F;
        double[] dArray = new double[3];
        double d2 = this.cBa[n3][0];
        double d3 = bt.aJ(this.cBa[n4][0] - d2);
        dArray[0] = d2 + d3 * (double)f2;
        d2 = this.cBa[n3][1];
        d3 = this.cBa[n4][1] - d2;
        dArray[1] = d2 + d3 * (double)f2;
        dArray[2] = this.cBa[n3][2] + (this.cBa[n4][2] - this.cBa[n3][2]) * (double)f2;
        return dArray;
    }

    @Override
    public void Dn() {
        float f2;
        float f3;
        if (this.baU.dDw) {
            f3 = bt.bB(this.cBl * (float)Math.PI * 2.0f);
            f2 = bt.bB(this.cBk * (float)Math.PI * 2.0f);
            if (f2 <= -0.3f && f3 >= -0.3f && !this.TE()) {
                this.baU.a(this.gW, this.gX, this.gY, "mob.enderdragon.wings", 5.0f, 0.8f + this.ta.nextFloat() * 0.3f, false);
            }
        }
        this.cBk = this.cBl;
        if (this.getHealth() <= 0.0f) {
            f3 = (this.ta.nextFloat() - 0.5f) * 8.0f;
            f2 = (this.ta.nextFloat() - 0.5f) * 4.0f;
            float f4 = (this.ta.nextFloat() - 0.5f) * 8.0f;
            this.baU.a(as.dwX, this.gW + (double)f3, this.gX + 2.0 + (double)f2, this.gY + (double)f4, 0.0, 0.0, 0.0, new int[0]);
        } else {
            this.XG();
            f3 = 0.2f / (bt.aD(this.ud * this.ud + this.uf * this.uf) * 10.0f + 1.0f);
            this.cBl = this.cBn ? (this.cBl += f3 * 0.5f) : (this.cBl += (f3 *= (float)Math.pow(2.0, this.ue)));
            this.pl = bt.bN(this.pl);
            if (this.Vt()) {
                this.cBl = 0.5f;
            } else {
                float f5;
                float f6;
                if (this.cBb < 0) {
                    for (int i2 = 0; i2 < this.cBa.length; ++i2) {
                        this.cBa[i2][0] = this.pl;
                        this.cBa[i2][1] = this.gX;
                    }
                }
                if (++this.cBb == this.cBa.length) {
                    this.cBb = 0;
                }
                this.cBa[this.cBb][0] = this.pl;
                this.cBa[this.cBb][1] = this.gX;
                if (this.baU.dDw) {
                    if (this.cuY > 0) {
                        double d2 = this.gW + (this.cuZ - this.gW) / (double)this.cuY;
                        var4_8 = this.gX + (this.cva - this.gX) / (double)this.cuY;
                        var6_10 = this.gY + (this.cvb - this.gY) / (double)this.cuY;
                        var8_12 = bt.aJ(this.cvc - (double)this.pl);
                        this.pl = (float)((double)this.pl + var8_12 / (double)this.cuY);
                        this.pm = (float)((double)this.pm + (this.cvd - (double)this.pm) / (double)this.cuY);
                        --this.cuY;
                        this.setPosition(d2, var4_8, var6_10);
                        this.setRotation(this.pl, this.pm);
                    }
                } else {
                    double d3;
                    double d4 = this.alc - this.gW;
                    var4_8 = this.cwH - this.gX;
                    var6_10 = this.alb - this.gY;
                    var8_12 = d4 * d4 + var4_8 * var4_8 + var6_10 * var6_10;
                    if (this.by != null) {
                        this.alc = this.by.gW;
                        this.alb = this.by.gY;
                        double d5 = this.alc - this.gW;
                        double d6 = this.alb - this.gY;
                        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
                        d3 = (double)0.4f + d7 / 80.0 - 1.0;
                        if (d3 > 10.0) {
                            d3 = 10.0;
                        }
                        this.cwH = this.by.Us().dtI + d3;
                    } else {
                        this.alc += this.ta.nextGaussian() * 2.0;
                        this.alb += this.ta.nextGaussian() * 2.0;
                    }
                    if (this.cBm || var8_12 < 100.0 || var8_12 > 22500.0 || this.crR || this.crW) {
                        this.XH();
                    }
                    var4_8 /= (double)bt.aD(d4 * d4 + var6_10 * var6_10);
                    f6 = 0.6f;
                    var4_8 = bt.ah(var4_8, -0.6f, 0.6f);
                    this.ue += var4_8 * (double)0.1f;
                    this.pl = bt.bN(this.pl);
                    double d8 = 180.0 - bt.y(d4, var6_10) * 180.0 / Math.PI;
                    double d9 = bt.aJ(d8 - (double)this.pl);
                    if (d9 > 50.0) {
                        d9 = 50.0;
                    }
                    if (d9 < -50.0) {
                        d9 = -50.0;
                    }
                    da da2 = new da(this.alc - this.gW, this.cwH - this.gX, this.alb - this.gY).atR();
                    d3 = -bt.bB(this.pl * (float)Math.PI / 180.0f);
                    da da3 = new da(bt.bx(this.pl * (float)Math.PI / 180.0f), this.ue, d3).atR();
                    f5 = ((float)da3.t(da2) + 0.5f) / 1.5f;
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    this.cuX *= 0.8f;
                    float f7 = bt.aD(this.ud * this.ud + this.uf * this.uf) * 1.0f + 1.0f;
                    double d10 = Math.sqrt(this.ud * this.ud + this.uf * this.uf) * 1.0 + 1.0;
                    if (d10 > 40.0) {
                        d10 = 40.0;
                    }
                    this.cuX = (float)((double)this.cuX + d9 * ((double)0.7f / d10 / (double)f7));
                    this.pl += this.cuX * 0.1f;
                    float f8 = (float)(2.0 / (d10 + 1.0));
                    float f9 = 0.06f;
                    this.s(0.0f, -1.0f, 0.06f * (f5 * f8 + (1.0f - f8)));
                    if (this.cBn) {
                        this.y(this.ud * (double)0.8f, this.ue * (double)0.8f, this.uf * (double)0.8f);
                    } else {
                        this.y(this.ud, this.ue, this.uf);
                    }
                    da da4 = new da(this.ud, this.ue, this.uf).atR();
                    float f10 = ((float)da4.t(da3) + 1.0f) / 2.0f;
                    f10 = 0.8f + 0.15f * f10;
                    this.ud *= (double)f10;
                    this.uf *= (double)f10;
                    this.ue *= (double)0.91f;
                }
                this.cuF = this.pl;
                this.cBd.height = 3.0f;
                this.cBd.width = 3.0f;
                this.cBf.height = 2.0f;
                this.cBf.width = 2.0f;
                this.cBg.height = 2.0f;
                this.cBg.width = 2.0f;
                this.cBh.height = 2.0f;
                this.cBh.width = 2.0f;
                this.cBe.height = 3.0f;
                this.cBe.width = 5.0f;
                this.cBi.height = 2.0f;
                this.cBi.width = 4.0f;
                this.cBj.height = 3.0f;
                this.cBj.width = 4.0f;
                f2 = (float)(this.g(5, 1.0f)[1] - this.g(10, 1.0f)[1]) * 10.0f / 180.0f * (float)Math.PI;
                float f11 = bt.bB(f2);
                float f12 = -bt.bx(f2);
                float f13 = this.pl * (float)Math.PI / 180.0f;
                float f14 = bt.bx(f13);
                float f15 = bt.bB(f13);
                this.cBe.Dm();
                this.cBe.b(this.gW + (double)(f14 * 0.5f), this.gX, this.gY - (double)(f15 * 0.5f), 0.0f, 0.0f);
                this.cBi.Dm();
                this.cBi.b(this.gW + (double)(f15 * 4.5f), this.gX + 2.0, this.gY + (double)(f14 * 4.5f), 0.0f, 0.0f);
                this.cBj.Dm();
                this.cBj.b(this.gW - (double)(f15 * 4.5f), this.gX + 2.0, this.gY - (double)(f14 * 4.5f), 0.0f, 0.0f);
                if (!this.baU.dDw && this.cus == 0) {
                    this.E(this.baU.b(this, this.cBi.Us().ad(4.0, 2.0, 4.0).ae(0.0, -2.0, 0.0)));
                    this.E(this.baU.b(this, this.cBj.Us().ad(4.0, 2.0, 4.0).ae(0.0, -2.0, 0.0)));
                    this.F(this.baU.b(this, this.cBd.Us().ad(1.0, 1.0, 1.0)));
                }
                double[] dArray = this.g(5, 1.0f);
                double[] dArray2 = this.g(0, 1.0f);
                f6 = bt.bx(this.pl * (float)Math.PI / 180.0f - this.cuX * 0.01f);
                float f16 = bt.bB(this.pl * (float)Math.PI / 180.0f - this.cuX * 0.01f);
                this.cBd.Dm();
                this.cBd.b(this.gW + (double)(f6 * 5.5f * f11), this.gX + (dArray2[1] - dArray[1]) * 1.0 + (double)(f12 * 5.5f), this.gY - (double)(f16 * 5.5f * f11), 0.0f, 0.0f);
                for (int i3 = 0; i3 < 3; ++i3) {
                    c c2 = null;
                    if (i3 == 0) {
                        c2 = this.cBf;
                    }
                    if (i3 == 1) {
                        c2 = this.cBg;
                    }
                    if (i3 == 2) {
                        c2 = this.cBh;
                    }
                    double[] dArray3 = this.g(12 + i3 * 2, 1.0f);
                    float f17 = this.pl * (float)Math.PI / 180.0f + this.aq(dArray3[0] - dArray[0]) * (float)Math.PI / 180.0f * 1.0f;
                    float f18 = bt.bx(f17);
                    float f19 = bt.bB(f17);
                    float f20 = 1.5f;
                    f5 = (float)(i3 + 1) * 2.0f;
                    c2.Dm();
                    c2.b(this.gW - (double)((f14 * 1.5f + f18 * f5) * f11), this.gX + (dArray3[1] - dArray[1]) * 1.0 - (double)((f5 + 1.5f) * f12) + 1.5, this.gY + (double)((f15 * 1.5f + f19 * f5) * f11), 0.0f, 0.0f);
                }
                if (!this.baU.dDw) {
                    this.cBn = this.o(this.cBd.Us()) | this.o(this.cBe.Us());
                }
            }
        }
    }

    private void XG() {
        if (this.cBp != null) {
            if (this.cBp.csb) {
                if (!this.baU.dDw) {
                    this.a(this.cBd, ad.b(null), 10.0f);
                }
                this.cBp = null;
            } else if (this.aRg % 10 == 0 && this.getHealth() < this.getMaxHealth()) {
                this.aY(this.getHealth() + 1.0f);
            }
        }
        if (this.ta.nextInt(10) == 0) {
            float f2 = 32.0f;
            List<net.minecraft.entity.item.c> list = this.baU.a(net.minecraft.entity.item.c.class, this.Us().ad(32.0, 32.0, 32.0));
            net.minecraft.entity.item.c c2 = null;
            double d2 = Double.MAX_VALUE;
            for (net.minecraft.entity.item.c c3 : list) {
                double d3 = c3.T(this);
                if (!(d3 < d2)) continue;
                d2 = d3;
                c2 = c3;
            }
            this.cBp = c2;
        }
    }

    private void E(List<net.minecraft.entity.c> list) {
        double d2 = (this.cBe.Us().dtH + this.cBe.Us().dtK) / 2.0;
        double d3 = (this.cBe.Us().dtJ + this.cBe.Us().dtM) / 2.0;
        for (net.minecraft.entity.c c2 : list) {
            if (!(c2 instanceof r)) continue;
            double d4 = c2.gW - d2;
            double d5 = c2.gY - d3;
            double d6 = d4 * d4 + d5 * d5;
            c2.N(d4 / d6 * 4.0, 0.2f, d5 / d6 * 4.0);
        }
    }

    private void F(List<net.minecraft.entity.c> list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            net.minecraft.entity.c c2 = list.get(i2);
            if (!(c2 instanceof r)) continue;
            c2.a(ad.ac(this), 10.0f);
            this.c(this, c2);
        }
    }

    private void XH() {
        this.cBm = false;
        ArrayList arrayList = Lists.newArrayList(this.baU.dCY);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (!((net.minecraft.entity.player.a)iterator.next()).CZ()) continue;
            iterator.remove();
        }
        if (this.ta.nextInt(2) == 0 && !arrayList.isEmpty()) {
            this.by = (net.minecraft.entity.c)arrayList.get(this.ta.nextInt(arrayList.size()));
        } else {
            double d2;
            double d3;
            double d4;
            boolean bl2;
            do {
                this.alc = 0.0;
                this.cwH = 70.0f + this.ta.nextFloat() * 50.0f;
                this.alb = 0.0;
                this.alc += (double)(this.ta.nextFloat() * 120.0f - 60.0f);
                this.alb += (double)(this.ta.nextFloat() * 120.0f - 60.0f);
            } while (!(bl2 = (d4 = this.gW - this.alc) * d4 + (d3 = this.gX - this.cwH) * d3 + (d2 = this.gY - this.alb) * d2 > 100.0));
            this.by = null;
        }
    }

    private float aq(double d2) {
        return (float)bt.aJ(d2);
    }

    private boolean o(a a2) {
        int n2 = bt.aF(a2.dtH);
        int n3 = bt.aF(a2.dtI);
        int n4 = bt.aF(a2.dtJ);
        int n5 = bt.aF(a2.dtK);
        int n6 = bt.aF(a2.dtL);
        int n7 = bt.aF(a2.dtM);
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i2 = n2; i2 <= n5; ++i2) {
            for (int i3 = n3; i3 <= n6; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    net.minecraft.util.b b2 = new net.minecraft.util.b(i2, i3, i4);
                    Block block = this.baU.L(b2).df();
                    if (block.xb() == Material.beo) continue;
                    if (block != Blocks.cOx && block != Blocks.cMb && block != Blocks.cNJ && block != Blocks.cLj && block != Blocks.cNZ && this.baU.Si().gw("mobGriefing")) {
                        bl3 = this.baU.aL(b2) || bl3;
                        continue;
                    }
                    bl2 = true;
                }
            }
        }
        if (bl3) {
            double d2 = a2.dtH + (a2.dtK - a2.dtH) * (double)this.ta.nextFloat();
            double d3 = a2.dtI + (a2.dtL - a2.dtI) * (double)this.ta.nextFloat();
            double d4 = a2.dtJ + (a2.dtM - a2.dtJ) * (double)this.ta.nextFloat();
            this.baU.a(as.dwX, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
        return bl2;
    }

    @Override
    public boolean a(c c2, ad ad2, float f2) {
        if (c2 != this.cBd) {
            f2 = f2 / 4.0f + 1.0f;
        }
        float f3 = this.pl * (float)Math.PI / 180.0f;
        float f4 = bt.bx(f3);
        float f5 = bt.bB(f3);
        this.alc = this.gW + (double)(f4 * 5.0f) + (double)((this.ta.nextFloat() - 0.5f) * 2.0f);
        this.cwH = this.gX + (double)(this.ta.nextFloat() * 3.0f) + 1.0;
        this.alb = this.gY - (double)(f5 * 5.0f) + (double)((this.ta.nextFloat() - 0.5f) * 2.0f);
        this.by = null;
        if (ad2.dk() instanceof net.minecraft.entity.player.a || ad2.arZ()) {
            this.e(ad2, f2);
        }
        return true;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (ad2 instanceof af && ((af)ad2).asu()) {
            this.e(ad2, f2);
        }
        return false;
    }

    protected boolean e(ad ad2, float f2) {
        return super.a(ad2, f2);
    }

    @Override
    public void To() {
        this.Tt();
    }

    @Override
    protected void Vz() {
        ++this.cBo;
        if (this.cBo >= 180 && this.cBo <= 200) {
            float f2 = (this.ta.nextFloat() - 0.5f) * 8.0f;
            float f3 = (this.ta.nextFloat() - 0.5f) * 4.0f;
            float f4 = (this.ta.nextFloat() - 0.5f) * 8.0f;
            this.baU.a(as.dwY, this.gW + (double)f2, this.gX + 2.0 + (double)f3, this.gY + (double)f4, 0.0, 0.0, 0.0, new int[0]);
        }
        boolean bl2 = this.baU.Si().gw("doMobLoot");
        if (!this.baU.dDw) {
            if (this.cBo > 150 && this.cBo % 5 == 0 && bl2) {
                int n2;
                for (int i2 = 1000; i2 > 0; i2 -= n2) {
                    n2 = net.minecraft.entity.item.w.fl(i2);
                    this.baU.G(new net.minecraft.entity.item.w(this.baU, this.gW, this.gX, this.gY, n2));
                }
            }
            if (this.cBo == 1) {
                this.baU.d(1018, new net.minecraft.util.b(this), 0);
            }
        }
        this.y(0.0, 0.1f, 0.0);
        this.cuF = this.pl += 20.0f;
        if (this.cBo == 200 && !this.baU.dDw) {
            if (bl2) {
                int n3;
                for (int i3 = 2000; i3 > 0; i3 -= n3) {
                    n3 = net.minecraft.entity.item.w.fl(i3);
                    this.baU.G(new net.minecraft.entity.item.w(this.baU, this.gW, this.gX, this.gY, n3));
                }
            }
            this.ah(new net.minecraft.util.b(this.gW, 64.0, this.gY));
            this.Tt();
        }
    }

    private void ah(net.minecraft.util.b b2) {
        int n2 = 4;
        double d2 = 12.25;
        double d3 = 6.25;
        for (int i2 = -1; i2 <= 32; ++i2) {
            for (int i3 = -4; i3 <= 4; ++i3) {
                for (int i4 = -4; i4 <= 4; ++i4) {
                    double d4 = i3 * i3 + i4 * i4;
                    if (!(d4 <= 12.25)) continue;
                    net.minecraft.util.b b3 = b2.C(i3, i2, i4);
                    if (i2 < 0) {
                        if (!(d4 <= 6.25)) continue;
                        this.baU.d(b3, Blocks.cLj.xM());
                        continue;
                    }
                    if (i2 > 0) {
                        this.baU.d(b3, Blocks.cLc.xM());
                        continue;
                    }
                    if (d4 > 6.25) {
                        this.baU.d(b3, Blocks.cLj.xM());
                        continue;
                    }
                    this.baU.d(b3, Blocks.cNH.xM());
                }
            }
        }
        this.baU.d(b2, Blocks.cLj.xM());
        this.baU.d(b2.aqX(), Blocks.cLj.xM());
        net.minecraft.util.b b4 = b2.hq(2);
        this.baU.d(b4, Blocks.cLj.xM());
        this.baU.d(b4.arb(), Blocks.cMc.xM().a(BlockTorch.bcF, net.minecraft.util.ao.dwv));
        this.baU.d(b4.arc(), Blocks.cMc.xM().a(BlockTorch.bcF, net.minecraft.util.ao.dwu));
        this.baU.d(b4.aqZ(), Blocks.cMc.xM().a(BlockTorch.bcF, net.minecraft.util.ao.dwt));
        this.baU.d(b4.ara(), Blocks.cMc.xM().a(BlockTorch.bcF, net.minecraft.util.ao.dws));
        this.baU.d(b2.hq(3), Blocks.cLj.xM());
        this.baU.d(b2.hq(4), Blocks.cNK.xM());
    }

    @Override
    protected void Ve() {
    }

    @Override
    public net.minecraft.entity.c[] Ue() {
        return this.cBc;
    }

    @Override
    public boolean TO() {
        return false;
    }

    @Override
    public w de() {
        return this.baU;
    }

    @Override
    protected String Vb() {
        return "mob.enderdragon.growl";
    }

    @Override
    protected String VN() {
        return "mob.enderdragon.hit";
    }

    @Override
    protected float VZ() {
        return 5.0f;
    }
}

