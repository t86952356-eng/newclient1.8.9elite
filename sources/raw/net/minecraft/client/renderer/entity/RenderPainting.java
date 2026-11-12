/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.entity.item.t;
import net.minecraft.entity.item.u;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderPainting
extends Render<t> {
    private static final cm bVU = new cm("textures/painting/paintings_kristoffer_zetterstrand.png");

    public RenderPainting(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    public void a(t t2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        GlStateManager.C(d2, d3, d4);
        GlStateManager.d(180.0f - f2, 0.0f, 1.0f, 0.0f);
        GlStateManager.JS();
        this.N(t2);
        u u2 = t2.cDa;
        float f4 = 0.0625f;
        GlStateManager.i(0.0625f, 0.0625f, 0.0625f);
        this.a(t2, u2.cDD, u2.cDE, u2.cDF, u2.cDG);
        GlStateManager.JT();
        GlStateManager.JW();
        super.a(t2, d2, d3, d4, f2, f3);
    }

    protected cm a(t t2) {
        return bVU;
    }

    private void a(t t2, int n2, int n3, int n4, int n5) {
        float f2 = (float)(-n2) / 2.0f;
        float f3 = (float)(-n3) / 2.0f;
        float f4 = 0.5f;
        float f5 = 0.75f;
        float f6 = 0.8125f;
        float f7 = 0.0f;
        float f8 = 0.0625f;
        float f9 = 0.75f;
        float f10 = 0.8125f;
        float f11 = 0.001953125f;
        float f12 = 0.001953125f;
        float f13 = 0.7519531f;
        float f14 = 0.7519531f;
        float f15 = 0.0f;
        float f16 = 0.0625f;
        for (int i2 = 0; i2 < n2 / 16; ++i2) {
            for (int i3 = 0; i3 < n3 / 16; ++i3) {
                float f17 = f2 + (float)((i2 + 1) * 16);
                float f18 = f2 + (float)(i2 * 16);
                float f19 = f3 + (float)((i3 + 1) * 16);
                float f20 = f3 + (float)(i3 * 16);
                this.a(t2, (f17 + f18) / 2.0f, (f19 + f20) / 2.0f);
                float f21 = (float)(n4 + n2 - i2 * 16) / 256.0f;
                float f22 = (float)(n4 + n2 - (i2 + 1) * 16) / 256.0f;
                float f23 = (float)(n5 + n3 - i3 * 16) / 256.0f;
                float f24 = (float)(n5 + n3 - (i3 + 1) * 16) / 256.0f;
                Tessellator tessellator = Tessellator.Li();
                WorldRenderer worldRenderer = tessellator.Lj();
                worldRenderer.a(7, DefaultVertexFormats.cbJ);
                worldRenderer.F(f17, f20, -0.5).r(f22, f23).n(0.0f, 0.0f, -1.0f).Lx();
                worldRenderer.F(f18, f20, -0.5).r(f21, f23).n(0.0f, 0.0f, -1.0f).Lx();
                worldRenderer.F(f18, f19, -0.5).r(f21, f24).n(0.0f, 0.0f, -1.0f).Lx();
                worldRenderer.F(f17, f19, -0.5).r(f22, f24).n(0.0f, 0.0f, -1.0f).Lx();
                worldRenderer.F(f17, f19, 0.5).r(0.75, 0.0).n(0.0f, 0.0f, 1.0f).Lx();
                worldRenderer.F(f18, f19, 0.5).r(0.8125, 0.0).n(0.0f, 0.0f, 1.0f).Lx();
                worldRenderer.F(f18, f20, 0.5).r(0.8125, 0.0625).n(0.0f, 0.0f, 1.0f).Lx();
                worldRenderer.F(f17, f20, 0.5).r(0.75, 0.0625).n(0.0f, 0.0f, 1.0f).Lx();
                worldRenderer.F(f17, f19, -0.5).r(0.75, 0.001953125).n(0.0f, 1.0f, 0.0f).Lx();
                worldRenderer.F(f18, f19, -0.5).r(0.8125, 0.001953125).n(0.0f, 1.0f, 0.0f).Lx();
                worldRenderer.F(f18, f19, 0.5).r(0.8125, 0.001953125).n(0.0f, 1.0f, 0.0f).Lx();
                worldRenderer.F(f17, f19, 0.5).r(0.75, 0.001953125).n(0.0f, 1.0f, 0.0f).Lx();
                worldRenderer.F(f17, f20, 0.5).r(0.75, 0.001953125).n(0.0f, -1.0f, 0.0f).Lx();
                worldRenderer.F(f18, f20, 0.5).r(0.8125, 0.001953125).n(0.0f, -1.0f, 0.0f).Lx();
                worldRenderer.F(f18, f20, -0.5).r(0.8125, 0.001953125).n(0.0f, -1.0f, 0.0f).Lx();
                worldRenderer.F(f17, f20, -0.5).r(0.75, 0.001953125).n(0.0f, -1.0f, 0.0f).Lx();
                worldRenderer.F(f17, f19, 0.5).r(0.751953125, 0.0).n(-1.0f, 0.0f, 0.0f).Lx();
                worldRenderer.F(f17, f20, 0.5).r(0.751953125, 0.0625).n(-1.0f, 0.0f, 0.0f).Lx();
                worldRenderer.F(f17, f20, -0.5).r(0.751953125, 0.0625).n(-1.0f, 0.0f, 0.0f).Lx();
                worldRenderer.F(f17, f19, -0.5).r(0.751953125, 0.0).n(-1.0f, 0.0f, 0.0f).Lx();
                worldRenderer.F(f18, f19, -0.5).r(0.751953125, 0.0).n(1.0f, 0.0f, 0.0f).Lx();
                worldRenderer.F(f18, f20, -0.5).r(0.751953125, 0.0625).n(1.0f, 0.0f, 0.0f).Lx();
                worldRenderer.F(f18, f20, 0.5).r(0.751953125, 0.0625).n(1.0f, 0.0f, 0.0f).Lx();
                worldRenderer.F(f18, f19, 0.5).r(0.751953125, 0.0).n(1.0f, 0.0f, 0.0f).Lx();
                tessellator.pZ();
            }
        }
    }

    private void a(t t2, float f2, float f3) {
        int n2 = bt.aF(t2.gW);
        int n3 = bt.aF(t2.gX + (double)(f3 / 16.0f));
        int n4 = bt.aF(t2.gY);
        ao ao2 = t2.cty;
        if (ao2 == ao.dws) {
            n2 = bt.aF(t2.gW + (double)(f2 / 16.0f));
        }
        if (ao2 == ao.dwu) {
            n4 = bt.aF(t2.gY - (double)(f2 / 16.0f));
        }
        if (ao2 == ao.dwt) {
            n2 = bt.aF(t2.gW - (double)(f2 / 16.0f));
        }
        if (ao2 == ao.dwv) {
            n4 = bt.aF(t2.gY + (double)(f2 / 16.0f));
        }
        int n5 = this.bUl.baU.b(new b(n2, n3, n4), 0);
        int n6 = n5 % 65536;
        int n7 = n5 / 65536;
        OpenGlHelper.a(OpenGlHelper.bMJ, (float)n6, (float)n7);
        GlStateManager.k(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((t)c2);
    }
}

