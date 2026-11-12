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
import net.minecraft.util.b;
import net.minecraft.world.g;
import net.minecraft.world.w;

public class BlockSnowBlock
extends Block {
    protected BlockSnowBlock() {
        super(Material.beN);
        this.O(true);
        this.a(a.cpx);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQH;
    }

    @Override
    public int a(Random random) {
        return 4;
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (w2.b(g.dCa, b2) > 11) {
            this.a(w2, b2, w2.L(b2), 0);
            w2.aL(b2);
        }
    }
}

