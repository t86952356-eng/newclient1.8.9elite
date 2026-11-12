/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockSoulSand
extends Block {
    public BlockSoulSand() {
        super(Material.beD, MapColor.bec);
        this.a(a.cpx);
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        float f2 = 0.125f;
        return new net.minecraft.util.a(b2.wt(), b2.wu(), b2.wx(), b2.wt() + 1, (float)(b2.wu() + 1) - 0.125f, b2.wx() + 1);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        c2.ud *= 0.4;
        c2.uf *= 0.4;
    }
}

