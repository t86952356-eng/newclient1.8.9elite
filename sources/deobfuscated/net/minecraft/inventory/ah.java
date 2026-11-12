/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import java.util.Random;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ah {
    private static final Random cTZ = new Random();

    public static void a(w w2, b b2, ab ab2) {
        ah.a(w2, (double)b2.wt(), (double)b2.wu(), (double)b2.wx(), ab2);
    }

    public static void a(w w2, c c2, ab ab2) {
        ah.a(w2, c2.gW, c2.gX, c2.gY, ab2);
    }

    private static void a(w w2, double d2, double d3, double d4, ab ab2) {
        for (int i2 = 0; i2 < ab2.YI(); ++i2) {
            co co2 = ab2.fi(i2);
            if (co2 == null) continue;
            ah.a(w2, d2, d3, d4, co2);
        }
    }

    private static void a(w w2, double d2, double d3, double d4, co co2) {
        float f2 = cTZ.nextFloat() * 0.8f + 0.1f;
        float f3 = cTZ.nextFloat() * 0.8f + 0.1f;
        float f4 = cTZ.nextFloat() * 0.8f + 0.1f;
        while (co2.cWZ > 0) {
            int n2 = cTZ.nextInt(21) + 10;
            if (n2 > co2.cWZ) {
                n2 = co2.cWZ;
            }
            co2.cWZ -= n2;
            i i2 = new i(w2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f4, new co(co2.bP(), n2, co2.yc()));
            if (co2.aej()) {
                i2.Yk().u((n)co2.aek().aeG());
            }
            float f5 = 0.05f;
            i2.ud = cTZ.nextGaussian() * (double)0.05f;
            i2.ue = cTZ.nextGaussian() * (double)0.05f + (double)0.2f;
            i2.uf = cTZ.nextGaussian() * (double)0.05f;
            w2.G(i2);
        }
    }
}

