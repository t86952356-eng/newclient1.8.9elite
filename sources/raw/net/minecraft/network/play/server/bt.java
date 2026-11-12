/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.ba;

public class bt
implements aj<a> {
    private ba daM;

    public bt() {
    }

    public bt(ba ba2) {
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
    public void a(a a2) {
        a2.a(this);
    }

    public ba aim() {
        return this.daM;
    }
}

