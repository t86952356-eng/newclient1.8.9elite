/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.player.a;
import net.minecraft.util.da;

public class as
extends e {
    private final f czv;
    private final double czw;
    private double alc;
    private double cwH;
    private double alb;

    public as(f f2, double d2) {
        this.czv = f2;
        this.czw = d2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (!this.czv.aaa() && this.czv.crA != null) {
            da da2 = bm.a(this.czv, 5, 4);
            if (da2 == null) {
                return false;
            }
            this.alc = da2.dAG;
            this.cwH = da2.dAH;
            this.alb = da2.dAI;
            return true;
        }
        return false;
    }

    @Override
    public void WG() {
        this.czv.UU().n(this.alc, this.cwH, this.alb, this.czw);
    }

    @Override
    public boolean WD() {
        return !this.czv.UU().aiK() && this.czv.crA != null;
    }

    @Override
    public void WF() {
        if (this.czv.VB().nextInt(50) == 0) {
            if (this.czv.crA instanceof a) {
                int n2 = this.czv.aak();
                int n3 = this.czv.aau();
                if (n3 > 0 && this.czv.VB().nextInt(n3) < n2) {
                    this.czv.C((a)this.czv.crA);
                    this.czv.baU.a((c)this.czv, (byte)7);
                    return;
                }
                this.czv.fw(5);
            }
            this.czv.crA.D(null);
            this.czv.crA = null;
            this.czv.aaJ();
            this.czv.baU.a((c)this.czv, (byte)6);
        }
    }
}

