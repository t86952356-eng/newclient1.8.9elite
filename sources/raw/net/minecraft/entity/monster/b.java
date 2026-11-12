/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.a;
import net.minecraft.entity.projectile.g;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

class b
extends e {
    private final a cDS;
    private int cDT;
    private int cDU;

    public b(a a2) {
        this.cDS = a2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        r r2 = this.cDS.UW();
        return r2 != null && r2.TS();
    }

    @Override
    public void WG() {
        this.cDT = 0;
    }

    @Override
    public void WE() {
        this.cDS.aZ(false);
    }

    @Override
    public void WF() {
        --this.cDU;
        r r2 = this.cDS.UW();
        double d2 = this.cDS.T((c)r2);
        if (d2 < 4.0) {
            if (this.cDU <= 0) {
                this.cDU = 20;
                this.cDS.ag(r2);
            }
            this.cDS.US().k(r2.gW, r2.gX, r2.gY, 1.0);
        } else if (d2 < 256.0) {
            double d3 = r2.gW - this.cDS.gW;
            double d4 = r2.Us().dtI + (double)(r2.height / 2.0f) - (this.cDS.gX + (double)(this.cDS.height / 2.0f));
            double d5 = r2.gY - this.cDS.gY;
            if (this.cDU <= 0) {
                ++this.cDT;
                if (this.cDT == 1) {
                    this.cDU = 60;
                    this.cDS.aZ(true);
                } else if (this.cDT <= 4) {
                    this.cDU = 6;
                } else {
                    this.cDU = 100;
                    this.cDT = 0;
                    this.cDS.aZ(false);
                }
                if (this.cDT > 1) {
                    float f2 = bt.bK(bt.aD(d2)) * 0.5f;
                    this.cDS.baU.b(null, 1009, new net.minecraft.util.b((int)this.cDS.gW, (int)this.cDS.gX, (int)this.cDS.gY), 0);
                    for (int i2 = 0; i2 < 1; ++i2) {
                        g g2 = new g(this.cDS.baU, this.cDS, d3 + this.cDS.VB().nextGaussian() * (double)f2, d4, d5 + this.cDS.VB().nextGaussian() * (double)f2);
                        g2.gX = this.cDS.gX + (double)(this.cDS.height / 2.0f) + 0.5;
                        this.cDS.baU.G(g2);
                    }
                }
            }
            this.cDS.UR().b(r2, 10.0f, 10.0f);
        } else {
            this.cDS.UU().aiL();
            this.cDS.US().k(r2.gW, r2.gX, r2.gY, 1.0);
        }
        super.WF();
    }
}

