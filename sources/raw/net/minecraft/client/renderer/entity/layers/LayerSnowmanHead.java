/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.RenderSnowMan;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.ao;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;

public class LayerSnowmanHead
implements LayerRenderer<ao> {
    private final RenderSnowMan bXV;

    public LayerSnowmanHead(RenderSnowMan renderSnowMan) {
        this.bXV = renderSnowMan;
    }

    public void a(ao ao2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!ao2.isInvisible()) {
            GlStateManager.JV();
            this.bXV.NB().bzg.ac(0.0625f);
            float f9 = 0.625f;
            GlStateManager.j(0.0f, -0.34375f, 0.0f);
            GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.i(0.625f, -0.625f, -0.625f);
            d.AZ().BH().a(ao2, new co(Blocks.cMW, 1), ItemCameraTransforms$TransformType.bRo);
            GlStateManager.JW();
        }
    }

    @Override
    public boolean NH() {
        return true;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((ao)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

