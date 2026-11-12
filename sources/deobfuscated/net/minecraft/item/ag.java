/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.entity.item.b;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class ag
extends d {
    public ag() {
        this.cVn = 1;
        this.d(a.cpA);
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        c c2;
        float f2 = 1.0f;
        float f3 = a2.crO + (a2.pm - a2.crO) * 1.0f;
        float f4 = a2.crM + (a2.pl - a2.crM) * 1.0f;
        double d2 = a2.crF + (a2.gW - a2.crF) * 1.0;
        double d3 = a2.crG + (a2.gX - a2.crG) * 1.0 + (double)a2.getEyeHeight();
        double d4 = a2.crH + (a2.gY - a2.crH) * 1.0;
        da da2 = new da(d2, d3, d4);
        float f5 = bt.bB(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = bt.bx(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f7 = -bt.bB(-f3 * ((float)Math.PI / 180));
        float f8 = bt.bx(-f3 * ((float)Math.PI / 180));
        float f9 = f6 * f7;
        float f10 = f5 * f7;
        double d5 = 5.0;
        da da3 = da2.al((double)f9 * 5.0, (double)f8 * 5.0, (double)f10 * 5.0);
        ce ce2 = w2.a(da2, da3, true);
        if (ce2 == null) {
            return co2;
        }
        da da4 = a2.O(1.0f);
        boolean bl2 = false;
        float f11 = 1.0f;
        List<c> list = w2.b(a2, a2.Us().ac(da4.dAG * 5.0, da4.dAH * 5.0, da4.dAI * 5.0).ad(1.0, 1.0, 1.0));
        for (int i2 = 0; i2 < list.size(); ++i2) {
            c2 = list.get(i2);
            if (!c2.TO()) continue;
            float f12 = c2.TX();
            net.minecraft.util.a a3 = c2.Us().ad(f12, f12, f12);
            if (!a3.o(da2)) continue;
            bl2 = true;
        }
        if (bl2) {
            return co2;
        }
        if (ce2.dzu == cf.dzy) {
            net.minecraft.util.b b2 = ce2.dg();
            if (w2.L(b2).df() == Blocks.cMJ) {
                b2 = b2.aqY();
            }
            c2 = new b(w2, (float)b2.wt() + 0.5f, (float)b2.wu() + 1.0f, (float)b2.wx() + 0.5f);
            ((b)c2).pl = ((bt.aF((double)(a2.pl * 4.0f / 360.0f) + 0.5) & 3) - 1) * 90;
            if (!w2.a(c2, c2.Us().ad(-0.1, -0.1, -0.1)).isEmpty()) {
                return co2;
            }
            if (!w2.dDw) {
                w2.G(c2);
            }
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            a2.a(n.dqE[d.p(this)]);
        }
        return co2;
    }
}

