/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.r;
import net.minecraft.util.da;

public class af
extends e {
    private final j cyQ;
    private r qX;
    private double cyM;
    private double cyN;
    private double cyO;
    private final double cyR;
    private final float cyS;

    public af(j j2, double d2, float f2) {
        this.cyQ = j2;
        this.cyR = d2;
        this.cyS = f2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        this.qX = this.cyQ.UW();
        if (this.qX == null) {
            return false;
        }
        if (this.qX.T((c)this.cyQ) > (double)(this.cyS * this.cyS)) {
            return false;
        }
        da da2 = bm.a(this.cyQ, 16, 7, new da(this.qX.gW, this.qX.gX, this.qX.gY));
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
        return !this.cyQ.UU().aiK() && this.qX.TS() && this.qX.T((c)this.cyQ) < (double)(this.cyS * this.cyS);
    }

    @Override
    public void WE() {
        this.qX = null;
    }

    @Override
    public void WG() {
        this.cyQ.UU().n(this.cyM, this.cyN, this.cyO, this.cyR);
    }
}

