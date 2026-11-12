/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.pathfinding.f;
import net.minecraft.util.b;
import net.minecraft.village.c;

public class aq
extends e {
    private final j czs;
    private net.minecraft.village.f czt;

    public aq(j j2) {
        this.czs = j2;
        if (!(j2.UU() instanceof f)) {
            throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
        }
    }

    @Override
    public boolean WC() {
        if (this.czs.baU.avr()) {
            return false;
        }
        b b2 = new b(this.czs);
        c c2 = this.czs.baU.avS().e(b2, 16);
        if (c2 == null) {
            return false;
        }
        this.czt = c2.as(b2);
        return this.czt != null && (double)this.czt.aC(b2) < 2.25;
    }

    @Override
    public boolean WD() {
        return !this.czs.baU.avr() && !this.czt.auK() && this.czt.aD(new b(this.czs));
    }

    @Override
    public void WG() {
        ((f)this.czs.UU()).bR(false);
        ((f)this.czs.UU()).bS(false);
    }

    @Override
    public void WE() {
        ((f)this.czs.UU()).bR(true);
        ((f)this.czs.UU()).bS(true);
        this.czt = null;
    }

    @Override
    public void WF() {
        this.czt.auD();
    }
}

