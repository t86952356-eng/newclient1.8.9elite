/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import java.util.Random;
import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.dispenser.h;
import net.minecraft.entity.projectile.g;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.world.w;

class Bootstrap$8
extends a {
    Bootstrap$8() {
    }

    @Override
    public co b(e e2, co co2) {
        ao ao2 = BlockDispenser.aQ(e2.zg());
        h h2 = BlockDispenser.a(e2);
        double d2 = h2.getX() + (double)((float)ao2.asH() * 0.3f);
        double d3 = h2.getY() + (double)((float)ao2.asI() * 0.3f);
        double d4 = h2.getZ() + (double)((float)ao2.asJ() * 0.3f);
        w w2 = e2.de();
        Random random = w2.dDk;
        double d5 = random.nextGaussian() * 0.05 + (double)ao2.asH();
        double d6 = random.nextGaussian() * 0.05 + (double)ao2.asI();
        double d7 = random.nextGaussian() * 0.05 + (double)ao2.asJ();
        w2.G(new g(w2, d2, d3, d4, d5, d6, d7));
        co2.ge(1);
        return co2;
    }

    @Override
    protected void b(e e2) {
        e2.de().e(1009, e2.dg(), 0);
    }
}

