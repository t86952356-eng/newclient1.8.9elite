/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class x
extends a {
    public x(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.cqY);
        this.eb("waterWalker");
    }

    @Override
    public int ei(int n2) {
        return n2 * 10;
    }

    @Override
    public int ej(int n2) {
        return this.ei(n2) + 15;
    }

    @Override
    public int Te() {
        return 3;
    }
}

