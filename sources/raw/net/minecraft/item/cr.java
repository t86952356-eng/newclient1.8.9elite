/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.entity.player.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.v;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class cr
extends d {
    public cr() {
        this.fU(1);
    }

    @Override
    public co a(co co2, w w2, a a2) {
        a2.G(co2);
        a2.a(n.dqE[d.p(this)]);
        return co2;
    }

    public static boolean v(net.minecraft.nbt.n n2) {
        if (n2 == null) {
            return false;
        }
        if (!n2.C("pages", 9)) {
            return false;
        }
        v v2 = n2.D("pages", 8);
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            String string = v2.gm(i2);
            if (string == null) {
                return false;
            }
            if (string.length() <= Short.MAX_VALUE) continue;
            return false;
        }
        return true;
    }
}

