/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.item.c;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class ag
extends ao {
    private final Block dOT;

    public ag(Block block) {
        this.dOT = block;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        if (w2.aG(b2) && w2.L(b2.aqY()).df() == this.dOT) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6 = random.nextInt(32) + 6;
            int n7 = random.nextInt(4) + 1;
            g g2 = new g();
            for (n5 = b2.wt() - n7; n5 <= b2.wt() + n7; ++n5) {
                for (n4 = b2.wx() - n7; n4 <= b2.wx() + n7; ++n4) {
                    n3 = n5 - b2.wt();
                    if (n3 * n3 + (n2 = n4 - b2.wx()) * n2 > n7 * n7 + 1 || w2.L(g2.E(n5, b2.wu() - 1, n4)).df() == this.dOT) continue;
                    return false;
                }
            }
            for (n5 = b2.wu(); n5 < b2.wu() + n6 && n5 < 256; ++n5) {
                for (n4 = b2.wt() - n7; n4 <= b2.wt() + n7; ++n4) {
                    for (n3 = b2.wx() - n7; n3 <= b2.wx() + n7; ++n3) {
                        int n8;
                        n2 = n4 - b2.wt();
                        if (n2 * n2 + (n8 = n3 - b2.wx()) * n8 > n7 * n7 + 1) continue;
                        w2.a(new b(n4, n5, n3), Blocks.cMb.xM(), 2);
                    }
                }
            }
            c c2 = new c(w2);
            c2.b((double)((float)b2.wt() + 0.5f), (double)(b2.wu() + n6), (double)((float)b2.wx() + 0.5f), random.nextFloat() * 360.0f, 0.0f);
            w2.G(c2);
            w2.a(b2.hq(n6), Blocks.cLj.xM(), 2);
            return true;
        }
        return false;
    }
}

