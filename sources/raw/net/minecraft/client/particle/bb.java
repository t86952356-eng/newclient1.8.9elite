/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import hackclient.rise.aea;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.util.as;
import net.minecraft.world.w;

public class bb
extends ae
implements aea {
    private final c bGP;
    private int bGQ;
    private final int bGR;
    private final as bGS;

    public bb(w w2, c c2, as as2) {
        super(w2, c2.gW, c2.Us().dtI + (double)(c2.height / 2.0f), c2.gY, c2.ud, c2.ue, c2.uf);
        this.bGP = c2;
        this.bGR = 3;
        this.bGS = as2;
        this.Dm();
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void Dm() {
        for (int i2 = 0; i2 < 16; ++i2) {
            double d2;
            double d3;
            double d4 = this.ta.nextFloat() * 2.0f - 1.0f;
            if (!(d4 * d4 + (d3 = (double)(this.ta.nextFloat() * 2.0f - 1.0f)) * d3 + (d2 = (double)(this.ta.nextFloat() * 2.0f - 1.0f)) * d2 <= 1.0)) continue;
            double d5 = this.bGP.gW + d4 * (double)this.bGP.width / 4.0;
            double d6 = this.bGP.Us().dtI + (double)(this.bGP.height / 2.0f) + d3 * (double)this.bGP.height / 4.0;
            double d7 = this.bGP.gY + d2 * (double)this.bGP.width / 4.0;
            this.baU.a(this.bGS, false, d5, d6, d7, d4, d3 + 0.2, d2, new int[0]);
        }
        ++this.bGQ;
        if (this.bGQ >= this.bGR) {
            this.Tt();
        }
    }

    @Override
    public int Ir() {
        return 3;
    }
}

