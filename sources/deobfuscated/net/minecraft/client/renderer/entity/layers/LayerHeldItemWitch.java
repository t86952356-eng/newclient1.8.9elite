/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.as;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.RenderWitch;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.at;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class LayerHeldItemWitch
implements LayerRenderer<at> {
    private final RenderWitch bXH;

    public LayerHeldItemWitch(RenderWitch renderWitch) {
        this.bXH = renderWitch;
    }

    public void a(at at2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        co co2 = at2.Vk();
        if (co2 != null) {
            GlStateManager.k(1.0f, 1.0f, 1.0f);
            GlStateManager.JV();
            if (this.bXH.Nk().byp) {
                GlStateManager.j(0.0f, 0.625f, 0.0f);
                GlStateManager.d(-20.0f, -1.0f, 0.0f, 0.0f);
                float f9 = 0.5f;
                GlStateManager.i(0.5f, 0.5f, 0.5f);
            }
            ((as)this.bXH.Nk()).bCL.ac(0.0625f);
            GlStateManager.j(-0.0625f, 0.53125f, 0.21875f);
            d d2 = co2.bP();
            Minecraft minecraft = Minecraft.getMinecraft();
            if (d2 instanceof af && minecraft.BE().f(Block.f(d2), co2.yc())) {
                GlStateManager.j(0.0f, 0.0625f, -0.25f);
                GlStateManager.d(30.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(-5.0f, 0.0f, 1.0f, 0.0f);
                float f10 = 0.375f;
                GlStateManager.i(0.375f, -0.375f, 0.375f);
            } else if (d2 == Items.cPj) {
                GlStateManager.j(0.0f, 0.125f, -0.125f);
                GlStateManager.d(-45.0f, 0.0f, 1.0f, 0.0f);
                float f11 = 0.625f;
                GlStateManager.i(0.625f, -0.625f, 0.625f);
                GlStateManager.d(-100.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(-20.0f, 0.0f, 1.0f, 0.0f);
            } else if (d2.adw()) {
                if (d2.adx()) {
                    GlStateManager.d(180.0f, 0.0f, 0.0f, 1.0f);
                    GlStateManager.j(0.0f, -0.0625f, 0.0f);
                }
                this.bXH.Nr();
                GlStateManager.j(0.0625f, -0.125f, 0.0f);
                float f12 = 0.625f;
                GlStateManager.i(0.625f, -0.625f, 0.625f);
                GlStateManager.d(0.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(0.0f, 0.0f, 1.0f, 0.0f);
            } else {
                GlStateManager.j(0.1875f, 0.1875f, 0.0f);
                float f13 = 0.875f;
                GlStateManager.i(0.875f, 0.875f, 0.875f);
                GlStateManager.d(-20.0f, 0.0f, 0.0f, 1.0f);
                GlStateManager.d(-60.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(-30.0f, 0.0f, 0.0f, 1.0f);
            }
            GlStateManager.d(-15.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(40.0f, 0.0f, 0.0f, 1.0f);
            minecraft.BH().a(at2, co2, ItemCameraTransforms$TransformType.bRm);
            GlStateManager.JW();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((at)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

