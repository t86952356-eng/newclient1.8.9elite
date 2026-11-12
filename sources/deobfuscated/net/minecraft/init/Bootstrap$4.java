/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.dispenser.b;
import net.minecraft.dispenser.h;
import net.minecraft.entity.ag;
import net.minecraft.entity.item.f;
import net.minecraft.world.w;

class Bootstrap$4
extends b {
    Bootstrap$4() {
    }

    @Override
    protected ag a(w w2, h h2) {
        return new f(w2, h2.getX(), h2.getY(), h2.getZ());
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

