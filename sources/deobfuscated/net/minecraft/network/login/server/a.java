/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.login.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.util.ba;

public class a
implements aj<net.minecraft.network.login.a> {
    private ba daM;

    public a() {
    }

    public a(ba ba2) {
        this.daM = ba2;
    }

    @Override
    public void a(ak ak2) {
        this.daM = ak2.afv();
    }

    @Override
    public void b(ak ak2) {
        ak2.j(this.daM);
    }

    @Override
    public void a(net.minecraft.network.login.a a2) {
        a2.a(this);
    }

    public ba afL() {
        return this.daM;
    }
}

