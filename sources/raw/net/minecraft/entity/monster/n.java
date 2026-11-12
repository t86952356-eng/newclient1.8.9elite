/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.entity.ai.bk;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.monster.k;

class n
extends e {
    private final k cEo;

    public n(k k2) {
        this.cEo = k2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        double d2;
        double d3;
        bk bk2 = this.cEo.US();
        if (!bk2.Xl()) {
            return true;
        }
        double d4 = bk2.getX() - this.cEo.gW;
        double d5 = d4 * d4 + (d3 = bk2.getY() - this.cEo.gX) * d3 + (d2 = bk2.getZ() - this.cEo.gY) * d2;
        return d5 < 1.0 || d5 > 3600.0;
    }

    @Override
    public boolean WD() {
        return false;
    }

    @Override
    public void WG() {
        Random random = this.cEo.VB();
        double d2 = this.cEo.gW + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d3 = this.cEo.gX + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d4 = this.cEo.gY + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        this.cEo.US().k(d2, d3, d4, 1.0);
    }
}

