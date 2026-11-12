/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

final class BlockSilverfish$EnumType$1
extends BlockSilverfish$EnumType {
    private BlockSilverfish$EnumType$1(int n3, String string2) {
    }

    @Override
    public IBlockState za() {
        return Blocks.cLd.xM().a(BlockStone.bbw, BlockStone$EnumType.bbx);
    }
}

