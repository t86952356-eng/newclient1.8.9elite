/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class bh
extends ae {
    float bHc;

    protected bh(w w2, double d2, double d3, double d4, float f2, float f3, float f4) {
        this(w2, d2, d3, d4, 1.0f, f2, f3, f4);
    }

    protected bh(w w2, double d2, double d3, double d4, float f2, float f3, float f4, float f5) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.ud *= (double)0.1f;
        this.ue *= (double)0.1f;
        this.uf *= (double)0.1f;
        if (f3 == 0.0f) {
            f3 = 1.0f;
        }
        float f6 = (float)Math.random() * 0.4f + 0.6f;
        this.bGg = ((float)(Math.random() * (double)0.2f) + 0.8f) * f3 * f6;
        this.bGh = ((float)(Math.random() * (double)0.2f) + 0.8f) * f4 * f6;
        this.bGi = ((float)(Math.random() * (double)0.2f) + 0.8f) * f5 * f6;
        this.bGe *= 0.75f;
        this.bGe *= f2;
        this.bHc = this.bGe;
        this.bGd = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.bGd = (int)((float)this.bGd * f2);
        this.csp = false;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd * 32.0f;
        f8 = bt.I(f8, 0.0f, 1.0f);
        this.bGe = this.bHc * f8;
        super.a(worldRenderer, c2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        if (this.bGc++ >= this.bGd) {
            this.Tt();
        }
        this.ct(7 - this.bGc * 8 / this.bGd);
        this.y(this.ud, this.ue, this.uf);
        if (this.gX == this.crG) {
            this.ud *= 1.1;
            this.uf *= 1.1;
        }
        this.ud *= (double)0.96f;
        this.ue *= (double)0.96f;
        this.uf *= (double)0.96f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }
}

