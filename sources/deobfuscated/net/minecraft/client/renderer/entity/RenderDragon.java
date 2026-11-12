/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.o;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerEnderDragonDeath;
import net.minecraft.client.renderer.entity.layers.LayerEnderDragonEyes;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.boss.a;
import net.minecraft.entity.boss.b;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderDragon
extends RenderLiving<b> {
    private static final cm bUC = new cm("textures/entity/endercrystal/endercrystal_beam.png");
    private static final cm bUD = new cm("textures/entity/enderdragon/dragon_exploding.png");
    private static final cm bUE = new cm("textures/entity/enderdragon/dragon.png");
    protected o bUF;

    public RenderDragon(RenderManager renderManager) {
        super(renderManager, new o(0.0f), 0.5f);
        this.bUF = (o)this.bWL;
        this.a(new LayerEnderDragonEyes(this));
        this.a(new LayerEnderDragonDeath());
    }

    protected void a(b b2, float f2, float f3, float f4) {
        float f5 = (float)b2.g(7, f4)[0];
        float f6 = (float)(b2.g(5, f4)[1] - b2.g(10, f4)[1]);
        GlStateManager.d(-f5, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(f6 * 10.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.j(0.0f, 0.0f, 1.0f);
        if (b2.cuv > 0) {
            float f7 = ((float)b2.cuv + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f7 = bt.bK(f7)) > 1.0f) {
                f7 = 1.0f;
            }
            GlStateManager.d(f7 * this.G(b2), 0.0f, 0.0f, 1.0f);
        }
    }

    protected void a(b b2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (b2.cBo > 0) {
            float f8 = (float)b2.cBo / 200.0f;
            GlStateManager.cJ(515);
            GlStateManager.tL();
            GlStateManager.e(516, f8);
            this.a(bUD);
            this.bWL.a(b2, f2, f3, f4, f5, f6, f7);
            GlStateManager.e(516, 0.1f);
            GlStateManager.cJ(514);
        }
        this.N(b2);
        this.bWL.a(b2, f2, f3, f4, f5, f6, f7);
        if (b2.cus > 0) {
            GlStateManager.cJ(514);
            GlStateManager.JO();
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            GlStateManager.e(1.0f, 0.0f, 0.0f, 0.5f);
            this.bWL.a(b2, f2, f3, f4, f5, f6, f7);
            GlStateManager.JN();
            GlStateManager.tR();
            GlStateManager.cJ(515);
        }
    }

    @Override
    public void a(b b2, double d2, double d3, double d4, float f2, float f3) {
        a.a(b2, false);
        super.a(b2, d2, d3, d4, f2, f3);
        if (b2.cBp != null) {
            this.a(b2, d2, d3, d4, f3);
        }
    }

    protected void a(b b2, double d2, double d3, double d4, float f2) {
        float f3 = (float)b2.cBp.cCe + f2;
        float f4 = bt.bx(f3 * 0.2f) / 2.0f + 0.5f;
        f4 = (f4 * f4 + f4) * 0.2f;
        float f5 = (float)(b2.cBp.gW - b2.gW - (b2.crF - b2.gW) * (double)(1.0f - f2));
        float f6 = (float)((double)f4 + b2.cBp.gX - 1.0 - b2.gX - (b2.crG - b2.gX) * (double)(1.0f - f2));
        float f7 = (float)(b2.cBp.gY - b2.gY - (b2.crH - b2.gY) * (double)(1.0f - f2));
        float f8 = bt.bK(f5 * f5 + f7 * f7);
        float f9 = bt.bK(f5 * f5 + f6 * f6 + f7 * f7);
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3 + 2.0f, (float)d4);
        GlStateManager.d((float)(-Math.atan2(f7, f5)) * 180.0f / (float)Math.PI - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d((float)(-Math.atan2(f8, f6)) * 180.0f / (float)Math.PI - 90.0f, 1.0f, 0.0f, 0.0f);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        RenderHelper.Lf();
        GlStateManager.JI();
        this.a(bUC);
        GlStateManager.cP(7425);
        float f10 = 0.0f - ((float)b2.aRg + f2) * 0.01f;
        float f11 = bt.bK(f5 * f5 + f6 * f6 + f7 * f7) / 32.0f - ((float)b2.aRg + f2) * 0.01f;
        worldRenderer.a(5, DefaultVertexFormats.cbI);
        int n2 = 8;
        for (int i2 = 0; i2 <= 8; ++i2) {
            float f12 = bt.bx((float)(i2 % 8) * (float)Math.PI * 2.0f / 8.0f) * 0.75f;
            float f13 = bt.bB((float)(i2 % 8) * (float)Math.PI * 2.0f / 8.0f) * 0.75f;
            float f14 = (float)(i2 % 8) * 1.0f / 8.0f;
            worldRenderer.F(f12 * 0.2f, f13 * 0.2f, 0.0).r(f14, f11).s(0, 0, 0, 255).Lx();
            worldRenderer.F(f12, f13, f9).r(f14, f10).s(255, 255, 255, 255).Lx();
        }
        tessellator.pZ();
        GlStateManager.JH();
        GlStateManager.cP(7424);
        RenderHelper.Lg();
        GlStateManager.JW();
    }

    protected cm a(b b2) {
        return bUE;
    }

    @Override
    protected /* synthetic */ void b(r r2, float f2, float f3, float f4) {
        this.a((b)r2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((b)c2);
    }
}

