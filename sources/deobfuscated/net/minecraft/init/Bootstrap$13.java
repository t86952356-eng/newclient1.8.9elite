/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.item.ar;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.world.w;

class Bootstrap$13
extends a {
    private boolean cOY = true;

    Bootstrap$13() {
    }

    @Override
    protected co b(e e2, co co2) {
        if (net.minecraft.item.b.cUC == net.minecraft.item.b.fR(co2.yc())) {
            b b2;
            w w2 = e2.de();
            if (ar.a(co2, w2, b2 = e2.dg().x(BlockDispenser.aQ(e2.zg())))) {
                if (!w2.dDw) {
                    w2.e(2005, b2, 0);
                }
            } else {
                this.cOY = false;
            }
            return co2;
        }
        return super.b(e2, co2);
    }

    @Override
    protected void b(e e2) {
        if (this.cOY) {
            e2.de().e(1000, e2.dg(), 0);
        } else {
            e2.de().e(1001, e2.dg(), 0);
        }
    }
}

