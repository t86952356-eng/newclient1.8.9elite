/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.creativetab.a;
import net.minecraft.item.bd;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.world.w;

public class bc
extends bg {
    private final boolean cWd;

    public bc(boolean bl2) {
        super(0, 0.0f, false);
        this.cWd = bl2;
    }

    @Override
    public int aE(co co2) {
        bd bd2 = bd.aG(co2);
        return this.cWd && bd2.adT() ? bd2.adR() : bd2.adP();
    }

    @Override
    public float aF(co co2) {
        bd bd2 = bd.aG(co2);
        return this.cWd && bd2.adT() ? bd2.adS() : bd2.adQ();
    }

    @Override
    public String ar(co co2) {
        return bd.aG(co2) == bd.cWh ? "+0-1+2+3+13&4-4" : null;
    }

    @Override
    protected void d(co co2, w w2, net.minecraft.entity.player.a a2) {
        bd bd2 = bd.aG(co2);
        if (bd2 == bd.cWh) {
            a2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgO.id, 1200, 3));
            a2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgM.id, 300, 2));
            a2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgE.id, 300, 1));
        }
        super.d(co2, w2, a2);
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        for (bd bd2 : bd.values()) {
            if (this.cWd && !bd2.adT()) continue;
            list.add(new co(this, 1, bd2.yc()));
        }
    }

    @Override
    public String ao(co co2) {
        bd bd2 = bd.aG(co2);
        return this.xB() + "." + bd2.xB() + "." + (this.cWd && bd2.adT() ? "cooked" : "raw");
    }
}

