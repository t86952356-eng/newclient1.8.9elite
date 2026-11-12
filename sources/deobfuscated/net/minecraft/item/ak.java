/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.init.Items;
import net.minecraft.item.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class ak
extends d {
    public ak() {
        this.fU(1);
        this.d(net.minecraft.creativetab.a.cpB);
    }

    @Override
    public co b(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (!a2.cIt.cJM) {
            --co2.cWZ;
        }
        if (!w2.dDw) {
            a2.VK();
        }
        a2.a(n.dqE[d.p(this)]);
        return co2.cWZ <= 0 ? new co(Items.cQA) : co2;
    }

    @Override
    public int aq(co co2) {
        return 32;
    }

    @Override
    public a ap(co co2) {
        return a.cUy;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        a2.c(co2, this.aq(co2));
        return co2;
    }
}

