/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import java.util.Random;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.util.b;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class q
extends e {
    private final j cxH;
    private double cxI;
    private double cxJ;
    private double cxK;
    private final double cxL;
    private final w cxM;

    public q(j j2, double d2) {
        this.cxH = j2;
        this.cxL = d2;
        this.cxM = j2.baU;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (!this.cxM.avr()) {
            return false;
        }
        if (!this.cxH.isBurning()) {
            return false;
        }
        if (!this.cxM.aM(new b(this.cxH.gW, this.cxH.Us().dtI, this.cxH.gY))) {
            return false;
        }
        da da2 = this.WP();
        if (da2 == null) {
            return false;
        }
        this.cxI = da2.dAG;
        this.cxJ = da2.dAH;
        this.cxK = da2.dAI;
        return true;
    }

    @Override
    public boolean WD() {
        return !this.cxH.UU().aiK();
    }

    @Override
    public void WG() {
        this.cxH.UU().n(this.cxI, this.cxJ, this.cxK, this.cxL);
    }

    private da WP() {
        Random random = this.cxH.VB();
        b b2 = new b(this.cxH.gW, this.cxH.Us().dtI, this.cxH.gY);
        for (int i2 = 0; i2 < 10; ++i2) {
            b b3 = b2.C(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
            if (this.cxM.aM(b3) || !(this.cxH.ad(b3) < 0.0f)) continue;
            return new da(b3.wt(), b3.wu(), b3.wx());
        }
        return null;
    }
}

