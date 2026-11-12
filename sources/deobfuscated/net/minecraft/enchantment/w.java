/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.cm;

public class w
extends a {
    protected w(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crd);
        this.eb("untouching");
    }

    @Override
    public int ei(int n2) {
        return 15;
    }

    @Override
    public int ej(int n2) {
        return super.ei(n2) + 50;
    }

    @Override
    public int Te() {
        return 1;
    }

    @Override
    public boolean a(a a2) {
        return super.a(a2) && a2.cqw != w.cqp.cqw;
    }

    @Override
    public boolean T(co co2) {
        return co2.bP() == Items.cRi || super.T(co2);
    }
}

