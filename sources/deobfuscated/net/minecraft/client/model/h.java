/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;

public class h
extends d {
    public ag[] byM = new ag[5];

    public h() {
        this.byM[0] = new ag(this, 0, 8);
        this.byM[1] = new ag(this, 0, 0);
        this.byM[2] = new ag(this, 0, 0);
        this.byM[3] = new ag(this, 0, 0);
        this.byM[4] = new ag(this, 0, 0);
        int n2 = 24;
        int n3 = 6;
        int n4 = 20;
        int n5 = 4;
        this.byM[0].a(-12.0f, -8.0f, -3.0f, 24, 16, 4, 0.0f);
        this.byM[0].g(0.0f, 4.0f, 0.0f);
        this.byM[1].a(-10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        this.byM[1].g(-11.0f, 4.0f, 0.0f);
        this.byM[2].a(-10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        this.byM[2].g(11.0f, 4.0f, 0.0f);
        this.byM[3].a(-10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        this.byM[3].g(0.0f, 4.0f, -9.0f);
        this.byM[4].a(-10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        this.byM[4].g(0.0f, 4.0f, 9.0f);
        this.byM[0].bBF = 1.5707964f;
        this.byM[1].bBG = 4.712389f;
        this.byM[2].bBG = 1.5707964f;
        this.byM[3].bBG = (float)Math.PI;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        for (int i2 = 0; i2 < 5; ++i2) {
            this.byM[i2].aa(f7);
        }
    }
}

