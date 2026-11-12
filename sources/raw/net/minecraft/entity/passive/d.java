/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.aa;
import net.minecraft.entity.ai.ao;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.az;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.t;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.h;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class d
extends b {
    public float cFD;
    public float cFE;
    public float cFF;
    public float cFG;
    public float cFH = 1.0f;
    public int cFI;
    public boolean cFJ;

    public d(w w2) {
        super(w2);
        this.o(0.4f, 0.7f);
        this.cFI = this.ta.nextInt(6000) + 6000;
        this.ctS.a(0, new au(this));
        this.ctS.a(1, new ao(this, 1.4));
        this.ctS.a(2, new aa(this, 1.0));
        this.ctS.a(3, new az(this, 1.0, Items.cPR, false));
        this.ctS.a(4, new t(this, 1.1));
        this.ctS.a(5, new bd(this, 1.0));
        this.ctS.a(6, new be(this, a.class, 6.0f));
        this.ctS.a(7, new z(this));
    }

    @Override
    public float getEyeHeight() {
        return this.height;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(4.0);
        this.a(aj.cwp).ap(0.25);
    }

    @Override
    public void Dn() {
        super.Dn();
        this.cFG = this.cFD;
        this.cFF = this.cFE;
        this.cFE = (float)((double)this.cFE + (double)(this.aO ? -1 : 4) * 0.3);
        this.cFE = bt.I(this.cFE, 0.0f, 1.0f);
        if (!this.aO && this.cFH < 1.0f) {
            this.cFH = 1.0f;
        }
        this.cFH = (float)((double)this.cFH * 0.9);
        if (!this.aO && this.ue < 0.0) {
            this.ue *= 0.6;
        }
        this.cFD += this.cFH * 2.0f;
        if (!(this.baU.dDw || this.Uz() || this.ZW() || --this.cFI > 0)) {
            this.a("mob.chicken.plop", 1.0f, (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
            this.d(Items.cQT, 1);
            this.cFI = this.ta.nextInt(6000) + 6000;
        }
    }

    @Override
    public void q(float f2, float f3) {
    }

    @Override
    protected String Vb() {
        return "mob.chicken.say";
    }

    @Override
    protected String VN() {
        return "mob.chicken.hurt";
    }

    @Override
    protected String VO() {
        return "mob.chicken.hurt";
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.chicken.step", 0.15f, 1.0f);
    }

    @Override
    protected net.minecraft.item.d Vc() {
        return Items.cPK;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3 = this.ta.nextInt(3) + this.ta.nextInt(1 + n2);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.d(Items.cPK, 1);
        }
        if (this.isBurning()) {
            this.d(Items.cRp, 1);
        } else {
            this.d(Items.cRo, 1);
        }
    }

    public d b(h h2) {
        return new d(this.baU);
    }

    @Override
    public boolean ac(co co2) {
        return co2 != null && co2.bP() == Items.cPR;
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.cFJ = n2.eO("IsChickenJockey");
        if (n2.eD("EggLayTime")) {
            this.cFI = n2.eG("EggLayTime");
        }
    }

    @Override
    protected int r(a a2) {
        return this.ZW() ? 10 : super.r(a2);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("IsChickenJockey", this.cFJ);
        n2.B("EggLayTime", this.cFI);
    }

    @Override
    protected boolean Vd() {
        return this.ZW() && this.crA == null;
    }

    @Override
    public void TV() {
        super.TV();
        float f2 = bt.bx(this.cuF * (float)Math.PI / 180.0f);
        float f3 = bt.bB(this.cuF * (float)Math.PI / 180.0f);
        float f4 = 0.1f;
        float f5 = 0.0f;
        this.crA.setPosition(this.gW + (double)(0.1f * f2), this.gX + (double)(this.height * 0.5f) + this.crA.LJ() + 0.0, this.gY - (double)(0.1f * f3));
        if (this.crA instanceof r) {
            ((r)this.crA).cuF = this.cuF;
        }
    }

    public boolean ZW() {
        return this.cFJ;
    }

    public void bo(boolean bl2) {
        this.cFJ = bl2;
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.b(h2);
    }
}

