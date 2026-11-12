/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import net.minecraft.entity.monster.ab;
import net.minecraft.entity.monster.k;
import net.minecraft.entity.monster.z;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;

public class u
extends j {
    public u(int n2) {
        super(n2);
        this.dHi.clear();
        this.dHj.clear();
        this.dHk.clear();
        this.dHl.clear();
        this.dHi.add(new m(k.class, 50, 4, 4));
        this.dHi.add(new m(ab.class, 100, 4, 4));
        this.dHi.add(new m(z.class, 1, 4, 4));
    }
}

