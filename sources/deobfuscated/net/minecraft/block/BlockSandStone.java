/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class BlockSandStone
extends Block {
    public static final PropertyEnum<BlockSandStone$EnumType> bak = PropertyEnum.c("type", BlockSandStone$EnumType.class);

    public BlockSandStone() {
        super(Material.bes);
        this.h(this.aSG.zS().a(bak, BlockSandStone$EnumType.bal));
        this.a(a.cpx);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bak).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockSandStone$EnumType blockSandStone$EnumType : BlockSandStone$EnumType.values()) {
            list.add(new co(d2, 1, blockSandStone$EnumType.yc()));
        }
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bdE;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bak, BlockSandStone$EnumType.bk(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bak).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bak);
    }
}

