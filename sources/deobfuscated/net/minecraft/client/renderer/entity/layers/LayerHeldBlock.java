/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.monster.e;
import net.minecraft.entity.r;

public class LayerHeldBlock
implements LayerRenderer<e> {
    private final RenderEnderman bXF;

    public LayerHeldBlock(RenderEnderman renderEnderman) {
        this.bXF = renderEnderman;
    }

    public void a(e e2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        IBlockState iBlockState = e2.Zh();
        if (iBlockState.df().xb() != Material.beo) {
            BlockRendererDispatcher blockRendererDispatcher = Minecraft.getMinecraft().BE();
            GlStateManager.JS();
            GlStateManager.JV();
            GlStateManager.j(0.0f, 0.6875f, -0.75f);
            GlStateManager.d(20.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(45.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(0.25f, 0.1875f, 0.25f);
            float f9 = 0.5f;
            GlStateManager.i(-0.5f, -0.5f, 0.5f);
            int n2 = e2.af(f4);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3 / 1.0f, (float)n4 / 1.0f);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.bXF.a(TextureMap.bZE);
            blockRendererDispatcher.a(iBlockState, 1.0f);
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
        this.a((e)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

