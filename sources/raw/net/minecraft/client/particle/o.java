/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class o
extends ae {
    float bFO;

    protected o(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f2 = 2.5f;
        this.ud *= (double)0.1f;
        this.ue *= (double)0.1f;
        this.uf *= (double)0.1f;
        this.ud += d5;
        this.ue += d6;
        this.uf += d7;
        this.bGh = this.bGi = 1.0f - (float)(Math.random() * (double)0.3f);
        this.bGg = this.bGi;
        this.bGe *= 0.75f;
        this.bGe *= 2.5f;
        this.bFO = this.bGe;
        this.bGd = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.bGd = (int)((float)this.bGd * 2.5f);
        this.csp = false;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd * 32.0f;
        f8 = bt.I(f8, 0.0f, 1.0f);
        this.bGe = this.bFO * f8;
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
        this.ud *= (double)0.96f;
        this.ue *= (double)0.96f;
        this.uf *= (double)0.96f;
        a a2 = this.baU.f(this, 2.0);
        if (a2 != null && this.gX > a2.Us().dtI) {
            this.gX += (a2.Us().dtI - this.gX) * 0.2;
            this.ue += (a2.ue - this.ue) * 0.2;
            this.setPosition(this.gW, this.gX, this.gY);
        }
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }
}

