/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class g
implements aj<a> {
    private float bM;
    private int dci;
    private float dcj;

    public g() {
    }

    public g(float f2, int n2, float f3) {
        this.bM = f2;
        this.dci = n2;
        this.dcj = f3;
    }

    @Override
    public void a(ak ak2) {
        this.bM = ak2.readFloat();
        this.dci = ak2.afw();
        this.dcj = ak2.readFloat();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.bM);
        ak2.gr(this.dci);
        ak2.writeFloat(this.dcj);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public float getHealth() {
        return this.bM;
    }

    public int getFoodLevel() {
        return this.dci;
    }

    public float getSaturationLevel() {
        return this.dcj;
    }
}

