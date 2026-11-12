/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class u
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2;
        int n3;
        while (w2.aG(b2) && b2.wu() > 2) {
            b2 = b2.aqY();
        }
        if (w2.L(b2).df() != Blocks.cML) {
            return false;
        }
        b2 = b2.hq(random.nextInt(4));
        int n4 = random.nextInt(4) + 7;
        int n5 = n4 / 4 + random.nextInt(2);
        if (n5 > 1 && random.nextInt(60) == 0) {
            b2 = b2.hq(10 + random.nextInt(30));
        }
        for (n3 = 0; n3 < n4; ++n3) {
            float f2 = (1.0f - (float)n3 / (float)n4) * (float)n5;
            n2 = bt.bM(f2);
            for (int i2 = -n2; i2 <= n2; ++i2) {
                float f3 = (float)bt.hN(i2) - 0.25f;
                for (int i3 = -n2; i3 <= n2; ++i3) {
                    float f4 = (float)bt.hN(i3) - 0.25f;
                    if ((i2 != 0 || i3 != 0) && !(f3 * f3 + f4 * f4 <= f2 * f2) || (i2 == -n2 || i2 == n2 || i3 == -n2 || i3 == n2) && !(random.nextFloat() <= 0.75f)) continue;
                    Block block = w2.L(b2.C(i2, n3, i3)).df();
                    if (block.xb() == Material.beo || block == Blocks.cLf || block == Blocks.cML || block == Blocks.cMK) {
                        this.N(w2, b2.C(i2, n3, i3), Blocks.cOD.xM());
                    }
                    if (n3 == 0 || n2 <= 1 || (block = w2.L(b2.C(i2, -n3, i3)).df()).xb() != Material.beo && block != Blocks.cLf && block != Blocks.cML && block != Blocks.cMK) continue;
                    this.N(w2, b2.C(i2, -n3, i3), Blocks.cOD.xM());
                }
            }
        }
        n3 = n5 - 1;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > 1) {
            n3 = 1;
        }
        for (int i4 = -n3; i4 <= n3; ++i4) {
            for (n2 = -n3; n2 <= n3; ++n2) {
                Block block;
                b b3 = b2.C(i4, -1, n2);
                int n6 = 50;
                if (Math.abs(i4) == 1 && Math.abs(n2) == 1) {
                    n6 = random.nextInt(5);
                }
                while (b3.wu() > 50 && ((block = w2.L(b3).df()).xb() == Material.beo || block == Blocks.cLf || block == Blocks.cML || block == Blocks.cMK || block == Blocks.cOD)) {
                    this.N(w2, b3, Blocks.cOD.xM());
                    b3 = b3.aqY();
                    if (--n6 > 0) continue;
                    b3 = b3.hr(random.nextInt(5) + 1);
                    n6 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}

