/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.pathfinding.f;

public class ar
extends e {
    private final j czu;

    public ar(j j2) {
        this.czu = j2;
    }

    @Override
    public boolean WC() {
        return this.czu.baU.avr();
    }

    @Override
    public void WG() {
        ((f)this.czu.UU()).bU(true);
    }

    @Override
    public void WE() {
        ((f)this.czu.UU()).bU(false);
    }
}

