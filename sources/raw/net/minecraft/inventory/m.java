/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.j;
import net.minecraft.item.b;
import net.minecraft.item.co;

class m
extends ak {
    m(j j2, ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
    }

    @Override
    public boolean H(co co2) {
        return co2.bP() == Items.cRa && b.fR(co2.yc()) == b.cUN;
    }
}

