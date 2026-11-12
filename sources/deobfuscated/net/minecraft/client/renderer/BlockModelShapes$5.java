/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;

class BlockModelShapes$5
extends StateMapperBase {
    BlockModelShapes$5(BlockModelShapes blockModelShapes) {
    }

    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(iBlockState.zV());
        String string = BlockDirt.aTC.a((BlockDirt$DirtType)linkedHashMap.remove(BlockDirt.aTC));
        if (BlockDirt$DirtType.aTG != iBlockState.b(BlockDirt.aTC)) {
            linkedHashMap.remove(BlockDirt.aTD);
        }
        return new ModelResourceLocation(string, this.g(linkedHashMap));
    }
}

