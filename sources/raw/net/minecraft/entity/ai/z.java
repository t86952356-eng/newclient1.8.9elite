/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.p;

public class z
extends e {
    private final p cyo;
    private double cyp;
    private double cyq;
    private int cyr;

    public z(p p2) {
        this.cyo = p2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        return this.cyo.VB().nextFloat() < 0.02f;
    }

    @Override
    public boolean WD() {
        return this.cyr >= 0;
    }

    @Override
    public void WG() {
        double d2 = Math.PI * 2 * this.cyo.VB().nextDouble();
        this.cyp = Math.cos(d2);
        this.cyq = Math.sin(d2);
        this.cyr = 20 + this.cyo.VB().nextInt(20);
    }

    @Override
    public void WF() {
        --this.cyr;
        this.cyo.UR().d(this.cyo.gW + this.cyp, this.cyo.gX + (double)this.cyo.getEyeHeight(), this.cyo.gY + this.cyq, 10.0f, this.cyo.Vg());
    }
}

