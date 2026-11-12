/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;

public class a
implements aj<net.minecraft.network.play.a> {
    private int id;

    public a() {
    }

    public a(int n2) {
        this.id = n2;
    }

    @Override
    public void a(net.minecraft.network.play.a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.id = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.id);
    }

    public int agl() {
        return this.id;
    }
}

