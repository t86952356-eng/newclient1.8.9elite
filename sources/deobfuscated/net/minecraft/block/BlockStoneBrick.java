/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class BlockStoneBrick
extends Block {
    public static final PropertyEnum<BlockStoneBrick$EnumType> bbK = PropertyEnum.c("variant", BlockStoneBrick$EnumType.class);
    public static final int bbL = BlockStoneBrick$EnumType.bbP.yc();
    public static final int bbM = BlockStoneBrick$EnumType.bbQ.yc();
    public static final int bbN = BlockStoneBrick$EnumType.bbR.yc();
    public static final int bbO = BlockStoneBrick$EnumType.bbS.yc();

    public BlockStoneBrick() {
        super(Material.bes);
        this.h(this.aSG.zS().a(bbK, BlockStoneBrick$EnumType.bbP));
        this.a(a.cpx);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bbK).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockStoneBrick$EnumType blockStoneBrick$EnumType : BlockStoneBrick$EnumType.values()) {
            list.add(new co(d2, 1, blockStoneBrick$EnumType.yc()));
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bbK, BlockStoneBrick$EnumType.bp(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bbK).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bbK);
    }
}

