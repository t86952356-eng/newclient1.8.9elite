/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class aq
extends ae {
    float bGE;

    protected aq(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(w2, d2, d3, d4, d5, d6, d7, 2.0f);
    }

    protected aq(w w2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.ud *= (double)0.01f;
        this.ue *= (double)0.01f;
        this.uf *= (double)0.01f;
        this.ue += 0.1;
        this.bGe *= 0.75f;
        this.bGe *= f2;
        this.bGE = this.bGe;
        this.bGd = 16;
        this.csp = false;
        this.ct(80);
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd * 32.0f;
        f8 = bt.I(f8, 0.0f, 1.0f);
        this.bGe = this.bGE * f8;
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
        if (this.gX == this.crG) {
            this.ud *= 1.1;
            this.uf *= 1.1;
        }
        this.ud *= (double)0.86f;
        this.ue *= (double)0.86f;
        this.uf *= (double)0.86f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }
}

