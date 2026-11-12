/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.status.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;

public class b
implements aj<net.minecraft.network.status.b> {
    private long dfQ;

    public b() {
    }

    public b(long l2) {
        this.dfQ = l2;
    }

    @Override
    public void a(ak ak2) {
        this.dfQ = ak2.readLong();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeLong(this.dfQ);
    }

    @Override
    public void a(net.minecraft.network.status.b b2) {
        b2.a(this);
    }

    public long aiw() {
        return this.dfQ;
    }
}

