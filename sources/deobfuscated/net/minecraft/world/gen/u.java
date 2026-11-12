/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.Random;

public class u {
    private static final int[][] dNJ = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
    public static final double dNK = Math.sqrt(3.0);
    private final int[] dNL = new int[512];
    public double dNM;
    public double dNN;
    public double dNO;
    private static final double dNP = 0.5 * (dNK - 1.0);
    private static final double dNQ = (3.0 - dNK) / 6.0;

    public u() {
        this(new Random());
    }

    public u(Random random) {
        this.dNM = random.nextDouble() * 256.0;
        this.dNN = random.nextDouble() * 256.0;
        this.dNO = random.nextDouble() * 256.0;
        int n2 = 0;
        while (n2 < 256) {
            this.dNL[n2] = n2++;
        }
        for (n2 = 0; n2 < 256; ++n2) {
            int n3 = random.nextInt(256 - n2) + n2;
            int n4 = this.dNL[n2];
            this.dNL[n2] = this.dNL[n3];
            this.dNL[n3] = n4;
            this.dNL[n2 + 256] = this.dNL[n2];
        }
    }

    private static int aQ(double d2) {
        return d2 > 0.0 ? (int)d2 : (int)d2 - 1;
    }

    private static double a(int[] nArray, double d2, double d3) {
        return (double)nArray[0] * d2 + (double)nArray[1] * d3;
    }

    public double E(double d2, double d3) {
        double d4;
        double d5;
        double d6;
        int n2;
        int n3;
        double d7;
        double d8;
        double d9;
        int n4;
        double d10;
        double d11 = 0.5 * (dNK - 1.0);
        double d12 = (d2 + d3) * d11;
        int n5 = u.aQ(d2 + d12);
        double d13 = (double)n5 - (d10 = (double)(n5 + (n4 = u.aQ(d3 + d12))) * (d9 = (3.0 - dNK) / 6.0));
        double d14 = d2 - d13;
        if (d14 > (d8 = d3 - (d7 = (double)n4 - d10))) {
            n3 = 1;
            n2 = 0;
        } else {
            n3 = 0;
            n2 = 1;
        }
        double d15 = d14 - (double)n3 + d9;
        double d16 = d8 - (double)n2 + d9;
        double d17 = d14 - 1.0 + 2.0 * d9;
        double d18 = d8 - 1.0 + 2.0 * d9;
        int n6 = n5 & 0xFF;
        int n7 = n4 & 0xFF;
        int n8 = this.dNL[n6 + this.dNL[n7]] % 12;
        int n9 = this.dNL[n6 + n3 + this.dNL[n7 + n2]] % 12;
        int n10 = this.dNL[n6 + 1 + this.dNL[n7 + 1]] % 12;
        double d19 = 0.5 - d14 * d14 - d8 * d8;
        if (d19 < 0.0) {
            d6 = 0.0;
        } else {
            d19 *= d19;
            d6 = d19 * d19 * u.a(dNJ[n8], d14, d8);
        }
        double d20 = 0.5 - d15 * d15 - d16 * d16;
        if (d20 < 0.0) {
            d5 = 0.0;
        } else {
            d20 *= d20;
            d5 = d20 * d20 * u.a(dNJ[n9], d15, d16);
        }
        double d21 = 0.5 - d17 * d17 - d18 * d18;
        if (d21 < 0.0) {
            d4 = 0.0;
        } else {
            d21 *= d21;
            d4 = d21 * d21 * u.a(dNJ[n10], d17, d18);
        }
        return 70.0 * (d6 + d5 + d4);
    }

    public void b(double[] dArray, double d2, double d3, int n2, int n3, double d4, double d5, double d6) {
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            double d7 = (d3 + (double)i2) * d5 + this.dNN;
            for (int i3 = 0; i3 < n2; ++i3) {
                int n5;
                double d8;
                double d9;
                double d10;
                int n6;
                int n7;
                double d11;
                double d12;
                int n8;
                double d13;
                double d14 = (d2 + (double)i3) * d4 + this.dNM;
                double d15 = (d14 + d7) * dNP;
                int n9 = u.aQ(d14 + d15);
                double d16 = (double)n9 - (d13 = (double)(n9 + (n8 = u.aQ(d7 + d15))) * dNQ);
                double d17 = d14 - d16;
                if (d17 > (d12 = d7 - (d11 = (double)n8 - d13))) {
                    n7 = 1;
                    n6 = 0;
                } else {
                    n7 = 0;
                    n6 = 1;
                }
                double d18 = d17 - (double)n7 + dNQ;
                double d19 = d12 - (double)n6 + dNQ;
                double d20 = d17 - 1.0 + 2.0 * dNQ;
                double d21 = d12 - 1.0 + 2.0 * dNQ;
                int n10 = n9 & 0xFF;
                int n11 = n8 & 0xFF;
                int n12 = this.dNL[n10 + this.dNL[n11]] % 12;
                int n13 = this.dNL[n10 + n7 + this.dNL[n11 + n6]] % 12;
                int n14 = this.dNL[n10 + 1 + this.dNL[n11 + 1]] % 12;
                double d22 = 0.5 - d17 * d17 - d12 * d12;
                if (d22 < 0.0) {
                    d10 = 0.0;
                } else {
                    d22 *= d22;
                    d10 = d22 * d22 * u.a(dNJ[n12], d17, d12);
                }
                double d23 = 0.5 - d18 * d18 - d19 * d19;
                if (d23 < 0.0) {
                    d9 = 0.0;
                } else {
                    d23 *= d23;
                    d9 = d23 * d23 * u.a(dNJ[n13], d18, d19);
                }
                double d24 = 0.5 - d20 * d20 - d21 * d21;
                if (d24 < 0.0) {
                    d8 = 0.0;
                } else {
                    d24 *= d24;
                    d8 = d24 * d24 * u.a(dNJ[n14], d20, d21);
                }
                int n15 = n5 = n4++;
                dArray[n15] = dArray[n15] + 70.0 * (d10 + d9 + d8) * d6;
            }
        }
    }
}

