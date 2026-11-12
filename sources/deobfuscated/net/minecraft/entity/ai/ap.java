/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import java.util.List;
import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.r;
import net.minecraft.util.da;

public class ap
extends e {
    private final z czp;
    private r czq;
    private final double czr;
    private int bjC;

    public ap(z z2, double d2) {
        this.czp = z2;
        this.czr = d2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (this.czp.Ux() >= 0) {
            return false;
        }
        if (this.czp.VB().nextInt(400) != 0) {
            return false;
        }
        List<z> list = this.czp.baU.a(z.class, this.czp.Us().ad(6.0, 3.0, 6.0));
        double d2 = Double.MAX_VALUE;
        for (z z2 : list) {
            double d3;
            if (z2 == this.czp || z2.abs() || z2.Ux() >= 0 || !((d3 = z2.T((c)this.czp)) <= d2)) continue;
            d2 = d3;
            this.czq = z2;
        }
        if (this.czq == null) {
            da da2 = bm.a(this.czp, 16, 3);
            return da2 != null;
        }
        return true;
    }

    @Override
    public boolean WD() {
        return this.bjC > 0;
    }

    @Override
    public void WG() {
        if (this.czq != null) {
            this.czp.bE(true);
        }
        this.bjC = 1000;
    }

    @Override
    public void WE() {
        this.czp.bE(false);
        this.czq = null;
    }

    @Override
    public void WF() {
        --this.bjC;
        if (this.czq != null) {
            if (this.czp.T((c)this.czq) > 4.0) {
                this.czp.UU().e(this.czq, this.czr);
            }
        } else if (this.czp.UU().aiK()) {
            da da2 = bm.a(this.czp, 16, 3);
            if (da2 == null) {
                return;
            }
            this.czp.UU().n(da2.dAG, da2.dAH, da2.dAI, this.czr);
        }
    }
}

