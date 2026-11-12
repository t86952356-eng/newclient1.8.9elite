/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class at
extends d {
    private final ag[] bCP;
    private final ag[] bCQ;

    public at(float f2) {
        this.bys = 64;
        this.byt = 64;
        this.bCP = new ag[3];
        this.bCP[0] = new ag(this, 0, 16);
        this.bCP[0].a(-10.0f, 3.9f, -0.5f, 20, 3, 3, f2);
        this.bCP[1] = new ag(this).D(this.bys, this.byt);
        this.bCP[1].g(-2.0f, 6.9f, -0.5f);
        this.bCP[1].C(0, 22).a(0.0f, 0.0f, 0.0f, 3, 10, 3, f2);
        this.bCP[1].C(24, 22).a(-4.0f, 1.5f, 0.5f, 11, 2, 2, f2);
        this.bCP[1].C(24, 22).a(-4.0f, 4.0f, 0.5f, 11, 2, 2, f2);
        this.bCP[1].C(24, 22).a(-4.0f, 6.5f, 0.5f, 11, 2, 2, f2);
        this.bCP[2] = new ag(this, 12, 22);
        this.bCP[2].a(0.0f, 0.0f, 0.0f, 3, 6, 3, f2);
        this.bCQ = new ag[3];
        this.bCQ[0] = new ag(this, 0, 0);
        this.bCQ[0].a(-4.0f, -4.0f, -4.0f, 8, 8, 8, f2);
        this.bCQ[1] = new ag(this, 32, 0);
        this.bCQ[1].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f2);
        this.bCQ[1].bBC = -8.0f;
        this.bCQ[1].bBD = 4.0f;
        this.bCQ[2] = new ag(this, 32, 0);
        this.bCQ[2].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f2);
        this.bCQ[2].bBC = 10.0f;
        this.bCQ[2].bBD = 4.0f;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        for (ag ag2 : this.bCQ) {
            ag2.aa(f7);
        }
        for (ag ag2 : this.bCP) {
            ag2.aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        float f8 = bt.bB(f4 * 0.1f);
        this.bCP[1].bBF = (0.065f + 0.05f * f8) * (float)Math.PI;
        this.bCP[2].g(-2.0f, 6.9f + bt.bB(this.bCP[1].bBF) * 10.0f, -0.5f + bt.bx(this.bCP[1].bBF) * 10.0f);
        this.bCP[2].bBF = (0.265f + 0.1f * f8) * (float)Math.PI;
        this.bCQ[0].bBG = f5 / 57.295776f;
        this.bCQ[0].bBF = f6 / 57.295776f;
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        net.minecraft.entity.boss.d d2 = (net.minecraft.entity.boss.d)r2;
        for (int i2 = 1; i2 < 3; ++i2) {
            this.bCQ[i2].bBG = (d2.eW(i2 - 1) - r2.cuF) / 57.295776f;
            this.bCQ[i2].bBF = d2.eX(i2 - 1) / 57.295776f;
        }
    }
}

