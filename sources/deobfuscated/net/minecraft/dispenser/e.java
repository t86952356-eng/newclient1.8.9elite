/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.dispenser;

import net.minecraft.dispenser.f;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;

public interface e
extends f {
    @Override
    public double getX();

    @Override
    public double getY();

    @Override
    public double getZ();

    public b dg();

    public int zg();

    public <T extends d> T zh();
}

