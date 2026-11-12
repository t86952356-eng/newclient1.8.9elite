/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import java.util.Objects;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.as;
import net.minecraft.world.w;

public class at
extends ae {
    private int bGF;
    private final int bGG = 8;

    protected at(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void Dm() {
        for (int i2 = 0; i2 < 6; ++i2) {
            double d2 = this.gW + (this.ta.nextDouble() - this.ta.nextDouble()) * 4.0;
            double d3 = this.gX + (this.ta.nextDouble() - this.ta.nextDouble()) * 4.0;
            double d4 = this.gY + (this.ta.nextDouble() - this.ta.nextDouble()) * 4.0;
            float f2 = this.bGF;
            Objects.requireNonNull(this);
            this.baU.a(as.dwX, d2, d3, d4, (double)(f2 / 8.0f), 0.0, 0.0, new int[0]);
        }
        ++this.bGF;
        if (this.bGF == this.bGG) {
            this.Tt();
        }
    }

    @Override
    public int Ir() {
        return 1;
    }
}

