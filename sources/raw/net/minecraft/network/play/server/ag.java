/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class ag
implements aj<a> {
    private float ddg;
    private int ddh;
    private int ddi;

    public ag() {
    }

    public ag(float f2, int n2, int n3) {
        this.ddg = f2;
        this.ddh = n2;
        this.ddi = n3;
    }

    @Override
    public void a(ak ak2) {
        this.ddg = ak2.readFloat();
        this.ddi = ak2.afw();
        this.ddh = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.ddg);
        ak2.gr(this.ddi);
        ak2.gr(this.ddh);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public float aha() {
        return this.ddg;
    }

    public int getTotalExperience() {
        return this.ddh;
    }

    public int getLevel() {
        return this.ddi;
    }
}

