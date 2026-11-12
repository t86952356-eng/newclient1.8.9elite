/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.dispenser.h;
import net.minecraft.entity.ag;
import net.minecraft.entity.projectile.b;
import net.minecraft.world.w;

class Bootstrap$2
extends net.minecraft.dispenser.b {
    Bootstrap$2() {
    }

    @Override
    protected ag a(w w2, h h2) {
        return new b(w2, h2.getX(), h2.getY(), h2.getZ());
    }
}

