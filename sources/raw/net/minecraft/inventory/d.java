/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.c;
import net.minecraft.item.co;

class d
extends ak {
    public d(c c2, ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
    }

    @Override
    public boolean H(co co2) {
        return co2 != null && (co2.bP() == Items.cRS || co2.bP() == Items.cPm || co2.bP() == Items.cPo || co2.bP() == Items.cPn);
    }

    @Override
    public int GL() {
        return 1;
    }
}

