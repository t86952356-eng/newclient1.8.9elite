/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class e
extends ao {
    private final Block dOd;
    private final int dOe;

    public e(Block block, int n2) {
        super(false);
        this.dOd = block;
        this.dOe = n2;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        while (true) {
            Block block;
            if (b2.wu() <= 3 || !w2.aG(b2.aqY()) && ((block = w2.L(b2.aqY()).df()) == Blocks.cLe || block == Blocks.cLf || block == Blocks.cLd)) {
                if (b2.wu() <= 3) {
                    return false;
                }
                int n2 = this.dOe;
                for (int i2 = 0; n2 >= 0 && i2 < 3; ++i2) {
                    int n3 = n2 + random.nextInt(2);
                    int n4 = n2 + random.nextInt(2);
                    int n5 = n2 + random.nextInt(2);
                    float f2 = (float)(n3 + n4 + n5) * 0.333f + 0.5f;
                    for (b b3 : b.b(b2.C(-n3, -n4, -n5), b2.C(n3, n4, n5))) {
                        if (!(b3.i(b2) <= (double)(f2 * f2))) continue;
                        w2.a(b3, this.dOd.xM(), 4);
                    }
                    b2 = b2.C(-(n2 + 1) + random.nextInt(2 + n2 * 2), 0 - random.nextInt(2), -(n2 + 1) + random.nextInt(2 + n2 * 2));
                }
                return true;
            }
            b2 = b2.aqY();
        }
    }
}

