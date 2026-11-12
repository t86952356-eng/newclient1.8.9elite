/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.entity.r;

public class z
extends d {
    ag[] bAO = new ag[8];
    ag bAP;

    public z() {
        for (int i2 = 0; i2 < this.bAO.length; ++i2) {
            int n2 = 0;
            int n3 = i2;
            if (i2 == 2) {
                n2 = 24;
                n3 = 10;
            } else if (i2 == 3) {
                n2 = 24;
                n3 = 19;
            }
            this.bAO[i2] = new ag(this, n2, n3);
            this.bAO[i2].a(-4.0f, 16 + i2, -4.0f, 8, 1, 8);
        }
        this.bAP = new ag(this, 0, 16);
        this.bAP.a(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        net.minecraft.entity.monster.z z2 = (net.minecraft.entity.monster.z)r2;
        float f5 = z2.cEX + (z2.cEW - z2.cEX) * f4;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        for (int i2 = 0; i2 < this.bAO.length; ++i2) {
            this.bAO[i2].bBD = (float)(-(4 - i2)) * f5 * 1.7f;
        }
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bAP.aa(f7);
        for (int i2 = 0; i2 < this.bAO.length; ++i2) {
            this.bAO[i2].aa(f7);
        }
    }
}

