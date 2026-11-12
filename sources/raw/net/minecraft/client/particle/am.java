/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class am
extends ae {
    private final float bGz;

    protected am(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.ud = this.ud * (double)0.01f + d5;
        this.ue = this.ue * (double)0.01f + d6;
        this.uf = this.uf * (double)0.01f + d7;
        this.gW += (double)((this.ta.nextFloat() - this.ta.nextFloat()) * 0.05f);
        this.gX += (double)((this.ta.nextFloat() - this.ta.nextFloat()) * 0.05f);
        this.gY += (double)((this.ta.nextFloat() - this.ta.nextFloat()) * 0.05f);
        this.bGz = this.bGe;
        this.bGi = 1.0f;
        this.bGh = 1.0f;
        this.bGg = 1.0f;
        this.bGd = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.csp = true;
        this.ct(48);
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd;
        this.bGe = this.bGz * (1.0f - f8 * f8 * 0.5f);
        super.a(worldRenderer, c2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public int af(float f2) {
        float f3 = ((float)this.bGc + f2) / (float)this.bGd;
        f3 = bt.I(f3, 0.0f, 1.0f);
        int n2 = super.af(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public float ag(float f2) {
        float f3 = ((float)this.bGc + f2) / (float)this.bGd;
        f3 = bt.I(f3, 0.0f, 1.0f);
        float f4 = super.ag(f2);
        return f4 * f3 + (1.0f - f3);
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
        this.ud *= (double)0.96f;
        this.ue *= (double)0.96f;
        this.uf *= (double)0.96f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }
}

