/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.util.af;
import net.minecraft.util.ba;
import net.minecraft.util.cr;
import net.minecraft.util.t;

public class ag
extends af {
    private final c dvF;

    public ag(String string, c c2, c c3) {
        super(string, c2);
        this.dvF = c3;
    }

    @Override
    public c asf() {
        return this.dvD;
    }

    @Override
    public c dk() {
        return this.dvF;
    }

    @Override
    public ba ad(r r2) {
        ba ba2 = this.dvF == null ? this.dvD.xW() : this.dvF.xW();
        co co2 = this.dvF instanceof r ? ((r)this.dvF).Vk() : null;
        String string = "death.attack." + this.dvz;
        String string2 = string + ".item";
        return co2 != null && co2.aen() && cr.go(string2) ? new t(string2, r2.xW(), ba2, co2.DM()) : new t(string, r2.xW(), ba2);
    }
}

