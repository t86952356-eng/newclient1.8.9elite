/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import net.minecraft.stats.d;
import net.minecraft.stats.f;

class i
implements d {
    i() {
    }

    @Override
    public String hj(int n2) {
        double d2 = (double)n2 / 100.0;
        double d3 = d2 / 1000.0;
        return d3 > 0.5 ? f.dpv.format(d3) + " km" : (d2 > 0.5 ? f.dpv.format(d2) + " m" : n2 + " cm");
    }
}

