/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.util.ad;
import net.minecraft.util.ba;
import net.minecraft.util.cr;
import net.minecraft.util.t;

public class af
extends ad {
    protected c dvD;
    private boolean dvE = false;

    public af(String string, c c2) {
        super(string);
        this.dvD = c2;
    }

    public af ast() {
        this.dvE = true;
        return this;
    }

    public boolean asu() {
        return this.dvE;
    }

    @Override
    public c dk() {
        return this.dvD;
    }

    @Override
    public ba ad(r r2) {
        co co2 = this.dvD instanceof r ? ((r)this.dvD).Vk() : null;
        String string = "death.attack." + this.dvz;
        String string2 = string + ".item";
        return co2 != null && co2.aen() && cr.go(string2) ? new t(string2, r2.xW(), this.dvD.xW(), co2.DM()) : new t(string, r2.xW(), this.dvD.xW());
    }

    @Override
    public boolean asn() {
        return this.dvD != null && this.dvD instanceof r && !(this.dvD instanceof a);
    }
}

