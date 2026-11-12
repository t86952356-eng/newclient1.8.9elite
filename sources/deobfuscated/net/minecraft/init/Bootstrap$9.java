/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.entity.item.b;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.world.w;

class Bootstrap$9
extends a {
    private final a cPd = new a();

    Bootstrap$9() {
    }

    @Override
    public co b(e e2, co co2) {
        double d2;
        ao ao2 = BlockDispenser.aQ(e2.zg());
        w w2 = e2.de();
        double d3 = e2.getX() + (double)((float)ao2.asH() * 1.125f);
        double d4 = e2.getY() + (double)((float)ao2.asI() * 1.125f);
        double d5 = e2.getZ() + (double)((float)ao2.asJ() * 1.125f);
        net.minecraft.util.b b2 = e2.dg().x(ao2);
        Material material = w2.L(b2).df().xb();
        if (Material.bev.equals(material)) {
            d2 = 1.0;
        } else {
            if (!Material.beo.equals(material) || !Material.bev.equals(w2.L(b2.aqY()).df().xb())) {
                return this.cPd.a(e2, co2);
            }
            d2 = 0.0;
        }
        b b3 = new b(w2, d3, d4 + d2, d5);
        w2.G(b3);
        co2.ge(1);
        return co2;
    }

    @Override
    protected void b(e e2) {
        e2.de().e(1000, e2.dg(), 0);
    }
}

