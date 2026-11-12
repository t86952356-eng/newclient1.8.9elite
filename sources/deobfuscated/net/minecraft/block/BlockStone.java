/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.cr;

public class BlockStone
extends Block {
    public static final PropertyEnum<BlockStone$EnumType> bbw = PropertyEnum.c("variant", BlockStone$EnumType.class);

    public BlockStone() {
        super(Material.bes);
        this.h(this.aSG.zS().a(bbw, BlockStone$EnumType.bbx));
        this.a(a.cpx);
    }

    @Override
    public String xA() {
        return cr.gm(this.xB() + "." + BlockStone$EnumType.bbx.xB() + ".name");
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(bbw).zl();
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return iBlockState.b(bbw) == BlockStone$EnumType.bbx ? d.I(Blocks.cLg) : d.I(Blocks.cLd);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bbw).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockStone$EnumType blockStone$EnumType : BlockStone$EnumType.values()) {
            list.add(new co(d2, 1, blockStone$EnumType.yc()));
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bbw, BlockStone$EnumType.bo(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bbw).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bbw);
    }
}

