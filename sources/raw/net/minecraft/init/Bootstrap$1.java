/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.dispenser.b;
import net.minecraft.dispenser.h;
import net.minecraft.entity.ag;
import net.minecraft.entity.projectile.a;
import net.minecraft.world.w;

class Bootstrap$1
extends b {
    Bootstrap$1() {
    }

    @Override
    protected ag a(w w2, h h2) {
        a a2 = new a(w2, h2.getX(), h2.getY(), h2.getZ());
        a2.cJW = 1;
        return a2;
    }
}

