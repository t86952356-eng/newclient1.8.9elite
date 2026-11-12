/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.bt;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.m;
import net.minecraft.world.w;

public class o
extends m {
    protected void b(long l2, int n2, int n3, f f2, double d2, double d3, double d4) {
        this.b(l2, n2, n3, f2, d2, d3, d4, 1.0f + this.ta.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    protected void b(long l2, int n2, int n3, f f2, double d2, double d3, double d4, float f3, float f4, float f5, int n4, int n5, double d5) {
        boolean bl2;
        int n6;
        double d6 = n2 * 16 + 8;
        double d7 = n3 * 16 + 8;
        float f6 = 0.0f;
        float f7 = 0.0f;
        Random random = new Random(l2);
        if (n5 <= 0) {
            n6 = this.dNx * 16 - 16;
            n5 = n6 - random.nextInt(n6 / 4);
        }
        n6 = 0;
        if (n4 == -1) {
            n4 = n5 / 2;
            n6 = 1;
        }
        int n7 = random.nextInt(n5 / 2) + n5 / 4;
        boolean bl3 = bl2 = random.nextInt(6) == 0;
        while (n4 < n5) {
            double d8 = 1.5 + (double)(bt.bx((float)n4 * (float)Math.PI / (float)n5) * f3 * 1.0f);
            double d9 = d8 * d5;
            float f8 = bt.bB(f5);
            float f9 = bt.bx(f5);
            d2 += (double)(bt.bB(f4) * f8);
            d3 += (double)f9;
            d4 += (double)(bt.bx(f4) * f8);
            f5 = bl2 ? (f5 *= 0.92f) : (f5 *= 0.7f);
            f5 += f7 * 0.1f;
            f4 += f6 * 0.1f;
            f7 *= 0.9f;
            f6 *= 0.75f;
            f7 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n6 == 0 && n4 == n7 && f3 > 1.0f) {
                this.b(random.nextLong(), n2, n3, f2, d2, d3, d4, random.nextFloat() * 0.5f + 0.5f, f4 - 1.5707964f, f5 / 3.0f, n4, n5, 1.0);
                this.b(random.nextLong(), n2, n3, f2, d2, d3, d4, random.nextFloat() * 0.5f + 0.5f, f4 + 1.5707964f, f5 / 3.0f, n4, n5, 1.0);
                return;
            }
            if (n6 != 0 || random.nextInt(4) != 0) {
                double d10 = d2 - d6;
                double d11 = d4 - d7;
                double d12 = n5 - n4;
                double d13 = f3 + 2.0f + 16.0f;
                if (d10 * d10 + d11 * d11 - d12 * d12 > d13 * d13) {
                    return;
                }
                if (d2 >= d6 - 16.0 - d8 * 2.0 && d4 >= d7 - 16.0 - d8 * 2.0 && d2 <= d6 + 16.0 + d8 * 2.0 && d4 <= d7 + 16.0 + d8 * 2.0) {
                    int n8;
                    int n9 = bt.aF(d2 - d8) - n2 * 16 - 1;
                    int n10 = bt.aF(d2 + d8) - n2 * 16 + 1;
                    int n11 = bt.aF(d3 - d9) - 1;
                    int n12 = bt.aF(d3 + d9) + 1;
                    int n13 = bt.aF(d4 - d8) - n3 * 16 - 1;
                    int n14 = bt.aF(d4 + d8) - n3 * 16 + 1;
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 > 16) {
                        n10 = 16;
                    }
                    if (n11 < 1) {
                        n11 = 1;
                    }
                    if (n12 > 120) {
                        n12 = 120;
                    }
                    if (n13 < 0) {
                        n13 = 0;
                    }
                    if (n14 > 16) {
                        n14 = 16;
                    }
                    boolean bl4 = false;
                    for (n8 = n9; !bl4 && n8 < n10; ++n8) {
                        for (int i2 = n13; !bl4 && i2 < n14; ++i2) {
                            for (int i3 = n12 + 1; !bl4 && i3 >= n11 - 1; --i3) {
                                if (i3 < 0 || i3 >= 128) continue;
                                IBlockState iBlockState = f2.S(n8, i3, i2);
                                if (iBlockState.df() == Blocks.cLm || iBlockState.df() == Blocks.cLn) {
                                    bl4 = true;
                                }
                                if (i3 == n11 - 1 || n8 == n9 || n8 == n10 - 1 || i2 == n13 || i2 == n14 - 1) continue;
                                i3 = n11;
                            }
                        }
                    }
                    if (!bl4) {
                        for (n8 = n9; n8 < n10; ++n8) {
                            double d14 = ((double)(n8 + n2 * 16) + 0.5 - d2) / d8;
                            for (int i4 = n13; i4 < n14; ++i4) {
                                double d15 = ((double)(i4 + n3 * 16) + 0.5 - d4) / d8;
                                for (int i5 = n12; i5 > n11; --i5) {
                                    IBlockState iBlockState;
                                    double d16 = ((double)(i5 - 1) + 0.5 - d3) / d9;
                                    if (!(d16 > -0.7) || !(d14 * d14 + d16 * d16 + d15 * d15 < 1.0) || (iBlockState = f2.S(n8, i5, i4)).df() != Blocks.cMX && iBlockState.df() != Blocks.cLf && iBlockState.df() != Blocks.cLe) continue;
                                    f2.a(n8, i5, i4, Blocks.cLc.xM());
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
        int n6 = this.ta.nextInt(this.ta.nextInt(this.ta.nextInt(10) + 1) + 1);
        if (this.ta.nextInt(5) != 0) {
            n6 = 0;
        }
        for (int i2 = 0; i2 < n6; ++i2) {
            double d2 = n2 * 16 + this.ta.nextInt(16);
            double d3 = this.ta.nextInt(128);
            double d4 = n3 * 16 + this.ta.nextInt(16);
            int n7 = 1;
            if (this.ta.nextInt(4) == 0) {
                this.b(this.ta.nextLong(), n4, n5, f2, d2, d3, d4);
                n7 += this.ta.nextInt(4);
            }
            for (int i3 = 0; i3 < n7; ++i3) {
                float f3 = this.ta.nextFloat() * (float)Math.PI * 2.0f;
                float f4 = (this.ta.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f5 = this.ta.nextFloat() * 2.0f + this.ta.nextFloat();
                this.b(this.ta.nextLong(), n4, n5, f2, d2, d3, d4, f5 * 2.0f, f3, f4, 0, 0, 0.5);
            }
        }
    }
}

