/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class BlockPlanks
extends Block {
    public static final PropertyEnum<BlockPlanks$EnumType> aXI = PropertyEnum.c("variant", BlockPlanks$EnumType.class);

    public BlockPlanks() {
        super(Material.ber);
        this.h(this.aSG.zS().a(aXI, BlockPlanks$EnumType.aXJ));
        this.a(a.cpx);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aXI).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockPlanks$EnumType blockPlanks$EnumType : BlockPlanks$EnumType.values()) {
            list.add(new co(d2, 1, blockPlanks$EnumType.yc()));
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXI, BlockPlanks$EnumType.bd(n2));
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(aXI).yB();
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aXI).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXI);
    }
}

