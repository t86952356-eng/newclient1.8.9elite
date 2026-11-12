/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.dispenser;

import net.minecraft.dispenser.h;

public class i
implements h {
    protected final double cpR;
    protected final double cpS;
    protected final double cpT;

    public i(double d2, double d3, double d4) {
        this.cpR = d2;
        this.cpS = d3;
        this.cpT = d4;
    }

    @Override
    public double getX() {
        return this.cpR;
    }

    @Override
    public double getY() {
        return this.cpS;
    }

    @Override
    public double getZ() {
        return this.cpT;
    }
}

