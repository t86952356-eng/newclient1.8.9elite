/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.dispenser.b;
import net.minecraft.dispenser.h;
import net.minecraft.entity.ag;
import net.minecraft.world.w;

class Bootstrap$3
extends b {
    Bootstrap$3() {
    }

    @Override
    protected ag a(w w2, h h2) {
        return new net.minecraft.entity.projectile.h(w2, h2.getX(), h2.getY(), h2.getZ());
    }
}

