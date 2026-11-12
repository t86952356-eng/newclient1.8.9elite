/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class q
extends d {
    private static final int[][] bzI = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
    private static final int[][] bzJ = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
    private static final int bzK = bzI.length;
    private final ag[] bzL = new ag[bzK];

    public q() {
        float f2 = -3.5f;
        for (int i2 = 0; i2 < this.bzL.length; ++i2) {
            this.bzL[i2] = new ag(this, bzJ[i2][0], bzJ[i2][1]);
            this.bzL[i2].a((float)bzI[i2][0] * -0.5f, 0.0f, (float)bzI[i2][2] * -0.5f, bzI[i2][0], bzI[i2][1], bzI[i2][2]);
            this.bzL[i2].g(0.0f, 24 - bzI[i2][1], f2);
            if (i2 >= this.bzL.length - 1) continue;
            f2 += (float)(bzI[i2][2] + bzI[i2 + 1][2]) * 0.5f;
        }
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        for (int i2 = 0; i2 < this.bzL.length; ++i2) {
            this.bzL[i2].aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        for (int i2 = 0; i2 < this.bzL.length; ++i2) {
            this.bzL[i2].bBG = bt.bB(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + Math.abs(i2 - 2));
            this.bzL[i2].bBC = bt.bx(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)Math.abs(i2 - 2);
        }
    }
}

