/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.item.co;
import net.minecraft.tileentity.y;

public class am
extends ak {
    public am(ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
    }

    @Override
    public boolean H(co co2) {
        return y.aX(co2) || am.am(co2);
    }

    @Override
    public int J(co co2) {
        return am.am(co2) ? 1 : super.J(co2);
    }

    public static boolean am(co co2) {
        return co2 != null && co2.bP() != null && co2.bP() == Items.cQA;
    }
}

