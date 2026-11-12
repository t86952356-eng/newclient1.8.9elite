/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.util.a;
import net.minecraft.util.ad;
import net.minecraft.util.ag;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class b
extends c {
    private boolean cBU = true;
    private double Jj = 0.07;
    private int cBV;
    private double cBW;
    private double cBX;
    private double cBY;
    private double cBZ;
    private double cCa;
    private double cCb;
    private double cCc;
    private double cCd;

    public b(w w2) {
        super(w2);
        this.crz = true;
        this.o(1.5f, 0.6f);
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected void IA() {
        this.csD.a(17, new Integer(0));
        this.csD.a(18, new Integer(1));
        this.csD.a(19, new Float(0.0f));
    }

    @Override
    public a V(c c2) {
        return c2.Us();
    }

    @Override
    public a ID() {
        return this.Us();
    }

    @Override
    public boolean IE() {
        return true;
    }

    public b(w w2, double d2, double d3, double d4) {
        this(w2);
        this.setPosition(d2, d3, d4);
        this.ud = 0.0;
        this.ue = 0.0;
        this.uf = 0.0;
        this.crF = d2;
        this.crG = d3;
        this.crH = d4;
    }

    @Override
    public double TW() {
        return -0.3;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (!this.baU.dDw && !this.csb) {
            boolean bl2;
            if (this.crA != null && this.crA == ad2.dk() && ad2 instanceof ag) {
                return false;
            }
            this.fb(-this.Yc());
            this.fa(10);
            this.bd(this.Ya() + f2 * 10.0f);
            this.TM();
            boolean bl3 = bl2 = ad2.dk() instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)ad2.dk()).cIt.cJM;
            if (bl2 || this.Ya() > 40.0f) {
                if (this.crA != null) {
                    this.crA.D(this);
                }
                if (!bl2 && this.baU.Si().gw("doEntityDrops")) {
                    this.a(Items.cQI, 1, 0.0f);
                }
                this.Tt();
            }
            return true;
        }
        return true;
    }

    @Override
    public void Ua() {
        this.fb(-this.Yc());
        this.fa(10);
        this.bd(this.Ya() * 11.0f);
    }

    @Override
    public boolean TO() {
        return !this.csb;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        if (bl2 && this.crA != null) {
            this.crF = this.gW = d2;
            this.crG = this.gX = d3;
            this.crH = this.gY = d4;
            this.pl = f2;
            this.pm = f3;
            this.cBV = 0;
            this.setPosition(d2, d3, d4);
            this.cCb = 0.0;
            this.ud = 0.0;
            this.cCc = 0.0;
            this.ue = 0.0;
            this.cCd = 0.0;
            this.uf = 0.0;
        } else {
            if (this.cBU) {
                this.cBV = n2 + 5;
            } else {
                double d5 = d2 - this.gW;
                double d6 = d3 - this.gX;
                double d7 = d4 - this.gY;
                double d8 = d5 * d5 + d6 * d6 + d7 * d7;
                if (d8 <= 1.0) {
                    return;
                }
                this.cBV = 3;
            }
            this.cBW = d2;
            this.cBX = d3;
            this.cBY = d4;
            this.cBZ = f2;
            this.cCa = f3;
            this.ud = this.cCb;
            this.ue = this.cCc;
            this.uf = this.cCd;
        }
    }

    @Override
    public void P(double d2, double d3, double d4) {
        this.cCb = this.ud = d2;
        this.cCc = this.ue = d3;
        this.cCd = this.uf = d4;
    }

    @Override
    public void Dm() {
        int n2;
        double d2;
        double d3;
        super.Dm();
        if (this.Yb() > 0) {
            this.fa(this.Yb() - 1);
        }
        if (this.Ya() > 0.0f) {
            this.bd(this.Ya() - 1.0f);
        }
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        int n3 = 5;
        double d4 = 0.0;
        for (int i2 = 0; i2 < 5; ++i2) {
            double d5 = this.Us().dtI + (this.Us().dtL - this.Us().dtI) * (double)(i2 + 0) / 5.0 - 0.125;
            double d6 = this.Us().dtI + (this.Us().dtL - this.Us().dtI) * (double)(i2 + 1) / 5.0 - 0.125;
            a a2 = new a(this.Us().dtH, d5, this.Us().dtJ, this.Us().dtK, d6, this.Us().dtM);
            if (!this.baU.c(a2, Material.bev)) continue;
            d4 += 0.2;
        }
        double d7 = Math.sqrt(this.ud * this.ud + this.uf * this.uf);
        if (d7 > 0.2975) {
            d3 = Math.cos((double)this.pl * Math.PI / 180.0);
            d2 = Math.sin((double)this.pl * Math.PI / 180.0);
            n2 = 0;
            while ((double)n2 < 1.0 + d7 * 60.0) {
                double d8 = this.ta.nextFloat() * 2.0f - 1.0f;
                double d9 = (double)(this.ta.nextInt(2) * 2 - 1) * 0.7;
                if (this.ta.nextBoolean()) {
                    var15_24 = this.gW - d3 * d8 * 0.8 + d2 * d9;
                    var17_25 = this.gY - d2 * d8 * 0.8 - d3 * d9;
                    this.baU.a(as.dxb, var15_24, this.gX - 0.125, var17_25, this.ud, this.ue, this.uf, new int[0]);
                } else {
                    var15_24 = this.gW + d3 + d2 * d8 * 0.7;
                    var17_25 = this.gY + d2 - d3 * d8 * 0.7;
                    this.baU.a(as.dxb, var15_24, this.gX - 0.125, var17_25, this.ud, this.ue, this.uf, new int[0]);
                }
                ++n2;
            }
        }
        if (this.baU.dDw && this.cBU) {
            if (this.cBV > 0) {
                d3 = this.gW + (this.cBW - this.gW) / (double)this.cBV;
                d2 = this.gX + (this.cBX - this.gX) / (double)this.cBV;
                double d10 = this.gY + (this.cBY - this.gY) / (double)this.cBV;
                double d11 = bt.aJ(this.cBZ - (double)this.pl);
                this.pl = (float)((double)this.pl + d11 / (double)this.cBV);
                this.pm = (float)((double)this.pm + (this.cCa - (double)this.pm) / (double)this.cBV);
                --this.cBV;
                this.setPosition(d3, d2, d10);
                this.setRotation(this.pl, this.pm);
            } else {
                d3 = this.gW + this.ud;
                d2 = this.gX + this.ue;
                double d12 = this.gY + this.uf;
                this.setPosition(d3, d2, d12);
                if (this.aO) {
                    this.ud *= 0.5;
                    this.ue *= 0.5;
                    this.uf *= 0.5;
                }
                this.ud *= (double)0.99f;
                this.ue *= (double)0.95f;
                this.uf *= (double)0.99f;
            }
        } else {
            double d13;
            int n4;
            double d14;
            if (d4 < 1.0) {
                d3 = d4 * 2.0 - 1.0;
                this.ue += (double)0.04f * d3;
            } else {
                if (this.ue < 0.0) {
                    this.ue /= 2.0;
                }
                this.ue += (double)0.007f;
            }
            if (this.crA instanceof r) {
                r r2 = (r)this.crA;
                float f2 = this.crA.pl + -r2.cuV * 90.0f;
                this.ud += -Math.sin(f2 * (float)Math.PI / 180.0f) * this.Jj * (double)r2.cuW * (double)0.05f;
                this.uf += Math.cos(f2 * (float)Math.PI / 180.0f) * this.Jj * (double)r2.cuW * (double)0.05f;
            }
            if ((d14 = Math.sqrt(this.ud * this.ud + this.uf * this.uf)) > 0.35) {
                d2 = 0.35 / d14;
                this.ud *= d2;
                this.uf *= d2;
                d14 = 0.35;
            }
            if (d14 > d7 && this.Jj < 0.35) {
                this.Jj += (0.35 - this.Jj) / 35.0;
                if (this.Jj > 0.35) {
                    this.Jj = 0.35;
                }
            } else {
                this.Jj -= (this.Jj - 0.07) / 35.0;
                if (this.Jj < 0.07) {
                    this.Jj = 0.07;
                }
            }
            for (n4 = 0; n4 < 4; ++n4) {
                int n5 = bt.aF(this.gW + ((double)(n4 % 2) - 0.5) * 0.8);
                n2 = bt.aF(this.gY + ((double)(n4 / 2) - 0.5) * 0.8);
                for (int i3 = 0; i3 < 2; ++i3) {
                    int n6 = bt.aF(this.gX) + i3;
                    net.minecraft.util.b b2 = new net.minecraft.util.b(n5, n6, n2);
                    Block block = this.baU.L(b2).df();
                    if (block == Blocks.cMJ) {
                        this.baU.aL(b2);
                        this.crR = false;
                        continue;
                    }
                    if (block != Blocks.cNz) continue;
                    this.baU.c(b2, true);
                    this.crR = false;
                }
            }
            if (this.aO) {
                this.ud *= 0.5;
                this.ue *= 0.5;
                this.uf *= 0.5;
            }
            this.y(this.ud, this.ue, this.uf);
            if (this.crR && d7 > 0.2975) {
                if (!this.baU.dDw && !this.csb) {
                    this.Tt();
                    if (this.baU.Si().gw("doEntityDrops")) {
                        for (n4 = 0; n4 < 3; ++n4) {
                            this.a(d.I(Blocks.cLh), 1, 0.0f);
                        }
                        for (n4 = 0; n4 < 2; ++n4) {
                            this.a(Items.cPC, 1, 0.0f);
                        }
                    }
                }
            } else {
                this.ud *= (double)0.99f;
                this.ue *= (double)0.95f;
                this.uf *= (double)0.99f;
            }
            this.pm = 0.0f;
            double d15 = this.pl;
            double d16 = this.crF - this.gW;
            double d17 = this.crH - this.gY;
            if (d16 * d16 + d17 * d17 > 0.001) {
                d15 = (float)(bt.y(d17, d16) * 180.0 / Math.PI);
            }
            if ((d13 = bt.aJ(d15 - (double)this.pl)) > 20.0) {
                d13 = 20.0;
            }
            if (d13 < -20.0) {
                d13 = -20.0;
            }
            this.pl = (float)((double)this.pl + d13);
            this.setRotation(this.pl, this.pm);
            if (!this.baU.dDw) {
                List<c> list = this.baU.b(this, this.Us().ad(0.2f, 0.0, 0.2f));
                if (list != null && !list.isEmpty()) {
                    for (int i4 = 0; i4 < list.size(); ++i4) {
                        c c2 = list.get(i4);
                        if (c2 == this.crA || !c2.IE() || !(c2 instanceof b)) continue;
                        c2.U(this);
                    }
                }
                if (this.crA != null && this.crA.csb) {
                    this.crA = null;
                }
            }
        }
    }

    @Override
    public void TV() {
        if (this.crA != null) {
            double d2 = Math.cos((double)this.pl * Math.PI / 180.0) * 0.4;
            double d3 = Math.sin((double)this.pl * Math.PI / 180.0) * 0.4;
            this.crA.setPosition(this.gW + d2, this.gX + this.TW() + this.crA.LJ(), this.gY + d3);
        }
    }

    @Override
    protected void d(n n2) {
    }

    @Override
    protected void e(n n2) {
    }

    @Override
    public boolean o(net.minecraft.entity.player.a a2) {
        if (this.crA != null && this.crA instanceof net.minecraft.entity.player.a && this.crA != a2) {
            return true;
        }
        if (!this.baU.dDw) {
            a2.D(this);
        }
        return true;
    }

    @Override
    protected void a(double d2, boolean bl2, Block block, net.minecraft.util.b b2) {
        if (bl2) {
            if (this.csf > 3.0f) {
                this.q(this.csf, 1.0f);
                if (!this.baU.dDw && !this.csb) {
                    this.Tt();
                    if (this.baU.Si().gw("doEntityDrops")) {
                        int n2;
                        for (n2 = 0; n2 < 3; ++n2) {
                            this.a(d.I(Blocks.cLh), 1, 0.0f);
                        }
                        for (n2 = 0; n2 < 2; ++n2) {
                            this.a(Items.cPC, 1, 0.0f);
                        }
                    }
                }
                this.csf = 0.0f;
            }
        } else if (this.baU.L(new net.minecraft.util.b(this).aqY()).df().xb() != Material.bev && d2 < 0.0) {
            this.csf = (float)((double)this.csf - d2);
        }
    }

    public void bd(float f2) {
        this.csD.b(19, Float.valueOf(f2));
    }

    public float Ya() {
        return this.csD.eo(19);
    }

    public void fa(int n2) {
        this.csD.b(17, n2);
    }

    public int Yb() {
        return this.csD.en(17);
    }

    public void fb(int n2) {
        this.csD.b(18, n2);
    }

    public int Yc() {
        return this.csD.en(18);
    }

    public void aU(boolean bl2) {
        this.cBU = bl2;
    }
}

