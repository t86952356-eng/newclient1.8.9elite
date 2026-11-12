/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import net.minecraft.entity.passive.d;
import net.minecraft.entity.projectile.i;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.ce;
import net.minecraft.world.w;

public class b
extends i {
    public b(w w2) {
        super(w2);
    }

    public b(w w2, r r2) {
        super(w2, r2);
    }

    public b(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    protected void f(ce ce2) {
        if (ce2.dzw != null) {
            ce2.dzw.a(ad.c(this, this.acR()), 0.0f);
        }
        if (!this.baU.dDw && this.ta.nextInt(8) == 0) {
            int n2 = 1;
            if (this.ta.nextInt(32) == 0) {
                n2 = 4;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                d d2 = new d(this.baU);
                d2.eC(-24000);
                d2.b(this.gW, this.gX, this.gY, this.pl, 0.0f);
                this.baU.G(d2);
            }
        }
        double d3 = 0.08;
        for (int i3 = 0; i3 < 8; ++i3) {
            this.baU.a(as.dxG, this.gW, this.gX, this.gY, ((double)this.ta.nextFloat() - 0.5) * 0.08, ((double)this.ta.nextFloat() - 0.5) * 0.08, ((double)this.ta.nextFloat() - 0.5) * 0.08, net.minecraft.item.d.p(Items.cQT));
        }
        if (!this.baU.dDw) {
            this.Tt();
        }
    }
}

