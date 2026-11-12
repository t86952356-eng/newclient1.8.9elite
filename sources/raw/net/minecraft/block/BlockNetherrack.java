/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;

public class BlockNetherrack
extends Block {
    public BlockNetherrack() {
        super(Material.bes);
        this.a(a.cpx);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bel;
    }
}

