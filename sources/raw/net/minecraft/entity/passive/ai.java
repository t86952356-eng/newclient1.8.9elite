/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.aa;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.am;
import net.minecraft.entity.ai.an;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.aw;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.s;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.c;
import net.minecraft.entity.h;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.monster.k;
import net.minecraft.entity.passive.aj;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class ai
extends y {
    private float cHP;
    private float cHQ;
    private boolean cHR;
    private boolean cHS;
    private float cHT;
    private float cHU;

    public ai(w w2) {
        super(w2);
        this.o(0.6f, 0.8f);
        ((net.minecraft.pathfinding.f)this.UU()).bQ(true);
        this.ctS.a(1, new au(this));
        this.ctS.a(2, this.cHo);
        this.ctS.a(3, new net.minecraft.entity.ai.w(this, 0.4f));
        this.ctS.a(4, new net.minecraft.entity.ai.b(this, 1.0, true));
        this.ctS.a(5, new s(this, 1.0, 10.0f, 2.0f));
        this.ctS.a(6, new aa(this, 1.0));
        this.ctS.a(7, new bd(this, 1.0));
        this.ctS.a(8, new net.minecraft.entity.ai.f(this, 8.0f));
        this.ctS.a(9, new be(this, a.class, 8.0f));
        this.ctS.a(9, new z(this));
        this.ctT.a(1, new am(this));
        this.ctT.a(2, new an(this));
        this.ctT.a(3, new v((j)this, true, new Class[0]));
        this.ctT.a(4, new aw<c>(this, b.class, false, new aj(this)));
        this.ctT.a(5, new ag<ah>((j)this, ah.class, false));
        this.by(false);
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(net.minecraft.entity.aj.cwp).ap(0.3f);
        if (this.abl()) {
            this.a(net.minecraft.entity.aj.cwm).ap(20.0);
        } else {
            this.a(net.minecraft.entity.aj.cwm).ap(8.0);
        }
        this.VX().c(net.minecraft.entity.aj.cwq);
        this.a(net.minecraft.entity.aj.cwq).ap(2.0);
    }

    @Override
    public void S(r r2) {
        super.S(r2);
        if (r2 == null) {
            this.bH(false);
        } else if (!this.abl()) {
            this.bH(true);
        }
    }

    @Override
    protected void Vf() {
        this.csD.b(18, Float.valueOf(this.getHealth()));
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(18, new Float(this.getHealth()));
        this.csD.a(19, new Byte(0));
        this.csD.a(20, new Byte((byte)net.minecraft.item.b.cUQ.yc()));
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.wolf.step", 0.15f, 1.0f);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("Angry", this.ZF());
        n2.a("CollarColor", (byte)this.abD().ado());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.bH(n2.eO("Angry"));
        if (n2.C("CollarColor", 99)) {
            this.c(net.minecraft.item.b.fR(n2.eE("CollarColor")));
        }
    }

    @Override
    protected String Vb() {
        return this.ZF() ? "mob.wolf.growl" : (this.ta.nextInt(3) == 0 ? (this.abl() && this.csD.eo(18) < 10.0f ? "mob.wolf.whine" : "mob.wolf.panting") : "mob.wolf.bark");
    }

    @Override
    protected String VN() {
        return "mob.wolf.hurt";
    }

    @Override
    protected String VO() {
        return "mob.wolf.death";
    }

    @Override
    protected float VZ() {
        return 0.4f;
    }

    @Override
    protected net.minecraft.item.d Vc() {
        return net.minecraft.item.d.fT(-1);
    }

    @Override
    public void Dn() {
        super.Dn();
        if (!this.baU.dDw && this.cHR && !this.cHS && !this.UC() && this.aO) {
            this.cHS = true;
            this.cHT = 0.0f;
            this.cHU = 0.0f;
            this.baU.a((c)this, (byte)8);
        }
        if (!this.baU.dDw && this.UW() == null && this.ZF()) {
            this.bH(false);
        }
    }

    @Override
    public void Dm() {
        super.Dm();
        this.cHQ = this.cHP;
        this.cHP = this.abE() ? (this.cHP += (1.0f - this.cHP) * 0.4f) : (this.cHP += (0.0f - this.cHP) * 0.4f);
        if (this.TG()) {
            this.cHR = true;
            this.cHS = false;
            this.cHT = 0.0f;
            this.cHU = 0.0f;
        } else if ((this.cHR || this.cHS) && this.cHS) {
            if (this.cHT == 0.0f) {
                this.a("mob.wolf.shake", this.VZ(), (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
            }
            this.cHU = this.cHT;
            this.cHT += 0.05f;
            if (this.cHU >= 2.0f) {
                this.cHR = false;
                this.cHS = false;
                this.cHU = 0.0f;
                this.cHT = 0.0f;
            }
            if (this.cHT > 0.4f) {
                float f2 = (float)this.Us().dtI;
                int n2 = (int)(bt.bx((this.cHT - 0.4f) * (float)Math.PI) * 7.0f);
                for (int i2 = 0; i2 < n2; ++i2) {
                    float f3 = (this.ta.nextFloat() * 2.0f - 1.0f) * this.width * 0.5f;
                    float f4 = (this.ta.nextFloat() * 2.0f - 1.0f) * this.width * 0.5f;
                    this.baU.a(as.dxb, this.gW + (double)f3, (double)(f2 + 0.8f), this.gY + (double)f4, this.ud, this.ue, this.uf, new int[0]);
                }
            }
        }
    }

    public boolean abB() {
        return this.cHR;
    }

    public float bq(float f2) {
        return 0.75f + (this.cHU + (this.cHT - this.cHU) * f2) / 2.0f * 0.25f;
    }

    public float v(float f2, float f3) {
        float f4 = (this.cHU + (this.cHT - this.cHU) * f2 + f3) / 1.8f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        return bt.bx(f4 * (float)Math.PI) * bt.bx(f4 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    public float br(float f2) {
        return (this.cHQ + (this.cHP - this.cHQ) * f2) * 0.15f * (float)Math.PI;
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.8f;
    }

    @Override
    public int Vg() {
        return this.abm() ? 20 : super.Vg();
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        c c2 = ad2.dk();
        this.cHo.aL(false);
        if (c2 != null && !(c2 instanceof a) && !(c2 instanceof net.minecraft.entity.projectile.a)) {
            f2 = (f2 + 1.0f) / 2.0f;
        }
        return super.a(ad2, f2);
    }

    @Override
    public boolean ag(c c2) {
        boolean bl2 = c2.a(ad.ac(this), (float)((int)this.a(net.minecraft.entity.aj.cwq).XB()));
        if (bl2) {
            this.c(this, c2);
        }
        return bl2;
    }

    @Override
    public void by(boolean bl2) {
        super.by(bl2);
        if (bl2) {
            this.a(net.minecraft.entity.aj.cwm).ap(20.0);
        } else {
            this.a(net.minecraft.entity.aj.cwm).ap(8.0);
        }
        this.a(net.minecraft.entity.aj.cwq).ap(4.0);
    }

    @Override
    public boolean q(a a2) {
        co co2 = a2.cHV.acE();
        if (this.abl()) {
            if (co2 != null) {
                net.minecraft.item.b b2;
                if (co2.bP() instanceof bg) {
                    bg bg2 = (bg)co2.bP();
                    if (bg2.adW() && this.csD.eo(18) < 20.0f) {
                        if (!a2.cIt.cJM) {
                            --co2.cWZ;
                        }
                        this.P(bg2.aE(co2));
                        if (co2.cWZ <= 0) {
                            a2.cHV.g(a2.cHV.cJE, null);
                        }
                        return true;
                    }
                } else if (co2.bP() == Items.cRa && (b2 = net.minecraft.item.b.fR(co2.yc())) != this.abD()) {
                    this.c(b2);
                    if (!a2.cIt.cJM && --co2.cWZ <= 0) {
                        a2.cHV.g(a2.cHV.cJE, null);
                    }
                    return true;
                }
            }
            if (this.Z(a2) && !this.baU.dDw && !this.ac(co2)) {
                this.cHo.aL(!this.abm());
                this.cuU = false;
                this.ctR.aiL();
                this.S(null);
            }
        } else if (co2 != null && co2.bP() == Items.cRb && !this.ZF()) {
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            if (co2.cWZ <= 0) {
                a2.cHV.g(a2.cHV.cJE, null);
            }
            if (!this.baU.dDw) {
                if (this.ta.nextInt(3) == 0) {
                    this.by(true);
                    this.ctR.aiL();
                    this.S(null);
                    this.cHo.aL(true);
                    this.aY(20.0f);
                    this.ek(a2.Ul().toString());
                    this.bC(true);
                    this.baU.a((c)this, (byte)7);
                } else {
                    this.bC(false);
                    this.baU.a((c)this, (byte)6);
                }
            }
            return true;
        }
        return super.q(a2);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 8) {
            this.cHS = true;
            this.cHT = 0.0f;
            this.cHU = 0.0f;
        } else {
            super.a(by2);
        }
    }

    public float abC() {
        return this.ZF() ? 1.5393804f : (this.abl() ? (0.55f - (20.0f - this.csD.eo(18)) * 0.02f) * (float)Math.PI : 0.62831855f);
    }

    @Override
    public boolean ac(co co2) {
        return co2 != null && co2.bP() instanceof bg && ((bg)co2.bP()).adW();
    }

    @Override
    public int Vj() {
        return 8;
    }

    public boolean ZF() {
        return (this.csD.el(16) & 2) != 0;
    }

    public void bH(boolean bl2) {
        byte by2 = this.csD.el(16);
        if (bl2) {
            this.csD.b(16, (byte)(by2 | 2));
        } else {
            this.csD.b(16, (byte)(by2 & 0xFFFFFFFD));
        }
    }

    public net.minecraft.item.b abD() {
        return net.minecraft.item.b.fR(this.csD.el(20) & 0xF);
    }

    public void c(net.minecraft.item.b b2) {
        this.csD.b(20, (byte)(b2.ado() & 0xF));
    }

    public ai j(h h2) {
        ai ai2 = new ai(this.baU);
        String string = this.Wz();
        if (string != null && string.trim().length() > 0) {
            ai2.ek(string);
            ai2.by(true);
        }
        return ai2;
    }

    public void bI(boolean bl2) {
        if (bl2) {
            this.csD.b(19, (byte)1);
        } else {
            this.csD.b(19, (byte)0);
        }
    }

    @Override
    public boolean a(b b2) {
        if (b2 == this) {
            return false;
        }
        if (!this.abl()) {
            return false;
        }
        if (!(b2 instanceof ai)) {
            return false;
        }
        ai ai2 = (ai)b2;
        return ai2.abl() && !ai2.abm() && this.ZT() && ai2.ZT();
    }

    public boolean abE() {
        return this.csD.el(19) == 1;
    }

    @Override
    protected boolean Vd() {
        return !this.abl() && this.aRg > 2400;
    }

    @Override
    public boolean b(r r2, r r3) {
        if (!(r2 instanceof d) && !(r2 instanceof k)) {
            ai ai2;
            if (r2 instanceof ai && (ai2 = (ai)r2).abl() && ai2.abn() == r3) {
                return false;
            }
            return !(r2 instanceof a && r3 instanceof a && !((a)r3).D((a)r2) || r2 instanceof f && ((f)r2).aaa());
        }
        return false;
    }

    @Override
    public boolean Vp() {
        return !this.ZF() && super.Vp();
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.j(h2);
    }
}

