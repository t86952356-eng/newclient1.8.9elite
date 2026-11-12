/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.dispenser.c;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.m;
import net.minecraft.item.br;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class bq
extends d {
    private static final c cWE = new br();
    private final m cWF;

    public bq(m m2) {
        this.cVn = 1;
        this.cWF = m2;
        this.d(a.cpA);
        BlockDispenser.aTP.b(this, cWE);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState = w2.L(b2);
        if (BlockRailBase.p(iBlockState)) {
            if (!w2.dDw) {
                BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = iBlockState.df() instanceof BlockRailBase ? iBlockState.b(((BlockRailBase)iBlockState.df()).yP()) : BlockRailBase$EnumRailDirection.aYQ;
                double d2 = 0.0;
                if (blockRailBase$EnumRailDirection.yQ()) {
                    d2 = 0.5;
                }
                k k2 = k.a(w2, (double)b2.wt() + 0.5, (double)b2.wu() + 0.0625 + d2, (double)b2.wx() + 0.5, this.cWF);
                if (co2.aen()) {
                    k2.ec(co2.getDisplayName());
                }
                w2.G(k2);
            }
            --co2.cWZ;
            return true;
        }
        return false;
    }
}

