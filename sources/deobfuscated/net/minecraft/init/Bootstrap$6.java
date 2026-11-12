/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.bs;
import net.minecraft.item.co;
import net.minecraft.util.ao;

class Bootstrap$6
extends a {
    Bootstrap$6() {
    }

    @Override
    public co b(e e2, co co2) {
        ao ao2 = BlockDispenser.aQ(e2.zg());
        double d2 = e2.getX() + (double)ao2.asH();
        double d3 = (float)e2.dg().wu() + 0.2f;
        double d4 = e2.getZ() + (double)ao2.asJ();
        c c2 = bs.a(e2.de(), co2.yc(), d2, d3, d4);
        if (c2 instanceof r && co2.aen()) {
            c2.ec(co2.getDisplayName());
        }
        co2.ge(1);
        return co2;
    }
}

