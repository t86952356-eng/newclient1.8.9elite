/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.Random;
import net.minecraft.block.BlockBush;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class l
extends ao {
    private final BlockBush dNw;

    public l(BlockBush blockBush) {
        this.dNw = blockBush;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!w2.aG(b3) || w2.dDl.awf() && b3.wu() >= 255 || !this.dNw.f(w2, b3, this.dNw.xM())) continue;
            w2.a(b3, this.dNw.xM(), 2);
        }
        return true;
    }
}

