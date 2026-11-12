/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.util.db;
import net.minecraft.util.y;
import net.minecraft.world.chunk.a;
import net.minecraft.world.chunk.storage.g;
import net.minecraft.world.w;

public class c {
    public static final int etx = 63;
    public static final ao[][] ety = c.cO(false);
    public static final ao[][] etz = c.cO(true);
    private static int tS = 0;
    private static int etA = -1;
    private static int etB = 16;
    private static w etC = null;
    private static int etD = Integer.MIN_VALUE;
    private static int etE = Integer.MIN_VALUE;

    public static int a(w w2, net.minecraft.entity.c c2, int n2) {
        int n3 = bt.aF(c2.gW) >> 4;
        int n4 = bt.aF(c2.gX) >> 4;
        int n5 = bt.aF(c2.gY) >> 4;
        a a2 = w2.aL(n3, n5);
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        int n8 = n5 - n2;
        int n9 = n5 + n2;
        if (w2 != etC || n3 != etD || n5 != etE) {
            tS = 0;
            etB = 16;
            etC = w2;
            etD = n3;
            etE = n5;
        }
        if (tS == 0) {
            etA = -1;
        }
        int n10 = etA;
        switch (tS) {
            case 0: {
                n7 = n3;
                n9 = n5;
                break;
            }
            case 1: {
                n6 = n3;
                n9 = n5;
                break;
            }
            case 2: {
                n7 = n3;
                n8 = n5;
                break;
            }
            case 3: {
                n6 = n3;
                n8 = n5;
            }
        }
        for (int i2 = n6; i2 < n7; ++i2) {
            block9: for (int i3 = n8; i3 < n9; ++i3) {
                y<net.minecraft.entity.c>[] yArray;
                a a3 = w2.aL(i2, i3);
                if (a3.isEmpty()) continue;
                g[] gArray = a3.axw();
                for (int i4 = gArray.length - 1; i4 > n10; --i4) {
                    g g2 = gArray[i4];
                    if (g2 == null || g2.isEmpty()) continue;
                    if (i4 <= n10) break;
                    n10 = i4;
                    break;
                }
                try {
                    yArray = a3.axJ();
                    if (!yArray.isEmpty()) {
                        for (y<net.minecraft.entity.c> y2 : yArray.keySet()) {
                            int n11 = ((db)((Object)y2)).wu() >> 4;
                            if (n11 <= n10) continue;
                            n10 = n11;
                        }
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    // empty catch block
                }
                yArray = a3.axK();
                for (int i5 = yArray.length - 1; i5 > n10; --i5) {
                    y<net.minecraft.entity.c> y2;
                    y2 = yArray[i5];
                    if (y2.isEmpty() || a3 == a2 && i5 == n4 && y2.size() == 1) continue;
                    if (i5 <= n10) continue block9;
                    n10 = i5;
                    continue block9;
                }
            }
        }
        if (tS < 3) {
            etA = n10;
            n10 = etB;
        } else {
            etB = n10;
            etA = -1;
        }
        tS = (tS + 1) % 4;
        return n10 << 4;
    }

    public static boolean kM() {
        return tS == 0;
    }

    private static ao[][] cO(boolean bl2) {
        int n2 = 64;
        ao[][] aoArray = new ao[64][];
        for (int i2 = 0; i2 < 64; ++i2) {
            ArrayList<ao> arrayList = new ArrayList<ao>();
            for (int i3 = 0; i3 < ao.dwD.length; ++i3) {
                ao ao2 = ao.dwD[i3];
                ao ao3 = bl2 ? ao2.asC() : ao2;
                int n3 = 1 << ao3.ordinal();
                if ((i2 & n3) == 0) continue;
                arrayList.add(ao2);
            }
            ao[] aoArray2 = arrayList.toArray(new ao[arrayList.size()]);
            aoArray[i2] = aoArray2;
        }
        return aoArray;
    }

    public static ao[] jB(int n2) {
        int n3 = ~n2 & 0x3F;
        return etz[n3];
    }

    public static void aX() {
        etC = null;
    }
}

