/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;

class BlockModelShapes$2
extends StateMapperBase {
    BlockModelShapes$2(BlockModelShapes blockModelShapes) {
    }

    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        return new ModelResourceLocation("dead_bush", "normal");
    }
}

