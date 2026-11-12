/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.world.w;

public class ak
extends ae {
    protected ak(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.ud *= (double)0.3f;
        this.ue = Math.random() * (double)0.2f + (double)0.1f;
        this.uf *= (double)0.3f;
        this.bGg = 1.0f;
        this.bGh = 1.0f;
        this.bGi = 1.0f;
        this.ct(19);
        this.o(0.01f, 0.01f);
        this.bGd = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.bGf = 0.0f;
        this.ud = d5;
        this.ue = d6;
        this.uf = d7;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.ue -= (double)this.bGf;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.98f;
        this.ue *= (double)0.98f;
        this.uf *= (double)0.98f;
        int n2 = 60 - this.bGd;
        float f2 = (float)n2 * 0.001f;
        this.o(f2, f2);
        this.ct(19 + n2 % 4);
        if (this.bGd-- <= 0) {
            this.Tt();
        }
    }
}

