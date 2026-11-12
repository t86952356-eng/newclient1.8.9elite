/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.r;
import net.minecraft.world.biome.z;
import net.minecraft.world.gen.feature.a;

class t
extends z {
    t(r r2, int n2, j j2) {
        super(n2, j2);
    }

    @Override
    public a j(Random random) {
        return random.nextBoolean() ? r.dHD : r.dHE;
    }
}

