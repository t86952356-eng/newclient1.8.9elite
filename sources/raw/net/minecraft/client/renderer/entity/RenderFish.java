/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.util.da;

public class RenderFish
extends Render<net.minecraft.entity.projectile.d> {
    private static final cm bUR = new cm("textures/particle/particles.png");

    public RenderFish(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    public void a(net.minecraft.entity.projectile.d d2, double d3, double d4, double d5, float f2, float f3) {
        GlStateManager.JV();
        GlStateManager.j((float)d3, (float)d4, (float)d5);
        GlStateManager.JS();
        GlStateManager.i(0.5f, 0.5f, 0.5f);
        this.N(d2);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        boolean bl2 = true;
        int n2 = 2;
        float f4 = 0.0625f;
        float f5 = 0.125f;
        float f6 = 0.125f;
        float f7 = 0.1875f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.5f;
        GlStateManager.d(180.0f - this.bUl.bVE, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(-this.bUl.bVF, 1.0f, 0.0f, 0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbJ);
        worldRenderer.F(-0.5, -0.5, 0.0).r(0.0625, 0.1875).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(0.5, -0.5, 0.0).r(0.125, 0.1875).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(0.5, 0.5, 0.0).r(0.125, 0.125).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(-0.5, 0.5, 0.0).r(0.0625, 0.125).n(0.0f, 1.0f, 0.0f).Lx();
        tessellator.pZ();
        GlStateManager.JT();
        GlStateManager.JW();
        if (d2.cKm != null) {
            float f11 = d2.cKm.ba(f3);
            float f12 = bt.bx(bt.bK(f11) * (float)Math.PI);
            da da2 = new da(-0.36, 0.03, 0.35);
            da2 = da2.bO(-(d2.cKm.crO + (d2.cKm.pm - d2.cKm.crO) * f3) * (float)Math.PI / 180.0f);
            da2 = da2.bP(-(d2.cKm.crM + (d2.cKm.pl - d2.cKm.crM) * f3) * (float)Math.PI / 180.0f);
            da2 = da2.bP(f12 * 0.5f);
            da2 = da2.bO(-f12 * 0.7f);
            double d6 = d2.cKm.crF + (d2.cKm.gW - d2.cKm.crF) * (double)f3 + da2.dAG;
            double d7 = d2.cKm.crG + (d2.cKm.gX - d2.cKm.crG) * (double)f3 + da2.dAH;
            double d8 = d2.cKm.crH + (d2.cKm.gY - d2.cKm.crH) * (double)f3 + da2.dAI;
            double d9 = d2.cKm.getEyeHeight();
            if (this.bUl.bjA != null && this.bUl.bjA.chP > 0 || d2.cKm != d.AZ().bgK) {
                float f13 = (d2.cKm.cuG + (d2.cKm.cuF - d2.cKm.cuG) * f3) * (float)Math.PI / 180.0f;
                double d10 = bt.bx(f13);
                double d11 = bt.bB(f13);
                double d12 = 0.35;
                double d13 = 0.8;
                d6 = d2.cKm.crF + (d2.cKm.gW - d2.cKm.crF) * (double)f3 - d11 * 0.35 - d10 * 0.8;
                d7 = d2.cKm.crG + d9 + (d2.cKm.gX - d2.cKm.crG) * (double)f3 - 0.45;
                d8 = d2.cKm.crH + (d2.cKm.gY - d2.cKm.crH) * (double)f3 - d10 * 0.35 + d11 * 0.8;
                d9 = d2.cKm.isSneaking() ? -0.1875 : 0.0;
            }
            double d14 = d2.crF + (d2.gW - d2.crF) * (double)f3;
            double d15 = d2.crG + (d2.gX - d2.crG) * (double)f3 + 0.25;
            double d16 = d2.crH + (d2.gY - d2.crH) * (double)f3;
            double d17 = (float)(d6 - d14);
            double d18 = (double)((float)(d7 - d15)) + d9;
            double d19 = (float)(d8 - d16);
            GlStateManager.JO();
            GlStateManager.JA();
            worldRenderer.a(3, DefaultVertexFormats.cbF);
            int n3 = 16;
            for (int i2 = 0; i2 <= 16; ++i2) {
                float f14 = (float)i2 / 16.0f;
                worldRenderer.F(d3 + d17 * (double)f14, d4 + d18 * (double)(f14 * f14 + f14) * 0.5 + 0.25, d5 + d19 * (double)f14).s(0, 0, 0, 255).Lx();
            }
            tessellator.pZ();
            GlStateManager.Jz();
            GlStateManager.JN();
            super.a(d2, d3, d4, d5, f2, f3);
        }
    }

    protected cm a(net.minecraft.entity.projectile.d d2) {
        return bUR;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.projectile.d)c2);
    }
}

