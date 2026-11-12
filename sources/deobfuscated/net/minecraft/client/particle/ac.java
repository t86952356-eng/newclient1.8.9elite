/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.world.w;

public class ac
extends ae {
    protected ac(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.ud = d5 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.ue = d6 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.uf = d7 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.bGh = this.bGi = this.ta.nextFloat() * 0.3f + 0.7f;
        this.bGg = this.bGi;
        this.bGe = this.ta.nextFloat() * this.ta.nextFloat() * 6.0f + 1.0f;
        this.bGd = (int)(16.0 / ((double)this.ta.nextFloat() * 0.8 + 0.2)) + 2;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        if (this.bGc++ >= this.bGd) {
            this.Tt();
        }
        this.ct(7 - this.bGc * 8 / this.bGd);
        this.ue += 0.004;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.9f;
        this.ue *= (double)0.9f;
        this.uf *= (double)0.9f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
    }
}

