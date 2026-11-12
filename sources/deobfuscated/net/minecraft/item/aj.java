/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.world.w;

public class aj
extends d {
    private final Block cVY;

    public aj(Block block) {
        this.cVn = 1;
        this.cVY = block;
        this.d(a.cpB);
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        boolean bl2 = this.cVY == Blocks.cLc;
        ce ce2 = this.a(w2, a2, bl2);
        if (ce2 == null) {
            return co2;
        }
        if (ce2.dzu == cf.dzy) {
            b b2 = ce2.dg();
            if (!w2.a(a2, b2)) {
                return co2;
            }
            if (bl2) {
                if (!a2.a(b2.x(ce2.dzv), ce2.dzv, co2)) {
                    return co2;
                }
                IBlockState iBlockState = w2.L(b2);
                Material material = iBlockState.df().xb();
                if (material == Material.bev && iBlockState.b(BlockLiquid.aWV) == 0) {
                    w2.aL(b2);
                    a2.a(n.dqE[d.p(this)]);
                    return this.a(co2, a2, Items.cQB);
                }
                if (material == Material.bew && iBlockState.b(BlockLiquid.aWV) == 0) {
                    w2.aL(b2);
                    a2.a(n.dqE[d.p(this)]);
                    return this.a(co2, a2, Items.cQC);
                }
            } else {
                if (this.cVY == Blocks.cLc) {
                    return new co(Items.cQA);
                }
                b b3 = b2.x(ce2.dzv);
                if (!a2.a(b3, ce2.dzv, co2)) {
                    return co2;
                }
                if (this.ac(w2, b3) && !a2.cIt.cJM) {
                    a2.a(n.dqE[d.p(this)]);
                    return new co(Items.cQA);
                }
            }
        }
        return co2;
    }

    private co a(co co2, net.minecraft.entity.player.a a2, d d2) {
        if (a2.cIt.cJM) {
            return co2;
        }
        if (--co2.cWZ <= 0) {
            return new co(d2);
        }
        if (!a2.cHV.ah(new co(d2))) {
            a2.d(new co(d2, 1, 0), false);
        }
        return co2;
    }

    public boolean ac(w w2, b b2) {
        boolean bl2;
        if (this.cVY == Blocks.cLc) {
            return false;
        }
        Material material = w2.L(b2).df().xb();
        boolean bl3 = bl2 = !material.zw();
        if (!w2.aG(b2) && !bl2) {
            return false;
        }
        if (w2.dDl.awe() && this.cVY == Blocks.cLk) {
            int n2 = b2.wt();
            int n3 = b2.wu();
            int n4 = b2.wx();
            w2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.fizz", 0.5f, 2.6f + (w2.dDk.nextFloat() - w2.dDk.nextFloat()) * 0.8f);
            for (int i2 = 0; i2 < 8; ++i2) {
                w2.a(as.dxi, (double)n2 + Math.random(), (double)n3 + Math.random(), (double)n4 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
            }
        } else {
            if (!w2.dDw && bl2 && !material.zv()) {
                w2.c(b2, true);
            }
            w2.a(b2, this.cVY.xM(), 3);
        }
        return true;
    }
}

