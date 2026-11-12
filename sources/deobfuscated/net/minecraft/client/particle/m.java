/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.block.material.Material;
import net.minecraft.client.particle.ae;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class m
extends ae {
    protected m(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.bGg = 1.0f;
        this.bGh = 1.0f;
        this.bGi = 1.0f;
        this.ct(32);
        this.o(0.02f, 0.02f);
        this.bGe *= this.ta.nextFloat() * 0.6f + 0.2f;
        this.ud = d5 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.ue = d6 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.uf = d7 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.bGd = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.ue += 0.002;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.85f;
        this.ue *= (double)0.85f;
        this.uf *= (double)0.85f;
        if (this.baU.L(new b(this)).df().xb() != Material.bev) {
            this.Tt();
        }
        if (this.bGd-- <= 0) {
            this.Tt();
        }
    }
}

