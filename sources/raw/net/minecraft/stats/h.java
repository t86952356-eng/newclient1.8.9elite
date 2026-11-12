/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import net.minecraft.stats.d;
import net.minecraft.stats.f;

class h
implements d {
    h() {
    }

    @Override
    public String hj(int n2) {
        double d2 = (double)n2 / 20.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 60.0;
        double d5 = d4 / 24.0;
        double d6 = d5 / 365.0;
        return d6 > 0.5 ? f.dpv.format(d6) + " y" : (d5 > 0.5 ? f.dpv.format(d5) + " d" : (d4 > 0.5 ? f.dpv.format(d4) + " h" : (d3 > 0.5 ? f.dpv.format(d3) + " m" : d2 + " s")));
    }
}

