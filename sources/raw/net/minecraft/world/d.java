/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

public class d {
    private static int[] dBO = new int[65536];

    public static void m(int[] nArray) {
        dBO = nArray;
    }

    public static int A(double d2, double d3) {
        int n2 = (int)((1.0 - (d3 *= d2)) * 255.0);
        int n3 = (int)((1.0 - d2) * 255.0);
        int n4 = n2 << 8 | n3;
        return n4 > dBO.length ? -65281 : dBO[n4];
    }
}

