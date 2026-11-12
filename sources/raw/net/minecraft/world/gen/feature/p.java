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

public class p
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        if (!w2.aG(b2)) {
            return false;
        }
        if (w2.L(b2.aqX()).df() != Blocks.cMX) {
            return false;
        }
        w2.a(b2, Blocks.cMZ.xM(), 2);
        for (int i2 = 0; i2 < 1500; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
            if (w2.L(b3).df().xb() != Material.beo) continue;
            int n2 = 0;
            for (net.minecraft.util.ao ao2 : net.minecraft.util.ao.values()) {
                if (w2.L(b3.x(ao2)).df() == Blocks.cMZ) {
                    ++n2;
                }
                if (n2 > 1) break;
            }
            if (n2 != true) continue;
            w2.a(b3, Blocks.cMZ.xM(), 2);
        }
        return true;
    }
}

