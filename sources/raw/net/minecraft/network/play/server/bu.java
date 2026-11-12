/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.f;

public class bu
implements aj<a> {
    private f chN;
    private boolean dfd;

    public bu() {
    }

    public bu(f f2, boolean bl2) {
        this.chN = f2;
        this.dfd = bl2;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.chN = f.ib(ak2.readUnsignedByte());
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.chN.auZ());
    }

    public boolean isDifficultyLocked() {
        return this.dfd;
    }

    public f agm() {
        return this.chN;
    }
}

