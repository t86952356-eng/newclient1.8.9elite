/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.entity.projectile.b;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class at
extends d {
    public at() {
        this.cVn = 16;
        this.d(a.cpH);
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (!a2.cIt.cJM) {
            --co2.cWZ;
        }
        w2.a((c)a2, "random.bow", 0.5f, 0.4f / (cVm.nextFloat() * 0.4f + 0.8f));
        if (!w2.dDw) {
            w2.G(new b(w2, a2));
        }
        a2.a(n.dqE[d.p(this)]);
        return co2;
    }
}

