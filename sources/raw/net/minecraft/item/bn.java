/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.ao;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.world.w;

public class bn
extends ao {
    public bn(Block block) {
        super(block, false);
    }

    @Override
    public co a(co co2, w w2, a a2) {
        ce ce2 = this.a(w2, a2, true);
        if (ce2 == null) {
            return co2;
        }
        if (ce2.dzu == cf.dzy) {
            b b2 = ce2.dg();
            if (!w2.a(a2, b2)) {
                return co2;
            }
            if (!a2.a(b2.x(ce2.dzv), ce2.dzv, co2)) {
                return co2;
            }
            b b3 = b2.aqX();
            IBlockState iBlockState = w2.L(b2);
            if (iBlockState.df().xb() == Material.bev && iBlockState.b(BlockLiquid.aWV) == 0 && w2.aG(b3)) {
                w2.d(b3, Blocks.cNz.xM());
                if (!a2.cIt.cJM) {
                    --co2.cWZ;
                }
                a2.a(n.dqE[d.p(this)]);
            }
        }
        return co2;
    }

    @Override
    public int e(co co2, int n2) {
        return Blocks.cNz.e(Blocks.cNz.aM(co2.yc()));
    }
}

