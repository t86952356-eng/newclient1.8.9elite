/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.tileentity;

import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.src.a;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.j;
import net.minecraft.tileentity.k;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.optifine.shaders.ah;
import org.lwjgl.opengl.GL11;

public class TileEntityBeaconRenderer
extends TileEntitySpecialRenderer<j> {
    private static final cm cav = new cm("textures/entity/beacon_beam.png");

    @Override
    public void a(j j2, double d2, double d3, double d4, float f2, int n2) {
        float f3 = j2.aqn();
        if ((double)f3 > 0.0) {
            if (a.aoG()) {
                ah.aGO();
            }
            GlStateManager.e(516, 0.1f);
            if (f3 > 0.0f) {
                Tessellator tessellator = Tessellator.Li();
                WorldRenderer worldRenderer = tessellator.Lj();
                GlStateManager.JG();
                List<k> list = j2.aqm();
                int n3 = 0;
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    k k2 = list.get(i2);
                    int n4 = n3 + k2.getHeight();
                    this.a(cav);
                    GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
                    GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
                    GlStateManager.JA();
                    GlStateManager.JI();
                    GlStateManager.tR();
                    GlStateManager.an(true);
                    GlStateManager.h(770, 1, 1, 0);
                    double d5 = (double)j2.de().getTotalWorldTime() + (double)f2;
                    double d6 = bt.aK(-d5 * 0.2 - (double)bt.aF(-d5 * 0.1));
                    float f4 = k2.aqp()[0];
                    float f5 = k2.aqp()[1];
                    float f6 = k2.aqp()[2];
                    double d7 = d5 * 0.025 * -1.5;
                    double d8 = 0.2;
                    double d9 = 0.5 + Math.cos(d7 + 2.356194490192345) * 0.2;
                    double d10 = 0.5 + Math.sin(d7 + 2.356194490192345) * 0.2;
                    double d11 = 0.5 + Math.cos(d7 + 0.7853981633974483) * 0.2;
                    double d12 = 0.5 + Math.sin(d7 + 0.7853981633974483) * 0.2;
                    double d13 = 0.5 + Math.cos(d7 + 3.9269908169872414) * 0.2;
                    double d14 = 0.5 + Math.sin(d7 + 3.9269908169872414) * 0.2;
                    double d15 = 0.5 + Math.cos(d7 + 5.497787143782138) * 0.2;
                    double d16 = 0.5 + Math.sin(d7 + 5.497787143782138) * 0.2;
                    double d17 = 0.0;
                    double d18 = 1.0;
                    double d19 = -1.0 + d6;
                    double d20 = (double)((float)k2.getHeight() * f3) * 2.5 + d19;
                    worldRenderer.a(7, DefaultVertexFormats.cbI);
                    worldRenderer.F(d2 + d9, d3 + (double)n4, d4 + d10).r(1.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d9, d3 + (double)n3, d4 + d10).r(1.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d11, d3 + (double)n3, d4 + d12).r(0.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d11, d3 + (double)n4, d4 + d12).r(0.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d15, d3 + (double)n4, d4 + d16).r(1.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d15, d3 + (double)n3, d4 + d16).r(1.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d13, d3 + (double)n3, d4 + d14).r(0.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d13, d3 + (double)n4, d4 + d14).r(0.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d11, d3 + (double)n4, d4 + d12).r(1.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d11, d3 + (double)n3, d4 + d12).r(1.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d15, d3 + (double)n3, d4 + d16).r(0.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d15, d3 + (double)n4, d4 + d16).r(0.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d13, d3 + (double)n4, d4 + d14).r(1.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d13, d3 + (double)n3, d4 + d14).r(1.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d9, d3 + (double)n3, d4 + d10).r(0.0, d19).g(f4, f5, f6, 1.0f).Lx();
                    worldRenderer.F(d2 + d9, d3 + (double)n4, d4 + d10).r(0.0, d20).g(f4, f5, f6, 1.0f).Lx();
                    tessellator.pZ();
                    GlStateManager.tQ();
                    GlStateManager.h(770, 771, 1, 0);
                    GlStateManager.an(false);
                    d7 = 0.2;
                    d8 = 0.2;
                    d9 = 0.8;
                    d10 = 0.2;
                    d11 = 0.2;
                    d12 = 0.8;
                    d13 = 0.8;
                    d14 = 0.8;
                    d15 = 0.0;
                    d16 = 1.0;
                    d17 = -1.0 + d6;
                    d18 = (double)((float)k2.getHeight() * f3) + d17;
                    worldRenderer.a(7, DefaultVertexFormats.cbI);
                    worldRenderer.F(d2 + 0.2, d3 + (double)n4, d4 + 0.2).r(1.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.2, d3 + (double)n3, d4 + 0.2).r(1.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n3, d4 + 0.2).r(0.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n4, d4 + 0.2).r(0.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n4, d4 + 0.8).r(1.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n3, d4 + 0.8).r(1.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.2, d3 + (double)n3, d4 + 0.8).r(0.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.2, d3 + (double)n4, d4 + 0.8).r(0.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n4, d4 + 0.2).r(1.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n3, d4 + 0.2).r(1.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n3, d4 + 0.8).r(0.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.8, d3 + (double)n4, d4 + 0.8).r(0.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.2, d3 + (double)n4, d4 + 0.8).r(1.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.2, d3 + (double)n3, d4 + 0.8).r(1.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.2, d3 + (double)n3, d4 + 0.2).r(0.0, d17).g(f4, f5, f6, 0.125f).Lx();
                    worldRenderer.F(d2 + 0.2, d3 + (double)n4, d4 + 0.2).r(0.0, d18).g(f4, f5, f6, 0.125f).Lx();
                    tessellator.pZ();
                    GlStateManager.Jz();
                    GlStateManager.JN();
                    GlStateManager.an(true);
                    n3 = n4;
                }
                GlStateManager.JF();
            }
            if (a.aoG()) {
                ah.aGP();
            }
        }
    }

    @Override
    public void b(j j2, double d2, double d3, double d4, float f2, int n2) {
    }

    @Override
    public boolean OE() {
        return true;
    }

    @Override
    public /* synthetic */ void a(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((j)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((j)d2, d3, d4, d5, f2, n2);
    }
}

