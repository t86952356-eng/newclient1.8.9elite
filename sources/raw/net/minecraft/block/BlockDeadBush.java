/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockDeadBush
extends BlockBush {
    protected BlockDeadBush() {
        super(Material.bez);
        float f2 = 0.4f;
        this.a(0.099999994f, 0.0f, 0.099999994f, 0.9f, 0.8f, 0.9f);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bdP;
    }

    @Override
    protected boolean l(Block block) {
        return block == Blocks.cLo || block == Blocks.cOB || block == Blocks.cOw || block == Blocks.cLf;
    }

    @Override
    public boolean a(w w2, b b2) {
        return true;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public void a(w w2, a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        if (!w2.dDw && a2.abO() != null && a2.abO().bP() == Items.cRi) {
            a2.a(n.dqC[Block.i(this)]);
            BlockDeadBush.a(w2, b2, new co(Blocks.cLK, 1, 0));
        } else {
            super.a(w2, a2, b2, iBlockState, d2);
        }
    }
}

