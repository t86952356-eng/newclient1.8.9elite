/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.item.d;
import net.minecraft.tileentity.v;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockEndPortal
extends BlockContainer {
    protected BlockEndPortal(Material material) {
        super(material);
        this.J(1.0f);
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new v();
    }

    @Override
    public void c(l l2, b b2) {
        float f2 = 0.0625f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return ao2 == ao.dwq && super.a(l2, b2, ao2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        if (c2.crC == null && c2.crA == null && !w2.dDw) {
            c2.ez(1);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        double d2 = (float)b2.wt() + random.nextFloat();
        double d3 = (float)b2.wu() + 0.8f;
        double d4 = (float)b2.wx() + random.nextFloat();
        double d5 = 0.0;
        double d6 = 0.0;
        double d7 = 0.0;
        w2.a(as.dxh, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public d e(w w2, b b2) {
        return null;
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bef;
    }
}

