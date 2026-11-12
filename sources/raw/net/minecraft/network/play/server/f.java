/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;

public class f
implements aj<a> {
    private b dch;

    public f() {
    }

    public f(b b2) {
        this.dch = b2;
    }

    @Override
    public void a(ak ak2) {
        this.dch = ak2.afu();
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.dch);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public b agp() {
        return this.dch;
    }
}

