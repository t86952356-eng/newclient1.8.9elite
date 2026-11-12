/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBreakable;
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

public class BlockStainedGlass
extends BlockBreakable {
    public static final PropertyEnum<net.minecraft.item.b> baX = PropertyEnum.c("color", net.minecraft.item.b.class);

    public BlockStainedGlass(Material material) {
        super(material, false);
        this.h(this.aSG.zS().a(baX, net.minecraft.item.b.cUC));
        this.a(a.cpx);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(baX).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (net.minecraft.item.b b2 : net.minecraft.item.b.values()) {
            list.add(new co(d2, 1, b2.yc()));
        }
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(baX).lv();
    }

    @Override
    public av xo() {
        return av.dxY;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    protected boolean xy() {
        return true;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(baX, net.minecraft.item.b.fS(n2));
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

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(baX).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, baX);
    }
}

