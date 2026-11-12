/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.entity.projectile.a;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import org.lwjgl.opengl.GL11;

public class RenderArrow
extends Render<a> {
    private static final cm bUq = new cm("textures/entity/arrow.png");

    public RenderArrow(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    public void a(a a2, double d2, double d3, double d4, float f2, float f3) {
        this.N(a2);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        GlStateManager.d(a2.crM + (a2.pl - a2.crM) * f3 - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(a2.crO + (a2.pm - a2.crO) * f3, 0.0f, 0.0f, 1.0f);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        boolean bl2 = false;
        float f4 = 0.0f;
        float f5 = 0.5f;
        float f6 = 0.0f;
        float f7 = 0.15625f;
        float f8 = 0.0f;
        float f9 = 0.15625f;
        float f10 = 0.15625f;
        float f11 = 0.3125f;
        float f12 = 0.05625f;
        GlStateManager.JS();
        float f13 = (float)a2.cJX - f3;
        if (f13 > 0.0f) {
            float f14 = -bt.bx(f13 * 3.0f) * f13;
            GlStateManager.d(f14, 0.0f, 0.0f, 1.0f);
        }
        GlStateManager.d(45.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.i(0.05625f, 0.05625f, 0.05625f);
        GlStateManager.j(-4.0f, 0.0f, 0.0f);
        GL11.glNormal3f((float)0.05625f, (float)0.0f, (float)0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(-7.0, -2.0, -2.0).r(0.0, 0.15625).Lx();
        worldRenderer.F(-7.0, -2.0, 2.0).r(0.15625, 0.15625).Lx();
        worldRenderer.F(-7.0, 2.0, 2.0).r(0.15625, 0.3125).Lx();
        worldRenderer.F(-7.0, 2.0, -2.0).r(0.0, 0.3125).Lx();
        tessellator.pZ();
        GL11.glNormal3f((float)-0.05625f, (float)0.0f, (float)0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(-7.0, 2.0, -2.0).r(0.0, 0.15625).Lx();
        worldRenderer.F(-7.0, 2.0, 2.0).r(0.15625, 0.15625).Lx();
        worldRenderer.F(-7.0, -2.0, 2.0).r(0.15625, 0.3125).Lx();
        worldRenderer.F(-7.0, -2.0, -2.0).r(0.0, 0.3125).Lx();
        tessellator.pZ();
        for (int i2 = 0; i2 < 4; ++i2) {
            GlStateManager.d(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)0.05625f);
            worldRenderer.a(7, DefaultVertexFormats.cbG);
            worldRenderer.F(-8.0, -2.0, 0.0).r(0.0, 0.0).Lx();
            worldRenderer.F(8.0, -2.0, 0.0).r(0.5, 0.0).Lx();
            worldRenderer.F(8.0, 2.0, 0.0).r(0.5, 0.15625).Lx();
            worldRenderer.F(-8.0, 2.0, 0.0).r(0.0, 0.15625).Lx();
            tessellator.pZ();
        }
        GlStateManager.JT();
        GlStateManager.JW();
        super.a(a2, d2, d3, d4, f2, f3);
    }

    protected cm a(a a2) {
        return bUq;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((a)c2);
    }
}

