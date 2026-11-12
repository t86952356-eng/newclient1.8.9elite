/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.creativetab.a;
import net.minecraft.entity.item.j;
import net.minecraft.entity.item.t;
import net.minecraft.entity.l;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class bi
extends d {
    private final Class<? extends l> cWA;

    public bi(Class<? extends l> clazz) {
        this.cWA = clazz;
        this.d(a.cpy);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (ao2 == ao.dwq) {
            return false;
        }
        if (ao2 == ao.dwr) {
            return false;
        }
        b b3 = b2.x(ao2);
        if (!a2.a(b3, ao2, co2)) {
            return false;
        }
        l l2 = this.j(w2, b3, ao2);
        if (l2 != null && l2.UK()) {
            if (!w2.dDw) {
                w2.G(l2);
            }
            --co2.cWZ;
        }
        return true;
    }

    private l j(w w2, b b2, ao ao2) {
        return this.cWA == t.class ? new t(w2, b2, ao2) : (this.cWA == j.class ? new j(w2, b2, ao2) : null);
    }
}

