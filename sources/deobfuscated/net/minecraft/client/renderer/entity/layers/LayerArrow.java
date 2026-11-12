/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import java.util.Random;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.j;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.projectile.a;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class LayerArrow
implements LayerRenderer<r> {
    private final RendererLivingEntity bXp;

    public LayerArrow(RendererLivingEntity rendererLivingEntity) {
        this.bXp = rendererLivingEntity;
    }

    @Override
    public void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int n2 = r2.VT();
        if (n2 > 0) {
            a a2 = new a(r2.baU, r2.gW, r2.gX, r2.gY);
            Random random = new Random(r2.getEntityId());
            RenderHelper.Lf();
            for (int i2 = 0; i2 < n2; ++i2) {
                GlStateManager.JV();
                ag ag2 = this.bXp.Nk().b(random);
                j j2 = ag2.bBN.get(random.nextInt(ag2.bBN.size()));
                ag2.ac(0.0625f);
                float f9 = random.nextFloat();
                float f10 = random.nextFloat();
                float f11 = random.nextFloat();
                float f12 = (j2.byW + (j2.byZ - j2.byW) * f9) / 16.0f;
                float f13 = (j2.byX + (j2.bza - j2.byX) * f10) / 16.0f;
                float f14 = (j2.byY + (j2.bzb - j2.byY) * f11) / 16.0f;
                GlStateManager.j(f12, f13, f14);
                f9 = f9 * 2.0f - 1.0f;
                f10 = f10 * 2.0f - 1.0f;
                f11 = f11 * 2.0f - 1.0f;
                float f15 = bt.bK((f9 *= -1.0f) * f9 + (f11 *= -1.0f) * f11);
                a2.crM = a2.pl = (float)(Math.atan2(f9, f11) * 180.0 / Math.PI);
                a2.crO = a2.pm = (float)(Math.atan2(f10 *= -1.0f, f15) * 180.0 / Math.PI);
                double d2 = 0.0;
                double d3 = 0.0;
                double d4 = 0.0;
                this.bXp.BF().e(a2, 0.0, 0.0, 0.0, 0.0f, f4);
                GlStateManager.JW();
            }
            RenderHelper.Lg();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }
}

