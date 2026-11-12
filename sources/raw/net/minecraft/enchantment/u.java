/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.l;
import net.minecraft.enchantment.z;
import net.minecraft.entity.c;
import net.minecraft.util.ad;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class u
extends a {
    private static final String[] cqR = new String[]{"all", "fire", "fall", "explosion", "projectile"};
    private static final int[] cqS = new int[]{1, 10, 5, 5, 3};
    private static final int[] cqT = new int[]{11, 8, 6, 8, 6};
    private static final int[] cqU = new int[]{20, 12, 10, 12, 15};
    public final int cqV;

    public u(int n2, cm cm2, int n3, int n4) {
        super(n2, cm2, n3, z.cqX);
        this.cqV = n4;
        if (n4 == 2) {
            this.cqy = z.cqY;
        }
    }

    @Override
    public int ei(int n2) {
        return cqS[this.cqV] + (n2 - 1) * cqT[this.cqV];
    }

    @Override
    public int ej(int n2) {
        return this.ei(n2) + cqU[this.cqV];
    }

    @Override
    public int Te() {
        return 4;
    }

    @Override
    public int a(int n2, ad ad2) {
        if (ad2.asd()) {
            return 0;
        }
        float f2 = (float)(6 + n2 * n2) / 3.0f;
        return this.cqV == 0 ? bt.bL(f2 * 0.75f) : (this.cqV == 1 && ad2.ask() ? bt.bL(f2 * 1.25f) : (this.cqV == 2 && ad2 == ad.dvj ? bt.bL(f2 * 2.5f) : (this.cqV == 3 && ad2.arZ() ? bt.bL(f2 * 1.5f) : (this.cqV == 4 && ad2.arX() ? bt.bL(f2 * 1.5f) : 0))));
    }

    @Override
    public String getName() {
        return "enchantment.protect." + cqR[this.cqV];
    }

    @Override
    public boolean a(a a2) {
        if (a2 instanceof u) {
            u u2 = (u)a2;
            return u2.cqV != this.cqV && (this.cqV == 2 || u2.cqV == 2);
        }
        return super.a(a2);
    }

    public static int a(c c2, int n2) {
        int n3 = l.a(a.cpY.cqw, c2.Ub());
        if (n3 > 0) {
            n2 -= bt.bL((float)n2 * (float)n3 * 0.15f);
        }
        return n2;
    }

    public static double c(c c2, double d2) {
        int n2 = l.a(a.cqa.cqw, c2.Ub());
        if (n2 > 0) {
            d2 -= (double)bt.aF(d2 * (double)((float)n2 * 0.15f));
        }
        return d2;
    }
}

