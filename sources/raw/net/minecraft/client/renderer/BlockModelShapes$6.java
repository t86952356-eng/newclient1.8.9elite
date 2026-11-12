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
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;

class BlockModelShapes$6
extends StateMapperBase {
    BlockModelShapes$6(BlockModelShapes blockModelShapes) {
    }

    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(iBlockState.zV());
        String string = BlockStoneSlab.bbZ.a((BlockStoneSlab$EnumType)linkedHashMap.remove(BlockStoneSlab.bbZ));
        linkedHashMap.remove(BlockStoneSlab.bbY);
        String string2 = iBlockState.b(BlockStoneSlab.bbY) != false ? "all" : "normal";
        return new ModelResourceLocation(string + "_double_slab", string2);
    }
}

