/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ab;
import net.minecraft.entity.ai.aa;
import net.minecraft.entity.ai.ak;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.aw;
import net.minecraft.entity.ai.az;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.s;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.h;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.passive.d;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.pathfinding.f;
import net.minecraft.util.ad;
import net.minecraft.util.cr;
import net.minecraft.world.e;
import net.minecraft.world.w;

public class j
extends y {
    private net.minecraft.entity.ai.c<a> cGq;
    private final az cGr;

    public j(w w2) {
        super(w2);
        this.o(0.6f, 0.7f);
        ((f)this.UU()).bQ(true);
        this.ctS.a(1, new au(this));
        this.ctS.a(2, this.cHo);
        this.cGr = new az(this, 0.6, Items.cQY, true);
        this.ctS.a(3, this.cGr);
        this.ctS.a(5, new s(this, 1.0, 10.0f, 5.0f));
        this.ctS.a(6, new ak(this, 0.8));
        this.ctS.a(7, new net.minecraft.entity.ai.w(this, 0.3f));
        this.ctS.a(8, new net.minecraft.entity.ai.aj(this));
        this.ctS.a(9, new aa(this, 0.8));
        this.ctS.a(10, new bd(this, 0.8));
        this.ctS.a(11, new be(this, a.class, 10.0f));
        this.ctT.a(1, new aw<d>(this, d.class, false, null));
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(18, (byte)0);
    }

    @Override
    public void Vf() {
        if (this.US().Xl()) {
            double d2 = this.US().getSpeed();
            if (d2 == 0.6) {
                this.setSneaking(true);
                this.setSprinting(false);
            } else if (d2 == 1.33) {
                this.setSneaking(false);
                this.setSprinting(true);
            } else {
                this.setSneaking(false);
                this.setSprinting(false);
            }
        } else {
            this.setSneaking(false);
            this.setSprinting(false);
        }
    }

    @Override
    protected boolean Vd() {
        return !this.abl() && this.aRg > 2400;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(10.0);
        this.a(aj.cwp).ap(0.3f);
    }

    @Override
    public void q(float f2, float f3) {
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.B("CatType", this.aaO());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.fy(n2.eG("CatType"));
    }

    @Override
    protected String Vb() {
        return this.abl() ? (this.ZT() ? "mob.cat.purr" : (this.ta.nextInt(4) == 0 ? "mob.cat.purreow" : "mob.cat.meow")) : "";
    }

    @Override
    protected String VN() {
        return "mob.cat.hitt";
    }

    @Override
    protected String VO() {
        return "mob.cat.hitt";
    }

    @Override
    protected float VZ() {
        return 0.4f;
    }

    @Override
    protected net.minecraft.item.d Vc() {
        return Items.cQJ;
    }

    @Override
    public boolean ag(c c2) {
        return c2.a(ad.ac(this), 3.0f);
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        this.cHo.aL(false);
        return super.a(ad2, f2);
    }

    @Override
    protected void a(boolean bl2, int n2) {
    }

    @Override
    public boolean q(a a2) {
        co co2 = a2.cHV.acE();
        if (this.abl()) {
            if (this.Z(a2) && !this.baU.dDw && !this.ac(co2)) {
                this.cHo.aL(!this.abm());
            }
        } else if (this.cGr.WX() && co2 != null && co2.bP() == Items.cQY && a2.T((c)this) < 9.0) {
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            if (co2.cWZ <= 0) {
                a2.cHV.g(a2.cHV.cJE, null);
            }
            if (!this.baU.dDw) {
                if (this.ta.nextInt(3) == 0) {
                    this.by(true);
                    this.fy(1 + this.baU.dDk.nextInt(3));
                    this.ek(a2.Ul().toString());
                    this.bC(true);
                    this.cHo.aL(true);
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

    public j e(h h2) {
        j j2 = new j(this.baU);
        if (this.abl()) {
            j2.ek(this.Wz());
            j2.by(true);
            j2.fy(this.aaO());
        }
        return j2;
    }

    @Override
    public boolean ac(co co2) {
        return co2 != null && co2.bP() == Items.cQY;
    }

    @Override
    public boolean a(b b2) {
        if (b2 == this) {
            return false;
        }
        if (!this.abl()) {
            return false;
        }
        if (!(b2 instanceof j)) {
            return false;
        }
        j j2 = (j)b2;
        return j2.abl() && this.ZT() && j2.ZT();
    }

    public int aaO() {
        return this.csD.el(18);
    }

    public void fy(int n2) {
        this.csD.b(18, (byte)n2);
    }

    @Override
    public boolean UB() {
        return this.baU.dDk.nextInt(3) != 0;
    }

    @Override
    public boolean Vh() {
        if (this.baU.a(this.Us(), (c)this) && this.baU.a((c)this, this.Us()).isEmpty() && !this.baU.u(this.Us())) {
            net.minecraft.util.b b2 = new net.minecraft.util.b(this.gW, this.Us().dtI, this.gY);
            if (b2.wu() < this.baU.avB()) {
                return false;
            }
            Block block = this.baU.L(b2.aqY()).df();
            return block == Blocks.cLe || block.xb() == Material.bex;
        }
        return false;
    }

    @Override
    public String xU() {
        return this.xV() ? this.Un() : (this.abl() ? cr.gm("entity.Cat.name") : super.xU());
    }

    @Override
    public void by(boolean bl2) {
        super.by(bl2);
    }

    @Override
    protected void aaP() {
        if (this.cGq == null) {
            this.cGq = new net.minecraft.entity.ai.c<a>(this, a.class, 16.0f, 0.8, 1.33);
        }
        this.ctS.a(this.cGq);
        if (!this.abl()) {
            this.ctS.a(4, this.cGq);
        }
    }

    @Override
    public ab a(e e2, ab ab2) {
        ab2 = super.a(e2, ab2);
        if (this.baU.dDk.nextInt(7) == 0) {
            for (int i2 = 0; i2 < 2; ++i2) {
                j j2 = new j(this.baU);
                j2.b(this.gW, this.gX, this.gY, this.pl, 0.0f);
                j2.eC(-24000);
                this.baU.G(j2);
            }
        }
        return ab2;
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.e(h2);
    }
}

