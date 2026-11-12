/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class BlockPressurePlateWeighted
extends BlockBasePressurePlate {
    public static final PropertyInteger aYj = PropertyInteger.e("power", 0, 15);
    private final int aYk;

    protected BlockPressurePlateWeighted(Material material, int n2) {
        this(material, n2, material.zK());
    }

    protected BlockPressurePlateWeighted(Material material, int n2, MapColor mapColor) {
        super(material, mapColor);
        this.h(this.aSG.zS().a(aYj, 0));
        this.aYk = n2;
    }

    @Override
    protected int l(w w2, b b2) {
        int n2 = Math.min(w2.a(c.class, this.x(b2)).size(), this.aYk);
        if (n2 > 0) {
            float f2 = (float)Math.min(this.aYk, n2) / (float)this.aYk;
            return bt.bM(f2 * 15.0f);
        }
        return 0;
    }

    @Override
    protected int j(IBlockState iBlockState) {
        return iBlockState.b(aYj);
    }

    @Override
    protected IBlockState a(IBlockState iBlockState, int n2) {
        return iBlockState.a(aYj, n2);
    }

    @Override
    public int c(w w2) {
        return 10;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aYj, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aYj);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aYj);
    }
}

