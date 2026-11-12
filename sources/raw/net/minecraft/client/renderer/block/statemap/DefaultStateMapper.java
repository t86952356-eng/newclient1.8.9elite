/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.statemap;

import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.cm;

public class DefaultStateMapper
extends StateMapperBase {
    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        return new ModelResourceLocation((cm)Block.aRV.y(iBlockState.df()), this.g((Map<IProperty, Comparable>)iBlockState.zV()));
    }
}

