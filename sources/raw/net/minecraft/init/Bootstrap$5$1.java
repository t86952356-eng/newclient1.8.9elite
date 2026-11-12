/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.dispenser.b;
import net.minecraft.dispenser.h;
import net.minecraft.entity.ag;
import net.minecraft.entity.projectile.f;
import net.minecraft.init.Bootstrap$5;
import net.minecraft.item.co;
import net.minecraft.world.w;

class Bootstrap$5$1
extends b {
    final /* synthetic */ co cPc;

    Bootstrap$5$1(Bootstrap.5 var1_1, co co2) {
        this.cPc = co2;
    }

    @Override
    protected ag a(w w2, h h2) {
        return new f(w2, h2.getX(), h2.getY(), h2.getZ(), this.cPc.aeg());
    }

    @Override
    protected float Ta() {
        return super.Ta() * 0.5f;
    }

    @Override
    protected float Tb() {
        return super.Tb() * 1.25f;
    }
}

