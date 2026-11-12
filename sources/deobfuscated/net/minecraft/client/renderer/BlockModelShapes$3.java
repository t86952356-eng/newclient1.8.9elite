/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ao;
import net.minecraft.util.cm;

class BlockModelShapes$3
extends StateMapperBase {
    BlockModelShapes$3(BlockModelShapes blockModelShapes) {
    }

    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(iBlockState.zV());
        if (iBlockState.b(BlockStem.bbu) != ao.dwr) {
            linkedHashMap.remove(BlockStem.bbt);
        }
        return new ModelResourceLocation((cm)Block.aRV.y(iBlockState.df()), this.g(linkedHashMap));
    }
}

