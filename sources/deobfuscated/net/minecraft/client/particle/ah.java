/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class ah
extends ae {
    protected ah(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
        this.bGd = 4;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = 0.25f;
        float f9 = 0.5f;
        float f10 = 0.125f;
        float f11 = 0.375f;
        float f12 = 7.1f * bt.bx(((float)this.bGc + f2 - 1.0f) * 0.25f * (float)Math.PI);
        this.bGj = 0.6f - ((float)this.bGc + f2 - 1.0f) * 0.25f * 0.5f;
        float f13 = (float)(this.crF + (this.gW - this.crF) * (double)f2 - bGl);
        float f14 = (float)(this.crG + (this.gX - this.crG) * (double)f2 - bGm);
        float f15 = (float)(this.crH + (this.gY - this.crH) * (double)f2 - bGn);
        int n2 = this.af(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        worldRenderer.F(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12).r(0.5, 0.375).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
        worldRenderer.F(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12).r(0.5, 0.125).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12).r(0.25, 0.125).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12).r(0.25, 0.375).g(this.bGg, this.bGh, this.bGi, this.bGj).aa(n3, n4).Lx();
    }
}

