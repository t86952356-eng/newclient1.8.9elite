/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public class bl {
    private static final Integer[] dyA = new Integer[65535];

    public static Integer hK(int n2) {
        return n2 >= 0 && n2 < dyA.length ? dyA[n2] : new Integer(n2);
    }

    static {
        int n2 = dyA.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bl.dyA[i2] = i2;
        }
    }
}

