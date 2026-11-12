/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class ax
extends ae {
    private final float bGN;

    protected ax(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.ud *= (double)0.8f;
        this.ue *= (double)0.8f;
        this.uf *= (double)0.8f;
        this.ue = this.ta.nextFloat() * 0.4f + 0.05f;
        this.bGi = 1.0f;
        this.bGh = 1.0f;
        this.bGg = 1.0f;
        this.bGe *= this.ta.nextFloat() * 2.0f + 0.2f;
        this.bGN = this.bGe;
        this.bGd = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.csp = false;
        this.ct(49);
    }

    @Override
    public int af(float f2) {
        float f3 = ((float)this.bGc + f2) / (float)this.bGd;
        f3 = bt.I(f3, 0.0f, 1.0f);
        int n2 = super.af(f2);
        int n3 = 240;
        int n4 = n2 >> 16 & 0xFF;
        return 0xF0 | n4 << 16;
    }

    @Override
    public float ag(float f2) {
        return 1.0f;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bGc + f2) / (float)this.bGd;
        this.bGe = this.bGN * (1.0f - f8 * f8);
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
        float f2 = (float)this.bGc / (float)this.bGd;
        if (this.ta.nextFloat() > f2) {
            this.baU.a(as.dxh, this.gW, this.gX, this.gY, this.ud, this.ue, this.uf, new int[0]);
        }
        this.ue -= 0.03;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.999f;
        this.ue *= (double)0.999f;
        this.uf *= (double)0.999f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }
}

