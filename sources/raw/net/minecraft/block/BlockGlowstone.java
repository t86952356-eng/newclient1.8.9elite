/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.bt;

public class BlockGlowstone
extends Block {
    public BlockGlowstone(Material material) {
        super(material);
        this.a(a.cpx);
    }

    @Override
    public int a(int n2, Random random) {
        return bt.F(this.a(random) + random.nextInt(n2 + 1), 1, 4);
    }

    @Override
    public int a(Random random) {
        return 2 + random.nextInt(3);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQX;
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bdE;
    }
}

