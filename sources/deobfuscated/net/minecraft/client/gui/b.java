/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.cm;

public class b {
    public static final cm optionsBackground = new cm("textures/gui/options_background.png");
    public static final cm statIcons = new cm("textures/gui/container/stats_icons.png");
    public static final cm icons = new cm("textures/gui/icons.png");
    public static float zLevel;

    protected void drawHorizontalLine(int n2, int n3, int n4, int n5) {
        if (n3 < n2) {
            int n6 = n2;
            n2 = n3;
            n3 = n6;
        }
        b.drawRect(n2, n4, n3 + 1, n4 + 1, n5);
    }

    protected void drawVerticalLine(int n2, int n3, int n4, int n5) {
        if (n4 < n3) {
            int n6 = n3;
            n3 = n4;
            n4 = n6;
        }
        b.drawRect(n2, n3 + 1, n2 + 1, n4, n5);
    }

    public static void drawRect(double d2, double d3, double d4, double d5, int n2) {
        double d6;
        if (d2 < d4) {
            d6 = d2;
            d2 = d4;
            d4 = d6;
        }
        if (d3 < d5) {
            d6 = d3;
            d3 = d5;
            d5 = d6;
        }
        float f2 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n2 & 0xFF) / 255.0f;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.e(f3, f4, f5, f2);
        worldRenderer.a(7, DefaultVertexFormats.cbE);
        worldRenderer.F(d2, d5, 0.0).Lx();
        worldRenderer.F(d4, d5, 0.0).Lx();
        worldRenderer.F(d4, d3, 0.0).Lx();
        worldRenderer.F(d2, d3, 0.0).Lx();
        tessellator.pZ();
        GlStateManager.JN();
        GlStateManager.tR();
    }

    public static void drawRect(int n2, int n3, int n4, int n5, int n6) {
        b.drawRect((float)n2, (float)n3, (float)n4, (float)n5, n6);
    }

    public static void drawRect(float f2, float f3, float f4, float f5, int n2) {
        float f6;
        if (f2 < f4) {
            f6 = f2;
            f2 = f4;
            f4 = f6;
        }
        if (f3 < f5) {
            f6 = f3;
            f3 = f5;
            f5 = f6;
        }
        f6 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f7 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n2 & 0xFF) / 255.0f;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.e(f7, f8, f9, f6);
        worldRenderer.a(7, DefaultVertexFormats.cbE);
        worldRenderer.F(f2, f5, 0.0).Lx();
        worldRenderer.F(f4, f5, 0.0).Lx();
        worldRenderer.F(f4, f3, 0.0).Lx();
        worldRenderer.F(f2, f3, 0.0).Lx();
        tessellator.pZ();
        GlStateManager.JN();
        GlStateManager.tR();
    }

    protected void drawGradientRect(int n2, int n3, int n4, int n5, int n6, int n7) {
        float f2 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n6 & 0xFF) / 255.0f;
        float f6 = (float)(n7 >> 24 & 0xFF) / 255.0f;
        float f7 = (float)(n7 >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n7 >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n7 & 0xFF) / 255.0f;
        GlStateManager.JO();
        GlStateManager.tQ();
        GlStateManager.Jy();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.cP(7425);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbF);
        worldRenderer.F(n4, n3, zLevel).g(f3, f4, f5, f2).Lx();
        worldRenderer.F(n2, n3, zLevel).g(f3, f4, f5, f2).Lx();
        worldRenderer.F(n2, n5, zLevel).g(f7, f8, f9, f6).Lx();
        worldRenderer.F(n4, n5, zLevel).g(f7, f8, f9, f6).Lx();
        tessellator.pZ();
        GlStateManager.cP(7424);
        GlStateManager.tR();
        GlStateManager.tL();
        GlStateManager.JN();
    }

    public void drawCenteredString(agg agg2, String string, int n2, int n3, int n4) {
        agg2.b(string, n2 - agg2.bQ(string) / 2, n3, n4);
    }

    public void drawString(agg agg2, String string, int n2, int n3, int n4) {
        agg2.b(string, n2, n3, n4);
    }

    public void drawTexturedModalRect(float f2, int n2, int n3, int n4, int n5, int n6) {
        float f3 = 0.00390625f;
        float f4 = 0.00390625f;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(f2 + 0.0f, n2 + n6, zLevel).r((float)n3 * 0.00390625f, (float)(n4 + n6) * 0.00390625f).Lx();
        worldRenderer.F(f2 + (float)n5, n2 + n6, zLevel).r((float)(n3 + n5) * 0.00390625f, (float)(n4 + n6) * 0.00390625f).Lx();
        worldRenderer.F(f2 + (float)n5, n2, zLevel).r((float)(n3 + n5) * 0.00390625f, (float)n4 * 0.00390625f).Lx();
        worldRenderer.F(f2 + 0.0f, n2, zLevel).r((float)n3 * 0.00390625f, (float)n4 * 0.00390625f).Lx();
        tessellator.pZ();
    }

    public void drawTexturedModalRect(float f2, float f3, int n2, int n3, int n4, int n5) {
        float f4 = 0.00390625f;
        float f5 = 0.00390625f;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(f2 + 0.0f, f3 + (float)n5, zLevel).r((float)n2 * 0.00390625f, (float)(n3 + n5) * 0.00390625f).Lx();
        worldRenderer.F(f2 + (float)n4, f3 + (float)n5, zLevel).r((float)(n2 + n4) * 0.00390625f, (float)(n3 + n5) * 0.00390625f).Lx();
        worldRenderer.F(f2 + (float)n4, f3 + 0.0f, zLevel).r((float)(n2 + n4) * 0.00390625f, (float)n3 * 0.00390625f).Lx();
        worldRenderer.F(f2 + 0.0f, f3 + 0.0f, zLevel).r((float)n2 * 0.00390625f, (float)n3 * 0.00390625f).Lx();
        tessellator.pZ();
    }

    public void drawTexturedModalRect(int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4, int n5) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(n2, n3 + n5, zLevel).r(textureAtlasSprite.NY(), textureAtlasSprite.Ob()).Lx();
        worldRenderer.F(n2 + n4, n3 + n5, zLevel).r(textureAtlasSprite.NZ(), textureAtlasSprite.Ob()).Lx();
        worldRenderer.F(n2 + n4, n3, zLevel).r(textureAtlasSprite.NZ(), textureAtlasSprite.Oa()).Lx();
        worldRenderer.F(n2, n3, zLevel).r(textureAtlasSprite.NY(), textureAtlasSprite.Oa()).Lx();
        tessellator.pZ();
    }

    public static void drawModalRectWithCustomSizedTexture(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = 1.0f / f8;
        float f11 = 1.0f / f9;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(f2, f3 + f7, 0.0).r(f4 * f10, (f5 + f7) * f11).Lx();
        worldRenderer.F(f2 + f6, f3 + f7, 0.0).r((f4 + f6) * f10, (f5 + f7) * f11).Lx();
        worldRenderer.F(f2 + f6, f3, 0.0).r((f4 + f6) * f10, f5 * f11).Lx();
        worldRenderer.F(f2, f3, 0.0).r(f4 * f10, f5 * f11).Lx();
        tessellator.pZ();
    }

    public static void drawScaledCustomSizeModalRect(double d2, double d3, float f2, float f3, float f4, float f5, double d4, double d5, float f6, float f7) {
        float f8 = 1.0f / f6;
        float f9 = 1.0f / f7;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(d2, d3 + d5, 0.0).r(f2 * f8, (f3 + f5) * f9).Lx();
        worldRenderer.F(d2 + d4, d3 + d5, 0.0).r((f2 + f4) * f8, (f3 + f5) * f9).Lx();
        worldRenderer.F(d2 + d4, d3, 0.0).r((f2 + f4) * f8, f3 * f9).Lx();
        worldRenderer.F(d2, d3, 0.0).r(f2 * f8, f3 * f9).Lx();
        tessellator.pZ();
    }
}

