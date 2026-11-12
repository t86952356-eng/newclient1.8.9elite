/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockStainedGlassPane
extends BlockPane {
    public static final PropertyEnum<net.minecraft.item.b> baY = PropertyEnum.c("color", net.minecraft.item.b.class);

    public BlockStainedGlassPane() {
        super(Material.beG, false);
        this.h(this.aSG.zS().a(aXp, false).a(aXq, false).a(aXr, false).a(aXs, false).a(baY, net.minecraft.item.b.cUC));
        this.a(a.cpy);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(baY).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (int i2 = 0; i2 < net.minecraft.item.b.values().length; ++i2) {
            list.add(new co(d2, 1, i2));
        }
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(baY).lv();
    }

    @Override
    public av xo() {
        return av.dxY;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(baY, net.minecraft.item.b.fS(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(baY).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXp, aXq, aXs, aXr, baY);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            BlockBeacon.m(w2, b2);
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            BlockBeacon.m(w2, b2);
        }
    }
}

