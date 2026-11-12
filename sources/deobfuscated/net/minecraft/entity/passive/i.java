/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.h;
import net.minecraft.entity.passive.e;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.as;
import net.minecraft.world.w;

public class i
extends e {
    public i(w w2) {
        super(w2);
        this.o(0.9f, 1.3f);
        this.cFA = Blocks.cNy;
    }

    @Override
    public boolean q(a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cPD && this.Ux() >= 0) {
            if (co2.cWZ == 1) {
                a2.cHV.g(a2.cHV.cJE, new co(Items.cPE));
                return true;
            }
            if (a2.cHV.ah(new co(Items.cPE)) && !a2.cIt.cJM) {
                a2.cHV.ap(a2.cHV.cJE, 1);
                return true;
            }
        }
        if (co2 != null && co2.bP() == Items.cRi && this.Ux() >= 0) {
            this.Tt();
            this.baU.a(as.dwX, this.gW, this.gX + (double)(this.height / 2.0f), this.gY, 0.0, 0.0, 0.0, new int[0]);
            if (!this.baU.dDw) {
                e e2 = new e(this.baU);
                e2.b(this.gW, this.gX, this.gY, this.pl, this.pm);
                e2.aY(this.getHealth());
                e2.cuF = this.cuF;
                if (this.xV()) {
                    e2.ec(this.Un());
                }
                this.baU.G(e2);
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.baU.G(new net.minecraft.entity.item.i(this.baU, this.gW, this.gX + (double)this.height, this.gY, new co(Blocks.cLS)));
                }
                co2.b(1, (r)a2);
                this.a("mob.sheep.shear", 1.0f, 1.0f);
            }
            return true;
        }
        return super.q(a2);
    }

    public i d(h h2) {
        return new i(this.baU);
    }

    @Override
    public /* synthetic */ e c(h h2) {
        return this.d(h2);
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.d(h2);
    }
}

