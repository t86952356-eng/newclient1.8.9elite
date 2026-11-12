/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.minecraft.util.bt;

public class z {
    public static final float eNb = (float)Math.PI;
    public static final float eNc = (float)Math.PI * 2;
    public static final float eNd = 1.5707964f;
    private static final float[] eNe;

    public static float cn(float f2) {
        return eNe[(int)((double)(f2 + 1.0f) * 32767.5) & 0xFFFF];
    }

    public static float co(float f2) {
        return 1.5707964f - eNe[(int)((double)(f2 + 1.0f) * 32767.5) & 0xFFFF];
    }

    public static int u(int[] nArray) {
        if (nArray.length <= 0) {
            return 0;
        }
        int n2 = z.v(nArray);
        int n3 = n2 / nArray.length;
        return n3;
    }

    public static int v(int[] nArray) {
        if (nArray.length <= 0) {
            return 0;
        }
        int n2 = 0;
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n3 = nArray[i2];
            n2 += n3;
        }
        return n2;
    }

    public static int ky(int n2) {
        int n3 = bt.hO(n2);
        return n2 == n3 ? n3 : n3 / 2;
    }

    public static boolean L(float f2, float f3, float f4) {
        return Math.abs(f2 - f3) <= f4;
    }

    public static float cp(float f2) {
        return f2 * 180.0f / bt.dyT;
    }

    public static float cq(float f2) {
        return f2 / 180.0f * bt.dyT;
    }

    public static float aX(double d2) {
        return (float)((double)Math.round(d2 * 1.0E8) / 1.0E8);
    }

    static {
        int n2;
        eNe = new float[65536];
        for (n2 = 0; n2 < 65536; ++n2) {
            z.eNe[n2] = (float)Math.asin((double)n2 / 32767.5 - 1.0);
        }
        for (n2 = -1; n2 < 2; ++n2) {
            z.eNe[(int)(((double)n2 + 1.0) * 32767.5) & 0xFFFF] = (float)Math.asin(n2);
        }
    }
}

