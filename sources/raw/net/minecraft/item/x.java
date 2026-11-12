/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.creativetab.a;
import net.minecraft.item.bg;
import net.minecraft.item.c;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.world.w;

public class x
extends bg {
    public x(int n2, float f2, boolean bl2) {
        super(n2, f2, bl2);
        this.bM(true);
    }

    @Override
    public boolean au(co co2) {
        return co2.yc() > 0;
    }

    @Override
    public c av(co co2) {
        return co2.yc() == 0 ? c.cVd : c.cVe;
    }

    @Override
    protected void d(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (!w2.dDw) {
            a2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgR.dhb, 2400, 0));
        }
        if (co2.yc() > 0) {
            if (!w2.dDw) {
                a2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgF.dhb, 600, 4));
                a2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgG.dhb, 6000, 0));
                a2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgH.dhb, 6000, 0));
            }
        } else {
            super.d(co2, w2, a2);
        }
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, 0));
        list.add(new co(d2, 1, 1));
    }
}

