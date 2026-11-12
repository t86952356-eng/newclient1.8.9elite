/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.b;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.aj;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.af;
import net.minecraft.entity.monster.ag;
import net.minecraft.entity.player.a;
import net.minecraft.entity.z;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.ad;
import net.minecraft.world.w;

public class ae
extends aa {
    private final ag cEO;

    public ae(w w2) {
        super(w2);
        this.o(0.4f, 0.3f);
        this.ctS.a(1, new au(this));
        this.cEO = new ag(this);
        this.ctS.a(3, this.cEO);
        this.ctS.a(4, new b(this, a.class, 1.0, false));
        this.ctS.a(5, new af(this));
        this.ctT.a(1, new v((j)this, true, new Class[0]));
        this.ctT.a(2, new net.minecraft.entity.ai.ag<a>((j)this, a.class, true));
    }

    @Override
    public double LJ() {
        return 0.2;
    }

    @Override
    public float getEyeHeight() {
        return 0.1f;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(8.0);
        this.a(aj.cwp).ap(0.25);
        this.a(aj.cwq).ap(1.0);
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected String Vb() {
        return "mob.silverfish.say";
    }

    @Override
    protected String VN() {
        return "mob.silverfish.hit";
    }

    @Override
    protected String VO() {
        return "mob.silverfish.kill";
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (ad2 instanceof net.minecraft.util.af || ad2 == ad.dvm) {
            this.cEO.ZG();
        }
        return super.a(ad2, f2);
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.silverfish.step", 0.15f, 1.0f);
    }

    @Override
    protected d Vc() {
        return null;
    }

    @Override
    public void Dm() {
        this.cuF = this.pl;
        super.Dm();
    }

    @Override
    public float ad(net.minecraft.util.b b2) {
        return this.baU.L(b2.aqY()).df() == Blocks.cLd ? 10.0f : super.ad(b2);
    }

    @Override
    protected boolean Za() {
        return true;
    }

    @Override
    public boolean UB() {
        if (super.UB()) {
            a a2 = this.baU.f(this, 5.0);
            return a2 == null;
        }
        return false;
    }

    @Override
    public z VY() {
        return z.cvV;
    }
}

