/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.f;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class aw
extends f {
    public aw() {
        this(0.0f, 0.0f, false);
    }

    public aw(float f2, float f3, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
        if (bl2) {
            this.byA = new ag(this, 0, 0);
            this.byA.a(-4.0f, -10.0f, -4.0f, 8, 8, 8, f2);
            this.byA.g(0.0f, 0.0f + f3, 0.0f);
        } else {
            this.byA = new ag(this);
            this.byA.g(0.0f, 0.0f + f3, 0.0f);
            this.byA.C(0, 32).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, f2);
            this.byA.C(24, 32).a(-1.0f, -3.0f, -6.0f, 2, 4, 2, f2);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        float f8 = bt.bx(this.km * (float)Math.PI);
        float f9 = bt.bx((1.0f - (1.0f - this.km) * (1.0f - this.km)) * (float)Math.PI);
        this.byD.bBH = 0.0f;
        this.byE.bBH = 0.0f;
        this.byD.bBG = -(0.1f - f8 * 0.6f);
        this.byE.bBG = 0.1f - f8 * 0.6f;
        this.byD.bBF = -1.5707964f;
        this.byE.bBF = -1.5707964f;
        this.byD.bBF -= f8 * 1.2f - f9 * 0.4f;
        this.byE.bBF -= f8 * 1.2f - f9 * 0.4f;
        this.byD.bBH += bt.bB(f4 * 0.09f) * 0.05f + 0.05f;
        this.byE.bBH -= bt.bB(f4 * 0.09f) * 0.05f + 0.05f;
        this.byD.bBF += bt.bx(f4 * 0.067f) * 0.05f;
        this.byE.bBF -= bt.bx(f4 * 0.067f) * 0.05f;
    }
}

