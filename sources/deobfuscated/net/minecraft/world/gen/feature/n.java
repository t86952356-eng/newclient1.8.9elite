/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class n
extends ao {
    private BlockFlower dOr;
    private IBlockState dOs;

    public n(BlockFlower blockFlower, BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        this.a(blockFlower, blockFlower$EnumFlowerType);
    }

    public void a(BlockFlower blockFlower, BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        this.dOr = blockFlower;
        this.dOs = blockFlower.xM().a(blockFlower.yq(), blockFlower$EnumFlowerType);
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            b b3 = b2.C(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!w2.aG(b3) || w2.dDl.awf() && b3.wu() >= 255 || !this.dOr.f(w2, b3, this.dOs)) continue;
            w2.a(b3, this.dOs, 2);
        }
        return true;
    }
}

