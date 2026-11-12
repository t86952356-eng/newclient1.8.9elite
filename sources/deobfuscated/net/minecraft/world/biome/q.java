/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import net.minecraft.entity.monster.e;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.i;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;

public class q
extends j {
    public q(int n2) {
        super(n2);
        this.dHi.clear();
        this.dHj.clear();
        this.dHk.clear();
        this.dHl.clear();
        this.dHi.add(new m(e.class, 10, 4, 4));
        this.dGZ = Blocks.cLf.xM();
        this.dHa = Blocks.cLf.xM();
        this.dHh = new i();
    }

    @Override
    public int cc(float f2) {
        return 0;
    }
}

