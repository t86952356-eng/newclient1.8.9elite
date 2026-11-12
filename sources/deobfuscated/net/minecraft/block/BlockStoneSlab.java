/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public abstract class BlockStoneSlab
extends BlockSlab {
    public static final PropertyBool bbY = PropertyBool.cs("seamless");
    public static final PropertyEnum<BlockStoneSlab$EnumType> bbZ = PropertyEnum.c("variant", BlockStoneSlab$EnumType.class);

    public BlockStoneSlab() {
        super(Material.bes);
        IBlockState iBlockState = this.aSG.zS();
        iBlockState = this.yk() ? iBlockState.a(bbY, false) : iBlockState.a(baO, BlockSlab$EnumBlockHalf.baQ);
        this.h(iBlockState.a(bbZ, BlockStoneSlab$EnumType.bca));
        this.a(a.cpx);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cLW);
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(Blocks.cLW);
    }

    @Override
    public String bm(int n2) {
        return super.xB() + "." + BlockStoneSlab$EnumType.bq(n2).xB();
    }

    @Override
    public IProperty<?> ze() {
        return bbZ;
    }

    @Override
    public Object F(co co2) {
        return BlockStoneSlab$EnumType.bq(co2.yc() & 7);
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        if (d2 != d.I(Blocks.cLV)) {
            for (BlockStoneSlab$EnumType blockStoneSlab$EnumType : BlockStoneSlab$EnumType.values()) {
                if (blockStoneSlab$EnumType == BlockStoneSlab$EnumType.bcc) continue;
                list.add(new co(d2, 1, blockStoneSlab$EnumType.yc()));
            }
        }
    }

    @Override
    public IBlockState aM(int n2) {
        IBlockState iBlockState = this.xM().a(bbZ, BlockStoneSlab$EnumType.bq(n2 & 7));
        iBlockState = this.yk() ? iBlockState.a(bbY, (n2 & 8) != 0) : iBlockState.a(baO, (n2 & 8) == 0 ? BlockSlab$EnumBlockHalf.baQ : BlockSlab$EnumBlockHalf.baP);
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(bbZ).yc();
        if (this.yk()) {
            if (iBlockState.b(bbY).booleanValue()) {
                n2 |= 8;
            }
        } else if (iBlockState.b(baO) == BlockSlab$EnumBlockHalf.baP) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return this.yk() ? new BlockState(this, bbY, bbZ) : new BlockState(this, baO, bbZ);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bbZ).yc();
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(bbZ).zo();
    }
}

