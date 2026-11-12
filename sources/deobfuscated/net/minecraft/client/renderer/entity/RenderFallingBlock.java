/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.entity.c;
import net.minecraft.entity.item.g;
import net.minecraft.util.b;
import net.minecraft.util.cm;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class RenderFallingBlock
extends Render<g> {
    public RenderFallingBlock(RenderManager renderManager) {
        super(renderManager);
        this.bUm = 0.5f;
    }

    @Override
    public void a(g g2, double d2, double d3, double d4, float f2, float f3) {
        if (g2.Yh() != null) {
            this.a(TextureMap.bZE);
            IBlockState iBlockState = g2.Yh();
            Block block = iBlockState.df();
            b b2 = new b(g2);
            w w2 = g2.Yg();
            if (iBlockState != w2.L(b2) && block.xg() != -1 && block.xg() == 3) {
                GlStateManager.JV();
                GlStateManager.j((float)d2, (float)d3, (float)d4);
                GlStateManager.JA();
                Tessellator tessellator = Tessellator.Li();
                WorldRenderer worldRenderer = tessellator.Lj();
                worldRenderer.a(7, DefaultVertexFormats.cbv);
                int n2 = b2.wt();
                int n3 = b2.wu();
                int n4 = b2.wx();
                worldRenderer.G((float)(-n2) - 0.5f, -n3, (float)(-n4) - 0.5f);
                BlockRendererDispatcher blockRendererDispatcher = Minecraft.getMinecraft().BE();
                IBakedModel iBakedModel = blockRendererDispatcher.b(iBlockState, w2, null);
                blockRendererDispatcher.IZ().a((l)w2, iBakedModel, iBlockState, b2, worldRenderer, false);
                worldRenderer.G(0.0, 0.0, 0.0);
                tessellator.pZ();
                GlStateManager.Jz();
                GlStateManager.JW();
                super.a(g2, d2, d3, d4, f2, f3);
            }
        }
    }

    protected cm b(g g2) {
        return TextureMap.bZE;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.b((g)c2);
    }
}

