/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.override;

import net.minecraft.client.multiplayer.d;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.network.h;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class b
extends d {
    private boolean elQ = false;
    private net.minecraft.util.b elR = null;
    private c elS = null;

    public b(net.minecraft.client.d d2, h h2) {
        super(d2, h2);
    }

    @Override
    public boolean e(net.minecraft.util.b b2, ao ao2) {
        this.elQ = true;
        this.elR = b2;
        boolean bl2 = super.e(b2, ao2);
        this.elQ = false;
        return bl2;
    }

    @Override
    public boolean f(net.minecraft.util.b b2, ao ao2) {
        this.elQ = true;
        this.elR = b2;
        boolean bl2 = super.f(b2, ao2);
        this.elQ = false;
        return bl2;
    }

    @Override
    public boolean a(a a2, w w2, co co2) {
        this.elQ = true;
        boolean bl2 = super.a(a2, w2, co2);
        this.elQ = false;
        return bl2;
    }

    @Override
    public boolean a(net.minecraft.client.entity.c c2, j j2, co co2, net.minecraft.util.b b2, ao ao2, da da2) {
        this.elQ = true;
        this.elR = b2;
        boolean bl2 = super.a(c2, j2, co2, b2, ao2, da2);
        this.elQ = false;
        return bl2;
    }

    @Override
    public boolean b(a a2, c c2) {
        this.elS = c2;
        return super.b(a2, c2);
    }

    @Override
    public boolean a(a a2, c c2, ce ce2) {
        this.elS = c2;
        return super.a(a2, c2, ce2);
    }

    public boolean aDp() {
        return this.elQ;
    }

    public net.minecraft.util.b aDq() {
        return this.elR;
    }

    public c aDr() {
        return this.elS;
    }
}

