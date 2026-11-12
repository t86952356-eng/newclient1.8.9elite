/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class be
extends d {
    public be() {
        this.fW(64);
        this.fU(1);
        this.d(a.cpE);
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
        if (a2.cIE != null) {
            int n2 = a2.cIE.acO();
            co2.b(n2, (r)a2);
            a2.swingItem();
        } else {
            w2.a((c)a2, "random.bow", 0.5f, 0.4f / (cVm.nextFloat() * 0.4f + 0.8f));
            if (!w2.dDw) {
                w2.G(new net.minecraft.entity.projectile.d(w2, a2));
            }
            a2.swingItem();
            a2.a(n.dqE[d.p(this)]);
        }
        return co2;
    }

    @Override
    public boolean aw(co co2) {
        return super.aw(co2);
    }

    @Override
    public int adC() {
        return 1;
    }
}

