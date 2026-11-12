/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.entity.c;
import net.minecraft.entity.item.k;
import net.minecraft.item.bq;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

class br
extends a {
    private final a cWG = new a();

    br() {
    }

    @Override
    public co b(e e2, co co2) {
        Object object;
        double d2;
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection;
        ao ao2 = BlockDispenser.aQ(e2.zg());
        w w2 = e2.de();
        double d3 = e2.getX() + (double)ao2.asH() * 1.125;
        double d4 = Math.floor(e2.getY()) + (double)ao2.asI();
        double d5 = e2.getZ() + (double)ao2.asJ() * 1.125;
        b b2 = e2.dg().x(ao2);
        IBlockState iBlockState = w2.L(b2);
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection2 = blockRailBase$EnumRailDirection = iBlockState.df() instanceof BlockRailBase ? iBlockState.b(((BlockRailBase)iBlockState.df()).yP()) : BlockRailBase$EnumRailDirection.aYQ;
        if (BlockRailBase.p(iBlockState)) {
            d2 = blockRailBase$EnumRailDirection.yQ() ? 0.6 : 0.1;
        } else {
            if (iBlockState.df().xb() != Material.beo || !BlockRailBase.p(w2.L(b2.aqY()))) {
                return this.cWG.a(e2, co2);
            }
            object = w2.L(b2.aqY());
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection3 = object.df() instanceof BlockRailBase ? object.b(((BlockRailBase)object.df()).yP()) : BlockRailBase$EnumRailDirection.aYQ;
            d2 = ao2 != ao.dwq && blockRailBase$EnumRailDirection3.yQ() ? -0.4 : -0.9;
        }
        object = k.a(w2, d3, d4 + d2, d5, ((bq)co2.bP()).cWF);
        if (co2.aen()) {
            ((k)object).ec(co2.getDisplayName());
        }
        w2.G((c)object);
        co2.ge(1);
        return co2;
    }

    @Override
    protected void b(e e2) {
        e2.de().e(1000, e2.dg(), 0);
    }
}

