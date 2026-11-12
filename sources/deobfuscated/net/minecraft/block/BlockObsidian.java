/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;

public class BlockObsidian
extends Block {
    public BlockObsidian() {
        super(Material.bes);
        this.a(a.cpx);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cMb);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bef;
    }
}

