/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.cm;

public class h
extends a {
    protected h(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crd);
        this.eb("digging");
    }

    @Override
    public int ei(int n2) {
        return 1 + 10 * (n2 - 1);
    }

    @Override
    public int ej(int n2) {
        return super.ei(n2) + 50;
    }

    @Override
    public int Te() {
        return 5;
    }

    @Override
    public boolean T(co co2) {
        return co2.bP() == Items.cRi || super.T(co2);
    }
}

