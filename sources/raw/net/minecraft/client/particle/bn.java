/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import java.util.Random;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class bn
extends ae {
    private static final Random bHf = new Random();
    private int bHg = 128;

    protected bn(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, 0.5 - bHf.nextDouble(), d6, 0.5 - bHf.nextDouble());
        this.ue *= (double)0.2f;
        if (d5 == 0.0 && d7 == 0.0) {
            this.ud *= (double)0.1f;
            this.uf *= (double)0.1f;
        }
        this.bGe *= 0.75f;
        this.bGd = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.csp = false;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd * 32.0f;
        f8 = bt.I(f8, 0.0f, 1.0f);
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
        this.ct(this.bHg + (7 - this.bGc * 8 / this.bGd));
        this.ue += 0.004;
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

    public void cw(int n2) {
        this.bHg = n2;
    }
}

