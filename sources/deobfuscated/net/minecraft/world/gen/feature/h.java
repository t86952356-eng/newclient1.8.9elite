/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class h
extends ao {
    private final Block dOh = Blocks.cMN;
    private final int dOi;

    public h(int n2) {
        this.dOi = n2;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        if (w2.L(b2).df().xb() != Material.bev) {
            return false;
        }
        int n2 = random.nextInt(this.dOi - 2) + 2;
        boolean bl2 = true;
        for (int i2 = b2.wt() - n2; i2 <= b2.wt() + n2; ++i2) {
            for (int i3 = b2.wx() - n2; i3 <= b2.wx() + n2; ++i3) {
                int n3;
                int n4 = i2 - b2.wt();
                if (n4 * n4 + (n3 = i3 - b2.wx()) * n3 > n2 * n2) continue;
                for (int i4 = b2.wu() - 1; i4 <= b2.wu() + 1; ++i4) {
                    b b3 = new b(i2, i4, i3);
                    Block block = w2.L(b3).df();
                    if (block != Blocks.cLf && block != Blocks.cMN) continue;
                    w2.a(b3, this.dOh.xM(), 2);
                }
            }
        }
        return true;
    }
}

