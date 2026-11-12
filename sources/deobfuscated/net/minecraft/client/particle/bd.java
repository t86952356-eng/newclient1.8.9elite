/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.world.w;

public class bd
extends ae {
    private final float bGY;
    private final double bGZ;
    private final double bHa;
    private final double bHb;

    protected bd(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.ud = d5;
        this.ue = d6;
        this.uf = d7;
        this.bGZ = this.gW = d2;
        this.bHa = this.gX = d3;
        this.bHb = this.gY = d4;
        float f2 = this.ta.nextFloat() * 0.6f + 0.4f;
        this.bGY = this.bGe = this.ta.nextFloat() * 0.2f + 0.5f;
        this.bGh = this.bGi = 1.0f * f2;
        this.bGg = this.bGi;
        this.bGh *= 0.3f;
        this.bGg *= 0.9f;
        this.bGd = (int)(Math.random() * 10.0) + 40;
        this.csp = true;
        this.ct((int)(Math.random() * 8.0));
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd;
        f8 = 1.0f - f8;
        f8 *= f8;
        f8 = 1.0f - f8;
        this.bGe = this.bGY * f8;
        super.a(worldRenderer, c2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public int af(float f2) {
        int n2 = super.af(f2);
        float f3 = (float)this.bGc / (float)this.bGd;
        f3 *= f3;
        f3 *= f3;
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n4 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n4 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public float ag(float f2) {
        float f3 = super.ag(f2);
        float f4 = (float)this.bGc / (float)this.bGd;
        f4 = f4 * f4 * f4 * f4;
        return f3 * (1.0f - f4) + f4;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        float f2 = (float)this.bGc / (float)this.bGd;
        f2 = -f2 + f2 * f2 * 2.0f;
        f2 = 1.0f - f2;
        this.gW = this.bGZ + this.ud * (double)f2;
        this.gX = this.bHa + this.ue * (double)f2 + (double)(1.0f - f2);
        this.gY = this.bHb + this.uf * (double)f2;
        if (this.bGc++ >= this.bGd) {
            this.Tt();
        }
    }
}

