/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;

public class BlockCompressedPowered
extends Block {
    public BlockCompressedPowered(Material material, MapColor mapColor) {
        super(material, mapColor);
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return 15;
    }
}

