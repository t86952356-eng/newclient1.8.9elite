/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.creativetab.a;
import net.minecraft.init.Items;
import net.minecraft.item.bp;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.world.storage.f;
import net.minecraft.world.w;

public class au
extends bp {
    protected au() {
        this.d(a.cpB);
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        co co3 = new co(Items.cRh, 1, w2.gA("map"));
        String string = "map_" + co3.yc();
        f f2 = new f(string);
        w2.a(string, f2);
        f2.dTk = 0;
        f2.a(a2.gW, a2.gY, f2.dTk);
        f2.dTj = (byte)w2.dDl.getDimensionId();
        f2.Lw();
        --co2.cWZ;
        if (co2.cWZ <= 0) {
            return co3;
        }
        if (!a2.cHV.ah(co3.aeg())) {
            a2.d(co3, false);
        }
        a2.a(n.dqE[d.p(this)]);
        return co2;
    }
}

