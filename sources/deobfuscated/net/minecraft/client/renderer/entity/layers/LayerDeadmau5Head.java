/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.entity.a;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.r;

public class LayerDeadmau5Head
implements LayerRenderer<a> {
    private final RenderPlayer bXA;

    public LayerDeadmau5Head(RenderPlayer renderPlayer) {
        this.bXA = renderPlayer;
    }

    public void a(a a2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (a2.xU().equals("deadmau5") && a2.Dc() && !a2.isInvisible()) {
            this.bXA.a(a2.Dd());
            for (int i2 = 0; i2 < 2; ++i2) {
                float f9 = a2.crM + (a2.pl - a2.crM) * f4 - (a2.cuG + (a2.cuF - a2.cuG) * f4);
                float f10 = a2.crO + (a2.pm - a2.crO) * f4;
                GlStateManager.JV();
                GlStateManager.d(f9, 0.0f, 1.0f, 0.0f);
                GlStateManager.d(f10, 1.0f, 0.0f, 0.0f);
                GlStateManager.j(0.375f * (float)(i2 * 2 - 1), 0.0f, 0.0f);
                GlStateManager.j(0.0f, -0.375f, 0.0f);
                GlStateManager.d(-f10, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(-f9, 0.0f, 1.0f, 0.0f);
                float f11 = 1.3333334f;
                GlStateManager.i(1.3333334f, 1.3333334f, 1.3333334f);
                this.bXA.Nz().Y(0.0625f);
                GlStateManager.JW();
            }
        }
    }

    @Override
    public boolean NH() {
        return true;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((a)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

