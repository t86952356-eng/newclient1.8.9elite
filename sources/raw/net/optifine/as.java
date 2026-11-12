/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

public class as {
    private static boolean ecC = false;
    private static long ecD = -1L;
    private static int ecE = 0;
    private static int ecF = 0;
    private static boolean ecG = false;
    private static boolean ecH = false;
    private static final long ecI = 3000L;
    private static final int ecJ = 10;

    public static void aBs() {
        ecC = true;
        if (ecD < 0L) {
            ecD = System.currentTimeMillis();
        }
    }

    public static boolean aX(int n2) {
        if (!ecC) {
            return true;
        }
        ++ecE;
        if (ecH) {
            ecH = false;
            return true;
        }
        if (ecG) {
            ++ecF;
        }
        return !ecG;
    }
}

