/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.world.gen.feature;

import com.google.common.base.Predicate;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class aa
extends ao {
    private final IBlockState dOK;
    private final int dOL;
    private final Predicate<IBlockState> dOM;

    public aa(IBlockState iBlockState, int n2) {
        this(iBlockState, n2, BlockHelper.x(Blocks.cLd));
    }

    public aa(IBlockState iBlockState, int n2, Predicate<IBlockState> predicate) {
        this.dOK = iBlockState;
        this.dOL = n2;
        this.dOM = predicate;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        float f2 = random.nextFloat() * (float)Math.PI;
        double d2 = (float)(b2.wt() + 8) + bt.bx(f2) * (float)this.dOL / 8.0f;
        double d3 = (float)(b2.wt() + 8) - bt.bx(f2) * (float)this.dOL / 8.0f;
        double d4 = (float)(b2.wx() + 8) + bt.bB(f2) * (float)this.dOL / 8.0f;
        double d5 = (float)(b2.wx() + 8) - bt.bB(f2) * (float)this.dOL / 8.0f;
        double d6 = b2.wu() + random.nextInt(3) - 2;
        double d7 = b2.wu() + random.nextInt(3) - 2;
        for (int i2 = 0; i2 < this.dOL; ++i2) {
            float f3 = (float)i2 / (float)this.dOL;
            double d8 = d2 + (d3 - d2) * (double)f3;
            double d9 = d6 + (d7 - d6) * (double)f3;
            double d10 = d4 + (d5 - d4) * (double)f3;
            double d11 = random.nextDouble() * (double)this.dOL / 16.0;
            double d12 = (double)(bt.bx((float)Math.PI * f3) + 1.0f) * d11 + 1.0;
            double d13 = (double)(bt.bx((float)Math.PI * f3) + 1.0f) * d11 + 1.0;
            int n2 = bt.aF(d8 - d12 / 2.0);
            int n3 = bt.aF(d9 - d13 / 2.0);
            int n4 = bt.aF(d10 - d12 / 2.0);
            int n5 = bt.aF(d8 + d12 / 2.0);
            int n6 = bt.aF(d9 + d13 / 2.0);
            int n7 = bt.aF(d10 + d12 / 2.0);
            for (int i3 = n2; i3 <= n5; ++i3) {
                double d14 = ((double)i3 + 0.5 - d8) / (d12 / 2.0);
                if (!(d14 * d14 < 1.0)) continue;
                for (int i4 = n3; i4 <= n6; ++i4) {
                    double d15 = ((double)i4 + 0.5 - d9) / (d13 / 2.0);
                    if (!(d14 * d14 + d15 * d15 < 1.0)) continue;
                    for (int i5 = n4; i5 <= n7; ++i5) {
                        b b3;
                        double d16 = ((double)i5 + 0.5 - d10) / (d12 / 2.0);
                        if (!(d14 * d14 + d15 * d15 + d16 * d16 < 1.0) || !this.dOM.apply((Object)w2.L(b3 = new b(i3, i4, i5)))) continue;
                        w2.a(b3, this.dOK, 2);
                    }
                }
            }
        }
        return true;
    }
}

