/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.dispenser;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.c;
import net.minecraft.dispenser.e;
import net.minecraft.dispenser.h;
import net.minecraft.entity.item.i;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.world.w;

public class a
implements c {
    @Override
    public final co a(e e2, co co2) {
        co co3 = this.b(e2, co2);
        this.b(e2);
        this.a(e2, BlockDispenser.aQ(e2.zg()));
        return co3;
    }

    protected co b(e e2, co co2) {
        ao ao2 = BlockDispenser.aQ(e2.zg());
        h h2 = BlockDispenser.a(e2);
        co co3 = co2.ge(1);
        a.a(e2.de(), co3, 6, ao2, h2);
        return co2;
    }

    public static void a(w w2, co co2, int n2, ao ao2, h h2) {
        double d2 = h2.getX();
        double d3 = h2.getY();
        double d4 = h2.getZ();
        d3 = ao2.asL() == ap.dwI ? (d3 -= 0.125) : (d3 -= 0.15625);
        i i2 = new i(w2, d2, d3, d4, co2);
        double d5 = w2.dDk.nextDouble() * 0.1 + 0.2;
        i2.ud = (double)ao2.asH() * d5;
        i2.ue = 0.2f;
        i2.uf = (double)ao2.asJ() * d5;
        i2.ud += w2.dDk.nextGaussian() * (double)0.0075f * (double)n2;
        i2.ue += w2.dDk.nextGaussian() * (double)0.0075f * (double)n2;
        i2.uf += w2.dDk.nextGaussian() * (double)0.0075f * (double)n2;
        w2.G(i2);
    }

    protected void b(e e2) {
        e2.de().e(1000, e2.dg(), 0);
    }

    protected void a(e e2, ao ao2) {
        e2.de().e(2000, e2.dg(), this.s(ao2));
    }

    private int s(ao ao2) {
        return ao2.asH() + 1 + (ao2.asJ() + 1) * 3;
    }
}

