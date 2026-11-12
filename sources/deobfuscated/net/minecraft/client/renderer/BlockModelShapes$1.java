/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;

class BlockModelShapes$1
extends StateMapperBase {
    BlockModelShapes$1(BlockModelShapes blockModelShapes) {
    }

    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        BlockQuartz$EnumType blockQuartz$EnumType = iBlockState.b(BlockQuartz.aYC);
        switch (blockQuartz$EnumType) {
            default: {
                return new ModelResourceLocation("quartz_block", "normal");
            }
            case aYF: {
                return new ModelResourceLocation("chiseled_quartz_block", "normal");
            }
            case aYG: {
                return new ModelResourceLocation("quartz_column", "axis=y");
            }
            case aYH: {
                return new ModelResourceLocation("quartz_column", "axis=x");
            }
            case aYI: 
        }
        return new ModelResourceLocation("quartz_column", "axis=z");
    }
}

