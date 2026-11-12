/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockStoneSlabNew;
import net.minecraft.block.BlockStoneSlabNew$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;

class BlockModelShapes$7
extends StateMapperBase {
    BlockModelShapes$7(BlockModelShapes blockModelShapes) {
    }

    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(iBlockState.zV());
        String string = BlockStoneSlabNew.bcp.a((BlockStoneSlabNew$EnumType)linkedHashMap.remove(BlockStoneSlabNew.bcp));
        linkedHashMap.remove(BlockStoneSlab.bbY);
        String string2 = iBlockState.b(BlockStoneSlabNew.bco) != false ? "all" : "normal";
        return new ModelResourceLocation(string + "_double_slab", string2);
    }
}

