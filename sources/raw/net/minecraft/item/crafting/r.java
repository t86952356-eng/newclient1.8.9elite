/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.u;
import net.minecraft.nbt.n;
import net.minecraft.world.storage.f;
import net.minecraft.world.w;

public class r
extends u {
    public r() {
        super(3, 3, new co[]{new co(Items.cQO), new co(Items.cQO), new co(Items.cQO), new co(Items.cQO), new co(Items.cRh, 0, Short.MAX_VALUE), new co(Items.cQO), new co(Items.cQO), new co(Items.cQO), new co(Items.cQO)}, new co(Items.cRZ, 0, 0));
    }

    @Override
    public boolean c(af af2, w w2) {
        if (!super.c(af2, w2)) {
            return false;
        }
        co co2 = null;
        for (int i2 = 0; i2 < af2.YI() && co2 == null; ++i2) {
            co co3 = af2.fi(i2);
            if (co3 == null || co3.bP() != Items.cRh) continue;
            co2 = co3;
        }
        if (co2 == null) {
            return false;
        }
        f f2 = Items.cRh.a(co2, w2);
        return f2 != null && f2.dTk < 4;
    }

    @Override
    public co a(af af2) {
        co co2 = null;
        for (int i2 = 0; i2 < af2.YI() && co2 == null; ++i2) {
            co co3 = af2.fi(i2);
            if (co3 == null || co3.bP() != Items.cRh) continue;
            co2 = co3;
        }
        co2 = co2.aeg();
        co2.cWZ = 1;
        if (co2.aek() == null) {
            co2.u(new n());
        }
        co2.aek().o("map_is_scaling", true);
        return co2;
    }
}

