/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.client.d;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager$TexGen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.src.a;
import net.minecraft.tileentity.v;
import net.minecraft.util.cm;
import net.optifine.shaders.aj;

public class TileEntityEndPortalRenderer
extends TileEntitySpecialRenderer<v> {
    private static final cm caH = new cm("textures/environment/end_sky.png");
    private static final cm caI = new cm("textures/entity/end_portal.png");
    private static final Random caJ = new Random(31100L);
    FloatBuffer caK = GLAllocation.cG(16);

    @Override
    public void a(v v2, double d2, double d3, double d4, float f2, int n2) {
        if (!a.aoG() || !aj.a(v2, d2, d3, d4, f2, n2, 0.75f)) {
            float f3 = (float)this.cbt.cbb;
            float f4 = (float)this.cbt.cbc;
            float f5 = (float)this.cbt.cbd;
            GlStateManager.JA();
            caJ.setSeed(31100L);
            float f6 = 0.75f;
            for (int i2 = 0; i2 < 16; ++i2) {
                GlStateManager.JV();
                float f7 = 16 - i2;
                float f8 = 0.0625f;
                float f9 = 1.0f / (f7 + 1.0f);
                if (i2 == 0) {
                    this.a(caH);
                    f9 = 0.1f;
                    f7 = 65.0f;
                    f8 = 0.125f;
                    GlStateManager.tQ();
                    GlStateManager.P(770, 771);
                }
                if (i2 >= 1) {
                    this.a(caI);
                }
                if (i2 == 1) {
                    GlStateManager.tQ();
                    GlStateManager.P(1, 1);
                    f8 = 0.5f;
                }
                float f10 = (float)(-(d3 + 0.75));
                float f11 = f10 + (float)ActiveRenderInfo.mr().dAH;
                float f12 = f10 + f7 + (float)ActiveRenderInfo.mr().dAH;
                float f13 = f11 / f12;
                f13 = (float)(d3 + 0.75) + f13;
                GlStateManager.j(f3, f13, f5);
                GlStateManager.a(GlStateManager$TexGen.bLK, 9217);
                GlStateManager.a(GlStateManager$TexGen.bLL, 9217);
                GlStateManager.a(GlStateManager$TexGen.bLM, 9217);
                GlStateManager.a(GlStateManager$TexGen.bLN, 9216);
                GlStateManager.a(GlStateManager$TexGen.bLK, 9473, this.h(1.0f, 0.0f, 0.0f, 0.0f));
                GlStateManager.a(GlStateManager$TexGen.bLL, 9473, this.h(0.0f, 0.0f, 1.0f, 0.0f));
                GlStateManager.a(GlStateManager$TexGen.bLM, 9473, this.h(0.0f, 0.0f, 0.0f, 1.0f));
                GlStateManager.a(GlStateManager$TexGen.bLN, 9474, this.h(0.0f, 1.0f, 0.0f, 0.0f));
                GlStateManager.a(GlStateManager$TexGen.bLK);
                GlStateManager.a(GlStateManager$TexGen.bLL);
                GlStateManager.a(GlStateManager$TexGen.bLM);
                GlStateManager.a(GlStateManager$TexGen.bLN);
                GlStateManager.JW();
                GlStateManager.cR(5890);
                GlStateManager.JV();
                GlStateManager.JU();
                GlStateManager.j(0.0f, (float)(d.Bj() % 700000L) / 700000.0f, 0.0f);
                GlStateManager.i(f8, f8, f8);
                GlStateManager.j(0.5f, 0.5f, 0.0f);
                GlStateManager.d((float)(i2 * i2 * 4321 + i2 * 9) * 2.0f, 0.0f, 0.0f, 1.0f);
                GlStateManager.j(-0.5f, -0.5f, 0.0f);
                GlStateManager.j(-f3, -f5, -f4);
                f11 = f10 + (float)ActiveRenderInfo.mr().dAH;
                GlStateManager.j((float)ActiveRenderInfo.mr().dAG * f7 / f11, (float)ActiveRenderInfo.mr().dAI * f7 / f11, -f4);
                Tessellator tessellator = Tessellator.Li();
                WorldRenderer worldRenderer = tessellator.Lj();
                worldRenderer.a(7, DefaultVertexFormats.cbF);
                float f14 = (caJ.nextFloat() * 0.5f + 0.1f) * f9;
                float f15 = (caJ.nextFloat() * 0.5f + 0.4f) * f9;
                float f16 = (caJ.nextFloat() * 0.5f + 0.5f) * f9;
                if (i2 == 0) {
                    f15 = f16 = 1.0f * f9;
                    f14 = f16;
                }
                worldRenderer.F(d2, d3 + 0.75, d4).g(f14, f15, f16, 1.0f).Lx();
                worldRenderer.F(d2, d3 + 0.75, d4 + 1.0).g(f14, f15, f16, 1.0f).Lx();
                worldRenderer.F(d2 + 1.0, d3 + 0.75, d4 + 1.0).g(f14, f15, f16, 1.0f).Lx();
                worldRenderer.F(d2 + 1.0, d3 + 0.75, d4).g(f14, f15, f16, 1.0f).Lx();
                tessellator.pZ();
                GlStateManager.JW();
                GlStateManager.cR(5888);
                this.a(caH);
            }
            GlStateManager.tR();
            GlStateManager.b(GlStateManager$TexGen.bLK);
            GlStateManager.b(GlStateManager$TexGen.bLL);
            GlStateManager.b(GlStateManager$TexGen.bLM);
            GlStateManager.b(GlStateManager$TexGen.bLN);
            GlStateManager.Jz();
        }
    }

    @Override
    public void b(v v2, double d2, double d3, double d4, float f2, int n2) {
    }

    private FloatBuffer h(float f2, float f3, float f4, float f5) {
        this.caK.clear();
        this.caK.put(f2).put(f3).put(f4).put(f5);
        this.caK.flip();
        return this.caK;
    }

    @Override
    public /* synthetic */ void a(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((v)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((v)d2, d3, d4, d5, f2, n2);
    }
}

