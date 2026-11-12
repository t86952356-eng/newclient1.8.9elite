/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockStoneSlabNew$EnumType;
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
import net.minecraft.util.cr;
import net.minecraft.world.w;

public abstract class BlockStoneSlabNew
extends BlockSlab {
    public static final PropertyBool bco = PropertyBool.cs("seamless");
    public static final PropertyEnum<BlockStoneSlabNew$EnumType> bcp = PropertyEnum.c("variant", BlockStoneSlabNew$EnumType.class);

    public BlockStoneSlabNew() {
        super(Material.bes);
        IBlockState iBlockState = this.aSG.zS();
        iBlockState = this.yk() ? iBlockState.a(bco, false) : iBlockState.a(baO, BlockSlab$EnumBlockHalf.baQ);
        this.h(iBlockState.a(bcp, BlockStoneSlabNew$EnumType.bcq));
        this.a(a.cpx);
    }

    @Override
    public String xA() {
        return cr.gm(this.xB() + ".red_sandstone.name");
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cOR);
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(Blocks.cOR);
    }

    @Override
    public String bm(int n2) {
        return super.xB() + "." + BlockStoneSlabNew$EnumType.br(n2).xB();
    }

    @Override
    public IProperty<?> ze() {
        return bcp;
    }

    @Override
    public Object F(co co2) {
        return BlockStoneSlabNew$EnumType.br(co2.yc() & 7);
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        if (d2 != d.I(Blocks.cOQ)) {
            for (BlockStoneSlabNew$EnumType blockStoneSlabNew$EnumType : BlockStoneSlabNew$EnumType.values()) {
                list.add(new co(d2, 1, blockStoneSlabNew$EnumType.yc()));
            }
        }
    }

    @Override
    public IBlockState aM(int n2) {
        IBlockState iBlockState = this.xM().a(bcp, BlockStoneSlabNew$EnumType.br(n2 & 7));
        iBlockState = this.yk() ? iBlockState.a(bco, (n2 & 8) != 0) : iBlockState.a(baO, (n2 & 8) == 0 ? BlockSlab$EnumBlockHalf.baQ : BlockSlab$EnumBlockHalf.baP);
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(bcp).yc();
        if (this.yk()) {
            if (iBlockState.b(bco).booleanValue()) {
                n2 |= 8;
            }
        } else if (iBlockState.b(baO) == BlockSlab$EnumBlockHalf.baP) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return this.yk() ? new BlockState(this, bco, bcp) : new BlockState(this, baO, bcp);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(bcp).zq();
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bcp).yc();
    }
}

