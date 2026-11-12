/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockRedstoneLight
extends Block {
    private final boolean aZH;

    public BlockRedstoneLight(boolean bl2) {
        super(Material.beH);
        this.aZH = bl2;
        if (bl2) {
            this.J(1.0f);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            if (this.aZH && !w2.bb(b2)) {
                w2.a(b2, Blocks.cNL.xM(), 2);
            } else if (!this.aZH && w2.bb(b2)) {
                w2.a(b2, Blocks.cNM.xM(), 2);
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw) {
            if (this.aZH && !w2.bb(b2)) {
                w2.a(b2, (Block)this, 4);
            } else if (!this.aZH && w2.bb(b2)) {
                w2.a(b2, Blocks.cNM.xM(), 2);
            }
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw && this.aZH && !w2.bb(b2)) {
            w2.a(b2, Blocks.cNL.xM(), 2);
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cNL);
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(Blocks.cNL);
    }

    @Override
    protected co f(IBlockState iBlockState) {
        return new co(Blocks.cNL);
    }
}

