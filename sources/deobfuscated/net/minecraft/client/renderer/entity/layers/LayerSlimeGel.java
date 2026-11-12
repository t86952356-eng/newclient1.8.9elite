/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.an;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderSlime;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.ai;
import net.minecraft.entity.r;

public class LayerSlimeGel
implements LayerRenderer<ai> {
    private final RenderSlime bXT;
    private final d bXU = new an(0);

    public LayerSlimeGel(RenderSlime renderSlime) {
        this.bXT = renderSlime;
    }

    public void a(ai ai2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!ai2.isInvisible()) {
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JQ();
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            this.bXU.a(this.bXT.Nk());
            this.bXU.a(ai2, f2, f3, f5, f6, f7, f8);
            GlStateManager.tR();
            GlStateManager.JR();
        }
    }

    @Override
    public boolean NH() {
        return true;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((ai)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

