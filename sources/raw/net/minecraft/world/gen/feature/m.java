/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class m
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!w2.aG(b3) || w2.L(b3.aqY()).df() != Blocks.cMX) continue;
            w2.a(b3, Blocks.cMd.xM(), 2);
        }
        return true;
    }
}

