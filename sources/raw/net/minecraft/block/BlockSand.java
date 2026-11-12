/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class BlockSand
extends BlockFalling {
    public static final PropertyEnum<BlockSand$EnumType> bab = PropertyEnum.c("variant", BlockSand$EnumType.class);

    public BlockSand() {
        this.h(this.aSG.zS().a(bab, BlockSand$EnumType.bac));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bab).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockSand$EnumType blockSand$EnumType : BlockSand$EnumType.values()) {
            list.add(new co(d2, 1, blockSand$EnumType.yc()));
        }
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(bab).lv();
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bab, BlockSand$EnumType.bj(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bab).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bab);
    }
}

