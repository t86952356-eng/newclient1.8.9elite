/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.passive.f;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.p;
import net.minecraft.item.co;

class r
extends ak {
    final /* synthetic */ f cTq;

    r(p p2, ab ab2, int n2, int n3, int n4, f f2) {
        this.cTq = f2;
        super(ab2, n2, n3, n4);
    }

    @Override
    public boolean H(co co2) {
        return super.H(co2) && this.cTq.aaB() && f.j(co2.bP());
    }

    @Override
    public boolean adh() {
        return this.cTq.aaB();
    }
}

