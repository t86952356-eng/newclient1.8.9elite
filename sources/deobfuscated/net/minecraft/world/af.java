/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.world.ae;
import net.minecraft.world.border.c;

class af
extends c {
    af(ae ae2) {
    }

    @Override
    public double getCenterX() {
        return super.getCenterX() / 8.0;
    }

    @Override
    public double getCenterZ() {
        return super.getCenterZ() / 8.0;
    }
}

