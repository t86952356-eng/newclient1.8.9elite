/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.creativetab.a;
import net.minecraft.entity.passive.k;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class al
extends d {
    public al() {
        this.d(a.cpA);
        this.fU(1);
        this.fW(25);
    }

    @Override
    public boolean adw() {
        return true;
    }

    @Override
    public boolean adx() {
        return true;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        k k2;
        if (a2.isRiding() && a2.crC instanceof k && (k2 = (k)a2.crC).aaR().WL() && co2.adt() - co2.yc() >= 7) {
            k2.aaR().WK();
            co2.b(7, (r)a2);
            if (co2.cWZ == 0) {
                co co3 = new co(Items.cQV);
                co3.u(co2.aek());
                return co3;
            }
        }
        a2.a(n.dqE[d.p(this)]);
        return co2;
    }
}

