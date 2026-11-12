/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.Random;
import java.util.UUID;
import net.minecraft.util.db;
import net.optifine.util.z;

public class bt {
    public static final float dyO;
    private static final int dyP = 12;
    private static final int dyQ = 4095;
    private static final int dyR = 4096;
    private static final int dyS = 1024;
    public static final float dyT;
    public static final float dyU;
    public static final float dyV;
    private static final float dyW;
    public static final float dyX;
    private static final float[] dyY;
    public static boolean dyZ;
    private static final float[] dza;
    private static final int[] dzb;
    private static final double dzc;
    private static final double[] dzd;
    private static final double[] dze;

    public static float bx(float f2) {
        return dyZ ? dyY[(int)(f2 * dyW) & 0xFFF] : dza[(int)(f2 * 10430.378f) & 0xFFFF];
    }

    public static float bB(float f2) {
        return dyZ ? dyY[(int)(f2 * dyW + 1024.0f) & 0xFFF] : dza[(int)(f2 * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static float bK(float f2) {
        return (float)Math.sqrt(f2);
    }

    public static float aD(double d2) {
        return (float)Math.sqrt(d2);
    }

    public static int bL(float f2) {
        int n2 = (int)f2;
        return f2 < (float)n2 ? n2 - 1 : n2;
    }

    public static int aE(double d2) {
        return (int)(d2 + 1024.0) - 1024;
    }

    public static int aF(double d2) {
        int n2 = (int)d2;
        return d2 < (double)n2 ? n2 - 1 : n2;
    }

    public static long aG(double d2) {
        long l2 = (long)d2;
        return d2 < (double)l2 ? l2 - 1L : l2;
    }

    public static int aH(double d2) {
        return (int)(d2 >= 0.0 ? d2 : -d2 + 1.0);
    }

    public static float bz(float f2) {
        return f2 >= 0.0f ? f2 : -f2;
    }

    public static int hN(int n2) {
        return n2 >= 0 ? n2 : -n2;
    }

    public static int bM(float f2) {
        int n2 = (int)f2;
        return f2 > (float)n2 ? n2 + 1 : n2;
    }

    public static int aI(double d2) {
        int n2 = (int)d2;
        return d2 > (double)n2 ? n2 + 1 : n2;
    }

    public static int F(int n2, int n3, int n4) {
        return n2 < n3 ? n3 : (n2 > n4 ? n4 : n2);
    }

    public static float I(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : (f2 > f4 ? f4 : f2);
    }

    public static double ah(double d2, double d3, double d4) {
        return d2 < d3 ? d3 : (d2 > d4 ? d4 : d2);
    }

    public static double ai(double d2, double d3, double d4) {
        return d4 < 0.0 ? d2 : (d4 > 1.0 ? d3 : d2 + (d3 - d2) * d4);
    }

    public static double x(double d2, double d3) {
        if (d2 < 0.0) {
            d2 = -d2;
        }
        if (d3 < 0.0) {
            d3 = -d3;
        }
        return d2 > d3 ? d2 : d3;
    }

    public static int aF(int n2, int n3) {
        return n2 < 0 ? -((-n2 - 1) / n3) - 1 : n2 / n3;
    }

    public static int b(Random random, int n2, int n3) {
        return n2 >= n3 ? n2 : random.nextInt(n3 - n2 + 1) + n2;
    }

    public static float b(Random random, float f2, float f3) {
        return f2 >= f3 ? f2 : random.nextFloat() * (f3 - f2) + f2;
    }

    public static double b(Random random, double d2, double d3) {
        return d2 >= d3 ? d2 : random.nextDouble() * (d3 - d2) + d2;
    }

    public static double a(long[] lArray) {
        long l2 = 0L;
        for (long l3 : lArray) {
            l2 += l3;
        }
        return (double)l2 / (double)lArray.length;
    }

    public static boolean x(float f2, float f3) {
        return bt.bz(f3 - f2) < 1.0E-5f;
    }

    public static int aG(int n2, int n3) {
        return (n2 % n3 + n3) % n3;
    }

    public static float bN(float f2) {
        if ((f2 %= 360.0f) >= 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    public static double aJ(double d2) {
        if ((d2 %= 360.0) >= 180.0) {
            d2 -= 360.0;
        }
        if (d2 < -180.0) {
            d2 += 360.0;
        }
        return d2;
    }

    public static int w(String string, int n2) {
        try {
            return Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            return n2;
        }
    }

    public static int j(String string, int n2, int n3) {
        return Math.max(n3, bt.w(string, n2));
    }

    public static double d(String string, double d2) {
        try {
            return Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            return d2;
        }
    }

    public static double c(String string, double d2, double d3) {
        return Math.max(d3, bt.d(string, d2));
    }

    public static int hO(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >> 1;
        n3 |= n3 >> 2;
        n3 |= n3 >> 4;
        n3 |= n3 >> 8;
        n3 |= n3 >> 16;
        return n3 + 1;
    }

    private static boolean hP(int n2) {
        return n2 != 0 && (n2 & n2 - 1) == 0;
    }

    private static int hQ(int n2) {
        n2 = bt.hP(n2) ? n2 : bt.hO(n2);
        return dzb[(int)((long)n2 * 125613361L >> 27) & 0x1F];
    }

    public static int hR(int n2) {
        return bt.hQ(n2) - (bt.hP(n2) ? 0 : 1);
    }

    public static int aH(int n2, int n3) {
        int n4;
        if (n3 == 0) {
            return 0;
        }
        if (n2 == 0) {
            return n3;
        }
        if (n2 < 0) {
            n3 *= -1;
        }
        return (n4 = n2 % n3) == 0 ? n2 : n2 + n3 - n4;
    }

    public static int J(float f2, float f3, float f4) {
        return bt.G(bt.bL(f2 * 255.0f), bt.bL(f3 * 255.0f), bt.bL(f4 * 255.0f));
    }

    public static int G(int n2, int n3, int n4) {
        int n5 = (n2 << 8) + n3;
        n5 = (n5 << 8) + n4;
        return n5;
    }

    public static int aI(int n2, int n3) {
        int n4 = (n2 & 0xFF0000) >> 16;
        int n5 = (n3 & 0xFF0000) >> 16;
        int n6 = (n2 & 0xFF00) >> 8;
        int n7 = (n3 & 0xFF00) >> 8;
        int n8 = (n2 & 0xFF) >> 0;
        int n9 = (n3 & 0xFF) >> 0;
        int n10 = (int)((float)n4 * (float)n5 / 255.0f);
        int n11 = (int)((float)n6 * (float)n7 / 255.0f);
        int n12 = (int)((float)n8 * (float)n9 / 255.0f);
        return n2 & 0xFF000000 | n10 << 16 | n11 << 8 | n12;
    }

    public static double aK(double d2) {
        return d2 - Math.floor(d2);
    }

    public static long g(db db2) {
        return bt.H(db2.wt(), db2.wu(), db2.wx());
    }

    public static long H(int n2, int n3, int n4) {
        long l2 = (long)(n2 * 3129871) ^ (long)n4 * 116129781L ^ (long)n3;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        return l2;
    }

    public static UUID h(Random random) {
        long l2 = random.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l3 = random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l2, l3);
    }

    public static double aj(double d2, double d3, double d4) {
        return (d2 - d3) / (d4 - d3);
    }

    public static double y(double d2, double d3) {
        double d4;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        double d5 = d3 * d3 + d2 * d2;
        if (Double.isNaN(d5)) {
            return Double.NaN;
        }
        boolean bl5 = bl4 = d2 < 0.0;
        if (bl4) {
            d2 = -d2;
        }
        boolean bl6 = bl3 = d3 < 0.0;
        if (bl3) {
            d3 = -d3;
        }
        boolean bl7 = bl2 = d2 > d3;
        if (bl2) {
            d4 = d3;
            d3 = d2;
            d2 = d4;
        }
        d4 = bt.aL(d5);
        d3 *= d4;
        double d6 = dzc + (d2 *= d4);
        int n2 = (int)Double.doubleToRawLongBits(d6);
        double d7 = dzd[n2];
        double d8 = dze[n2];
        double d9 = d6 - dzc;
        double d10 = d2 * d8 - d3 * d9;
        double d11 = (6.0 + d10 * d10) * d10 * 0.16666666666666666;
        double d12 = d7 + d11;
        if (bl2) {
            d12 = 1.5707963267948966 - d12;
        }
        if (bl3) {
            d12 = Math.PI - d12;
        }
        if (bl4) {
            d12 = -d12;
        }
        return d12;
    }

    public static double aL(double d2) {
        double d3 = 0.5 * d2;
        long l2 = Double.doubleToRawLongBits(d2);
        l2 = 6910469410427058090L - (l2 >> 1);
        d2 = Double.longBitsToDouble(l2);
        d2 *= 1.5 - d3 * d2 * d2;
        return d2;
    }

    public static int K(float f2, float f3, float f4) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return 0;
    }

    static { /* RISE-PORT STUB: initializer unrestored */ }
}

