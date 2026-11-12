/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import java.util.Random;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.l;
import net.minecraft.enchantment.z;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.y;
import net.minecraft.util.ad;
import net.minecraft.util.cm;

public class v
extends a {
    public v(int n2, cm cm2, int n3) {
        super(n2, cm2, n3, z.cra);
        this.eb("thorns");
    }

    @Override
    public int ei(int n2) {
        return 10 + 20 * (n2 - 1);
    }

    @Override
    public int ej(int n2) {
        return super.ei(n2) + 50;
    }

    @Override
    public int Te() {
        return 3;
    }

    @Override
    public boolean T(co co2) {
        return co2.bP() instanceof y || super.T(co2);
    }

    @Override
    public void b(r r2, c c2, int n2) {
        Random random = r2.VB();
        co co2 = l.a(a.cqe, r2);
        if (v.b(n2, random)) {
            if (c2 != null) {
                c2.a(ad.aw(r2), (float)v.c(n2, random));
                c2.a("damage.thorns", 0.5f, 1.0f);
            }
            if (co2 != null) {
                co2.b(3, r2);
            }
        } else if (co2 != null) {
            co2.b(1, r2);
        }
    }

    public static boolean b(int n2, Random random) {
        return n2 > 0 && random.nextFloat() < 0.15f * (float)n2;
    }

    public static int c(int n2, Random random) {
        return n2 > 10 ? n2 - 10 : 1 + random.nextInt(4);
    }
}

