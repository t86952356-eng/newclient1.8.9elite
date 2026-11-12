/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.enchantment.l;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.stats.n;
import net.minecraft.tileentity.d;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.g;
import net.minecraft.world.w;

public class BlockIce
extends BlockBreakable {
    public BlockIce() {
        super(Material.beK, false);
        this.aSF = 0.98f;
        this.O(true);
        this.a(a.cpx);
    }

    @Override
    public av xo() {
        return av.dxY;
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, d d2) {
        a2.a(n.dqC[Block.i(this)]);
        a2.bs(0.025f);
        if (this.xy() && l.L(a2)) {
            co co2 = this.f(iBlockState);
            if (co2 != null) {
                BlockIce.a(w2, b2, co2);
            }
        } else {
            if (w2.dDl.awe()) {
                w2.aL(b2);
                return;
            }
            int n2 = l.M(a2);
            this.a(w2, b2, iBlockState, n2);
            Material material = w2.L(b2.aqY()).df().xb();
            if (material.zy() || material.zv()) {
                w2.d(b2, Blocks.cLk.xM());
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (w2.b(g.dCa, b2) > 11 - this.wX()) {
            if (w2.dDl.awe()) {
                w2.aL(b2);
            } else {
                this.a(w2, b2, w2.L(b2), 0);
                w2.d(b2, Blocks.cLl.xM());
            }
        }
    }

    @Override
    public int xE() {
        return 0;
    }
}

