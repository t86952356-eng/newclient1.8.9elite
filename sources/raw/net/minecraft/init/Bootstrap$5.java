/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.dispenser.a;
import net.minecraft.dispenser.c;
import net.minecraft.dispenser.e;
import net.minecraft.init.Bootstrap$5$1;
import net.minecraft.item.by;
import net.minecraft.item.co;

class Bootstrap$5
implements c {
    private final a cPb = new a();

    Bootstrap$5() {
    }

    @Override
    public co a(e e2, co co2) {
        return by.gb(co2.yc()) ? new Bootstrap$5$1(this, co2).a(e2, co2) : this.cPb.a(e2, co2);
    }
}

