/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.ae;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class TileEntityPistonRenderer
extends TileEntitySpecialRenderer<ae> {
    private final BlockRendererDispatcher caT = Minecraft.getMinecraft().BE();

    @Override
    public void a(ae ae2, double d2, double d3, double d4, float f2, int n2) {
        b b2 = ae2.Ab();
        IBlockState iBlockState = ae2.aqK();
        Block block = iBlockState.df();
        if (block.xb() != Material.beo && ae2.bF(f2) < 1.0f) {
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            this.a(TextureMap.bZE);
            RenderHelper.Lf();
            GlStateManager.P(770, 771);
            GlStateManager.tQ();
            GlStateManager.JI();
            if (Minecraft.AX()) {
                GlStateManager.cP(7425);
            } else {
                GlStateManager.cP(7424);
            }
            worldRenderer.a(7, DefaultVertexFormats.cbv);
            worldRenderer.G((float)d2 - (float)b2.wt() + ae2.bG(f2), (float)d3 - (float)b2.wu() + ae2.bH(f2), (float)d4 - (float)b2.wx() + ae2.bI(f2));
            w w2 = this.de();
            if (block == Blocks.cLM && ae2.bF(f2) < 0.5f) {
                iBlockState = iBlockState.a(BlockPistonExtension.aXA, true);
                this.caT.IZ().a((l)w2, this.caT.b(iBlockState, w2, b2), iBlockState, b2, worldRenderer, true);
            } else if (ae2.aqM() && !ae2.aqL()) {
                BlockPistonExtension$EnumPistonType blockPistonExtension$EnumPistonType = block == Blocks.cLH ? BlockPistonExtension$EnumPistonType.aXD : BlockPistonExtension$EnumPistonType.aXC;
                IBlockState iBlockState2 = Blocks.cLM.xM().a(BlockPistonExtension.aXz, blockPistonExtension$EnumPistonType).a(BlockPistonExtension.aXy, iBlockState.b(BlockPistonBase.aXu));
                iBlockState2 = iBlockState2.a(BlockPistonExtension.aXA, ae2.bF(f2) >= 0.5f);
                this.caT.IZ().a((l)w2, this.caT.b(iBlockState2, w2, b2), iBlockState2, b2, worldRenderer, true);
                worldRenderer.G((float)d2 - (float)b2.wt(), (float)d3 - (float)b2.wu(), (float)d4 - (float)b2.wx());
                iBlockState.a(BlockPistonBase.aXv, true);
                this.caT.IZ().a((l)w2, this.caT.b(iBlockState, w2, b2), iBlockState, b2, worldRenderer, true);
            } else {
                this.caT.IZ().a((l)w2, this.caT.b(iBlockState, w2, b2), iBlockState, b2, worldRenderer, false);
            }
            worldRenderer.G(0.0, 0.0, 0.0);
            tessellator.pZ();
            RenderHelper.Lg();
        }
    }

    @Override
    public void b(ae ae2, double d2, double d3, double d4, float f2, int n2) {
    }

    @Override
    public /* synthetic */ void a(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((ae)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((ae)d2, d3, d4, d5, f2, n2);
    }
}

