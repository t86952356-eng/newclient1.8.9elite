/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import java.util.Random;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.item.co;
import net.minecraft.item.y;
import net.minecraft.util.cm;

public class i
extends a {
    protected i(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.crf);
        this.eb("durability");
    }

    @Override
    public int ei(int n2) {
        return 5 + (n2 - 1) * 8;
    }

    @Override
    public int ej(int n2) {
        return super.ei(n2) + 50;
    }

    @Override
    public int Te() {
        return 3;
    }

    @Override
    public boolean T(co co2) {
        return co2.aed() || super.T(co2);
    }

    public static boolean a(co co2, int n2, Random random) {
        return !(co2.bP() instanceof y && random.nextFloat() < 0.6f || random.nextInt(n2 + 1) <= 0);
    }
}

