/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockQuartz
extends Block {
    public static final PropertyEnum<BlockQuartz$EnumType> aYC = PropertyEnum.c("variant", BlockQuartz$EnumType.class);

    public BlockQuartz() {
        super(Material.bes);
        this.h(this.aSG.zS().a(aYC, BlockQuartz$EnumType.aYE));
        this.a(a.cpx);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        if (n2 == BlockQuartz$EnumType.aYG.yc()) {
            switch (ao2.asL()) {
                case dwJ: {
                    return this.xM().a(aYC, BlockQuartz$EnumType.aYI);
                }
                case dwH: {
                    return this.xM().a(aYC, BlockQuartz$EnumType.aYH);
                }
            }
            return this.xM().a(aYC, BlockQuartz$EnumType.aYG);
        }
        return n2 == BlockQuartz$EnumType.aYF.yc() ? this.xM().a(aYC, BlockQuartz$EnumType.aYF) : this.xM().a(aYC, BlockQuartz$EnumType.aYE);
    }

    @Override
    public int d(IBlockState iBlockState) {
        BlockQuartz$EnumType blockQuartz$EnumType = iBlockState.b(aYC);
        return blockQuartz$EnumType != BlockQuartz$EnumType.aYH && blockQuartz$EnumType != BlockQuartz$EnumType.aYI ? blockQuartz$EnumType.yc() : BlockQuartz$EnumType.aYG.yc();
    }

    @Override
    protected co f(IBlockState iBlockState) {
        BlockQuartz$EnumType blockQuartz$EnumType = iBlockState.b(aYC);
        return blockQuartz$EnumType != BlockQuartz$EnumType.aYH && blockQuartz$EnumType != BlockQuartz$EnumType.aYI ? super.f(iBlockState) : new co(d.I(this), 1, BlockQuartz$EnumType.aYG.yc());
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, BlockQuartz$EnumType.aYE.yc()));
        list.add(new co(d2, 1, BlockQuartz$EnumType.aYF.yc()));
        list.add(new co(d2, 1, BlockQuartz$EnumType.aYG.yc()));
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bdQ;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aYC, BlockQuartz$EnumType.bf(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aYC).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aYC);
    }
}

