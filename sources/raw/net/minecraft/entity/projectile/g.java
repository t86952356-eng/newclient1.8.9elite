/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.world.w;

public class g
extends net.minecraft.entity.projectile.c {
    public g(w w2) {
        super(w2);
        this.o(0.3125f, 0.3125f);
    }

    public g(w w2, r r2, double d2, double d3, double d4) {
        super(w2, r2, d2, d3, d4);
        this.o(0.3125f, 0.3125f);
    }

    public g(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.o(0.3125f, 0.3125f);
    }

    @Override
    protected void f(ce ce2) {
        if (!this.baU.dDw) {
            if (ce2.dzw != null) {
                boolean bl2 = ce2.dzw.a(ad.a(this, (c)this.cKd), 5.0f);
                if (bl2) {
                    this.c(this.cKd, ce2.dzw);
                    if (!ce2.dzw.TF()) {
                        ce2.dzw.ev(5);
                    }
                }
            } else {
                b b2;
                boolean bl3 = true;
                if (this.cKd != null && this.cKd instanceof p) {
                    bl3 = this.baU.Si().gw("mobGriefing");
                }
                if (bl3 && this.baU.aG(b2 = ce2.dg().x(ce2.dzv))) {
                    this.baU.d(b2, Blocks.cMd.xM());
                }
            }
            this.Tt();
        }
    }

    @Override
    public boolean TO() {
        return false;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        return false;
    }
}

