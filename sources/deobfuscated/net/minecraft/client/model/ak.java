/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class ak
extends d {
    private final ag[] bCg = new ag[7];
    private final ag[] bCh;
    private final float[] bCi = new float[7];
    private static final int[][] bCj = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] bCk = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public ak() {
        float f2 = -3.5f;
        for (int i2 = 0; i2 < this.bCg.length; ++i2) {
            this.bCg[i2] = new ag(this, bCk[i2][0], bCk[i2][1]);
            this.bCg[i2].a((float)bCj[i2][0] * -0.5f, 0.0f, (float)bCj[i2][2] * -0.5f, bCj[i2][0], bCj[i2][1], bCj[i2][2]);
            this.bCg[i2].g(0.0f, 24 - bCj[i2][1], f2);
            this.bCi[i2] = f2;
            if (i2 >= this.bCg.length - 1) continue;
            f2 += (float)(bCj[i2][2] + bCj[i2 + 1][2]) * 0.5f;
        }
        this.bCh = new ag[3];
        this.bCh[0] = new ag(this, 20, 0);
        this.bCh[0].a(-5.0f, 0.0f, (float)bCj[2][2] * -0.5f, 10, 8, bCj[2][2]);
        this.bCh[0].g(0.0f, 16.0f, this.bCi[2]);
        this.bCh[1] = new ag(this, 20, 11);
        this.bCh[1].a(-3.0f, 0.0f, (float)bCj[4][2] * -0.5f, 6, 4, bCj[4][2]);
        this.bCh[1].g(0.0f, 20.0f, this.bCi[4]);
        this.bCh[2] = new ag(this, 20, 18);
        this.bCh[2].a(-3.0f, 0.0f, (float)bCj[4][2] * -0.5f, 6, 5, bCj[1][2]);
        this.bCh[2].g(0.0f, 19.0f, this.bCi[1]);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n2;
        this.a(f2, f3, f4, f5, f6, f7, c2);
        for (n2 = 0; n2 < this.bCg.length; ++n2) {
            this.bCg[n2].aa(f7);
        }
        for (n2 = 0; n2 < this.bCh.length; ++n2) {
            this.bCh[n2].aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        for (int i2 = 0; i2 < this.bCg.length; ++i2) {
            this.bCg[i2].bBG = bt.bB(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs(i2 - 2));
            this.bCg[i2].bBC = bt.bx(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs(i2 - 2);
        }
        this.bCh[0].bBG = this.bCg[2].bBG;
        this.bCh[1].bBG = this.bCg[4].bBG;
        this.bCh[1].bBC = this.bCg[4].bBC;
        this.bCh[2].bBG = this.bCg[1].bBG;
        this.bCh[2].bBC = this.bCg[1].bBC;
    }
}

