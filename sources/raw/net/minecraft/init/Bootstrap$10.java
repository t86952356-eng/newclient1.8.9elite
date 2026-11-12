/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.init.Items;
import net.minecraft.item.aj;
import net.minecraft.item.co;
import net.minecraft.util.b;

class Bootstrap$10
extends a {
    private final a cOV = new a();

    Bootstrap$10() {
    }

    @Override
    public co b(e e2, co co2) {
        aj aj2 = (aj)co2.bP();
        b b2 = e2.dg().x(BlockDispenser.aQ(e2.zg()));
        if (aj2.ac(e2.de(), b2)) {
            co2.r(Items.cQA);
            co2.cWZ = 1;
            return co2;
        }
        return this.cOV.a(e2, co2);
    }
}

