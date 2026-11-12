/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;

public class aq
extends d {
    ag bCE;
    ag[] bCF = new ag[8];

    public aq() {
        int n2 = -16;
        this.bCE = new ag(this, 0, 0);
        this.bCE.a(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        this.bCE.bBD += 8.0f;
        for (int i2 = 0; i2 < this.bCF.length; ++i2) {
            this.bCF[i2] = new ag(this, 48, 0);
            double d2 = (double)i2 * Math.PI * 2.0 / (double)this.bCF.length;
            float f2 = (float)Math.cos(d2) * 5.0f;
            float f3 = (float)Math.sin(d2) * 5.0f;
            this.bCF[i2].a(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.bCF[i2].bBC = f2;
            this.bCF[i2].bBE = f3;
            this.bCF[i2].bBD = 15.0f;
            d2 = (double)i2 * Math.PI * -2.0 / (double)this.bCF.length + 1.5707963267948966;
            this.bCF[i2].bBG = (float)d2;
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        for (ag ag2 : this.bCF) {
            ag2.bBF = f4;
        }
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCE.aa(f7);
        for (int i2 = 0; i2 < this.bCF.length; ++i2) {
            this.bCF[i2].aa(f7);
        }
    }
}

