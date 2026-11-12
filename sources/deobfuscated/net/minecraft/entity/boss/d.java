/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.entity.boss;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ah;
import net.minecraft.entity.ai.a;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.aj;
import net.minecraft.entity.boss.e;
import net.minecraft.entity.boss.f;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.entity.z;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class d
extends aa
implements ah,
f {
    private final float[] cBs = new float[2];
    private final float[] cBt = new float[2];
    private final float[] cBu = new float[2];
    private final float[] cBv = new float[2];
    private final int[] cBw = new int[2];
    private final int[] cBx = new int[2];
    private int cBy;
    private static final Predicate<c> cBz = new e();

    public d(w w2) {
        super(w2);
        this.aY(this.getMaxHealth());
        this.o(0.9f, 3.5f);
        this.csC = true;
        ((net.minecraft.pathfinding.f)this.UU()).bT(true);
        this.ctS.a(0, new au(this));
        this.ctS.a(2, new a(this, 1.0, 40, 20.0f));
        this.ctS.a(5, new bd(this, 1.0));
        this.ctS.a(6, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(7, new net.minecraft.entity.ai.z(this));
        this.ctT.a(1, new v((j)this, false, new Class[0]));
        this.ctT.a(2, new ag<c>(this, p.class, 0, false, false, cBz));
        this.ctM = 50;
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(17, new Integer(0));
        this.csD.a(18, new Integer(0));
        this.csD.a(19, new Integer(0));
        this.csD.a(20, new Integer(0));
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.B("Invul", this.XJ());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.eY(n2.eG("Invul"));
    }

    @Override
    protected String Vb() {
        return "mob.wither.idle";
    }

    @Override
    protected String VN() {
        return "mob.wither.hurt";
    }

    @Override
    protected String VO() {
        return "mob.wither.death";
    }

    @Override
    public void Dn() {
        int n2;
        int n3;
        double d2;
        double d3;
        double d4;
        c c2;
        this.ue *= (double)0.6f;
        if (!this.baU.dDw && this.eZ(0) > 0 && (c2 = this.baU.cn(this.eZ(0))) != null) {
            double d5;
            if (this.gX < c2.gX || !this.XK() && this.gX < c2.gX + 5.0) {
                if (this.ue < 0.0) {
                    this.ue = 0.0;
                }
                this.ue += (0.5 - this.ue) * (double)0.6f;
            }
            if ((d4 = (d5 = c2.gW - this.gW) * d5 + (d3 = c2.gY - this.gY) * d3) > 9.0) {
                d2 = bt.aD(d4);
                this.ud += (d5 / d2 * 0.5 - this.ud) * (double)0.6f;
                this.uf += (d3 / d2 * 0.5 - this.uf) * (double)0.6f;
            }
        }
        if (this.ud * this.ud + this.uf * this.uf > (double)0.05f) {
            this.pl = (float)bt.y(this.uf, this.ud) * 57.295776f - 90.0f;
        }
        super.Dn();
        for (n3 = 0; n3 < 2; ++n3) {
            this.cBv[n3] = this.cBt[n3];
            this.cBu[n3] = this.cBs[n3];
        }
        for (n3 = 0; n3 < 2; ++n3) {
            int n4 = this.eZ(n3 + 1);
            c c3 = null;
            if (n4 > 0) {
                c3 = this.baU.cn(n4);
            }
            if (c3 != null) {
                d3 = this.eT(n3 + 1);
                d4 = this.eU(n3 + 1);
                d2 = this.eV(n3 + 1);
                double d6 = c3.gW - d3;
                double d7 = c3.gX + (double)c3.getEyeHeight() - d4;
                double d8 = c3.gY - d2;
                double d9 = bt.aD(d6 * d6 + d8 * d8);
                float f2 = (float)(bt.y(d8, d6) * 180.0 / Math.PI) - 90.0f;
                float f3 = (float)(-(bt.y(d7, d9) * 180.0 / Math.PI));
                this.cBs[n3] = this.x(this.cBs[n3], f3, 40.0f);
                this.cBt[n3] = this.x(this.cBt[n3], f2, 10.0f);
                continue;
            }
            this.cBt[n3] = this.x(this.cBt[n3], this.cuF, 10.0f);
        }
        n3 = this.XK() ? 1 : 0;
        for (n2 = 0; n2 < 3; ++n2) {
            double d10 = this.eT(n2);
            double d11 = this.eU(n2);
            double d12 = this.eV(n2);
            this.baU.a(as.dxh, d10 + this.ta.nextGaussian() * (double)0.3f, d11 + this.ta.nextGaussian() * (double)0.3f, d12 + this.ta.nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0, new int[0]);
            if (n3 == 0 || this.baU.dDk.nextInt(4) != 0) continue;
            this.baU.a(as.dxl, d10 + this.ta.nextGaussian() * (double)0.3f, d11 + this.ta.nextGaussian() * (double)0.3f, d12 + this.ta.nextGaussian() * (double)0.3f, (double)0.7f, (double)0.7f, 0.5, new int[0]);
        }
        if (this.XJ() > 0) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.baU.a(as.dxl, this.gW + this.ta.nextGaussian() * 1.0, this.gX + (double)(this.ta.nextFloat() * 3.3f), this.gY + this.ta.nextGaussian() * 1.0, (double)0.7f, (double)0.7f, (double)0.9f, new int[0]);
            }
        }
    }

    @Override
    protected void Vf() {
        if (this.XJ() > 0) {
            int n2 = this.XJ() - 1;
            if (n2 <= 0) {
                this.baU.a(this, this.gW, this.gX + (double)this.getEyeHeight(), this.gY, 7.0f, false, this.baU.Si().gw("mobGriefing"));
                this.baU.d(1013, new b(this), 0);
            }
            this.eY(n2);
            if (this.aRg % 10 == 0) {
                this.P(10.0f);
            }
        } else {
            int n3;
            int n4;
            super.Vf();
            block0: for (n4 = 1; n4 < 3; ++n4) {
                c c2;
                if (this.aRg < this.cBw[n4 - 1]) continue;
                this.cBw[n4 - 1] = this.aRg + 10 + this.ta.nextInt(10);
                if (this.baU.agm() == net.minecraft.world.f.dBT || this.baU.agm() == net.minecraft.world.f.dBU) {
                    n3 = n4 - 1;
                    int n5 = this.cBx[n4 - 1];
                    this.cBx[n3] = this.cBx[n4 - 1] + 1;
                    if (n5 > 15) {
                        float f2 = 10.0f;
                        float f3 = 5.0f;
                        double d2 = bt.b(this.ta, this.gW - 10.0, this.gW + 10.0);
                        double d3 = bt.b(this.ta, this.gX - 5.0, this.gX + 5.0);
                        double d4 = bt.b(this.ta, this.gY - 10.0, this.gY + 10.0);
                        this.a(n4 + 1, d2, d3, d4, true);
                        this.cBx[n4 - 1] = 0;
                    }
                }
                if ((n3 = this.eZ(n4)) > 0) {
                    c2 = this.baU.cn(n3);
                    if (c2 != null && c2.TS() && this.T(c2) <= 900.0 && this.ai(c2)) {
                        if (c2 instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)c2).cIt.cJJ) {
                            this.ao(n4, 0);
                            continue;
                        }
                        this.a(n4 + 1, (r)c2);
                        this.cBw[n4 - 1] = this.aRg + 40 + this.ta.nextInt(20);
                        this.cBx[n4 - 1] = 0;
                        continue;
                    }
                    this.ao(n4, 0);
                    continue;
                }
                c2 = this.baU.a(r.class, this.Us().ad(20.0, 8.0, 20.0), Predicates.and(cBz, net.minecraft.util.ah.dvJ));
                for (int i2 = 0; i2 < 10 && !c2.isEmpty(); ++i2) {
                    r r2 = (r)c2.get(this.ta.nextInt(c2.size()));
                    if (r2 != this && r2.TS() && this.ai(r2)) {
                        if (r2 instanceof net.minecraft.entity.player.a) {
                            if (((net.minecraft.entity.player.a)r2).cIt.cJJ) continue block0;
                            this.ao(n4, r2.getEntityId());
                            continue block0;
                        }
                        this.ao(n4, r2.getEntityId());
                        continue block0;
                    }
                    c2.remove(r2);
                }
            }
            if (this.UW() != null) {
                this.ao(0, this.UW().getEntityId());
            } else {
                this.ao(0, 0);
            }
            if (this.cBy > 0) {
                --this.cBy;
                if (this.cBy == 0 && this.baU.Si().gw("mobGriefing")) {
                    n4 = bt.aF(this.gX);
                    n3 = bt.aF(this.gW);
                    int n6 = bt.aF(this.gY);
                    boolean bl2 = false;
                    for (int i3 = -1; i3 <= 1; ++i3) {
                        for (int i4 = -1; i4 <= 1; ++i4) {
                            for (int i5 = 0; i5 <= 3; ++i5) {
                                int n7 = n3 + i3;
                                int n8 = n4 + i5;
                                int n9 = n6 + i4;
                                b b2 = new b(n7, n8, n9);
                                Block block = this.baU.L(b2).df();
                                if (block.xb() == Material.beo || !d.D(block)) continue;
                                bl2 = this.baU.c(b2, true) || bl2;
                            }
                        }
                    }
                    if (bl2) {
                        this.baU.b(null, 1012, new b(this), 0);
                    }
                }
            }
            if (this.aRg % 20 == 0) {
                this.P(1.0f);
            }
        }
    }

    public static boolean D(Block block) {
        return block != Blocks.cLj && block != Blocks.cNH && block != Blocks.cNI && block != Blocks.cNZ && block != Blocks.cOx;
    }

    public void XI() {
        this.eY(220);
        this.aY(this.getMaxHealth() / 3.0f);
    }

    @Override
    public void Ud() {
    }

    @Override
    public int VQ() {
        return 4;
    }

    private double eT(int n2) {
        if (n2 <= 0) {
            return this.gW;
        }
        float f2 = (this.cuF + (float)(180 * (n2 - 1))) / 180.0f * (float)Math.PI;
        float f3 = bt.bB(f2);
        return this.gW + (double)f3 * 1.3;
    }

    private double eU(int n2) {
        return n2 <= 0 ? this.gX + 3.0 : this.gX + 2.2;
    }

    private double eV(int n2) {
        if (n2 <= 0) {
            return this.gY;
        }
        float f2 = (this.cuF + (float)(180 * (n2 - 1))) / 180.0f * (float)Math.PI;
        float f3 = bt.bx(f2);
        return this.gY + (double)f3 * 1.3;
    }

    private float x(float f2, float f3, float f4) {
        float f5 = bt.bN(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    private void a(int n2, r r2) {
        this.a(n2, r2.gW, r2.gX + (double)r2.getEyeHeight() * 0.5, r2.gY, n2 == 0 && this.ta.nextFloat() < 0.001f);
    }

    private void a(int n2, double d2, double d3, double d4, boolean bl2) {
        this.baU.b(null, 1014, new b(this), 0);
        double d5 = this.eT(n2);
        double d6 = this.eU(n2);
        double d7 = this.eV(n2);
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        net.minecraft.entity.projectile.j j2 = new net.minecraft.entity.projectile.j(this.baU, this, d8, d9, d10);
        if (bl2) {
            j2.setInvulnerable(true);
        }
        j2.gX = d6;
        j2.gW = d5;
        j2.gY = d7;
        this.baU.G(j2);
    }

    @Override
    public void g(r r2, float f2) {
        this.a(0, r2);
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (ad2 != ad.dvg && !(ad2.dk() instanceof d)) {
            c c2;
            if (this.XJ() > 0 && ad2 != ad.dvk) {
                return false;
            }
            if (this.XK() && (c2 = ad2.asf()) instanceof net.minecraft.entity.projectile.a) {
                return false;
            }
            c2 = ad2.dk();
            if (c2 != null && !(c2 instanceof net.minecraft.entity.player.a) && c2 instanceof r && ((r)c2).VY() == this.VY()) {
                return false;
            }
            if (this.cBy <= 0) {
                this.cBy = 20;
            }
            int n2 = 0;
            while (n2 < this.cBx.length) {
                int n3 = n2++;
                this.cBx[n3] = this.cBx[n3] + 3;
            }
            return super.a(ad2, f2);
        }
        return false;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        i i2 = this.d(Items.cSd, 1);
        if (i2 != null) {
            i2.Yr();
        }
        if (!this.baU.dDw) {
            for (net.minecraft.entity.player.a a2 : this.baU.a(net.minecraft.entity.player.a.class, this.Us().ad(50.0, 100.0, 50.0))) {
                a2.a(net.minecraft.stats.b.dpi);
            }
        }
    }

    @Override
    protected void Ve() {
        this.cuM = 0;
    }

    @Override
    public int af(float f2) {
        return 0xF000F0;
    }

    @Override
    public void q(float f2, float f3) {
    }

    @Override
    public void b(net.minecraft.potion.d d2) {
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(300.0);
        this.a(aj.cwp).ap(0.6f);
        this.a(aj.cwn).ap(40.0);
    }

    public float eW(int n2) {
        return this.cBt[n2];
    }

    public float eX(int n2) {
        return this.cBs[n2];
    }

    public int XJ() {
        return this.csD.en(20);
    }

    public void eY(int n2) {
        this.csD.b(20, n2);
    }

    public int eZ(int n2) {
        return this.csD.en(17 + n2);
    }

    public void ao(int n2, int n3) {
        this.csD.b(17 + n2, n3);
    }

    public boolean XK() {
        return this.getHealth() <= this.getMaxHealth() / 2.0f;
    }

    @Override
    public z VY() {
        return z.cvU;
    }

    @Override
    public void D(c c2) {
        this.crC = null;
    }
}

