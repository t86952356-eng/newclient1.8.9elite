/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.optifine.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.bt;
import org.lwjgl.opengl.GL11;

public class d {
    private ag egk = null;
    private int bBA = 0;
    private int bBB = 0;
    private float aIL = 0.0f;
    private float aIM = 0.0f;
    private float elu = 0.0f;
    private int cDD = 0;
    private int cDE = 0;
    private int elv = 0;
    private float elw = 0.0f;
    private float bYU = 0.0f;
    private float bYW = 0.0f;
    private float bYV = 0.0f;
    private float bYX = 0.0f;

    public d(ag ag2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5) {
        this.egk = ag2;
        this.bBA = n2;
        this.bBB = n3;
        this.aIL = f2;
        this.aIM = f3;
        this.elu = f4;
        this.cDD = n4;
        this.cDE = n5;
        this.elv = n6;
        this.elw = f5;
        this.bYU = (float)n2 / ag2.bBy;
        this.bYW = (float)n3 / ag2.bBz;
        this.bYV = (float)(n2 + n4) / ag2.bBy;
        this.bYX = (float)(n3 + n5) / ag2.bBz;
    }

    public void a(Tessellator tessellator, float f2) {
        GlStateManager.j(this.aIL * f2, this.aIM * f2, this.elu * f2);
        float f3 = this.bYU;
        float f4 = this.bYV;
        float f5 = this.bYW;
        float f6 = this.bYX;
        if (this.egk.bBK) {
            f3 = this.bYV;
            f4 = this.bYU;
        }
        if (this.egk.bBV) {
            f5 = this.bYX;
            f6 = this.bYW;
        }
        d.a(tessellator, f3, f5, f4, f6, this.cDD, this.cDE, f2 * (float)this.elv, this.egk.bBy, this.egk.bBz);
        GlStateManager.j(-this.aIL * f2, -this.aIM * f2, -this.elu * f2);
    }

    public static void a(Tessellator tessellator, float f2, float f3, float f4, float f5, int n2, int n3, float f6, float f7, float f8) {
        float f9;
        float f10;
        float f11;
        int n4;
        if (f6 < 6.25E-4f) {
            f6 = 6.25E-4f;
        }
        float f12 = f4 - f2;
        float f13 = f5 - f3;
        double d2 = bt.bz(f12) * (f7 / 16.0f);
        double d3 = bt.bz(f13) * (f8 / 16.0f);
        WorldRenderer worldRenderer = tessellator.Lj();
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(0.0, d3, 0.0).r(f2, f5).Lx();
        worldRenderer.F(d2, d3, 0.0).r(f4, f5).Lx();
        worldRenderer.F(d2, 0.0, 0.0).r(f4, f3).Lx();
        worldRenderer.F(0.0, 0.0, 0.0).r(f2, f3).Lx();
        tessellator.pZ();
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)1.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(0.0, 0.0, f6).r(f2, f3).Lx();
        worldRenderer.F(d2, 0.0, f6).r(f4, f3).Lx();
        worldRenderer.F(d2, d3, f6).r(f4, f5).Lx();
        worldRenderer.F(0.0, d3, f6).r(f2, f5).Lx();
        tessellator.pZ();
        float f14 = 0.5f * f12 / (float)n2;
        float f15 = 0.5f * f13 / (float)n3;
        GL11.glNormal3f((float)-1.0f, (float)0.0f, (float)0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        for (n4 = 0; n4 < n2; ++n4) {
            f11 = (float)n4 / (float)n2;
            f10 = f2 + f12 * f11 + f14;
            worldRenderer.F((double)f11 * d2, d3, f6).r(f10, f5).Lx();
            worldRenderer.F((double)f11 * d2, d3, 0.0).r(f10, f5).Lx();
            worldRenderer.F((double)f11 * d2, 0.0, 0.0).r(f10, f3).Lx();
            worldRenderer.F((double)f11 * d2, 0.0, f6).r(f10, f3).Lx();
        }
        tessellator.pZ();
        GL11.glNormal3f((float)1.0f, (float)0.0f, (float)0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        for (n4 = 0; n4 < n2; ++n4) {
            f11 = (float)n4 / (float)n2;
            f10 = f2 + f12 * f11 + f14;
            f9 = f11 + 1.0f / (float)n2;
            worldRenderer.F((double)f9 * d2, 0.0, f6).r(f10, f3).Lx();
            worldRenderer.F((double)f9 * d2, 0.0, 0.0).r(f10, f3).Lx();
            worldRenderer.F((double)f9 * d2, d3, 0.0).r(f10, f5).Lx();
            worldRenderer.F((double)f9 * d2, d3, f6).r(f10, f5).Lx();
        }
        tessellator.pZ();
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        for (n4 = 0; n4 < n3; ++n4) {
            f11 = (float)n4 / (float)n3;
            f10 = f3 + f13 * f11 + f15;
            f9 = f11 + 1.0f / (float)n3;
            worldRenderer.F(0.0, (double)f9 * d3, f6).r(f2, f10).Lx();
            worldRenderer.F(d2, (double)f9 * d3, f6).r(f4, f10).Lx();
            worldRenderer.F(d2, (double)f9 * d3, 0.0).r(f4, f10).Lx();
            worldRenderer.F(0.0, (double)f9 * d3, 0.0).r(f2, f10).Lx();
        }
        tessellator.pZ();
        GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        for (n4 = 0; n4 < n3; ++n4) {
            f11 = (float)n4 / (float)n3;
            f10 = f3 + f13 * f11 + f15;
            worldRenderer.F(d2, (double)f11 * d3, f6).r(f4, f10).Lx();
            worldRenderer.F(0.0, (double)f11 * d3, f6).r(f2, f10).Lx();
            worldRenderer.F(0.0, (double)f11 * d3, 0.0).r(f2, f10).Lx();
            worldRenderer.F(d2, (double)f11 * d3, 0.0).r(f4, f10).Lx();
        }
        tessellator.pZ();
    }
}

