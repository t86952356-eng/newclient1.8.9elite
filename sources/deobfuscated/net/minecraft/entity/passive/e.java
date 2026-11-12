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
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.pathfinding.f;
import net.minecraft.world.w;

public class e
extends b {
    public e(w w2) {
        super(w2);
        this.o(0.9f, 1.3f);
        ((f)this.UU()).bQ(true);
        this.ctS.a(0, new au(this));
        this.ctS.a(1, new ao(this, 2.0));
        this.ctS.a(2, new aa(this, 1.0));
        this.ctS.a(3, new az(this, 1.25, Items.cPS, false));
        this.ctS.a(4, new t(this, 1.25));
        this.ctS.a(5, new bd(this, 1.0));
        this.ctS.a(6, new be(this, a.class, 6.0f));
        this.ctS.a(7, new z(this));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(10.0);
        this.a(aj.cwp).ap(0.2f);
    }

    @Override
    protected String Vb() {
        return "mob.cow.say";
    }

    @Override
    protected String VN() {
        return "mob.cow.hurt";
    }

    @Override
    protected String VO() {
        return "mob.cow.hurt";
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.cow.step", 0.15f, 1.0f);
    }

    @Override
    protected float VZ() {
        return 0.4f;
    }

    @Override
    protected d Vc() {
        return Items.cQJ;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3;
        int n4 = this.ta.nextInt(3) + this.ta.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.d(Items.cQJ, 1);
        }
        n4 = this.ta.nextInt(3) + 1 + this.ta.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            if (this.isBurning()) {
                this.d(Items.cRn, 1);
                continue;
            }
            this.d(Items.cRm, 1);
        }
    }

    @Override
    public boolean q(a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cQA && !a2.cIt.cJM && !this.Uz()) {
            if (co2.cWZ-- == 1) {
                a2.cHV.g(a2.cHV.cJE, new co(Items.cQK));
            } else if (!a2.cHV.ah(new co(Items.cQK))) {
                a2.d(new co(Items.cQK, 1, 0), false);
            }
            return true;
        }
        return super.q(a2);
    }

    public e c(h h2) {
        return new e(this.baU);
    }

    @Override
    public float getEyeHeight() {
        return this.height;
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.c(h2);
    }
}

