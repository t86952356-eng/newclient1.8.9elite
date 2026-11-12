/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.r;
import net.minecraft.util.bt;
import net.minecraft.util.da;

public class t
extends d {
    private final ag bzP;
    private final ag bzQ;
    private final ag[] bzR;
    private final ag[] bzS;

    public t() {
        this.bys = 64;
        this.byt = 64;
        this.bzR = new ag[12];
        this.bzP = new ag(this);
        this.bzP.C(0, 0).a(-6.0f, 10.0f, -8.0f, 12, 12, 16);
        this.bzP.C(0, 28).a(-8.0f, 10.0f, -6.0f, 2, 12, 12);
        this.bzP.C(0, 28).a(6.0f, 10.0f, -6.0f, 2, 12, 12, true);
        this.bzP.C(16, 40).a(-6.0f, 8.0f, -6.0f, 12, 2, 12);
        this.bzP.C(16, 40).a(-6.0f, 22.0f, -6.0f, 12, 2, 12);
        for (int i2 = 0; i2 < this.bzR.length; ++i2) {
            this.bzR[i2] = new ag(this, 0, 0);
            this.bzR[i2].a(-1.0f, -4.5f, -1.0f, 2, 9, 2);
            this.bzP.a(this.bzR[i2]);
        }
        this.bzQ = new ag(this, 8, 0);
        this.bzQ.a(-1.0f, 15.0f, 0.0f, 2, 2, 1);
        this.bzP.a(this.bzQ);
        this.bzS = new ag[3];
        this.bzS[0] = new ag(this, 40, 0);
        this.bzS[0].a(-2.0f, 14.0f, 7.0f, 4, 4, 8);
        this.bzS[1] = new ag(this, 0, 54);
        this.bzS[1].a(0.0f, 14.0f, 0.0f, 3, 3, 7);
        this.bzS[2] = new ag(this);
        this.bzS[2].C(41, 32).a(0.0f, 14.0f, 0.0f, 2, 2, 6);
        this.bzS[2].C(25, 19).a(1.0f, 10.5f, 3.0f, 1, 9, 9);
        this.bzP.a(this.bzS[0]);
        this.bzS[0].a(this.bzS[1]);
        this.bzS[1].a(this.bzS[2]);
    }

    public int Ha() {
        return 54;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bzP.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        r r2 = (r)c2;
        float f8 = f4 - (float)r2.aRg;
        this.bzP.bBG = f5 / 57.295776f;
        this.bzP.bBF = f6 / 57.295776f;
        float[] fArray = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
        float[] fArray2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArray3 = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
        float[] fArray4 = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
        float[] fArray5 = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
        float[] fArray6 = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
        float f9 = (1.0f - r2.bh(f8)) * 0.55f;
        for (int i2 = 0; i2 < 12; ++i2) {
            this.bzR[i2].bBF = (float)Math.PI * fArray[i2];
            this.bzR[i2].bBG = (float)Math.PI * fArray2[i2];
            this.bzR[i2].bBH = (float)Math.PI * fArray3[i2];
            this.bzR[i2].bBC = fArray4[i2] * (1.0f + bt.bB(f4 * 1.5f + (float)i2) * 0.01f - f9);
            this.bzR[i2].bBD = 16.0f + fArray5[i2] * (1.0f + bt.bB(f4 * 1.5f + (float)i2) * 0.01f - f9);
            this.bzR[i2].bBE = fArray6[i2] * (1.0f + bt.bB(f4 * 1.5f + (float)i2) * 0.01f - f9);
        }
        this.bzQ.bBE = -8.25f;
        c c3 = net.minecraft.client.d.AZ().BC();
        if (r2.Zq()) {
            c3 = r2.Zr();
        }
        if (c3 != null) {
            da da2 = c3.aQ(0.0f);
            da da3 = c2.aQ(0.0f);
            double d2 = da2.dAH - da3.dAH;
            this.bzQ.bBD = d2 > 0.0 ? 0.0f : 1.0f;
            da da4 = c2.O(0.0f);
            da4 = new da(da4.dAG, 0.0, da4.dAI);
            da da5 = new da(da3.dAG - da2.dAG, 0.0, da3.dAI - da2.dAI).atR().bP(1.5707964f);
            double d3 = da4.t(da5);
            this.bzQ.bBC = bt.bK((float)Math.abs(d3)) * 2.0f * (float)Math.signum(d3);
        }
        this.bzQ.bBL = true;
        float f10 = r2.bg(f8);
        this.bzS[0].bBG = bt.bx(f10) * (float)Math.PI * 0.05f;
        this.bzS[1].bBG = bt.bx(f10) * (float)Math.PI * 0.1f;
        this.bzS[1].bBC = -1.5f;
        this.bzS[1].bBD = 0.5f;
        this.bzS[1].bBE = 14.0f;
        this.bzS[2].bBG = bt.bx(f10) * (float)Math.PI * 0.15f;
        this.bzS[2].bBC = 0.5f;
        this.bzS[2].bBD = 0.5f;
        this.bzS[2].bBE = 6.0f;
    }
}

