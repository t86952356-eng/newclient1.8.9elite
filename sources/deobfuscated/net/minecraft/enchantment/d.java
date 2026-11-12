/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class d
extends a {
    public d(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crg);
        this.eb("arrowInfinite");
    }

    @Override
    public int ei(int n2) {
        return 20;
    }

    @Override
    public int ej(int n2) {
        return 50;
    }

    @Override
    public int Te() {
        return 1;
    }
}

