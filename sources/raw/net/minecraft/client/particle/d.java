/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.world.w;

public class d
extends ae {
    protected d(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        float f2;
        this.bGg = f2 = this.ta.nextFloat() * 0.1f + 0.2f;
        this.bGh = f2;
        this.bGi = f2;
        this.ct(0);
        this.o(0.02f, 0.02f);
        this.bGe *= this.ta.nextFloat() * 0.6f + 0.5f;
        this.ud *= (double)0.02f;
        this.ue *= (double)0.02f;
        this.uf *= (double)0.02f;
        this.bGd = (int)(20.0 / (Math.random() * 0.8 + 0.2));
        this.csp = true;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= 0.99;
        this.ue *= 0.99;
        this.uf *= 0.99;
        if (this.bGd-- <= 0) {
            this.Tt();
        }
    }
}

