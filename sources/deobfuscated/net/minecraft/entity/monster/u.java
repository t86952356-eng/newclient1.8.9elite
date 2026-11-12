/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.bh;
import net.minecraft.entity.ai.bk;
import net.minecraft.entity.aj;
import net.minecraft.entity.monster.r;
import net.minecraft.util.bt;

class u
extends bk {
    private final r cEC;

    public u(r r2) {
        super(r2);
        this.cEC = r2;
    }

    @Override
    public void Xm() {
        if (this.cAu && !this.cEC.UU().aiK()) {
            double d2 = this.x - this.cEC.gW;
            double d3 = this.y - this.cEC.gX;
            double d4 = this.z - this.cEC.gY;
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            d5 = bt.aD(d5);
            d3 /= d5;
            float f2 = (float)(bt.y(d4, d2) * 180.0 / Math.PI) - 90.0f;
            this.cEC.cuF = this.cEC.pl = this.w(this.cEC.pl, f2, 30.0f);
            float f3 = (float)(this.speed * this.cEC.a(aj.cwp).XB());
            this.cEC.aX(this.cEC.Wf() + (f3 - this.cEC.Wf()) * 0.125f);
            double d6 = Math.sin((double)(this.cEC.aRg + this.cEC.getEntityId()) * 0.5) * 0.05;
            double d7 = Math.cos(this.cEC.pl * (float)Math.PI / 180.0f);
            double d8 = Math.sin(this.cEC.pl * (float)Math.PI / 180.0f);
            this.cEC.ud += d6 * d7;
            this.cEC.uf += d6 * d8;
            d6 = Math.sin((double)(this.cEC.aRg + this.cEC.getEntityId()) * 0.75) * 0.05;
            this.cEC.ue += d6 * (d8 + d7) * 0.25;
            this.cEC.ue += (double)this.cEC.Wf() * d3 * 0.1;
            bh bh2 = this.cEC.UR();
            double d9 = this.cEC.gW + d2 / d5 * 2.0;
            double d10 = (double)this.cEC.getEyeHeight() + this.cEC.gX + d3 / d5 * 1.0;
            double d11 = this.cEC.gY + d4 / d5 * 2.0;
            double d12 = bh2.Xf();
            double d13 = bh2.Xg();
            double d14 = bh2.Xh();
            if (!bh2.Xe()) {
                d12 = d9;
                d13 = d10;
                d14 = d11;
            }
            this.cEC.UR().d(d12 + (d9 - d12) * 0.125, d13 + (d10 - d13) * 0.125, d14 + (d11 - d14) * 0.125, 10.0f, 40.0f);
            this.cEC.bd(true);
        } else {
            this.cEC.aX(0.0f);
            this.cEC.bd(false);
        }
    }
}

