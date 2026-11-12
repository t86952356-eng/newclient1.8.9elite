/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.util.da;

public class ao
extends e {
    private final j czl;
    protected double LL;
    private double czm;
    private double czn;
    private double czo;

    public ao(j j2, double d2) {
        this.czl = j2;
        this.LL = d2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (this.czl.VC() == null && !this.czl.isBurning()) {
            return false;
        }
        da da2 = bm.a(this.czl, 5, 4);
        if (da2 == null) {
            return false;
        }
        this.czm = da2.dAG;
        this.czn = da2.dAH;
        this.czo = da2.dAI;
        return true;
    }

    @Override
    public void WG() {
        this.czl.UU().n(this.czm, this.czn, this.czo, this.LL);
    }

    @Override
    public boolean WD() {
        return !this.czl.UU().aiK();
    }
}

