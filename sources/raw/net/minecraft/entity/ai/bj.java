/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bi;
import net.minecraft.entity.c;
import net.minecraft.tileentity.b;
import net.minecraft.world.w;

class bj
extends b {
    final /* synthetic */ bi cAt;

    bj(bi bi2) {
        this.cAt = bi2;
    }

    @Override
    public void eQ(int n2) {
        this.cAt.baU.a((c)this.cAt, (byte)n2);
    }

    @Override
    public w Xj() {
        return this.cAt.baU;
    }

    @Override
    public net.minecraft.util.b Xk() {
        return new net.minecraft.util.b(this.cAt);
    }
}

