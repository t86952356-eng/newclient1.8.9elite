/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class f
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!w2.aG(b3)) continue;
            int n2 = 1 + random.nextInt(random.nextInt(3) + 1);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!Blocks.cMM.p(w2, b3)) continue;
                w2.a(b3.hq(i3), Blocks.cMM.xM(), 2);
            }
        }
        return true;
    }
}

