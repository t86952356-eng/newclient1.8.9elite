/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.bk;
import net.minecraft.entity.aj;
import net.minecraft.entity.monster.ai;

class an
extends bk {
    private float cFg;
    private int cFh;
    private final ai cFi;
    private boolean cFj;

    public an(ai ai2) {
        super(ai2);
        this.cFi = ai2;
    }

    public void c(float f2, boolean bl2) {
        this.cFg = f2;
        this.cFj = bl2;
    }

    public void setSpeed(double d2) {
        this.speed = d2;
        this.cAu = true;
    }

    @Override
    public void Xm() {
        this.cAn.pn = this.cAn.pl = this.w(this.cAn.pl, this.cFg, 30.0f);
        this.cAn.cuF = this.cAn.pl;
        if (!this.cAu) {
            this.cAn.aW(0.0f);
        } else {
            this.cAu = false;
            if (this.cAn.aO) {
                this.cAn.aX((float)(this.speed * this.cAn.a(aj.cwp).XB()));
                if (this.cFh-- <= 0) {
                    this.cFh = this.cFi.Zy();
                    if (this.cFj) {
                        this.cFh /= 3;
                    }
                    this.cFi.UT().Xb();
                    if (this.cFi.ZK()) {
                        this.cFi.a(this.cFi.ZC(), this.cFi.VZ(), ((this.cFi.VB().nextFloat() - this.cFi.VB().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                    }
                } else {
                    this.cFi.cuW = 0.0f;
                    this.cFi.cuV = 0.0f;
                    this.cAn.aX(0.0f);
                }
            } else {
                this.cAn.aX((float)(this.speed * this.cAn.a(aj.cwp).XB()));
            }
        }
    }
}

