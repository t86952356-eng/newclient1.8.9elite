/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderMinecart;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.entity.ai.bi;
import net.minecraft.init.Blocks;

public class RenderMinecartMobSpawner
extends RenderMinecart<bi> {
    public RenderMinecartMobSpawner(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    protected void a(bi bi2, float f2, IBlockState iBlockState) {
        super.a(bi2, f2, iBlockState);
        if (iBlockState.df() == Blocks.cMe) {
            TileEntityMobSpawnerRenderer.a(bi2.Xi(), bi2.gW, bi2.gX, bi2.gY, f2);
        }
    }
}

