/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class k
extends ao {
    private BlockDoublePlant$EnumPlantType dOn;

    public void a(BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType) {
        this.dOn = blockDoublePlant$EnumPlantType;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < 64; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!w2.aG(b3) || w2.dDl.awf() && b3.wu() >= 254 || !Blocks.cOH.d(w2, b3)) continue;
            Blocks.cOH.a(w2, b3, this.dOn, 2);
            bl2 = true;
        }
        return bl2;
    }
}

