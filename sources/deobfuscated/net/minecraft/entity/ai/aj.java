/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.world.w;

public class aj
extends e {
    w cxM;
    p cxk;
    r cza;
    int czb;

    public aj(p p2) {
        this.cxk = p2;
        this.cxM = p2.baU;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        r r2 = this.cxk.UW();
        if (r2 == null) {
            return false;
        }
        this.cza = r2;
        return true;
    }

    @Override
    public boolean WD() {
        return !(!this.cza.TS() || this.cxk.T((c)this.cza) > 225.0 || this.cxk.UU().aiK() && !this.WC());
    }

    @Override
    public void WE() {
        this.cza = null;
        this.cxk.UU().aiL();
    }

    @Override
    public void WF() {
        this.cxk.UR().b(this.cza, 30.0f, 30.0f);
        double d2 = this.cxk.width * 2.0f * this.cxk.width * 2.0f;
        double d3 = this.cxk.M(this.cza.gW, this.cza.Us().dtI, this.cza.gY);
        double d4 = 0.8;
        if (d3 > d2 && d3 < 16.0) {
            d4 = 1.33;
        } else if (d3 < 225.0) {
            d4 = 0.6;
        }
        this.cxk.UU().e(this.cza, d4);
        this.czb = Math.max(this.czb - 1, 0);
        if (d3 <= d2 && this.czb <= 0) {
            this.czb = 20;
            this.cxk.ag(this.cza);
        }
    }
}

