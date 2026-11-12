/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.p;
import net.minecraft.item.co;

class q
extends ak {
    q(p p2, ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
    }

    @Override
    public boolean H(co co2) {
        return super.H(co2) && co2.bP() == Items.cQE && !this.GJ();
    }
}

