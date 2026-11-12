/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.creativetab.a;
import net.minecraft.entity.passive.k;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class cc
extends d {
    public cc() {
        this.cVn = 1;
        this.d(a.cpA);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, r r2) {
        if (r2 instanceof k) {
            k k2 = (k)r2;
            if (!k2.aaQ() && !k2.Uz()) {
                k2.bz(true);
                k2.baU.a(k2, "mob.horse.leather", 0.5f, 1.0f);
                --co2.cWZ;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(co co2, r r2, r r3) {
        this.a(co2, null, r2);
        return true;
    }
}

