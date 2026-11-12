/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.d;
import net.minecraft.tileentity.ab;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockMobSpawner
extends BlockContainer {
    protected BlockMobSpawner() {
        super(Material.bes);
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new ab();
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        super.a(w2, b2, iBlockState, f2, n2);
        int n3 = 15 + w2.dDk.nextInt(15) + w2.dDk.nextInt(15);
        this.a(w2, b2, n3);
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public d e(w w2, b b2) {
        return null;
    }
}

