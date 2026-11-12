/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.monster.j;
import net.minecraft.entity.player.a;
import net.minecraft.entity.projectile.i;
import net.minecraft.entity.r;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.ce;
import net.minecraft.world.w;

public class e
extends i {
    private r cCi;

    public e(w w2) {
        super(w2);
    }

    public e(w w2, r r2) {
        super(w2, r2);
        this.cCi = r2;
    }

    public e(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    protected void f(ce ce2) {
        r r2 = this.acR();
        if (ce2.dzw != null) {
            if (ce2.dzw == this.cCi) {
                return;
            }
            ce2.dzw.a(ad.c(this, r2), 0.0f);
        }
        for (int i2 = 0; i2 < 32; ++i2) {
            this.baU.a(as.dxu, this.gW, this.gX + this.ta.nextDouble() * 2.0, this.gY, this.ta.nextGaussian(), 0.0, this.ta.nextGaussian(), new int[0]);
        }
        if (!this.baU.dDw) {
            if (r2 instanceof net.minecraft.entity.player.e) {
                net.minecraft.entity.player.e e2 = (net.minecraft.entity.player.e)r2;
                if (e2.cIX.dr().afe() && e2.baU == this.baU && !e2.Wg()) {
                    if (this.ta.nextFloat() < 0.05f && this.baU.Si().gw("doMobSpawning")) {
                        j j2 = new j(this.baU);
                        j2.bb(true);
                        j2.b(r2.gW, r2.gX, r2.gY, r2.pl, r2.pm);
                        this.baU.G(j2);
                    }
                    if (r2.isRiding()) {
                        r2.D(null);
                    }
                    r2.Q(this.gW, this.gX, this.gY);
                    r2.csf = 0.0f;
                    r2.a(ad.dvj, 5.0f);
                }
            } else if (r2 != null) {
                r2.Q(this.gW, this.gX, this.gY);
                r2.csf = 0.0f;
            }
            this.Tt();
        }
    }

    @Override
    public void Dm() {
        r r2 = this.acR();
        if (r2 != null && r2 instanceof a && !r2.TS()) {
            this.Tt();
        } else {
            super.Dm();
        }
    }
}

