/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.passive.z;

public class y
extends e {
    private final w cym;
    private z cxN;
    private int cyn;

    public y(w w2) {
        this.cym = w2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        if (!this.cym.baU.avr()) {
            return false;
        }
        if (this.cym.VB().nextInt(8000) != 0) {
            return false;
        }
        this.cxN = (z)((Object)this.cym.baU.a(z.class, this.cym.Us().ad(6.0, 2.0, 6.0), this.cym));
        return this.cxN != null;
    }

    @Override
    public boolean WD() {
        return this.cyn > 0;
    }

    @Override
    public void WG() {
        this.cyn = 400;
        this.cym.bf(true);
    }

    @Override
    public void WE() {
        this.cym.bf(false);
        this.cxN = null;
    }

    @Override
    public void WF() {
        this.cym.UR().b(this.cxN, 30.0f, 30.0f);
        --this.cyn;
    }
}

