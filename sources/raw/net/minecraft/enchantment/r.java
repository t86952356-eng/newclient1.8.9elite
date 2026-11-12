/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class r
extends a {
    protected r(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crc);
        this.eb("knockback");
    }

    @Override
    public int ei(int n2) {
        return 5 + 20 * (n2 - 1);
    }

    @Override
    public int ej(int n2) {
        return super.ei(n2) + 50;
    }

    @Override
    public int Te() {
        return 2;
    }
}

