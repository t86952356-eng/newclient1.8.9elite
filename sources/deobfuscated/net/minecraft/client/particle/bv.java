/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.block.material.Material;
import net.minecraft.client.particle.ae;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class bv
extends ae {
    protected bv(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3 - 0.125, d4, d5, d6, d7);
        this.bGg = 0.4f;
        this.bGh = 0.4f;
        this.bGi = 0.7f;
        this.ct(0);
        this.o(0.01f, 0.01f);
        this.bGe *= this.ta.nextFloat() * 0.6f + 0.2f;
        this.ud = d5 * 0.0;
        this.ue = d6 * 0.0;
        this.uf = d7 * 0.0;
        this.bGd = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.y(this.ud, this.ue, this.uf);
        if (this.baU.L(new b(this)).df().xb() != Material.bev) {
            this.Tt();
        }
        if (this.bGd-- <= 0) {
            this.Tt();
        }
    }
}

