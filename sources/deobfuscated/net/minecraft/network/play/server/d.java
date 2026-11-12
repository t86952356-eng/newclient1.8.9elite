/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class d
implements aj<a> {
    private long totalWorldTime;
    private long worldTime;

    public d() {
    }

    public d(long l2, long l3, boolean bl2) {
        this.totalWorldTime = l2;
        this.worldTime = l3;
        if (!bl2) {
            this.worldTime = -this.worldTime;
            if (this.worldTime == 0L) {
                this.worldTime = -1L;
            }
        }
    }

    @Override
    public void a(ak ak2) {
        this.totalWorldTime = ak2.readLong();
        this.worldTime = ak2.readLong();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeLong(this.totalWorldTime);
        ak2.writeLong(this.worldTime);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public long getTotalWorldTime() {
        return this.totalWorldTime;
    }

    public long getWorldTime() {
        return this.worldTime;
    }
}

