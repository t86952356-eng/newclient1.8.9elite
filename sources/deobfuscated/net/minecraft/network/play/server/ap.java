/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;

public class ap
implements aj<a> {
    private int breakerId;
    private b aca;
    private int progress;

    public ap() {
    }

    public ap(int n2, b b2, int n3) {
        this.breakerId = n2;
        this.aca = b2;
        this.progress = n3;
    }

    @Override
    public void a(ak ak2) {
        this.breakerId = ak2.afw();
        this.aca = ak2.afu();
        this.progress = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.breakerId);
        ak2.ak(this.aca);
        ak2.writeByte(this.progress);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getBreakerId() {
        return this.breakerId;
    }

    public b yl() {
        return this.aca;
    }

    public int getProgress() {
        return this.progress;
    }
}

