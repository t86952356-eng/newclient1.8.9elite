/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.r;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockHugeMushroom
extends Block {
    public static final PropertyEnum<BlockHugeMushroom$EnumType> aWa = PropertyEnum.c("variant", BlockHugeMushroom$EnumType.class);
    private final Block aWb;

    public BlockHugeMushroom(Material material, MapColor mapColor, Block block) {
        super(material, mapColor);
        this.h(this.aSG.zS().a(aWa, BlockHugeMushroom$EnumType.aWn));
        this.aWb = block;
    }

    @Override
    public int a(Random random) {
        return Math.max(0, random.nextInt(10) - 7);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        switch (iBlockState.b(aWa).ordinal()) {
            case 12: {
                return MapColor.bdF;
            }
            case 10: {
                return MapColor.bdE;
            }
            case 9: {
                return MapColor.bdE;
            }
        }
        return super.b(iBlockState);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(this.aWb);
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(this.aWb);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM();
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aWa, BlockHugeMushroom$EnumType.aY(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aWa).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aWa);
    }
}

