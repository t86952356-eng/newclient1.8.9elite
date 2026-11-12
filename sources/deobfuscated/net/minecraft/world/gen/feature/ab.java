/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.init.Blocks;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class ab
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!w2.aG(b3) || w2.L(b3.aqY()).df() != Blocks.cLe || !Blocks.cMW.d(w2, b3)) continue;
            w2.a(b3, Blocks.cMW.xM().a(BlockPumpkin.aTB, ar.dwT.g(random)), 2);
        }
        return true;
    }
}

