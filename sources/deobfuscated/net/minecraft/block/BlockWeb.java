/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockWeb
extends Block {
    public BlockWeb() {
        super(Material.beU);
        this.a(a.cpy);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        c2.Ud();
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cPJ;
    }

    @Override
    protected boolean xy() {
        return true;
    }

    @Override
    public av xo() {
        return av.dxX;
    }
}

