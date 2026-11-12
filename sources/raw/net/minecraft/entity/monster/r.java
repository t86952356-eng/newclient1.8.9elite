/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.ae;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.s;
import net.minecraft.entity.monster.t;
import net.minecraft.entity.monster.u;
import net.minecraft.entity.monster.v;
import net.minecraft.entity.player.e;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.bd;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.network.play.server.av;
import net.minecraft.pathfinding.g;
import net.minecraft.potion.a;
import net.minecraft.potion.d;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.da;
import net.minecraft.util.de;
import net.minecraft.world.w;

public class r
extends aa {
    private float cEr;
    private float cEs;
    private float cEt;
    private float cEu;
    private float cEv;
    private net.minecraft.entity.r cEw;
    private int cEx;
    private boolean cEy;
    private final net.minecraft.entity.ai.bd cEz;

    public r(w w2) {
        super(w2);
        this.ctM = 10;
        this.o(0.85f, 0.85f);
        this.ctS.a(4, new t(this));
        ae ae2 = new ae(this, 1.0);
        this.ctS.a(5, ae2);
        this.cEz = new net.minecraft.entity.ai.bd(this, 1.0, 80);
        this.ctS.a(7, this.cEz);
        this.ctS.a(8, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(8, new be(this, r.class, 12.0f, 0.01f));
        this.ctS.a(9, new z(this));
        this.cEz.eO(3);
        ae2.eO(3);
        this.ctT.a(1, new ag<net.minecraft.entity.r>(this, net.minecraft.entity.r.class, 10, true, false, new v(this)));
        this.ctO = new u(this);
        this.cEs = this.cEr = this.ta.nextFloat();
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwq).ap(6.0);
        this.a(aj.cwp).ap(0.5);
        this.a(aj.cwn).ap(16.0);
        this.a(aj.cwm).ap(30.0);
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.be(n2.eO("Elder"));
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("Elder", this.Zo());
    }

    @Override
    protected net.minecraft.pathfinding.d i(w w2) {
        return new g(this, w2);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, 0);
        this.csD.a(17, 0);
    }

    private boolean fn(int n2) {
        return (this.csD.en(16) & n2) != 0;
    }

    private void o(int n2, boolean bl2) {
        int n3 = this.csD.en(16);
        if (bl2) {
            this.csD.b(16, n3 | n2);
        } else {
            this.csD.b(16, n3 & ~n2);
        }
    }

    public boolean Zm() {
        return this.fn(2);
    }

    private void bd(boolean bl2) {
        this.o(2, bl2);
    }

    public int Zn() {
        return this.Zo() ? 60 : 80;
    }

    public boolean Zo() {
        return this.fn(4);
    }

    public void be(boolean bl2) {
        this.o(4, bl2);
        if (bl2) {
            this.o(1.9975f, 1.9975f);
            this.a(aj.cwp).ap(0.3f);
            this.a(aj.cwq).ap(8.0);
            this.a(aj.cwm).ap(80.0);
            this.Vm();
            this.cEz.eP(400);
        }
    }

    public void Zp() {
        this.be(true);
        this.cEu = 1.0f;
        this.cEv = 1.0f;
    }

    private void fo(int n2) {
        this.csD.b(17, n2);
    }

    public boolean Zq() {
        return this.csD.en(17) != 0;
    }

    public net.minecraft.entity.r Zr() {
        if (!this.Zq()) {
            return null;
        }
        if (this.baU.dDw) {
            if (this.cEw != null) {
                return this.cEw;
            }
            c c2 = this.baU.cn(this.csD.en(17));
            if (c2 instanceof net.minecraft.entity.r) {
                this.cEw = (net.minecraft.entity.r)c2;
                return this.cEw;
            }
            return null;
        }
        return this.UW();
    }

    @Override
    public void eA(int n2) {
        super.eA(n2);
        if (n2 == 16) {
            if (this.Zo() && this.width < 1.0f) {
                this.o(1.9975f, 1.9975f);
            }
        } else if (n2 == 17) {
            this.cEx = 0;
            this.cEw = null;
        }
    }

    @Override
    public int UY() {
        return 160;
    }

    @Override
    protected String Vb() {
        return !this.isInWater() ? "mob.guardian.land.idle" : (this.Zo() ? "mob.guardian.elder.idle" : "mob.guardian.idle");
    }

    @Override
    protected String VN() {
        return !this.isInWater() ? "mob.guardian.land.hit" : (this.Zo() ? "mob.guardian.elder.hit" : "mob.guardian.hit");
    }

    @Override
    protected String VO() {
        return !this.isInWater() ? "mob.guardian.land.death" : (this.Zo() ? "mob.guardian.elder.death" : "mob.guardian.death");
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.5f;
    }

    @Override
    public float ad(b b2) {
        return this.baU.L(b2).df().xb() == Material.bev ? 10.0f + this.baU.aR(b2) - 0.5f : super.ad(b2);
    }

    @Override
    public void Dn() {
        if (this.baU.dDw) {
            Object object;
            this.cEs = this.cEr;
            if (!this.isInWater()) {
                this.cEt = 2.0f;
                if (this.ue > 0.0 && this.cEy && !this.TE()) {
                    this.baU.a(this.gW, this.gX, this.gY, "mob.guardian.flop", 1.0f, 1.0f, false);
                }
                this.cEy = this.ue < 0.0 && this.baU.e(new b(this).aqY(), false);
            } else {
                this.cEt = this.Zm() ? (this.cEt < 0.5f ? 4.0f : (this.cEt += (0.5f - this.cEt) * 0.1f)) : (this.cEt += (0.125f - this.cEt) * 0.2f);
            }
            this.cEr += this.cEt;
            this.cEv = this.cEu;
            this.cEu = !this.isInWater() ? this.ta.nextFloat() : (this.Zm() ? (this.cEu += (0.0f - this.cEu) * 0.25f) : (this.cEu += (1.0f - this.cEu) * 0.06f));
            if (this.Zm() && this.isInWater()) {
                object = this.O(0.0f);
                for (int i2 = 0; i2 < 2; ++i2) {
                    this.baU.a(as.dxa, this.gW + (this.ta.nextDouble() - 0.5) * (double)this.width - ((da)object).dAG * 1.5, this.gX + this.ta.nextDouble() * (double)this.height - ((da)object).dAH * 1.5, this.gY + (this.ta.nextDouble() - 0.5) * (double)this.width - ((da)object).dAI * 1.5, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (this.Zq()) {
                if (this.cEx < this.Zn()) {
                    ++this.cEx;
                }
                if ((object = this.Zr()) != null) {
                    this.UR().b((c)object, 90.0f, 90.0f);
                    this.UR().Xd();
                    double d2 = this.bi(0.0f);
                    double d3 = ((net.minecraft.entity.r)object).gW - this.gW;
                    double d4 = ((net.minecraft.entity.r)object).gX + (double)(((net.minecraft.entity.r)object).height * 0.5f) - (this.gX + (double)this.getEyeHeight());
                    double d5 = ((net.minecraft.entity.r)object).gY - this.gY;
                    double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                    d3 /= d6;
                    d4 /= d6;
                    d5 /= d6;
                    double d7 = this.ta.nextDouble();
                    while (d7 < d6) {
                        this.baU.a(as.dxa, this.gW + d3 * (d7 += 1.8 - d2 + this.ta.nextDouble() * (1.7 - d2)), this.gX + d4 * d7 + (double)this.getEyeHeight(), this.gY + d5 * d7, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
            }
        }
        if (this.csz) {
            this.ey(300);
        } else if (this.aO) {
            this.ue += 0.5;
            this.ud += (double)((this.ta.nextFloat() * 2.0f - 1.0f) * 0.4f);
            this.uf += (double)((this.ta.nextFloat() * 2.0f - 1.0f) * 0.4f);
            this.pl = this.ta.nextFloat() * 360.0f;
            this.aO = false;
            this.csL = true;
        }
        if (this.Zq()) {
            this.pl = this.pn;
        }
        super.Dn();
    }

    public float bg(float f2) {
        return this.cEs + (this.cEr - this.cEs) * f2;
    }

    public float bh(float f2) {
        return this.cEv + (this.cEu - this.cEv) * f2;
    }

    public float bi(float f2) {
        return ((float)this.cEx + f2) / (float)this.Zn();
    }

    @Override
    protected void Vf() {
        super.Vf();
        if (this.Zo()) {
            int n2 = 1200;
            int n3 = 1200;
            int n4 = 6000;
            int n5 = 2;
            if ((this.aRg + this.getEntityId()) % 1200 == 0) {
                a a2 = a.dgz;
                for (e e2 : this.baU.b(e.class, new s(this))) {
                    if (e2.a(a2) && e2.b(a2).ajf() >= 2 && e2.b(a2).getDuration() >= 1200) continue;
                    e2.cIX.B(new av(10, 0.0f));
                    e2.b(new d(a2.dhb, 6000, 2));
                }
            }
            if (!this.UH()) {
                this.c(new b(this), 16);
            }
        }
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3 = this.ta.nextInt(3) + this.ta.nextInt(n2 + 1);
        if (n3 > 0) {
            this.a(new co(Items.cSG, n3, 0), 1.0f);
        }
        if (this.ta.nextInt(3 + n2) > 1) {
            this.a(new co(Items.cQY, 1, bd.cWe.yc()), 1.0f);
        } else if (this.ta.nextInt(3 + n2) > 1) {
            this.a(new co(Items.cSH, 1, 0), 1.0f);
        }
        if (bl2 && this.Zo()) {
            this.a(new co(Blocks.cLx, 1, 1), 1.0f);
        }
    }

    @Override
    protected void VP() {
        co co2 = de.a(this.ta, net.minecraft.entity.projectile.d.acN()).i(this.ta);
        this.a(co2, 1.0f);
    }

    @Override
    protected boolean Za() {
        return true;
    }

    @Override
    public boolean Vh() {
        return this.baU.a(this.Us(), (c)this) && this.baU.a((c)this, this.Us()).isEmpty();
    }

    @Override
    public boolean UB() {
        return (this.ta.nextInt(20) == 0 || !this.baU.aN(new b(this))) && super.UB();
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (!this.Zm() && !ad2.aso() && ad2.asf() instanceof net.minecraft.entity.r) {
            net.minecraft.entity.r r2 = (net.minecraft.entity.r)ad2.asf();
            if (!ad2.arZ()) {
                r2.a(ad.aw(this), 2.0f);
                r2.a("damage.thorns", 0.5f, 1.0f);
            }
        }
        this.cEz.Xa();
        return super.a(ad2, f2);
    }

    @Override
    public int Vg() {
        return 180;
    }

    @Override
    public void t(float f2, float f3) {
        if (this.Dy()) {
            if (this.isInWater()) {
                this.s(f2, f3, 0.1f);
                this.y(this.ud, this.ue, this.uf);
                this.ud *= (double)0.9f;
                this.ue *= (double)0.9f;
                this.uf *= (double)0.9f;
                if (!this.Zm() && this.UW() == null) {
                    this.ue -= 0.005;
                }
            } else {
                super.t(f2, f3);
            }
        } else {
            super.t(f2, f3);
        }
    }
}

