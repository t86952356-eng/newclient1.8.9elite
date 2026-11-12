/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.r;
import net.minecraft.world.w;

public class b
extends e {
    w baU;
    protected j cwA;
    int cwB;
    double cwC;
    boolean cwD;
    net.minecraft.pathfinding.b cwE;
    Class<? extends c> cwF;
    private int cwG;
    private double alc;
    private double cwH;
    private double alb;

    public b(j j2, Class<? extends c> clazz, double d2, boolean bl2) {
        this(j2, d2, bl2);
        this.cwF = clazz;
    }

    public b(j j2, double d2, boolean bl2) {
        this.cwA = j2;
        this.baU = j2.baU;
        this.cwC = d2;
        this.cwD = bl2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        r r2 = this.cwA.UW();
        if (r2 == null) {
            return false;
        }
        if (!r2.TS()) {
            return false;
        }
        if (this.cwF != null && !this.cwF.isAssignableFrom(r2.getClass())) {
            return false;
        }
        this.cwE = this.cwA.UU().au(r2);
        return this.cwE != null;
    }

    @Override
    public boolean WD() {
        r r2 = this.cwA.UW();
        return r2 != null && r2.TS() && (!this.cwD ? !this.cwA.UU().aiK() : this.cwA.ae(new net.minecraft.util.b(r2)));
    }

    @Override
    public void WG() {
        this.cwA.UU().a(this.cwE, this.cwC);
        this.cwG = 0;
    }

    @Override
    public void WE() {
        this.cwA.UU().aiL();
    }

    @Override
    public void WF() {
        r r2 = this.cwA.UW();
        this.cwA.UR().b(r2, 30.0f, 30.0f);
        double d2 = this.cwA.M(r2.gW, r2.Us().dtI, r2.gY);
        double d3 = this.V(r2);
        --this.cwG;
        if ((this.cwD || this.cwA.UV().al(r2)) && this.cwG <= 0 && (this.alc == 0.0 && this.cwH == 0.0 && this.alb == 0.0 || r2.M(this.alc, this.cwH, this.alb) >= 1.0 || this.cwA.VB().nextFloat() < 0.05f)) {
            this.alc = r2.gW;
            this.cwH = r2.Us().dtI;
            this.alb = r2.gY;
            this.cwG = 4 + this.cwA.VB().nextInt(7);
            if (d2 > 1024.0) {
                this.cwG += 10;
            } else if (d2 > 256.0) {
                this.cwG += 5;
            }
            if (!this.cwA.UU().e(r2, this.cwC)) {
                this.cwG += 15;
            }
        }
        this.cwB = Math.max(this.cwB - 1, 0);
        if (d2 <= d3 && this.cwB <= 0) {
            this.cwB = 20;
            if (this.cwA.Vk() != null) {
                this.cwA.swingItem();
            }
            this.cwA.ag(r2);
        }
    }

    protected double V(r r2) {
        return this.cwA.width * 2.0f * this.cwA.width * 2.0f + r2.width;
    }
}

