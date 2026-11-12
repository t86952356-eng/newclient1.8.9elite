/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class t
extends a {
    public t(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crb);
        this.eb("oxygen");
    }

    @Override
    public int ei(int n2) {
        return 10 * n2;
    }

    @Override
    public int ej(int n2) {
        return this.ei(n2) + 30;
    }

    @Override
    public int Te() {
        return 3;
    }
}

