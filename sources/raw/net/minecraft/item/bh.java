/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.a;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.world.w;

public class bh
extends d {
    public bh() {
        this.d(a.cpG);
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        ce ce2 = this.a(w2, a2, true);
        if (ce2 == null) {
            return co2;
        }
        if (ce2.dzu == cf.dzy) {
            b b2 = ce2.dg();
            if (!w2.a(a2, b2)) {
                return co2;
            }
            if (!a2.a(b2.x(ce2.dzv), ce2.dzv, co2)) {
                return co2;
            }
            if (w2.L(b2).df().xb() == Material.bev) {
                --co2.cWZ;
                a2.a(n.dqE[d.p(this)]);
                if (co2.cWZ <= 0) {
                    return new co(Items.cRD);
                }
                if (!a2.cHV.ah(new co(Items.cRD))) {
                    a2.d(new co(Items.cRD, 1, 0), false);
                }
            }
        }
        return co2;
    }
}

