/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.entity.item.h;
import net.minecraft.item.co;
import net.minecraft.util.ao;

class Bootstrap$7
extends a {
    Bootstrap$7() {
    }

    @Override
    public co b(e e2, co co2) {
        ao ao2 = BlockDispenser.aQ(e2.zg());
        double d2 = e2.getX() + (double)ao2.asH();
        double d3 = (float)e2.dg().wu() + 0.2f;
        double d4 = e2.getZ() + (double)ao2.asJ();
        h h2 = new h(e2.de(), d2, d3, d4, co2);
        e2.de().G(h2);
        co2.ge(1);
        return co2;
    }

    @Override
    protected void b(e e2) {
        e2.de().e(1002, e2.dg(), 0);
    }
}

