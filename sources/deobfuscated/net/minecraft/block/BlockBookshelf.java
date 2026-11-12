/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Items;
import net.minecraft.item.d;

public class BlockBookshelf
extends Block {
    public BlockBookshelf() {
        super(Material.ber);
        this.a(a.cpx);
    }

    @Override
    public int a(Random random) {
        return 3;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQP;
    }
}

