/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class cb
extends d {
    private final Block cWP;

    public cb(Block block) {
        this.cWP = block;
    }

    @Override
    public boolean a(co co2, a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState;
        IBlockState iBlockState2 = w2.L(b2);
        Block block = iBlockState2.df();
        if (block == Blocks.cMJ && iBlockState2.b(BlockSnow.baT) < 1) {
            ao2 = ao.dwr;
        } else if (!block.a(w2, b2)) {
            b2 = b2.x(ao2);
        }
        if (!a2.a(b2, ao2, co2)) {
            return false;
        }
        if (co2.cWZ == 0) {
            return false;
        }
        if (w2.a(this.cWP, b2, false, ao2, null, co2) && w2.a(b2, iBlockState = this.cWP.a(w2, b2, ao2, f2, f3, f4, 0, a2), 3)) {
            iBlockState = w2.L(b2);
            if (iBlockState.df() == this.cWP) {
                af.a(w2, a2, b2, co2);
                iBlockState.df().a(w2, b2, iBlockState, a2, co2);
            }
            w2.a((float)b2.wt() + 0.5f, (double)((float)b2.wu() + 0.5f), (double)((float)b2.wx() + 0.5f), this.cWP.aSB.xQ(), (this.cWP.aSB.getVolume() + 1.0f) / 2.0f, this.cWP.aSB.xT() * 0.8f);
            --co2.cWZ;
            return true;
        }
        return false;
    }
}

