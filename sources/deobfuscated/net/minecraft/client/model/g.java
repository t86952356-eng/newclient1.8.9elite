/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class g
extends d {
    private final ag[] byK = new ag[12];
    private final ag byL;

    public g() {
        for (int i2 = 0; i2 < this.byK.length; ++i2) {
            this.byK[i2] = new ag(this, 0, 16);
            this.byK[i2].a(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.byL = new ag(this, 0, 0);
        this.byL.a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.byL.aa(f7);
        for (int i2 = 0; i2 < this.byK.length; ++i2) {
            this.byK[i2].aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        int n2;
        float f8 = f4 * (float)Math.PI * -0.1f;
        for (n2 = 0; n2 < 4; ++n2) {
            this.byK[n2].bBD = -2.0f + bt.bB(((float)(n2 * 2) + f4) * 0.25f);
            this.byK[n2].bBC = bt.bB(f8) * 9.0f;
            this.byK[n2].bBE = bt.bx(f8) * 9.0f;
            f8 += 1.0f;
        }
        f8 = 0.7853982f + f4 * (float)Math.PI * 0.03f;
        for (n2 = 4; n2 < 8; ++n2) {
            this.byK[n2].bBD = 2.0f + bt.bB(((float)(n2 * 2) + f4) * 0.25f);
            this.byK[n2].bBC = bt.bB(f8) * 7.0f;
            this.byK[n2].bBE = bt.bx(f8) * 7.0f;
            f8 += 1.0f;
        }
        f8 = 0.47123894f + f4 * (float)Math.PI * -0.05f;
        for (n2 = 8; n2 < 12; ++n2) {
            this.byK[n2].bBD = 11.0f + bt.bB(((float)n2 * 1.5f + f4) * 0.5f);
            this.byK[n2].bBC = bt.bB(f8) * 5.0f;
            this.byK[n2].bBE = bt.bx(f8) * 5.0f;
            f8 += 1.0f;
        }
        this.byL.bBG = f5 / 57.295776f;
        this.byL.bBF = f6 / 57.295776f;
    }
}

