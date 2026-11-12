/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class ac
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        for (int i2 = 0; i2 < 20; ++i2) {
            b b3;
            b b4 = b2.C(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            if (!w2.aG(b4) || w2.L((b3 = b4.aqY()).arb()).df().xb() != Material.bev && w2.L(b3.arc()).df().xb() != Material.bev && w2.L(b3.aqZ()).df().xb() != Material.bev && w2.L(b3.ara()).df().xb() != Material.bev) continue;
            int n2 = 2 + random.nextInt(random.nextInt(3) + 1);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!Blocks.cMO.p(w2, b4)) continue;
                w2.a(b4.hq(i3), Blocks.cMO.xM(), 2);
            }
        }
        return true;
    }
}

