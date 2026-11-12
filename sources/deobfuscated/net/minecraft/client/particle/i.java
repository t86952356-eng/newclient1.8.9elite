/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.world.w;

public class i
extends ae {
    protected i(w w2, double d2, double d3, double d4, d d5) {
        this(w2, d2, d3, d4, d5, 0);
    }

    protected i(w w2, double d2, double d3, double d4, double d5, double d6, double d7, d d8, int n2) {
        this(w2, d2, d3, d4, d8, n2);
        this.ud *= (double)0.1f;
        this.ue *= (double)0.1f;
        this.uf *= (double)0.1f;
        this.ud += d5;
        this.ue += d6;
        this.uf += d7;
    }

    protected i(w w2, double d2, double d3, double d4, d d5, int n2) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.a(Minecraft.getMinecraft().BG().Ns().a(d5, n2));
        this.bGi = 1.0f;
        this.bGh = 1.0f;
        this.bGg = 1.0f;
        this.bGf = Blocks.cML.aSC;
        this.bGe /= 2.0f;
    }

    @Override
    public int Ir() {
        return 1;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bFY + this.bGa / 4.0f) / 16.0f;
        float f9 = f8 + 0.015609375f;
        float f10 = ((float)this.bFZ + this.bGb / 4.0f) / 16.0f;
        float f11 = f10 + 0.015609375f;
        float f12 = 0.1f * this.bGe;
        if (this.bGk != null) {
            f8 = this.bGk.al(this.bGa / 4.0f * 16.0f);
            f9 = this.bGk.al((this.bGa + 1.0f) / 4.0f * 16.0f);
            f10 = this.bGk.am(this.bGb / 4.0f * 16.0f);
            f11 = this.bGk.am((this.bGb + 1.0f) / 4.0f * 16.0f);
        }
        float f13 = (float)(this.crF + (this.gW - this.crF) * (double)f2 - bGl);
        float f14 = (float)(this.crG + (this.gX - this.crG) * (double)f2 - bGm);
        float f15 = (float)(this.crH + (this.gY - this.crH) * (double)f2 - bGn);
        int n2 = this.af(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        worldRenderer.F(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12).r(f8, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12).r(f8, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12).r(f9, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12).r(f9, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
    }
}

