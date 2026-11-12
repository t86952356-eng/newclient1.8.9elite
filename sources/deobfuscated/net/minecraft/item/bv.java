/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.creativetab.a;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class bv
extends d {
    public bv() {
        this.d(a.cpE);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, r r2) {
        if (!co2.aen()) {
            return false;
        }
        if (r2 instanceof p) {
            p p2 = (p)r2;
            p2.ec(co2.getDisplayName());
            p2.Vm();
            --co2.cWZ;
            return true;
        }
        return super.a(co2, a2, r2);
    }
}

