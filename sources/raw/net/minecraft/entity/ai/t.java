/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import java.util.List;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.b;

public class t
extends e {
    b cxZ;
    b cya;
    double xv;
    private int cwG;

    public t(b b2, double d2) {
        this.cxZ = b2;
        this.xv = d2;
    }

    @Override
    public boolean WC() {
        if (this.cxZ.Ux() >= 0) {
            return false;
        }
        List<?> list = this.cxZ.baU.a(this.cxZ.getClass(), this.cxZ.Us().ad(8.0, 4.0, 8.0));
        b b2 = null;
        double d2 = Double.MAX_VALUE;
        for (b b3 : list) {
            double d3;
            if (b3.Ux() < 0 || !((d3 = this.cxZ.T((c)b3)) <= d2)) continue;
            d2 = d3;
            b2 = b3;
        }
        if (b2 == null) {
            return false;
        }
        if (d2 < 9.0) {
            return false;
        }
        this.cya = b2;
        return true;
    }

    @Override
    public boolean WD() {
        if (this.cxZ.Ux() >= 0) {
            return false;
        }
        if (!this.cya.TS()) {
            return false;
        }
        double d2 = this.cxZ.T((c)this.cya);
        return d2 >= 9.0 && d2 <= 256.0;
    }

    @Override
    public void WG() {
        this.cwG = 0;
    }

    @Override
    public void WE() {
        this.cya = null;
    }

    @Override
    public void WF() {
        if (--this.cwG <= 0) {
            this.cwG = 10;
            this.cxZ.UU().e(this.cya, this.xv);
        }
    }
}

