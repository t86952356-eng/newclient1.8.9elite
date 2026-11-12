/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class d
implements aj<a> {
    private long dce;
    private long dcf;

    public d() {
    }

    public d(long l2, long l3, boolean bl2) {
        this.dce = l2;
        this.dcf = l3;
        if (!bl2) {
            this.dcf = -this.dcf;
            if (this.dcf == 0L) {
                this.dcf = -1L;
            }
        }
    }

    @Override
    public void a(ak ak2) {
        this.dce = ak2.readLong();
        this.dcf = ak2.readLong();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeLong(this.dce);
        ak2.writeLong(this.dcf);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public long getTotalWorldTime() {
        return this.dce;
    }

    public long getWorldTime() {
        return this.dcf;
    }
}

