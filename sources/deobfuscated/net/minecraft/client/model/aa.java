/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;

public class aa
extends d {
    public ag[] bAQ = new ag[7];

    public aa() {
        this.bAQ[0] = new ag(this, 0, 10);
        this.bAQ[1] = new ag(this, 0, 0);
        this.bAQ[2] = new ag(this, 0, 0);
        this.bAQ[3] = new ag(this, 0, 0);
        this.bAQ[4] = new ag(this, 0, 0);
        this.bAQ[5] = new ag(this, 44, 10);
        int n2 = 20;
        int n3 = 8;
        int n4 = 16;
        int n5 = 4;
        this.bAQ[0].a(-10.0f, -8.0f, -1.0f, 20, 16, 2, 0.0f);
        this.bAQ[0].g(0.0f, 4.0f, 0.0f);
        this.bAQ[5].a(-9.0f, -7.0f, -1.0f, 18, 14, 1, 0.0f);
        this.bAQ[5].g(0.0f, 4.0f, 0.0f);
        this.bAQ[1].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.bAQ[1].g(-9.0f, 4.0f, 0.0f);
        this.bAQ[2].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.bAQ[2].g(9.0f, 4.0f, 0.0f);
        this.bAQ[3].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.bAQ[3].g(0.0f, 4.0f, -7.0f);
        this.bAQ[4].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.bAQ[4].g(0.0f, 4.0f, 7.0f);
        this.bAQ[0].bBF = 1.5707964f;
        this.bAQ[1].bBG = 4.712389f;
        this.bAQ[2].bBG = 1.5707964f;
        this.bAQ[3].bBG = (float)Math.PI;
        this.bAQ[5].bBF = -1.5707964f;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.bAQ[5].bBD = 4.0f - f4;
        for (int i2 = 0; i2 < 6; ++i2) {
            this.bAQ[i2].aa(f7);
        }
    }
}

