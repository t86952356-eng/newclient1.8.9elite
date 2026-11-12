/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import net.minecraft.entity.passive.i;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;

public class y
extends j {
    public y(int n2) {
        super(n2);
        this.dHh.dFB = -100;
        this.dHh.dFC = -100;
        this.dHh.dFD = -100;
        this.dHh.dFF = 1;
        this.dHh.dFL = 1;
        this.dGZ = Blocks.cNy.xM();
        this.dHi.clear();
        this.dHj.clear();
        this.dHk.clear();
        this.dHj.add(new m(i.class, 8, 4, 8));
    }
}

