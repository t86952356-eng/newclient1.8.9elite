/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class cc
implements aj<a> {
    private int dfM;

    @Override
    public void a(ak ak2) {
        this.dfM = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dfM);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int ait() {
        return this.dfM;
    }
}

