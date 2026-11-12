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

public class i
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        Block block;
        while (((block = w2.L(b2).df()).xb() == Material.beo || block.xb() == Material.bex) && b2.wu() > 0) {
            b2 = b2.aqY();
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!w2.aG(b3) || !Blocks.cLK.f(w2, b3, Blocks.cLK.xM())) continue;
            w2.a(b3, Blocks.cLK.xM(), 2);
        }
        return true;
    }
}

