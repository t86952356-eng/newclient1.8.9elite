/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.entity.player.a;

public class be
extends e {
    protected p cAi;
    protected c cAj;
    protected float cAk;
    private int cyn;
    private final float cAl;
    protected Class<? extends c> cAm;

    public be(p p2, Class<? extends c> clazz, float f2) {
        this.cAi = p2;
        this.cAm = clazz;
        this.cAk = f2;
        this.cAl = 0.02f;
        this.eO(2);
    }

    public be(p p2, Class<? extends c> clazz, float f2, float f3) {
        this.cAi = p2;
        this.cAm = clazz;
        this.cAk = f2;
        this.cAl = f3;
        this.eO(2);
    }

    @Override
    public boolean WC() {
        if (this.cAi.VB().nextFloat() >= this.cAl) {
            return false;
        }
        if (this.cAi.UW() != null) {
            this.cAj = this.cAi.UW();
        }
        this.cAj = this.cAm == a.class ? this.cAi.baU.f(this.cAi, this.cAk) : this.cAi.baU.a(this.cAm, this.cAi.Us().ad(this.cAk, 3.0, this.cAk), this.cAi);
        return this.cAj != null;
    }

    @Override
    public boolean WD() {
        return this.cAj.TS() && !(this.cAi.T(this.cAj) > (double)(this.cAk * this.cAk)) && this.cyn > 0;
    }

    @Override
    public void WG() {
        this.cyn = 40 + this.cAi.VB().nextInt(40);
    }

    @Override
    public void WE() {
        this.cAj = null;
    }

    @Override
    public void WF() {
        this.cAi.UR().d(this.cAj.gW, this.cAj.gX + (double)this.cAj.getEyeHeight(), this.cAj.gY, 10.0f, this.cAi.Vg());
        --this.cyn;
    }
}

