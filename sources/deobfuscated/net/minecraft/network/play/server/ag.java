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
    private int totalExperience;
    private int level;

    public ag() {
    }

    public ag(float f2, int n2, int n3) {
        this.ddg = f2;
        this.totalExperience = n2;
        this.level = n3;
    }

    @Override
    public void a(ak ak2) {
        this.ddg = ak2.readFloat();
        this.level = ak2.afw();
        this.totalExperience = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.ddg);
        ak2.gr(this.level);
        ak2.gr(this.totalExperience);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public float aha() {
        return this.ddg;
    }

    public int getTotalExperience() {
        return this.totalExperience;
    }

    public int getLevel() {
        return this.level;
    }
}

