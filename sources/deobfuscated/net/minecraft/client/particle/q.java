/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class q
extends ae {
    float bFP;

    protected q(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(w2, d2, d3, d4, d5, d6, d7, 1.0f);
    }

    protected q(w w2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.ud *= (double)0.1f;
        this.ue *= (double)0.1f;
        this.uf *= (double)0.1f;
        this.ud += d5 * 0.4;
        this.ue += d6 * 0.4;
        this.uf += d7 * 0.4;
        this.bGh = this.bGi = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.bGg = this.bGi;
        this.bGe *= 0.75f;
        this.bGe *= f2;
        this.bFP = this.bGe;
        this.bGd = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.bGd = (int)((float)this.bGd * f2);
        this.csp = false;
        this.ct(65);
        this.Dm();
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd * 32.0f;
        f8 = bt.I(f8, 0.0f, 1.0f);
        this.bGe = this.bFP * f8;
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
        this.y(this.ud, this.ue, this.uf);
        this.bGh = (float)((double)this.bGh * 0.96);
        this.bGi = (float)((double)this.bGi * 0.9);
        this.ud *= (double)0.7f;
        this.ue *= (double)0.7f;
        this.uf *= (double)0.7f;
        this.ue -= (double)0.02f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }
}

