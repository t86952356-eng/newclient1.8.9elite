/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.player.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.pathfinding.f;

public class az
extends e {
    private final j czO;
    private final double czP;
    private double alc;
    private double cwH;
    private double alb;
    private double aL;
    private double aK;
    private a czQ;
    private int czR;
    private boolean czS;
    private final d czT;
    private final boolean czU;
    private boolean czV;

    public az(j j2, double d2, d d3, boolean bl2) {
        this.czO = j2;
        this.czP = d2;
        this.czT = d3;
        this.czU = bl2;
        this.eO(3);
        if (!(j2.UU() instanceof f)) {
            throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
        }
    }

    @Override
    public boolean WC() {
        if (this.czR > 0) {
            --this.czR;
            return false;
        }
        this.czQ = this.czO.baU.f(this.czO, 10.0);
        if (this.czQ == null) {
            return false;
        }
        co co2 = this.czQ.abO();
        return co2 != null && co2.bP() == this.czT;
    }

    @Override
    public boolean WD() {
        if (this.czU) {
            if (this.czO.T((c)this.czQ) < 36.0) {
                if (this.czQ.M(this.alc, this.cwH, this.alb) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs((double)this.czQ.pm - this.aL) > 5.0 || Math.abs((double)this.czQ.pl - this.aK) > 5.0) {
                    return false;
                }
            } else {
                this.alc = this.czQ.gW;
                this.cwH = this.czQ.gX;
                this.alb = this.czQ.gY;
            }
            this.aL = this.czQ.pm;
            this.aK = this.czQ.pl;
        }
        return this.WC();
    }

    @Override
    public void WG() {
        this.alc = this.czQ.gW;
        this.cwH = this.czQ.gX;
        this.alb = this.czQ.gY;
        this.czS = true;
        this.czV = ((f)this.czO.UU()).aiR();
        ((f)this.czO.UU()).bQ(false);
    }

    @Override
    public void WE() {
        this.czQ = null;
        this.czO.UU().aiL();
        this.czR = 100;
        this.czS = false;
        ((f)this.czO.UU()).bQ(this.czV);
    }

    @Override
    public void WF() {
        this.czO.UR().b(this.czQ, 30.0f, this.czO.Vg());
        if (this.czO.T((c)this.czQ) < 6.25) {
            this.czO.UU().aiL();
        } else {
            this.czO.UU().e(this.czQ, this.czP);
        }
    }

    public boolean WX() {
        return this.czS;
    }
}

