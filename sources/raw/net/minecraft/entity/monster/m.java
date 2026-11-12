/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.k;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

class m
extends e {
    private final k cEn;

    public m(k k2) {
        this.cEn = k2;
        this.eO(2);
    }

    @Override
    public boolean WC() {
        return true;
    }

    @Override
    public void WF() {
        if (this.cEn.UW() == null) {
            this.cEn.cuF = this.cEn.pl = -((float)bt.y(this.cEn.ud, this.cEn.uf)) * 180.0f / (float)Math.PI;
        } else {
            r r2 = this.cEn.UW();
            double d2 = 64.0;
            if (r2.T((c)this.cEn) < 4096.0) {
                double d3 = r2.gW - this.cEn.gW;
                double d4 = r2.gY - this.cEn.gY;
                this.cEn.cuF = this.cEn.pl = -((float)bt.y(d3, d4)) * 180.0f / (float)Math.PI;
            }
        }
    }
}

