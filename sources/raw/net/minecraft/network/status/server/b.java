/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.status.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.status.a;

public class b
implements aj<a> {
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
    public void a(a a2) {
        a2.a(this);
    }
}

