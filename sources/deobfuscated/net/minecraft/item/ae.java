/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBed$EnumPartType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class ae
extends d {
    public ae() {
        this.d(a.cpy);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        if (ao2 != ao.dwr) {
            return false;
        }
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        boolean bl2 = block.a(w2, b2);
        if (!bl2) {
            b2 = b2.aqX();
        }
        int n2 = bt.aF((double)(a2.pl * 4.0f / 360.0f) + 0.5) & 3;
        ao ao3 = ao.hz(n2);
        b b3 = b2.x(ao3);
        if (a2.a(b2, ao2, co2) && a2.a(b3, ao2, co2)) {
            boolean bl3;
            boolean bl4 = w2.L(b3).df().a(w2, b3);
            boolean bl5 = bl2 || w2.aG(b2);
            boolean bl6 = bl3 = bl4 || w2.aG(b3);
            if (bl5 && bl3 && w.v(w2, b2.aqY()) && w.v(w2, b3.aqY())) {
                IBlockState iBlockState2 = Blocks.cLE.xM().a(BlockBed.aTd, false).a(BlockBed.aTB, ao3).a(BlockBed.aTc, BlockBed$EnumPartType.aTf);
                if (w2.a(b2, iBlockState2, 3)) {
                    IBlockState iBlockState3 = iBlockState2.a(BlockBed.aTc, BlockBed$EnumPartType.aTe);
                    w2.a(b3, iBlockState3, 3);
                }
                --co2.cWZ;
                return true;
            }
            return false;
        }
        return false;
    }
}

