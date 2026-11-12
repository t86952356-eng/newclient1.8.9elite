/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import net.minecraft.util.b;
import net.minecraft.world.biome.d;
import net.minecraft.world.biome.e;
import net.minecraft.world.biome.f;
import net.minecraft.world.biome.g;
import net.minecraft.world.l;

public class c {
    private static final g dEY = new d();
    private static final g dEZ = new e();
    private static final g dFa = new f();

    private static int a(l l2, b b2, g g2) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (net.minecraft.util.g g3 : b.c(b2.C(-1, 0, -1), b2.C(1, 0, 1))) {
            int n5 = g2.a(l2.aF(g3), g3);
            n2 += (n5 & 0xFF0000) >> 16;
            n3 += (n5 & 0xFF00) >> 8;
            n4 += n5 & 0xFF;
        }
        return (n2 / 9 & 0xFF) << 16 | (n3 / 9 & 0xFF) << 8 | n4 / 9 & 0xFF;
    }

    public static int w(l l2, b b2) {
        return c.a(l2, b2, dEY);
    }

    public static int x(l l2, b b2) {
        return c.a(l2, b2, dEZ);
    }

    public static int y(l l2, b b2) {
        return c.a(l2, b2, dFa);
    }
}

