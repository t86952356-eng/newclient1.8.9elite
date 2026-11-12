/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import net.minecraft.item.d;
import net.minecraft.scoreboard.b;
import net.minecraft.stats.f;
import net.minecraft.util.ba;

public class l
extends f {
    private final d dpz;

    public l(String string, String string2, ba ba2, d d2) {
        super(string + string2, ba2);
        this.dpz = d2;
        int n2 = d.p(d2);
        if (n2 != 0) {
            b.djp.put(string + n2, this.apu());
        }
    }

    public d apw() {
        return this.dpz;
    }
}

