/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.item.g;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockFalling
extends Block {
    public static boolean aUB;

    public BlockFalling() {
        super(Material.beD);
        this.a(a.cpx);
    }

    public BlockFalling(Material material) {
        super(material);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        w2.a(b2, (Block)this, this.c(w2));
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        w2.a(b2, (Block)this, this.c(w2));
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw) {
            this.B(w2, b2);
        }
    }

    private void B(w w2, b b2) {
        if (BlockFalling.C(w2, b2.aqY()) && b2.wu() >= 0) {
            int n2 = 32;
            if (!aUB && w2.e(b2.C(-32, -32, -32), b2.C(32, 32, 32))) {
                if (!w2.dDw) {
                    g g2 = new g(w2, (double)b2.wt() + 0.5, b2.wu(), (double)b2.wx() + 0.5, w2.L(b2));
                    this.a(g2);
                    w2.G(g2);
                }
            } else {
                w2.aL(b2);
                b b3 = b2.aqY();
                while (BlockFalling.C(w2, b3) && b3.wu() > 0) {
                    b3 = b3.aqY();
                }
                if (b3.wu() > 0) {
                    w2.d(b3.aqX(), this.xM());
                }
            }
        }
    }

    protected void a(g g2) {
    }

    @Override
    public int c(w w2) {
        return 2;
    }

    public static boolean C(w w2, b b2) {
        Block block = w2.L(b2).df();
        Material material = block.aSD;
        return block == Blocks.cMd || material == Material.beo || material == Material.bev || material == Material.bew;
    }

    public void i(w w2, b b2) {
    }
}

