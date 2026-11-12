/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.monster.ai;
import net.minecraft.entity.monster.an;
import net.minecraft.pathfinding.f;

class al
extends e {
    private final ai cFe;

    public al(ai ai2) {
        this.cFe = ai2;
        this.eO(5);
        ((f)ai2.UU()).bT(true);
    }

    @Override
    public boolean WC() {
        return this.cFe.isInWater() || this.cFe.isInLava();
    }

    @Override
    public void WF() {
        if (this.cFe.VB().nextFloat() < 0.8f) {
            this.cFe.UT().Xb();
        }
        ((an)this.cFe.US()).setSpeed(1.2);
    }
}

