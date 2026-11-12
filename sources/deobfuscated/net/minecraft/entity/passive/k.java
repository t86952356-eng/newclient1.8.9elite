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
import net.minecraft.entity.effect.a;
import net.minecraft.entity.h;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.passive.b;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.pathfinding.f;
import net.minecraft.world.w;

public class k
extends b {
    private final net.minecraft.entity.ai.h cGs;

    public k(w w2) {
        super(w2);
        this.o(0.9f, 0.9f);
        ((f)this.UU()).bQ(true);
        this.ctS.a(0, new au(this));
        this.ctS.a(1, new ao(this, 1.25));
        this.cGs = new net.minecraft.entity.ai.h(this, 0.3f);
        this.ctS.a(2, this.cGs);
        this.ctS.a(3, new aa(this, 1.0));
        this.ctS.a(4, new az(this, 1.2, Items.cSc, false));
        this.ctS.a(4, new az(this, 1.2, Items.cRV, false));
        this.ctS.a(5, new t(this, 1.1));
        this.ctS.a(6, new bd(this, 1.0));
        this.ctS.a(7, new be(this, net.minecraft.entity.player.a.class, 6.0f));
        this.ctS.a(8, new z(this));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(10.0);
        this.a(aj.cwp).ap(0.25);
    }

    @Override
    public boolean Vl() {
        co co2 = ((net.minecraft.entity.player.a)this.crA).Vk();
        return co2 != null && co2.bP() == Items.cSc;
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, (byte)0);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("Saddle", this.aaQ());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.bz(n2.eO("Saddle"));
    }

    @Override
    protected String Vb() {
        return "mob.pig.say";
    }

    @Override
    protected String VN() {
        return "mob.pig.say";
    }

    @Override
    protected String VO() {
        return "mob.pig.death";
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.pig.step", 0.15f, 1.0f);
    }

    @Override
    public boolean q(net.minecraft.entity.player.a a2) {
        if (super.q(a2)) {
            return true;
        }
        if (!this.aaQ() || this.baU.dDw || this.crA != null && this.crA != a2) {
            return false;
        }
        a2.D(this);
        return true;
    }

    @Override
    protected d Vc() {
        return this.isBurning() ? Items.cRn : Items.cRm;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3 = this.ta.nextInt(3) + 1 + this.ta.nextInt(1 + n2);
        for (int i2 = 0; i2 < n3; ++i2) {
            if (this.isBurning()) {
                this.d(Items.cRn, 1);
                continue;
            }
            this.d(Items.cRm, 1);
        }
        if (this.aaQ()) {
            this.d(Items.cQE, 1);
        }
    }

    public boolean aaQ() {
        return (this.csD.el(16) & 1) != 0;
    }

    public void bz(boolean bl2) {
        if (bl2) {
            this.csD.b(16, (byte)1);
        } else {
            this.csD.b(16, (byte)0);
        }
    }

    @Override
    public void b(a a2) {
        if (!this.baU.dDw && !this.csb) {
            ab ab2 = new ab(this.baU);
            ab2.c(0, new co(Items.cPF));
            ab2.b(this.gW, this.gX, this.gY, this.pl, this.pm);
            ab2.aJ(this.Vt());
            if (this.xV()) {
                ab2.ec(this.Un());
                ab2.aF(this.Uo());
            }
            this.baU.G(ab2);
            this.Tt();
        }
    }

    @Override
    public void q(float f2, float f3) {
        super.q(f2, f3);
        if (f2 > 5.0f && this.crA instanceof net.minecraft.entity.player.a) {
            ((net.minecraft.entity.player.a)this.crA).a(net.minecraft.stats.b.doT);
        }
    }

    public k f(h h2) {
        return new k(this.baU);
    }

    @Override
    public boolean ac(co co2) {
        return co2 != null && co2.bP() == Items.cRV;
    }

    public net.minecraft.entity.ai.h aaR() {
        return this.cGs;
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.f(h2);
    }
}

