/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.aj;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.monster.l;
import net.minecraft.entity.monster.m;
import net.minecraft.entity.monster.n;
import net.minecraft.entity.monster.o;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.stats.b;
import net.minecraft.util.ad;
import net.minecraft.world.f;
import net.minecraft.world.w;

public class k
extends net.minecraft.entity.k
implements aw {
    private int cEk = 1;

    public k(w w2) {
        super(w2);
        this.o(4.0f, 4.0f);
        this.csC = true;
        this.ctM = 5;
        this.ctO = new o(this);
        this.ctS.a(5, new n(this));
        this.ctS.a(7, new m(this));
        this.ctS.a(7, new l(this));
        this.ctT.a(1, new net.minecraft.entity.ai.o(this));
    }

    public boolean Zk() {
        return this.csD.el(16) != 0;
    }

    public void bc(boolean bl2) {
        this.csD.b(16, (byte)(bl2 ? 1 : 0));
    }

    public int Zl() {
        return this.cEk;
    }

    @Override
    public void Dm() {
        super.Dm();
        if (!this.baU.dDw && this.baU.agm() == f.dBR) {
            this.Tt();
        }
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if ("fireball".equals(ad2.asl()) && ad2.dk() instanceof a) {
            super.a(ad2, 1000.0f);
            ((a)ad2.dk()).a(b.doY);
            return true;
        }
        return super.a(ad2, f2);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, (byte)0);
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(10.0);
        this.a(aj.cwn).ap(100.0);
    }

    @Override
    protected String Vb() {
        return "mob.ghast.moan";
    }

    @Override
    protected String VN() {
        return "mob.ghast.scream";
    }

    @Override
    protected String VO() {
        return "mob.ghast.death";
    }

    @Override
    protected d Vc() {
        return Items.cPL;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3;
        int n4 = this.ta.nextInt(2) + this.ta.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.d(Items.cRA, 1);
        }
        n4 = this.ta.nextInt(3) + this.ta.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.d(Items.cPL, 1);
        }
    }

    @Override
    protected float VZ() {
        return 10.0f;
    }

    @Override
    public boolean UB() {
        return this.ta.nextInt(20) == 0 && super.UB() && this.baU.agm() != f.dBR;
    }

    @Override
    public int Vj() {
        return 1;
    }

    @Override
    public void d(net.minecraft.nbt.n n2) {
        super.d(n2);
        n2.B("ExplosionPower", this.cEk);
    }

    @Override
    public void e(net.minecraft.nbt.n n2) {
        super.e(n2);
        if (n2.C("ExplosionPower", 99)) {
            this.cEk = n2.eG("ExplosionPower");
        }
    }

    @Override
    public float getEyeHeight() {
        return 2.6f;
    }
}

