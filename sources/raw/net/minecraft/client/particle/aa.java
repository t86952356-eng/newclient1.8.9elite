/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.world.w;

public class aa
extends ae {
    private final float bFU;
    private final double bFV;
    private final double bFW;
    private final double bFX;

    protected aa(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.ud = d5;
        this.ue = d6;
        this.uf = d7;
        this.bFV = d2;
        this.bFW = d3;
        this.bFX = d4;
        this.gW = this.crF = d2 + d5;
        this.gX = this.crG = d3 + d6;
        this.gY = this.crH = d4 + d7;
        float f2 = this.ta.nextFloat() * 0.6f + 0.4f;
        this.bFU = this.bGe = this.ta.nextFloat() * 0.5f + 0.2f;
        this.bGh = this.bGi = 1.0f * f2;
        this.bGg = this.bGi;
        this.bGh *= 0.9f;
        this.bGg *= 0.9f;
        this.bGd = (int)(Math.random() * 10.0) + 30;
        this.csp = true;
        this.ct((int)(Math.random() * 26.0 + 1.0 + 224.0));
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
        f4 *= f4;
        f4 *= f4;
        return f3 * (1.0f - f4) + f4;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        float f2 = (float)this.bGc / (float)this.bGd;
        f2 = 1.0f - f2;
        float f3 = 1.0f - f2;
        f3 *= f3;
        f3 *= f3;
        this.gW = this.bFV + this.ud * (double)f2;
        this.gX = this.bFW + this.ue * (double)f2 - (double)(f3 * 1.2f);
        this.gY = this.bFX + this.uf * (double)f2;
        if (this.bGc++ >= this.bGd) {
            this.Tt();
        }
    }
}

