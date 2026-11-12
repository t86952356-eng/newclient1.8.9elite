/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.util.bi;

public class w
extends d
implements bi {
    public float dsC;
    public float dsD;
    public int dsE;
    private int dsF;

    @Override
    public void jA() {
        double d2;
        if (++this.dsF % 20 * 4 == 0) {
            this.baU.c(this.aZf, Blocks.cNS, 1, this.dsE);
        }
        this.dsD = this.dsC;
        int n2 = this.aZf.wt();
        int n3 = this.aZf.wu();
        int n4 = this.aZf.wx();
        float f2 = 0.1f;
        if (this.dsE > 0 && this.dsC == 0.0f) {
            double d3 = (double)n2 + 0.5;
            d2 = (double)n4 + 0.5;
            this.baU.a(d3, (double)n3 + 0.5, d2, "random.chestopen", 0.5f, this.baU.dDk.nextFloat() * 0.1f + 0.9f);
        }
        if (this.dsE == 0 && this.dsC > 0.0f || this.dsE > 0 && this.dsC < 1.0f) {
            float f3 = this.dsC;
            this.dsC = this.dsE > 0 ? (this.dsC += 0.1f) : (this.dsC -= 0.1f);
            if (this.dsC > 1.0f) {
                this.dsC = 1.0f;
            }
            float f4 = 0.5f;
            if (this.dsC < 0.5f && f3 >= 0.5f) {
                d2 = (double)n2 + 0.5;
                double d4 = (double)n4 + 0.5;
                this.baU.a(d2, (double)n3 + 0.5, d4, "random.chestclosed", 0.5f, this.baU.dDk.nextFloat() * 0.1f + 0.9f);
            }
            if (this.dsC < 0.0f) {
                this.dsC = 0.0f;
            }
        }
    }

    @Override
    public boolean aC(int n2, int n3) {
        if (n2 == 1) {
            this.dsE = n3;
            return true;
        }
        return super.aC(n2, n3);
    }

    @Override
    public void apS() {
        this.apU();
        super.apS();
    }

    public void aqx() {
        ++this.dsE;
        this.baU.c(this.aZf, Blocks.cNS, 1, this.dsE);
    }

    public void aqy() {
        --this.dsE;
        this.baU.c(this.aZf, Blocks.cNS, 1, this.dsE);
    }

    public boolean I(a a2) {
        return this.baU.K(this.aZf) == this && a2.M((double)this.aZf.wt() + 0.5, (double)this.aZf.wu() + 0.5, (double)this.aZf.wx() + 0.5) <= 64.0;
    }
}

