/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedSandstone$EnumType;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class BlockRedSandstone
extends Block {
    public static final PropertyEnum<BlockRedSandstone$EnumType> aZq = PropertyEnum.c("type", BlockRedSandstone$EnumType.class);

    public BlockRedSandstone() {
        super(Material.bes, BlockSand$EnumType.bad.lv());
        this.h(this.aSG.zS().a(aZq, BlockRedSandstone$EnumType.aZr));
        this.a(a.cpx);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aZq).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockRedSandstone$EnumType blockRedSandstone$EnumType : BlockRedSandstone$EnumType.values()) {
            list.add(new co(d2, 1, blockRedSandstone$EnumType.yc()));
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aZq, BlockRedSandstone$EnumType.bh(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aZq).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aZq);
    }
}

