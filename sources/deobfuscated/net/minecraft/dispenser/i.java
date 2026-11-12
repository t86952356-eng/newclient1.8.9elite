/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.dispenser;

import net.minecraft.dispenser.h;

public class i
implements h {
    protected final double x;
    protected final double y;
    protected final double z;

    public i(double d2, double d3, double d4) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public double getZ() {
        return this.z;
    }
}

