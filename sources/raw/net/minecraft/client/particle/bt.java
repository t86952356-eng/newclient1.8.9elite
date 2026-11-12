/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.bf;
import net.minecraft.world.w;

public class bt
extends bf {
    protected bt(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4);
        this.bGf = 0.04f;
        this.IB();
        if (d6 == 0.0 && (d5 != 0.0 || d7 != 0.0)) {
            this.ud = d5;
            this.ue = d6 + 0.1;
            this.uf = d7;
        }
    }
}

