/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.ai.ao;
import net.minecraft.entity.passive.l;

class o
extends ao {
    private final l cGD;

    public o(l l2, double d2) {
        super(l2, d2);
        this.cGD = l2;
    }

    @Override
    public void WF() {
        super.WF();
        this.cGD.as(this.LL);
    }
}

