/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.block.Block;
import net.minecraft.entity.ab;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.aj;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.monster.aq;
import net.minecraft.entity.monster.ar;
import net.minecraft.entity.monster.as;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.z;
import net.minecraft.init.Items;
import net.minecraft.potion.a;
import net.minecraft.potion.d;
import net.minecraft.util.b;
import net.minecraft.world.e;
import net.minecraft.world.f;

public class ap
extends aa {
    public ap(net.minecraft.world.w w2) {
        super(w2);
        this.o(1.4f, 0.9f);
        this.ctS.a(1, new au(this));
        this.ctS.a(3, new net.minecraft.entity.ai.w(this, 0.4f));
        this.ctS.a(4, new aq(this, net.minecraft.entity.player.a.class));
        this.ctS.a(4, new aq(this, w.class));
        this.ctS.a(5, new bd(this, 0.8));
        this.ctS.a(6, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(6, new net.minecraft.entity.ai.z(this));
        this.ctT.a(1, new v((j)this, false, new Class[0]));
        this.ctT.a(2, new ar<net.minecraft.entity.player.a>(this, net.minecraft.entity.player.a.class));
        this.ctT.a(3, new ar<w>(this, w.class));
    }

    @Override
    public double TW() {
        return this.height * 0.5f;
    }

    @Override
    protected net.minecraft.pathfinding.d i(net.minecraft.world.w w2) {
        return new net.minecraft.pathfinding.e(this, w2);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, new Byte(0));
    }

    @Override
    public void Dm() {
        super.Dm();
        if (!this.baU.dDw) {
            this.bh(this.crR);
        }
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(16.0);
        this.a(aj.cwp).ap(0.3f);
    }

    @Override
    protected String Vb() {
        return "mob.spider.say";
    }

    @Override
    protected String VN() {
        return "mob.spider.say";
    }

    @Override
    protected String VO() {
        return "mob.spider.death";
    }

    @Override
    protected void a(b b2, Block block) {
        this.a("mob.spider.step", 0.15f, 1.0f);
    }

    @Override
    protected net.minecraft.item.d Vc() {
        return Items.cPJ;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        super.a(bl2, n2);
        if (bl2 && (this.ta.nextInt(3) == 0 || this.ta.nextInt(1 + n2) > 0)) {
            this.d(Items.cRF, 1);
        }
    }

    @Override
    public boolean isOnLadder() {
        return this.ZL();
    }

    @Override
    public void Ud() {
    }

    @Override
    public z VY() {
        return z.cvV;
    }

    @Override
    public boolean c(d d2) {
        return d2.aje() != a.dgO.dhb && super.c(d2);
    }

    public boolean ZL() {
        return (this.csD.el(16) & 1) != 0;
    }

    public void bh(boolean bl2) {
        byte by2 = this.csD.el(16);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.csD.b(16, by2);
    }

    @Override
    public ab a(e e2, ab ab2) {
        int n2;
        ab2 = super.a(e2, ab2);
        if (this.baU.dDk.nextInt(100) == 0) {
            ah ah2 = new ah(this.baU);
            ah2.b(this.gW, this.gX, this.gY, this.pl, 0.0f);
            ah2.a(e2, null);
            this.baU.G(ah2);
            ah2.D(this);
        }
        if (ab2 == null) {
            ab2 = new as();
            if (this.baU.agm() == f.dBU && this.baU.dDk.nextFloat() < 0.1f * e2.auY()) {
                ((as)ab2).c(this.baU.dDk);
            }
        }
        if (ab2 instanceof as && (n2 = ((as)ab2).cFk) > 0 && a.dgt[n2] != null) {
            this.b(new d(n2, Integer.MAX_VALUE));
        }
        return ab2;
    }

    @Override
    public float getEyeHeight() {
        return 0.65f;
    }
}

