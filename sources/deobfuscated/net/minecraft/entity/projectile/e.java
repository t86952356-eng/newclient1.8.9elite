/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.ce;
import net.minecraft.world.w;

public class e
extends net.minecraft.entity.projectile.c {
    public int cKB = 1;

    public e(w w2) {
        super(w2);
    }

    public e(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
    }

    public e(w w2, r r2, double d2, double d3, double d4) {
        super(w2, r2, d2, d3, d4);
    }

    @Override
    protected void f(ce ce2) {
        if (!this.baU.dDw) {
            if (ce2.dzw != null) {
                ce2.dzw.a(ad.a(this, (c)this.cKd), 6.0f);
                this.c(this.cKd, ce2.dzw);
            }
            boolean bl2 = this.baU.Si().gw("mobGriefing");
            this.baU.a(null, this.gW, this.gX, this.gY, (float)this.cKB, bl2, bl2);
            this.Tt();
        }
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.B("ExplosionPower", this.cKB);
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        if (n2.C("ExplosionPower", 99)) {
            this.cKB = n2.eG("ExplosionPower");
        }
    }
}

