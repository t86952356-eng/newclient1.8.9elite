/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.enchantment.l;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class ai
extends d {
    public static final String[] cVX = new String[]{"pulling_0", "pulling_1", "pulling_2"};

    public ai() {
        this.cVn = 1;
        this.fW(384);
        this.d(net.minecraft.creativetab.a.cpF);
    }

    @Override
    public void a(co co2, w w2, net.minecraft.entity.player.a a2, int n2) {
        boolean bl2;
        boolean bl3 = bl2 = a2.cIt.cJM || l.d(net.minecraft.enchantment.a.cqt.cqw, co2) > 0;
        if (bl2 || a2.cHV.o(Items.cPk)) {
            int n3;
            int n4;
            int n5 = this.aq(co2) - n2;
            float f2 = (float)n5 / 20.0f;
            if ((double)(f2 = (f2 * f2 + f2 * 2.0f) / 3.0f) < 0.1) {
                return;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            net.minecraft.entity.projectile.a a3 = new net.minecraft.entity.projectile.a(w2, a2, f2 * 2.0f);
            if (f2 == 1.0f) {
                a3.bL(true);
            }
            if ((n4 = l.d(net.minecraft.enchantment.a.cqq.cqw, co2)) > 0) {
                a3.at(a3.acK() + (double)n4 * 0.5 + 0.5);
            }
            if ((n3 = l.d(net.minecraft.enchantment.a.cqr.cqw, co2)) > 0) {
                a3.fK(n3);
            }
            if (l.d(net.minecraft.enchantment.a.cqs.cqw, co2) > 0) {
                a3.ev(100);
            }
            co2.b(1, (r)a2);
            w2.a((c)a2, "random.bow", 1.0f, 1.0f / (cVm.nextFloat() * 0.4f + 1.2f) + f2 * 0.5f);
            if (bl2) {
                a3.cJW = 2;
            } else {
                a2.cHV.n(Items.cPk);
            }
            a2.a(n.dqE[d.p(this)]);
            if (!w2.dDw) {
                w2.G(a3);
            }
        }
    }

    @Override
    public co b(co co2, w w2, net.minecraft.entity.player.a a2) {
        return co2;
    }

    @Override
    public int aq(co co2) {
        return 72000;
    }

    @Override
    public a ap(co co2) {
        return a.cUA;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (a2.cIt.cJM || a2.cHV.o(Items.cPk)) {
            a2.c(co2, this.aq(co2));
        }
        return co2;
    }

    @Override
    public int adC() {
        return 1;
    }
}

