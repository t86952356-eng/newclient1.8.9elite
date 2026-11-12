/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.k;
import net.minecraft.entity.r;
import net.minecraft.util.b;
import net.minecraft.util.da;
import net.minecraft.world.w;

class l
extends e {
    private final k cEl;
    public int cEm;

    public l(k k2) {
        this.cEl = k2;
    }

    @Override
    public boolean WC() {
        return this.cEl.UW() != null;
    }

    @Override
    public void WG() {
        this.cEm = 0;
    }

    @Override
    public void WE() {
        this.cEl.bc(false);
    }

    @Override
    public void WF() {
        r r2 = this.cEl.UW();
        double d2 = 64.0;
        if (r2.T((c)this.cEl) < 4096.0 && this.cEl.ai(r2)) {
            w w2 = this.cEl.baU;
            ++this.cEm;
            if (this.cEm == 10) {
                w2.b(null, 1007, new b(this.cEl), 0);
            }
            if (this.cEm == 20) {
                double d3 = 4.0;
                da da2 = this.cEl.O(1.0f);
                double d4 = r2.gW - (this.cEl.gW + da2.dAG * 4.0);
                double d5 = r2.Us().dtI + (double)(r2.height / 2.0f) - (0.5 + this.cEl.gX + (double)(this.cEl.height / 2.0f));
                double d6 = r2.gY - (this.cEl.gY + da2.dAI * 4.0);
                w2.b(null, 1008, new b(this.cEl), 0);
                net.minecraft.entity.projectile.e e2 = new net.minecraft.entity.projectile.e(w2, this.cEl, d4, d5, d6);
                e2.cKB = this.cEl.Zl();
                e2.gW = this.cEl.gW + da2.dAG * 4.0;
                e2.gX = this.cEl.gX + (double)(this.cEl.height / 2.0f) + 0.5;
                e2.gY = this.cEl.gY + da2.dAI * 4.0;
                w2.G(e2);
                this.cEm = -40;
            }
        } else if (this.cEm > 0) {
            --this.cEm;
        }
        this.cEl.bc(this.cEm > 10);
    }
}

