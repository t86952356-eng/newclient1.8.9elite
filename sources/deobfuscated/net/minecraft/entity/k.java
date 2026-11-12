/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.p;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public abstract class k
extends p {
    public k(w w2) {
        super(w2);
    }

    @Override
    public void q(float f2, float f3) {
    }

    @Override
    protected void a(double d2, boolean bl2, Block block, b b2) {
    }

    @Override
    public void t(float f2, float f3) {
        if (this.isInWater()) {
            this.s(f2, f3, 0.02f);
            this.y(this.ud, this.ue, this.uf);
            this.ud *= (double)0.8f;
            this.ue *= (double)0.8f;
            this.uf *= (double)0.8f;
        } else if (this.isInLava()) {
            this.s(f2, f3, 0.02f);
            this.y(this.ud, this.ue, this.uf);
            this.ud *= 0.5;
            this.ue *= 0.5;
            this.uf *= 0.5;
        } else {
            float f4 = 0.91f;
            if (this.aO) {
                f4 = this.baU.L((b)new b((int)bt.aF((double)this.gW), (int)(bt.aF((double)this.Us().dtI) - 1), (int)bt.aF((double)this.gY))).df().aSF * 0.91f;
            }
            float f5 = 0.16277136f / (f4 * f4 * f4);
            this.s(f2, f3, this.aO ? 0.1f * f5 : 0.02f);
            f4 = 0.91f;
            if (this.aO) {
                f4 = this.baU.L((b)new b((int)bt.aF((double)this.gW), (int)(bt.aF((double)this.Us().dtI) - 1), (int)bt.aF((double)this.gY))).df().aSF * 0.91f;
            }
            this.y(this.ud, this.ue, this.uf);
            this.ud *= (double)f4;
            this.ue *= (double)f4;
            this.uf *= (double)f4;
        }
        this.cux = this.cuy;
        double d2 = this.gW - this.crF;
        double d3 = this.gY - this.crH;
        float f6 = bt.aD(d2 * d2 + d3 * d3) * 4.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        this.cuy += (f6 - this.cuy) * 0.4f;
        this.cuz += this.cuy;
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }
}

