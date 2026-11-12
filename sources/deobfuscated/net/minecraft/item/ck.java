/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ck
extends af {
    public ck(Block block) {
        super(block);
        this.fW(0);
        this.bM(true);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState;
        a a3;
        int n2;
        if (co2.cWZ == 0) {
            return false;
        }
        if (!a2.a(b2, ao2, co2)) {
            return false;
        }
        IBlockState iBlockState2 = w2.L(b2);
        Block block = iBlockState2.df();
        b b3 = b2;
        if (!(ao2 == ao.dwr && block == this.cVW || block.a(w2, b2))) {
            b3 = b2.x(ao2);
            iBlockState2 = w2.L(b3);
            block = iBlockState2.df();
        }
        if (block == this.cVW && (n2 = iBlockState2.b(BlockSnow.baT).intValue()) <= 7 && (a3 = this.cVW.a(w2, b3, iBlockState = iBlockState2.a(BlockSnow.baT, n2 + 1))) != null && w2.s(a3) && w2.a(b3, iBlockState, 2)) {
            w2.a((float)b3.wt() + 0.5f, (double)((float)b3.wu() + 0.5f), (double)((float)b3.wx() + 0.5f), this.cVW.aSB.xQ(), (this.cVW.aSB.getVolume() + 1.0f) / 2.0f, this.cVW.aSB.xT() * 0.8f);
            --co2.cWZ;
            return true;
        }
        return super.a(co2, a2, w2, b3, ao2, f2, f3, f4);
    }

    @Override
    public int fV(int n2) {
        return n2;
    }
}

