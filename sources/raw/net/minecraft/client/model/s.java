/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import java.util.Random;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class s
extends d {
    ag bzh;
    ag[] bzO = new ag[9];

    public s() {
        int n2 = -16;
        this.bzh = new ag(this, 0, 0);
        this.bzh.a(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.bzh.bBD += 8.0f;
        Random random = new Random(1660L);
        for (int i2 = 0; i2 < this.bzO.length; ++i2) {
            this.bzO[i2] = new ag(this, 0, 0);
            float f2 = (((float)(i2 % 3) - (float)(i2 / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f3 = ((float)(i2 / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n3 = random.nextInt(7) + 8;
            this.bzO[i2].a(-1.0f, 0.0f, -1.0f, 2, n3, 2);
            this.bzO[i2].bBC = f2;
            this.bzO[i2].bBE = f3;
            this.bzO[i2].bBD = 15.0f;
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        for (int i2 = 0; i2 < this.bzO.length; ++i2) {
            this.bzO[i2].bBF = 0.2f * bt.bx(f4 * 0.3f + (float)i2) + 0.4f;
        }
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        GlStateManager.JV();
        GlStateManager.j(0.0f, 0.6f, 0.0f);
        this.bzh.aa(f7);
        for (ag ag2 : this.bzO) {
            ag2.aa(f7);
        }
        GlStateManager.JW();
    }
}

