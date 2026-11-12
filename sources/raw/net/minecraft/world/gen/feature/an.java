/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class an
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2;
            int n3;
            int n4 = b2.wt() + random.nextInt(8) - random.nextInt(8);
            if (!w2.aG(new b(n4, n3 = b2.wu() + random.nextInt(4) - random.nextInt(4), n2 = b2.wx() + random.nextInt(8) - random.nextInt(8))) || !Blocks.cNz.d(w2, new b(n4, n3, n2))) continue;
            w2.a(new b(n4, n3, n2), Blocks.cNz.xM(), 2);
        }
        return true;
    }
}

