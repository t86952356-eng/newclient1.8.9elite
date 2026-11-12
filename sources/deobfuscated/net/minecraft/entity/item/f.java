/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.item.w;
import net.minecraft.entity.projectile.i;
import net.minecraft.entity.r;
import net.minecraft.util.b;
import net.minecraft.util.ce;

public class f
extends i {
    public f(net.minecraft.world.w w2) {
        super(w2);
    }

    public f(net.minecraft.world.w w2, r r2) {
        super(w2, r2);
    }

    public f(net.minecraft.world.w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    protected float Yd() {
        return 0.07f;
    }

    @Override
    protected float Ye() {
        return 0.7f;
    }

    @Override
    protected float Yf() {
        return -20.0f;
    }

    @Override
    protected void f(ce ce2) {
        if (!this.baU.dDw) {
            int n2;
            this.baU.e(2002, new b(this), 0);
            for (int i2 = 3 + this.baU.dDk.nextInt(5) + this.baU.dDk.nextInt(5); i2 > 0; i2 -= n2) {
                n2 = w.fl(i2);
                this.baU.G(new w(this.baU, this.gW, this.gX, this.gY, n2));
            }
            this.Tt();
        }
    }
}

