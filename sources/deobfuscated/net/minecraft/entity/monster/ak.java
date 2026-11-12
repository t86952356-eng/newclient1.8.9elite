/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.monster.ai;
import net.minecraft.entity.monster.an;

class ak
extends e {
    private final ai cFb;
    private float cFc;
    private int cFd;

    public ak(ai ai2) {
        this.cFb = ai2;
        this.eO(2);
    }

    @Override
    public boolean WC() {
        return this.cFb.UW() == null && (this.cFb.aO || this.cFb.isInWater() || this.cFb.isInLava());
    }

    @Override
    public void WF() {
        if (--this.cFd <= 0) {
            this.cFd = 40 + this.cFb.VB().nextInt(60);
            this.cFc = this.cFb.VB().nextInt(360);
        }
        ((an)this.cFb.US()).c(this.cFc, false);
    }
}

