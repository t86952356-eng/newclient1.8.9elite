/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.tileentity.ag;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockSign
extends BlockContainer {
    protected BlockSign() {
        super(Material.ber);
        float f2 = 0.25f;
        float f3 = 1.0f;
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public a c(w w2, b b2) {
        this.c((l)w2, b2);
        return super.c(w2, b2);
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean a(l l2, b b2) {
        return true;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xz() {
        return true;
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new ag();
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQt;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cQt;
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        net.minecraft.tileentity.d d2 = w2.K(b2);
        return d2 instanceof ag && ((ag)d2).K(a2);
    }

    @Override
    public boolean d(w w2, b b2) {
        return !this.v(w2, b2) && super.d(w2, b2);
    }
}

