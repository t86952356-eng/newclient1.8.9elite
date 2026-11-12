/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.p;
import net.minecraft.pathfinding.f;

public class au
extends e {
    private final p czz;

    public au(p p2) {
        this.czz = p2;
        this.eO(4);
        ((f)p2.UU()).bT(true);
    }

    @Override
    public boolean WC() {
        return this.czz.isInWater() || this.czz.isInLava();
    }

    @Override
    public void WF() {
        if (this.czz.VB().nextFloat() < 0.8f) {
            this.czz.UT().Xb();
        }
    }
}

