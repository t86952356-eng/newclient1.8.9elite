/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import java.util.List;
import java.util.Random;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.h;
import net.minecraft.entity.player.a;
import net.minecraft.stats.b;
import net.minecraft.stats.n;
import net.minecraft.util.as;
import net.minecraft.world.w;

public class aa
extends e {
    private final net.minecraft.entity.passive.b cys;
    w cxM;
    private net.minecraft.entity.passive.b cyt;
    int cyu;
    double xv;

    public aa(net.minecraft.entity.passive.b b2, double d2) {
        this.cys = b2;
        this.cxM = b2.baU;
        this.xv = d2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        if (!this.cys.ZT()) {
            return false;
        }
        this.cyt = this.WQ();
        return this.cyt != null;
    }

    @Override
    public boolean WD() {
        return this.cyt.TS() && this.cyt.ZT() && this.cyu < 60;
    }

    @Override
    public void WE() {
        this.cyt = null;
        this.cyu = 0;
    }

    @Override
    public void WF() {
        this.cys.UR().b(this.cyt, 10.0f, this.cys.Vg());
        this.cys.UU().e(this.cyt, this.xv);
        ++this.cyu;
        if (this.cyu >= 60 && this.cys.T((c)this.cyt) < 9.0) {
            this.WR();
        }
    }

    private net.minecraft.entity.passive.b WQ() {
        float f2 = 8.0f;
        List<?> list = this.cxM.a(this.cys.getClass(), this.cys.Us().ad(8.0, 8.0, 8.0));
        double d2 = Double.MAX_VALUE;
        net.minecraft.entity.passive.b b2 = null;
        for (net.minecraft.entity.passive.b b3 : list) {
            if (!this.cys.a(b3) || !(this.cys.T((c)b3) < d2)) continue;
            b2 = b3;
            d2 = this.cys.T((c)b3);
        }
        return b2;
    }

    private void WR() {
        h h2 = this.cys.a((h)this.cyt);
        if (h2 != null) {
            a a2 = this.cys.ZS();
            if (a2 == null && this.cyt.ZS() != null) {
                a2 = this.cyt.ZS();
            }
            if (a2 != null) {
                a2.a(n.dqb);
                if (this.cys instanceof net.minecraft.entity.passive.e) {
                    a2.a(b.dpg);
                }
            }
            this.cys.eC(6000);
            this.cyt.eC(6000);
            this.cys.ZU();
            this.cyt.ZU();
            h2.eC(-24000);
            h2.b(this.cys.gW, this.cys.gX, this.cys.gY, 0.0f, 0.0f);
            this.cxM.G(h2);
            Random random = this.cys.VB();
            for (int i2 = 0; i2 < 7; ++i2) {
                double d2 = random.nextGaussian() * 0.02;
                double d3 = random.nextGaussian() * 0.02;
                double d4 = random.nextGaussian() * 0.02;
                double d5 = random.nextDouble() * (double)this.cys.width * 2.0 - (double)this.cys.width;
                double d6 = 0.5 + random.nextDouble() * (double)this.cys.height;
                double d7 = random.nextDouble() * (double)this.cys.width * 2.0 - (double)this.cys.width;
                this.cxM.a(as.dxE, this.cys.gW + d5, this.cys.gX + d6, this.cys.gY + d7, d2, d3, d4, new int[0]);
            }
            if (this.cxM.Si().gw("doMobLoot")) {
                this.cxM.G(new net.minecraft.entity.item.w(this.cxM, this.cys.gW, this.cys.gX, this.cys.gY, random.nextInt(7) + 1));
            }
        }
    }
}

