/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import net.minecraft.entity.monster.a;
import net.minecraft.entity.projectile.i;
import net.minecraft.entity.r;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.ce;
import net.minecraft.world.w;

public class h
extends i {
    public h(w w2) {
        super(w2);
    }

    public h(w w2, r r2) {
        super(w2, r2);
    }

    public h(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    protected void f(ce ce2) {
        int n2;
        if (ce2.dzw != null) {
            n2 = 0;
            if (ce2.dzw instanceof a) {
                n2 = 3;
            }
            ce2.dzw.a(ad.c(this, this.acR()), (float)n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            this.baU.a(as.dxB, this.gW, this.gX, this.gY, 0.0, 0.0, 0.0, new int[0]);
        }
        if (!this.baU.dDw) {
            this.Tt();
        }
    }
}

