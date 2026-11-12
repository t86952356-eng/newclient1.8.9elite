/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockEndPortalFrame
extends Block {
    public static final PropertyDirection aUu = PropertyDirection.a("facing", ar.dwT);
    public static final PropertyBool aUv = PropertyBool.cs("eye");

    public BlockEndPortalFrame() {
        super(Material.bes, MapColor.bed);
        this.h(this.aSG.zS().a(aUu, ao.dws).a(aUv, false));
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public void xx() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        if (w2.L(b2).b(aUv).booleanValue()) {
            this.a(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
            super.a(w2, b2, iBlockState, a2, list, c2);
        }
        this.xx();
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aUu, r2.Uq().asC()).a(aUv, false);
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        return w2.L(b2).b(aUv) != false ? 15 : 0;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aUv, (n2 & 4) != 0).a(aUu, ao.hz(n2 & 3));
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aUu).asA();
        if (iBlockState.b(aUv).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aUu, aUv);
    }
}

