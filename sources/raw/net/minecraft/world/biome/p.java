/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.w;

public class p
extends j {
    public p(int n2) {
        super(n2);
        this.dHj.clear();
        this.dGZ = Blocks.cLo.xM();
        this.dHa = Blocks.cLo.xM();
        this.dHh.dFB = -999;
        this.dHh.dFE = 2;
        this.dHh.dFG = 50;
        this.dHh.dFH = 10;
        this.dHj.clear();
    }

    @Override
    public void a(w w2, Random random, b b2) {
        super.a(w2, random, b2);
        if (random.nextInt(1000) == 0) {
            int n2 = random.nextInt(16) + 8;
            int n3 = random.nextInt(16) + 8;
            b b3 = w2.aQ(b2.C(n2, 0, n3)).aqX();
            new net.minecraft.world.gen.feature.j().b(w2, random, b3);
        }
    }
}

