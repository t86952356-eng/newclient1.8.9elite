/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.login.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.login.a;

public class d
implements aj<a> {
    private int daQ;

    public d() {
    }

    public d(int n2) {
        this.daQ = n2;
    }

    @Override
    public void a(ak ak2) {
        this.daQ = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.daQ);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int afP() {
        return this.daQ;
    }
}

