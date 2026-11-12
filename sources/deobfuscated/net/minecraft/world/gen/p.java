/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.g;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.m;
import net.minecraft.world.w;

public class p
extends m {
    private final float[] dNy = new float[1024];

    protected void c(long l2, int n2, int n3, f f2, double d2, double d3, double d4, float f3, float f4, float f5, int n4, int n5, double d5) {
        int n6;
        Random random = new Random(l2);
        double d6 = n2 * 16 + 8;
        double d7 = n3 * 16 + 8;
        float f6 = 0.0f;
        float f7 = 0.0f;
        if (n5 <= 0) {
            n6 = this.dNx * 16 - 16;
            n5 = n6 - random.nextInt(n6 / 4);
        }
        n6 = 0;
        if (n4 == -1) {
            n4 = n5 / 2;
            n6 = 1;
        }
        float f8 = 1.0f;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (i2 == 0 || random.nextInt(3) == 0) {
                f8 = 1.0f + random.nextFloat() * random.nextFloat() * 1.0f;
            }
            this.dNy[i2] = f8 * f8;
        }
        while (n4 < n5) {
            double d8 = 1.5 + (double)(bt.bx((float)n4 * (float)Math.PI / (float)n5) * f3 * 1.0f);
            double d9 = d8 * d5;
            d8 *= (double)random.nextFloat() * 0.25 + 0.75;
            d9 *= (double)random.nextFloat() * 0.25 + 0.75;
            float f9 = bt.bB(f5);
            float f10 = bt.bx(f5);
            d2 += (double)(bt.bB(f4) * f9);
            d3 += (double)f10;
            d4 += (double)(bt.bx(f4) * f9);
            f5 *= 0.7f;
            f5 += f7 * 0.05f;
            f4 += f6 * 0.05f;
            f7 *= 0.8f;
            f6 *= 0.5f;
            f7 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n6 != 0 || random.nextInt(4) != 0) {
                double d10 = d2 - d6;
                double d11 = d4 - d7;
                double d12 = n5 - n4;
                double d13 = f3 + 2.0f + 16.0f;
                if (d10 * d10 + d11 * d11 - d12 * d12 > d13 * d13) {
                    return;
                }
                if (d2 >= d6 - 16.0 - d8 * 2.0 && d4 >= d7 - 16.0 - d8 * 2.0 && d2 <= d6 + 16.0 + d8 * 2.0 && d4 <= d7 + 16.0 + d8 * 2.0) {
                    int n7;
                    int n8 = bt.aF(d2 - d8) - n2 * 16 - 1;
                    int n9 = bt.aF(d2 + d8) - n2 * 16 + 1;
                    int n10 = bt.aF(d3 - d9) - 1;
                    int n11 = bt.aF(d3 + d9) + 1;
                    int n12 = bt.aF(d4 - d8) - n3 * 16 - 1;
                    int n13 = bt.aF(d4 + d8) - n3 * 16 + 1;
                    if (n8 < 0) {
                        n8 = 0;
                    }
                    if (n9 > 16) {
                        n9 = 16;
                    }
                    if (n10 < 1) {
                        n10 = 1;
                    }
                    if (n11 > 248) {
                        n11 = 248;
                    }
                    if (n12 < 0) {
                        n12 = 0;
                    }
                    if (n13 > 16) {
                        n13 = 16;
                    }
                    boolean bl2 = false;
                    for (int i3 = n8; !bl2 && i3 < n9; ++i3) {
                        for (n7 = n12; !bl2 && n7 < n13; ++n7) {
                            for (int i4 = n11 + 1; !bl2 && i4 >= n10 - 1; --i4) {
                                if (i4 < 0 || i4 >= 256) continue;
                                IBlockState iBlockState = f2.S(i3, i4, n7);
                                if (iBlockState.df() == Blocks.cLk || iBlockState.df() == Blocks.cLl) {
                                    bl2 = true;
                                }
                                if (i4 == n10 - 1 || i3 == n8 || i3 == n9 - 1 || n7 == n12 || n7 == n13 - 1) continue;
                                i4 = n10;
                            }
                        }
                    }
                    if (!bl2) {
                        g g2 = new g();
                        for (n7 = n8; n7 < n9; ++n7) {
                            double d14 = ((double)(n7 + n2 * 16) + 0.5 - d2) / d8;
                            for (int i5 = n12; i5 < n13; ++i5) {
                                double d15 = ((double)(i5 + n3 * 16) + 0.5 - d4) / d8;
                                boolean bl3 = false;
                                if (!(d14 * d14 + d15 * d15 < 1.0)) continue;
                                for (int i6 = n11; i6 > n10; --i6) {
                                    double d16 = ((double)(i6 - 1) + 0.5 - d3) / d9;
                                    if (!((d14 * d14 + d15 * d15) * (double)this.dNy[i6 - 1] + d16 * d16 / 6.0 < 1.0)) continue;
                                    IBlockState iBlockState = f2.S(n7, i6, i5);
                                    if (iBlockState.df() == Blocks.cLe) {
                                        bl3 = true;
                                    }
                                    if (iBlockState.df() != Blocks.cLd && iBlockState.df() != Blocks.cLf && iBlockState.df() != Blocks.cLe) continue;
                                    if (i6 - 1 < 10) {
                                        f2.a(n7, i6, i5, Blocks.cLm.xM());
                                        continue;
                                    }
                                    f2.a(n7, i6, i5, Blocks.cLc.xM());
                                    if (!bl3 || f2.S(n7, i6 - 1, i5).df() != Blocks.cLf) continue;
                                    g2.E(n7 + n2 * 16, 0, i5 + n3 * 16);
                                    f2.a(n7, i6 - 1, i5, this.baU.aF((b)g2).dGZ);
                                }
                            }
                        }
                        if (n6 != 0) break;
                    }
                }
            }
            ++n4;
        }
    }

    @Override
    protected void a(w w2, int n2, int n3, int n4, int n5, f f2) {
        if (this.ta.nextInt(50) == 0) {
            double d2 = n2 * 16 + this.ta.nextInt(16);
            double d3 = this.ta.nextInt(this.ta.nextInt(40) + 8) + 20;
            double d4 = n3 * 16 + this.ta.nextInt(16);
            boolean bl2 = true;
            for (int i2 = 0; i2 < 1; ++i2) {
                float f3 = this.ta.nextFloat() * (float)Math.PI * 2.0f;
                float f4 = (this.ta.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f5 = (this.ta.nextFloat() * 2.0f + this.ta.nextFloat()) * 2.0f;
                this.c(this.ta.nextLong(), n4, n5, f2, d2, d3, d4, f5, f3, f4, 0, 0, 3.0);
            }
        }
    }
}

