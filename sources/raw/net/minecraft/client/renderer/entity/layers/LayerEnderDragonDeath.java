/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import java.util.Random;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.boss.b;
import net.minecraft.entity.r;

public class LayerEnderDragonDeath
implements LayerRenderer<b> {
    public void a(b b2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (b2.cBo > 0) {
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            RenderHelper.Lf();
            float f9 = ((float)b2.cBo + f4) / 200.0f;
            float f10 = 0.0f;
            if (f9 > 0.8f) {
                f10 = (f9 - 0.8f) / 0.2f;
            }
            Random random = new Random(432L);
            GlStateManager.JO();
            GlStateManager.cP(7425);
            GlStateManager.tQ();
            GlStateManager.P(770, 1);
            GlStateManager.Jy();
            GlStateManager.JH();
            GlStateManager.an(false);
            GlStateManager.JV();
            GlStateManager.j(0.0f, -1.0f, -2.0f);
            int n2 = 0;
            while ((float)n2 < (f9 + f9 * f9) / 2.0f * 60.0f) {
                GlStateManager.d(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.d(random.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
                GlStateManager.d(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.d(random.nextFloat() * 360.0f + f9 * 90.0f, 0.0f, 0.0f, 1.0f);
                float f11 = random.nextFloat() * 20.0f + 5.0f + f10 * 10.0f;
                float f12 = random.nextFloat() * 2.0f + 1.0f + f10 * 2.0f;
                worldRenderer.a(6, DefaultVertexFormats.cbF);
                worldRenderer.F(0.0, 0.0, 0.0).s(255, 255, 255, (int)(255.0f * (1.0f - f10))).Lx();
                worldRenderer.F(-0.866 * (double)f12, f11, -0.5f * f12).s(255, 0, 255, 0).Lx();
                worldRenderer.F(0.866 * (double)f12, f11, -0.5f * f12).s(255, 0, 255, 0).Lx();
                worldRenderer.F(0.0, f11, 1.0f * f12).s(255, 0, 255, 0).Lx();
                worldRenderer.F(-0.866 * (double)f12, f11, -0.5f * f12).s(255, 0, 255, 0).Lx();
                tessellator.pZ();
                ++n2;
            }
            GlStateManager.JW();
            GlStateManager.an(true);
            GlStateManager.JI();
            GlStateManager.tR();
            GlStateManager.cP(7424);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JN();
            GlStateManager.tL();
            RenderHelper.Lg();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((b)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

