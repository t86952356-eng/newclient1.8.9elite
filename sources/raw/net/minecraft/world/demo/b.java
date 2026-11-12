/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.demo;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.ai;
import net.minecraft.world.an;
import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.o;

public class b
extends ai {
    private static final long dKd = "North Carolina".hashCode();
    public static final an dKe = new an(dKd, ao.dEx, true, false, ap.dED).awx();

    public b(MinecraftServer minecraftServer, d d2, o o2, int n2, net.minecraft.profiler.d d3) {
        super(minecraftServer, d2, o2, n2, d3);
        this.dDp.c(dKe);
    }
}

