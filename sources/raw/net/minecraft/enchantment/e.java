/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class e
extends a {
    public e(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crg);
        this.eb("arrowKnockback");
    }

    @Override
    public int ei(int n2) {
        return 12 + (n2 - 1) * 20;
    }

    @Override
    public int ej(int n2) {
        return this.ei(n2) + 25;
    }

    @Override
    public int Te() {
        return 2;
    }
}

