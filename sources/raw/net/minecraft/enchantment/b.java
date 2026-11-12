/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class b
extends a {
    public b(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crg);
        this.eb("arrowDamage");
    }

    @Override
    public int ei(int n2) {
        return 1 + (n2 - 1) * 10;
    }

    @Override
    public int ej(int n2) {
        return this.ei(n2) + 15;
    }

    @Override
    public int Te() {
        return 5;
    }
}

