/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.monster.ai;
import net.minecraft.entity.monster.an;

class am
extends e {
    private final ai cFf;

    public am(ai ai2) {
        this.cFf = ai2;
        this.eO(5);
    }

    @Override
    public boolean WC() {
        return true;
    }

    @Override
    public void WF() {
        ((an)this.cFf.US()).setSpeed(1.0);
    }
}

