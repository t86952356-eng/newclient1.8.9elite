/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.t;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.y;

class u
extends ak {
    final /* synthetic */ int cTy;

    u(t t2, ab ab2, int n2, int n3, int n4, int n5) {
        this.cTy = n5;
        super(ab2, n2, n3, n4);
    }

    @Override
    public int GL() {
        return 1;
    }

    @Override
    public boolean H(co co2) {
        return co2 != null && (co2.bP() instanceof y ? ((y)co2.bP()).cVH == this.cTy : (co2.bP() == d.I(Blocks.cMW) || co2.bP() == Items.cSb) && this.cTy == 0);
    }

    @Override
    public String GM() {
        return y.cVF[this.cTy];
    }
}

