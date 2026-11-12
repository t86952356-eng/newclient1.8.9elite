/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.block.Block;
import net.minecraft.client.d;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.af;
import net.minecraft.item.co;

public class LayerHeldItem
implements LayerRenderer<r> {
    private final RendererLivingEntity<?> bXG;

    public LayerHeldItem(RendererLivingEntity<?> rendererLivingEntity) {
        this.bXG = rendererLivingEntity;
    }

    @Override
    public void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        co co2 = r2.Vk();
        if (co2 != null) {
            GlStateManager.JV();
            if (this.bXG.Nk().byp) {
                float f9 = 0.5f;
                GlStateManager.j(0.0f, 0.625f, 0.0f);
                GlStateManager.d(-20.0f, -1.0f, 0.0f, 0.0f);
                GlStateManager.i(0.5f, 0.5f, 0.5f);
            }
            ((f)this.bXG.Nk()).X(0.0625f);
            GlStateManager.j(-0.0625f, 0.4375f, 0.0625f);
            if (r2 instanceof a && ((a)r2).cIE != null) {
                co2 = new co(Items.cQV, 0);
            }
            net.minecraft.item.d d2 = co2.bP();
            d d3 = d.AZ();
            if (d2 instanceof af && Block.f(d2).xg() == 2) {
                GlStateManager.j(0.0f, 0.1875f, -0.3125f);
                GlStateManager.d(20.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(45.0f, 0.0f, 1.0f, 0.0f);
                float f10 = 0.375f;
                GlStateManager.i(-0.375f, -0.375f, 0.375f);
            }
            if (r2.isSneaking()) {
                GlStateManager.j(0.0f, 0.203125f, 0.0f);
            }
            d3.BH().a(r2, co2, ItemCameraTransforms$TransformType.bRm);
            GlStateManager.JW();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }
}

