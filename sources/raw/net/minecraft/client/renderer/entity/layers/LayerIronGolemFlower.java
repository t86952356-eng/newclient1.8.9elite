/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.d;
import net.minecraft.client.model.w;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderIronGolem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;

public class LayerIronGolemFlower
implements LayerRenderer<net.minecraft.entity.monster.w> {
    private final RenderIronGolem bXI;

    public LayerIronGolemFlower(RenderIronGolem renderIronGolem) {
        this.bXI = renderIronGolem;
    }

    public void a(net.minecraft.entity.monster.w w2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (w2.Zu() != 0) {
            BlockRendererDispatcher blockRendererDispatcher = d.AZ().BE();
            GlStateManager.JS();
            GlStateManager.JV();
            GlStateManager.d(5.0f + 180.0f * ((w)this.bXI.Nk()).bAJ.bBF / (float)Math.PI, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.j(-0.9375f, -0.625f, -0.9375f);
            float f9 = 0.5f;
            GlStateManager.i(0.5f, -0.5f, 0.5f);
            int n2 = w2.af(f4);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3 / 1.0f, (float)n4 / 1.0f);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.bXI.a(TextureMap.bZE);
            blockRendererDispatcher.a(Blocks.cLQ.xM(), 1.0f);
            GlStateManager.JW();
            GlStateManager.JT();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((net.minecraft.entity.monster.w)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

