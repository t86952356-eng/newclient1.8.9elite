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

public class BlockMelon
extends Block {
    protected BlockMelon() {
        super(Material.beQ, MapColor.bdV);
        this.a(a.cpx);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cRj;
    }

    @Override
    public int a(Random random) {
        return 3 + random.nextInt(5);
    }

    @Override
    public int a(int n2, Random random) {
        return Math.min(9, this.a(random) + random.nextInt(1 + n2));
    }
}

