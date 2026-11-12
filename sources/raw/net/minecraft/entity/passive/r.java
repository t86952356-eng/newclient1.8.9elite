/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.ai.bg;
import net.minecraft.entity.passive.l;
import net.minecraft.entity.passive.q;

public class r
extends bg {
    private final l cGR;
    private boolean cGS = false;

    public r(l l2, l l3) {
        super(l3);
        this.cGR = l3;
    }

    public boolean abg() {
        return this.cuU;
    }

    public boolean abh() {
        return this.cGS;
    }

    public void bA(boolean bl2) {
        this.cGS = bl2;
    }

    @Override
    public void Xc() {
        if (this.cuU) {
            this.cGR.b(q.cGJ);
            this.cuU = false;
        }
    }
}

