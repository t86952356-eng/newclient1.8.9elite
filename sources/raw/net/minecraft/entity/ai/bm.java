/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import java.util.Random;
import net.minecraft.entity.j;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;

public class bm {
    private static da cAy = new da(0.0, 0.0, 0.0);

    public static da a(j j2, int n2, int n3) {
        return bm.c(j2, n2, n3, null);
    }

    public static da a(j j2, int n2, int n3, da da2) {
        cAy = da2.ak(j2.gW, j2.gX, j2.gY);
        return bm.c(j2, n2, n3, cAy);
    }

    public static da b(j j2, int n2, int n3, da da2) {
        cAy = new da(j2.gW, j2.gX, j2.gY).v(da2);
        return bm.c(j2, n2, n3, cAy);
    }

    private static da c(j j2, int n2, int n3, da da2) {
        double d2;
        double d3;
        Random random = j2.VB();
        boolean bl2 = false;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        float f2 = -99999.0f;
        boolean bl3 = j2.UH() ? (d3 = j2.UE().am(bt.aF(j2.gW), bt.aF(j2.gX), bt.aF(j2.gY)) + 4.0) < (d2 = (double)(j2.UF() + (float)n2)) * d2 : false;
        for (int i2 = 0; i2 < 10; ++i2) {
            float f3;
            b b2;
            int n7 = random.nextInt(2 * n2 + 1) - n2;
            int n8 = random.nextInt(2 * n3 + 1) - n3;
            int n9 = random.nextInt(2 * n2 + 1) - n2;
            if (da2 != null && !((double)n7 * da2.dAG + (double)n9 * da2.dAI >= 0.0)) continue;
            if (j2.UH() && n2 > 1) {
                b2 = j2.UE();
                n7 = j2.gW > (double)b2.wt() ? (n7 -= random.nextInt(n2 / 2)) : (n7 += random.nextInt(n2 / 2));
                n9 = j2.gY > (double)b2.wx() ? (n9 -= random.nextInt(n2 / 2)) : (n9 += random.nextInt(n2 / 2));
            }
            b2 = new b(n7 += bt.aF(j2.gW), n8 += bt.aF(j2.gX), n9 += bt.aF(j2.gY));
            if (bl3 && !j2.ae(b2) || !((f3 = j2.ad(b2)) > f2)) continue;
            f2 = f3;
            n4 = n7;
            n5 = n8;
            n6 = n9;
            bl2 = true;
        }
        if (bl2) {
            return new da(n4, n5, n6);
        }
        return null;
    }
}

