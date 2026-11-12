/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class q
implements aj<b> {
    private int cSL;

    public q() {
    }

    public q(int n2) {
        this.cSL = n2;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.cSL = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
    }
}

