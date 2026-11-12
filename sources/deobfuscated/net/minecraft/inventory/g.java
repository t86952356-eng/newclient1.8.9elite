/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.item.co;
import net.minecraft.stats.b;

class g
extends ak {
    private final a cSX;

    public g(a a2, ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
        this.cSX = a2;
    }

    @Override
    public boolean H(co co2) {
        return g.aj(co2);
    }

    @Override
    public int GL() {
        return 1;
    }

    @Override
    public void a(a a2, co co2) {
        if (co2.bP() == Items.cRD && co2.yc() > 0) {
            this.cSX.a(b.dpa);
        }
        super.a(a2, co2);
    }

    public static boolean aj(co co2) {
        return co2 != null && (co2.bP() == Items.cRD || co2.bP() == Items.cRE);
    }
}

