/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.Random;
import net.minecraft.world.gen.q;

public class r
extends q {
    private final int[] dNz = new int[512];
    public double dAG;
    public double dAH;
    public double dAI;
    private static final double[] dNA = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] dNB = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
    private static final double[] dNC = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
    private static final double[] dND = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] dNE = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};

    public r() {
        this(new Random());
    }

    public r(Random random) {
        this.dAG = random.nextDouble() * 256.0;
        this.dAH = random.nextDouble() * 256.0;
        this.dAI = random.nextDouble() * 256.0;
        int n2 = 0;
        while (n2 < 256) {
            this.dNz[n2] = n2++;
        }
        for (n2 = 0; n2 < 256; ++n2) {
            int n3 = random.nextInt(256 - n2) + n2;
            int n4 = this.dNz[n2];
            this.dNz[n2] = this.dNz[n3];
            this.dNz[n3] = n4;
            this.dNz[n2 + 256] = this.dNz[n2];
        }
    }

    public final double ap(double d2, double d3, double d4) {
        return d3 + d2 * (d4 - d3);
    }

    public final double a(int n2, double d2, double d3) {
        int n3 = n2 & 0xF;
        return dND[n3] * d2 + dNE[n3] * d3;
    }

    public final double b(int n2, double d2, double d3, double d4) {
        int n3 = n2 & 0xF;
        return dNA[n3] * d2 + dNB[n3] * d3 + dNC[n3] * d4;
    }

    public void a(double[] dArray, double d2, double d3, double d4, int n2, int n3, int n4, double d5, double d6, double d7, double d8) {
        if (n3 == 1) {
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            double d9 = 0.0;
            double d10 = 0.0;
            int n9 = 0;
            double d11 = 1.0 / d8;
            for (int i2 = 0; i2 < n2; ++i2) {
                double d12 = d2 + (double)i2 * d5 + this.dAG;
                int n10 = (int)d12;
                if (d12 < (double)n10) {
                    --n10;
                }
                int n11 = n10 & 0xFF;
                double d13 = (d12 -= (double)n10) * d12 * d12 * (d12 * (d12 * 6.0 - 15.0) + 10.0);
                for (int i3 = 0; i3 < n4; ++i3) {
                    int n12;
                    double d14 = d4 + (double)i3 * d7 + this.dAI;
                    int n13 = (int)d14;
                    if (d14 < (double)n13) {
                        --n13;
                    }
                    int n14 = n13 & 0xFF;
                    double d15 = (d14 -= (double)n13) * d14 * d14 * (d14 * (d14 * 6.0 - 15.0) + 10.0);
                    n5 = this.dNz[n11] + 0;
                    n6 = this.dNz[n5] + n14;
                    n7 = this.dNz[n11 + 1] + 0;
                    n8 = this.dNz[n7] + n14;
                    d9 = this.ap(d13, this.a(this.dNz[n6], d12, d14), this.b(this.dNz[n8], d12 - 1.0, 0.0, d14));
                    d10 = this.ap(d13, this.b(this.dNz[n6 + 1], d12, 0.0, d14 - 1.0), this.b(this.dNz[n8 + 1], d12 - 1.0, 0.0, d14 - 1.0));
                    double d16 = this.ap(d15, d9, d10);
                    int n15 = n12 = n9++;
                    dArray[n15] = dArray[n15] + d16 * d11;
                }
            }
        } else {
            int n16 = 0;
            double d17 = 1.0 / d8;
            int n17 = -1;
            int n18 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            double d18 = 0.0;
            double d19 = 0.0;
            double d20 = 0.0;
            double d21 = 0.0;
            for (int i4 = 0; i4 < n2; ++i4) {
                double d22 = d2 + (double)i4 * d5 + this.dAG;
                int n24 = (int)d22;
                if (d22 < (double)n24) {
                    --n24;
                }
                int n25 = n24 & 0xFF;
                double d23 = (d22 -= (double)n24) * d22 * d22 * (d22 * (d22 * 6.0 - 15.0) + 10.0);
                for (int i5 = 0; i5 < n4; ++i5) {
                    double d24 = d4 + (double)i5 * d7 + this.dAI;
                    int n26 = (int)d24;
                    if (d24 < (double)n26) {
                        --n26;
                    }
                    int n27 = n26 & 0xFF;
                    double d25 = (d24 -= (double)n26) * d24 * d24 * (d24 * (d24 * 6.0 - 15.0) + 10.0);
                    for (int i6 = 0; i6 < n3; ++i6) {
                        int n28;
                        double d26 = d3 + (double)i6 * d6 + this.dAH;
                        int n29 = (int)d26;
                        if (d26 < (double)n29) {
                            --n29;
                        }
                        int n30 = n29 & 0xFF;
                        double d27 = (d26 -= (double)n29) * d26 * d26 * (d26 * (d26 * 6.0 - 15.0) + 10.0);
                        if (i6 == 0 || n30 != n17) {
                            n17 = n30;
                            n18 = this.dNz[n25] + n30;
                            n19 = this.dNz[n18] + n27;
                            n20 = this.dNz[n18 + 1] + n27;
                            n21 = this.dNz[n25 + 1] + n30;
                            n22 = this.dNz[n21] + n27;
                            n23 = this.dNz[n21 + 1] + n27;
                            d18 = this.ap(d23, this.b(this.dNz[n19], d22, d26, d24), this.b(this.dNz[n22], d22 - 1.0, d26, d24));
                            d19 = this.ap(d23, this.b(this.dNz[n20], d22, d26 - 1.0, d24), this.b(this.dNz[n23], d22 - 1.0, d26 - 1.0, d24));
                            d20 = this.ap(d23, this.b(this.dNz[n19 + 1], d22, d26, d24 - 1.0), this.b(this.dNz[n22 + 1], d22 - 1.0, d26, d24 - 1.0));
                            d21 = this.ap(d23, this.b(this.dNz[n20 + 1], d22, d26 - 1.0, d24 - 1.0), this.b(this.dNz[n23 + 1], d22 - 1.0, d26 - 1.0, d24 - 1.0));
                        }
                        double d28 = this.ap(d27, d18, d19);
                        double d29 = this.ap(d27, d20, d21);
                        double d30 = this.ap(d25, d28, d29);
                        int n31 = n28 = n16++;
                        dArray[n31] = dArray[n31] + d30 * d17;
                    }
                }
            }
        }
    }
}

