/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.entity.item.v;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.world.w;

class Bootstrap$14
extends a {
    Bootstrap$14() {
    }

    @Override
    protected co b(e e2, co co2) {
        w w2 = e2.de();
        b b2 = e2.dg().x(BlockDispenser.aQ(e2.zg()));
        v v2 = new v(w2, (double)b2.wt() + 0.5, b2.wu(), (double)b2.wx() + 0.5, null);
        w2.G(v2);
        w2.a(v2, "game.tnt.primed", 1.0f, 1.0f);
        --co2.cWZ;
        return co2;
    }
}

