/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.f;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class av
extends f {
    public av() {
        this(0.0f, false);
    }

    protected av(float f2, float f3, int n2, int n3) {
        super(f2, f3, n2, n3);
    }

    public av(float f2, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
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

