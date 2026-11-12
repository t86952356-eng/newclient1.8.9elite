/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.item.d;
import net.minecraft.world.w;

public class a
extends ae {
    protected a(w w2, double d2, double d3, double d4, d d5) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.a(Minecraft.getMinecraft().BG().Ns().g(d5));
        this.bGi = 1.0f;
        this.bGh = 1.0f;
        this.bGg = 1.0f;
        this.uf = 0.0;
        this.ue = 0.0;
        this.ud = 0.0;
        this.bGf = 0.0f;
        this.bGd = 80;
    }

    @Override
    public int Ir() {
        return 1;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = this.bGk.NY();
        float f9 = this.bGk.NZ();
        float f10 = this.bGk.Oa();
        float f11 = this.bGk.Ob();
        float f12 = 0.5f;
        float f13 = (float)(this.crF + (this.gW - this.crF) * (double)f2 - bGl);
        float f14 = (float)(this.crG + (this.gX - this.crG) * (double)f2 - bGm);
        float f15 = (float)(this.crH + (this.gY - this.crH) * (double)f2 - bGn);
        int n2 = this.af(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        worldRenderer.F(f13 - f3 * 0.5f - f6 * 0.5f, f14 - f4 * 0.5f, f15 - f5 * 0.5f - f7 * 0.5f).r(f9, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 - f3 * 0.5f + f6 * 0.5f, f14 + f4 * 0.5f, f15 - f5 * 0.5f + f7 * 0.5f).r(f9, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * 0.5f + f6 * 0.5f, f14 + f4 * 0.5f, f15 + f5 * 0.5f + f7 * 0.5f).r(f8, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * 0.5f - f6 * 0.5f, f14 - f4 * 0.5f, f15 + f5 * 0.5f - f7 * 0.5f).r(f8, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
    }
}

