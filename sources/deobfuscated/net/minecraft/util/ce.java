/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.entity.c;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.cf;
import net.minecraft.util.da;

public class ce {
    private b jI;
    public cf dzu;
    public ao dzv;
    public da daS;
    public c dzw;

    public ce(da da2, ao ao2, b b2) {
        this(cf.dzy, da2, ao2, b2);
    }

    public ce(da da2, ao ao2) {
        this(cf.dzy, da2, ao2, b.dtN);
    }

    public ce(c c2) {
        this(c2, new da(c2.gW, c2.gX, c2.gY));
    }

    public ce(cf cf2, da da2, ao ao2, b b2) {
        this.dzu = cf2;
        this.jI = b2;
        this.dzv = ao2;
        this.daS = new da(da2.dAG, da2.dAH, da2.dAI);
    }

    public ce(c c2, da da2) {
        this.dzu = cf.dzz;
        this.dzw = c2;
        this.daS = da2;
    }

    public b dg() {
        return this.jI;
    }

    public void a(b b2) {
        this.jI = b2;
    }

    public String toString() {
        return "HitResult{type=" + String.valueOf((Object)this.dzu) + ", blockpos=" + String.valueOf(this.jI) + ", f=" + String.valueOf(this.dzv) + ", pos=" + String.valueOf(this.daS) + ", entity=" + String.valueOf(this.dzw) + "}";
    }
}

