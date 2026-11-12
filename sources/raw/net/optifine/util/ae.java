/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class ae {
    public static float F(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : (f2 > f4 ? f4 : f2);
    }

    public static int bZ(int n2, int n3) {
        int n4 = n2 % n3;
        if (n4 < 0) {
            n4 += n3;
        }
        return n4;
    }
}

