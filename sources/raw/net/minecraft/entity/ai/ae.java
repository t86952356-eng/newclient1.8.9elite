/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.util.b;
import net.minecraft.util.da;

public class ae
extends e {
    private final j cyL;
    private double cyM;
    private double cyN;
    private double cyO;
    private final double cyP;

    public ae(j j2, double d2) {
        this.cyL = j2;
        this.cyP = d2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (this.cyL.UD()) {
            return false;
        }
        b b2 = this.cyL.UE();
        da da2 = bm.a(this.cyL, 16, 7, new da(b2.wt(), b2.wu(), b2.wx()));
        if (da2 == null) {
            return false;
        }
        this.cyM = da2.dAG;
        this.cyN = da2.dAH;
        this.cyO = da2.dAI;
        return true;
    }

    @Override
    public boolean WD() {
        return !this.cyL.UU().aiK();
    }

    @Override
    public void WG() {
        this.cyL.UU().n(this.cyM, this.cyN, this.cyO, this.cyP);
    }
}

