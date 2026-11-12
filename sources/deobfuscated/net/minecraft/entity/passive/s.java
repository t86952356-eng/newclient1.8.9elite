/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.ai.bk;
import net.minecraft.entity.passive.l;

class s
extends bk {
    private final l cGT;

    public s(l l2) {
        super(l2);
        this.cGT = l2;
    }

    @Override
    public void Xm() {
        if (this.cGT.aO && !this.cGT.aaS()) {
            this.cGT.as(0.0);
        }
        super.Xm();
    }
}

