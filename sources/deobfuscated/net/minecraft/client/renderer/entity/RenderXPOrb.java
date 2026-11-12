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
import net.minecraft.entity.item.w;
import net.minecraft.src.a;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.optifine.s;

public class RenderXPOrb
extends Render<w> {
    private static final cm bWC = new cm("textures/entity/experience_orb.png");

    public RenderXPOrb(RenderManager renderManager) {
        super(renderManager);
        this.bUm = 0.15f;
        this.bUn = 0.75f;
    }

    @Override
    public void a(w w2, double d2, double d3, double d4, float f2, float f3) {
        int n2;
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        this.N(w2);
        int n3 = w2.YY();
        float f4 = (float)(n3 % 4 * 16 + 0) / 64.0f;
        float f5 = (float)(n3 % 4 * 16 + 16) / 64.0f;
        float f6 = (float)(n3 / 4 * 16 + 0) / 64.0f;
        float f7 = (float)(n3 / 4 * 16 + 16) / 64.0f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        int n4 = w2.af(f3);
        int n5 = n4 % 65536;
        int n6 = n4 / 65536;
        OpenGlHelper.a(OpenGlHelper.bMJ, (float)n5 / 1.0f, (float)n6 / 1.0f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        float f11 = 255.0f;
        float f12 = ((float)w2.cDK + f3) / 2.0f;
        if (a.aow()) {
            f12 = s.cd(f12);
        }
        n6 = (int)((bt.bx(f12 + 0.0f) + 1.0f) * 0.5f * 255.0f);
        int n7 = 255;
        int n8 = (int)((bt.bx(f12 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        GlStateManager.d(180.0f - this.bUl.bVE, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(-this.bUl.bVF, 1.0f, 0.0f, 0.0f);
        float f13 = 0.3f;
        GlStateManager.i(0.3f, 0.3f, 0.3f);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbL);
        int n9 = n6;
        int n10 = 255;
        int n11 = n8;
        if (a.aow() && (n2 = s.ce(f12)) >= 0) {
            n9 = n2 >> 16 & 0xFF;
            n10 = n2 >> 8 & 0xFF;
            n11 = n2 >> 0 & 0xFF;
        }
        worldRenderer.F(-0.5, -0.25, 0.0).r(f4, f7).s(n9, n10, n11, 128).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(0.5, -0.25, 0.0).r(f5, f7).s(n9, n10, n11, 128).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(0.5, 0.75, 0.0).r(f5, f6).s(n9, n10, n11, 128).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(-0.5, 0.75, 0.0).r(f4, f6).s(n9, n10, n11, 128).n(0.0f, 1.0f, 0.0f).Lx();
        tessellator.pZ();
        GlStateManager.tR();
        GlStateManager.JT();
        GlStateManager.JW();
        super.a(w2, d2, d3, d4, f2, f3);
    }

    protected cm a(w w2) {
        return bWC;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((w)c2);
    }
}

