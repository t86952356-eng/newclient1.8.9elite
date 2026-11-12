/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public abstract class BlockWoodSlab
extends BlockSlab {
    public static final PropertyEnum<BlockPlanks$EnumType> bdy = PropertyEnum.c("variant", BlockPlanks$EnumType.class);

    public BlockWoodSlab() {
        super(Material.ber);
        IBlockState iBlockState = this.aSG.zS();
        if (!this.yk()) {
            iBlockState = iBlockState.a(baO, BlockSlab$EnumBlockHalf.baQ);
        }
        this.h(iBlockState.a(bdy, BlockPlanks$EnumType.aXJ));
        this.a(a.cpx);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(bdy).yB();
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cNO);
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(Blocks.cNO);
    }

    @Override
    public String bm(int n2) {
        return super.xB() + "." + BlockPlanks$EnumType.bd(n2).xB();
    }

    @Override
    public IProperty<?> ze() {
        return bdy;
    }

    @Override
    public Object F(co co2) {
        return BlockPlanks$EnumType.bd(co2.yc() & 7);
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        if (d2 != d.I(Blocks.cNN)) {
            for (BlockPlanks$EnumType blockPlanks$EnumType : BlockPlanks$EnumType.values()) {
                list.add(new co(d2, 1, blockPlanks$EnumType.yc()));
            }
        }
    }

    @Override
    public IBlockState aM(int n2) {
        IBlockState iBlockState = this.xM().a(bdy, BlockPlanks$EnumType.bd(n2 & 7));
        if (!this.yk()) {
            iBlockState = iBlockState.a(baO, (n2 & 8) == 0 ? BlockSlab$EnumBlockHalf.baQ : BlockSlab$EnumBlockHalf.baP);
        }
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(bdy).yc();
        if (!this.yk() && iBlockState.b(baO) == BlockSlab$EnumBlockHalf.baP) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return this.yk() ? new BlockState(this, bdy) : new BlockState(this, baO, bdy);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bdy).yc();
    }
}

