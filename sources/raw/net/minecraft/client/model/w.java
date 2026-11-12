/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.entity.r;

public class w
extends d {
    public ag bAH;
    public ag bAI;
    public ag bAJ;
    public ag bAK;
    public ag bAL;
    public ag bAM;

    public w() {
        this(0.0f);
    }

    public w(float f2) {
        this(f2, -7.0f);
    }

    public w(float f2, float f3) {
        int n2 = 128;
        int n3 = 128;
        this.bAH = new ag(this).D(128, 128);
        this.bAH.g(0.0f, 0.0f + f3, -2.0f);
        this.bAH.C(0, 0).a(-4.0f, -12.0f, -5.5f, 8, 10, 8, f2);
        this.bAH.C(24, 0).a(-1.0f, -5.0f, -7.5f, 2, 4, 2, f2);
        this.bAI = new ag(this).D(128, 128);
        this.bAI.g(0.0f, 0.0f + f3, 0.0f);
        this.bAI.C(0, 40).a(-9.0f, -2.0f, -6.0f, 18, 12, 11, f2);
        this.bAI.C(0, 70).a(-4.5f, 10.0f, -3.0f, 9, 5, 6, f2 + 0.5f);
        this.bAJ = new ag(this).D(128, 128);
        this.bAJ.g(0.0f, -7.0f, 0.0f);
        this.bAJ.C(60, 21).a(-13.0f, -2.5f, -3.0f, 4, 30, 6, f2);
        this.bAK = new ag(this).D(128, 128);
        this.bAK.g(0.0f, -7.0f, 0.0f);
        this.bAK.C(60, 58).a(9.0f, -2.5f, -3.0f, 4, 30, 6, f2);
        this.bAL = new ag(this, 0, 22).D(128, 128);
        this.bAL.g(-4.0f, 18.0f + f3, 0.0f);
        this.bAL.C(37, 0).a(-3.5f, -3.0f, -3.0f, 6, 16, 5, f2);
        this.bAM = new ag(this, 0, 22).D(128, 128);
        this.bAM.bBK = true;
        this.bAM.C(60, 0).g(5.0f, 18.0f + f3, 0.0f);
        this.bAM.a(-3.5f, -3.0f, -3.0f, 6, 16, 5, f2);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bAH.aa(f7);
        this.bAI.aa(f7);
        this.bAL.aa(f7);
        this.bAM.aa(f7);
        this.bAJ.aa(f7);
        this.bAK.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        this.bAH.bBG = f5 / 57.295776f;
        this.bAH.bBF = f6 / 57.295776f;
        this.bAL.bBF = -1.5f * this.i(f2, 13.0f) * f3;
        this.bAM.bBF = 1.5f * this.i(f2, 13.0f) * f3;
        this.bAL.bBG = 0.0f;
        this.bAM.bBG = 0.0f;
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        net.minecraft.entity.monster.w w2 = (net.minecraft.entity.monster.w)r2;
        int n2 = w2.Zt();
        if (n2 > 0) {
            this.bAJ.bBF = -2.0f + 1.5f * this.i((float)n2 - f4, 10.0f);
            this.bAK.bBF = -2.0f + 1.5f * this.i((float)n2 - f4, 10.0f);
        } else {
            int n3 = w2.Zu();
            if (n3 > 0) {
                this.bAJ.bBF = -0.8f + 0.025f * this.i(n3, 70.0f);
                this.bAK.bBF = 0.0f;
            } else {
                this.bAJ.bBF = (-0.2f + 1.5f * this.i(f2, 13.0f)) * f3;
                this.bAK.bBF = (-0.2f - 1.5f * this.i(f2, 13.0f)) * f3;
            }
        }
    }

    private float i(float f2, float f3) {
        return (Math.abs(f2 % f3 - f3 * 0.5f) - f3 * 0.25f) / (f3 * 0.25f);
    }
}

