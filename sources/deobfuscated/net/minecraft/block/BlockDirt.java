/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockDirt
extends Block {
    public static final PropertyEnum<BlockDirt$DirtType> aTC = PropertyEnum.c("variant", BlockDirt$DirtType.class);
    public static final PropertyBool aTD = PropertyBool.cs("snowy");

    protected BlockDirt() {
        super(Material.beq);
        this.h(this.aSG.zS().a(aTC, BlockDirt$DirtType.aTE).a(aTD, false));
        this.a(a.cpx);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(aTC).yd();
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        if (iBlockState.b(aTC) == BlockDirt$DirtType.aTG) {
            Block block = l2.L(b2.aqX()).df();
            iBlockState = iBlockState.a(aTD, block == Blocks.cML || block == Blocks.cMJ);
        }
        return iBlockState;
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(this, 1, BlockDirt$DirtType.aTE.yc()));
        list.add(new co(this, 1, BlockDirt$DirtType.aTF.yc()));
        list.add(new co(this, 1, BlockDirt$DirtType.aTG.yc()));
    }

    @Override
    public int f(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        return iBlockState.df() != this ? 0 : iBlockState.b(aTC).yc();
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTC, BlockDirt$DirtType.aP(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTC).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTC, aTD);
    }

    @Override
    public int d(IBlockState iBlockState) {
        BlockDirt$DirtType blockDirt$DirtType = iBlockState.b(aTC);
        if (blockDirt$DirtType == BlockDirt$DirtType.aTG) {
            blockDirt$DirtType = BlockDirt$DirtType.aTE;
        }
        return blockDirt$DirtType.yc();
    }
}

