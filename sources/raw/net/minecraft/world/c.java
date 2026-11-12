/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

public class c {
    private static int[] dBN = new int[65536];

    public static void l(int[] nArray) {
        dBN = nArray;
    }

    public static int z(double d2, double d3) {
        int n2 = (int)((1.0 - d2) * 255.0);
        int n3 = (int)((1.0 - (d3 *= d2)) * 255.0);
        return dBN[n3 << 8 | n2];
    }

    public static int auU() {
        return 0x619961;
    }

    public static int auV() {
        return 8431445;
    }

    public static int auW() {
        return 4764952;
    }
}

