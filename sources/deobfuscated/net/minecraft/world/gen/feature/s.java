/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public abstract class s
extends a {
    protected final int dOy;
    protected final IBlockState dOz;
    protected final IBlockState dOA;
    protected int dOB;

    public s(boolean bl2, int n2, int n3, IBlockState iBlockState, IBlockState iBlockState2) {
        super(bl2);
        this.dOy = n2;
        this.dOB = n3;
        this.dOz = iBlockState;
        this.dOA = iBlockState2;
    }

    protected int m(Random random) {
        int n2 = random.nextInt(3) + this.dOy;
        if (this.dOB > 1) {
            n2 += random.nextInt(this.dOB);
        }
        return n2;
    }

    private boolean g(w w2, b b2, int n2) {
        boolean bl2 = true;
        if (b2.wu() >= 1 && b2.wu() + n2 + 1 <= 256) {
            for (int i2 = 0; i2 <= 1 + n2; ++i2) {
                int n3 = 2;
                if (i2 == 0) {
                    n3 = 1;
                } else if (i2 >= 1 + n2 - 2) {
                    n3 = 2;
                }
                for (int i3 = -n3; i3 <= n3 && bl2; ++i3) {
                    for (int i4 = -n3; i4 <= n3 && bl2; ++i4) {
                        if (b2.wu() + i2 >= 0 && b2.wu() + i2 < 256 && this.L(w2.L(b2.C(i3, i2, i4)).df())) continue;
                        bl2 = false;
                    }
                }
            }
            return bl2;
        }
        return false;
    }

    private boolean a(b b2, w w2) {
        b b3 = b2.aqY();
        Block block = w2.L(b3).df();
        if ((block == Blocks.cLe || block == Blocks.cLf) && b2.wu() >= 2) {
            this.af(w2, b3);
            this.af(w2, b3.arc());
            this.af(w2, b3.ara());
            this.af(w2, b3.ara().arc());
            return true;
        }
        return false;
    }

    protected boolean a(w w2, Random random, b b2, int n2) {
        return this.g(w2, b2, n2) && this.a(b2, w2);
    }

    protected void h(w w2, b b2, int n2) {
        int n3 = n2 * n2;
        for (int i2 = -n2; i2 <= n2 + 1; ++i2) {
            for (int i3 = -n2; i3 <= n2 + 1; ++i3) {
                b b3;
                Material material;
                int n4 = i2 - 1;
                int n5 = i3 - 1;
                if (i2 * i2 + i3 * i3 > n3 && n4 * n4 + n5 * n5 > n3 && i2 * i2 + n5 * n5 > n3 && n4 * n4 + i3 * i3 > n3 || (material = w2.L(b3 = b2.C(i2, 0, i3)).df().xb()) != Material.beo && material != Material.bex) continue;
                this.N(w2, b3, this.dOA);
            }
        }
    }

    protected void i(w w2, b b2, int n2) {
        int n3 = n2 * n2;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                b b3;
                Material material;
                if (i2 * i2 + i3 * i3 > n3 || (material = w2.L(b3 = b2.C(i2, 0, i3)).df().xb()) != Material.beo && material != Material.bex) continue;
                this.N(w2, b3, this.dOA);
            }
        }
    }
}

