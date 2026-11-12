/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class k
extends a {
    protected k(int n2, cm cm2, int n3, z z2) {
        super(n2, cm2, n3, z2);
        this.eb("fishingSpeed");
    }

    @Override
    public int ei(int n2) {
        return 15 + (n2 - 1) * 9;
    }

    @Override
    public int ej(int n2) {
        return super.ei(n2) + 50;
    }

    @Override
    public int Te() {
        return 3;
    }
}

