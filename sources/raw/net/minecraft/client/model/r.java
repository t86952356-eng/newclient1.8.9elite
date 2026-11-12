/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.f;
import net.minecraft.entity.c;

public class r
extends f {
    public boolean bzM;
    public boolean bzN;

    public r(float f2) {
        super(0.0f, -14.0f, 64, 32);
        float f3 = -14.0f;
        this.byB = new ag(this, 0, 16);
        this.byB.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 - 0.5f);
        this.byB.g(0.0f, -14.0f, 0.0f);
        this.byC = new ag(this, 32, 16);
        this.byC.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.byC.g(0.0f, -14.0f, 0.0f);
        this.byD = new ag(this, 56, 0);
        this.byD.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.byD.g(-3.0f, -12.0f, 0.0f);
        this.byE = new ag(this, 56, 0);
        this.byE.bBK = true;
        this.byE.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.byE.g(5.0f, -12.0f, 0.0f);
        this.byF = new ag(this, 56, 0);
        this.byF.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.byF.g(-2.0f, -2.0f, 0.0f);
        this.byG = new ag(this, 56, 0);
        this.byG.bBK = true;
        this.byG.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.byG.g(2.0f, -2.0f, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.byA.bBL = true;
        float f8 = -14.0f;
        this.byC.bBF = 0.0f;
        this.byC.bBD = -14.0f;
        this.byC.bBE = -0.0f;
        this.byF.bBF -= 0.0f;
        this.byG.bBF -= 0.0f;
        this.byD.bBF = (float)((double)this.byD.bBF * 0.5);
        this.byE.bBF = (float)((double)this.byE.bBF * 0.5);
        this.byF.bBF = (float)((double)this.byF.bBF * 0.5);
        this.byG.bBF = (float)((double)this.byG.bBF * 0.5);
        float f9 = 0.4f;
        if (this.byD.bBF > 0.4f) {
            this.byD.bBF = 0.4f;
        }
        if (this.byE.bBF > 0.4f) {
            this.byE.bBF = 0.4f;
        }
        if (this.byD.bBF < -0.4f) {
            this.byD.bBF = -0.4f;
        }
        if (this.byE.bBF < -0.4f) {
            this.byE.bBF = -0.4f;
        }
        if (this.byF.bBF > 0.4f) {
            this.byF.bBF = 0.4f;
        }
        if (this.byG.bBF > 0.4f) {
            this.byG.bBF = 0.4f;
        }
        if (this.byF.bBF < -0.4f) {
            this.byF.bBF = -0.4f;
        }
        if (this.byG.bBF < -0.4f) {
            this.byG.bBF = -0.4f;
        }
        if (this.bzM) {
            this.byD.bBF = -0.5f;
            this.byE.bBF = -0.5f;
            this.byD.bBH = 0.05f;
            this.byE.bBH = -0.05f;
        }
        this.byD.bBE = 0.0f;
        this.byE.bBE = 0.0f;
        this.byF.bBE = 0.0f;
        this.byG.bBE = 0.0f;
        this.byF.bBD = -5.0f;
        this.byG.bBD = -5.0f;
        this.byA.bBE = -0.0f;
        this.byA.bBD = -13.0f;
        this.byB.bBC = this.byA.bBC;
        this.byB.bBD = this.byA.bBD;
        this.byB.bBE = this.byA.bBE;
        this.byB.bBF = this.byA.bBF;
        this.byB.bBG = this.byA.bBG;
        this.byB.bBH = this.byA.bBH;
        if (this.bzN) {
            float f10 = 1.0f;
            this.byA.bBD -= 5.0f;
        }
    }
}

