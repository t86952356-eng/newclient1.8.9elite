/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.e;
import net.minecraft.item.co;

class f
extends ak {
    public f(e e2, ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
    }

    @Override
    public boolean H(co co2) {
        return co2 != null && co2.bP().as(co2);
    }

    @Override
    public int GL() {
        return 64;
    }
}

