/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailBase$Rail;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockRail
extends BlockRailBase {
    public static final PropertyEnum<BlockRailBase$EnumRailDirection> aYO = PropertyEnum.c("shape", BlockRailBase$EnumRailDirection.class);

    protected BlockRail() {
        super(false);
        this.h(this.aSG.zS().a(aYO, BlockRailBase$EnumRailDirection.aYQ));
    }

    @Override
    protected void b(w w2, b b2, IBlockState iBlockState, Block block) {
        if (block.xw() && new BlockRailBase$Rail(this, w2, b2, iBlockState).yT() == 3) {
            this.b(w2, b2, iBlockState, false);
        }
    }

    @Override
    public IProperty<BlockRailBase$EnumRailDirection> yP() {
        return aYO;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aYO, BlockRailBase$EnumRailDirection.bg(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aYO).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aYO);
    }
}

