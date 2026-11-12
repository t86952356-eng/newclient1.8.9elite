/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

final class BlockSilverfish$EnumType$5
extends BlockSilverfish$EnumType {
    private BlockSilverfish$EnumType$5(int n3, String string2, String string3) {
    }

    @Override
    public IBlockState za() {
        return Blocks.cNh.xM().a(BlockStoneBrick.bbK, BlockStoneBrick$EnumType.bbR);
    }
}

