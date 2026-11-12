/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class an
extends d {
    public an() {
        this.bM(true);
        this.fW(0);
        this.d(a.cpH);
    }

    @Override
    public String ao(co co2) {
        return co2.yc() == 1 ? "item.charcoal" : "item.coal";
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, 0));
        list.add(new co(d2, 1, 1));
    }
}

