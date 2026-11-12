/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.aa;

public class z
implements aj<b> {
    private aa dbO;

    public z() {
    }

    public z(aa aa2) {
        this.dbO = aa2;
    }

    @Override
    public void a(ak ak2) {
        this.dbO = ak2.k(aa.class);
    }

    @Override
    public void b(ak ak2) {
        ak2.b(this.dbO);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public aa agh() {
        return this.dbO;
    }
}

