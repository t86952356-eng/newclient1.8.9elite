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
    private int ddA;
    private b aca;
    private int bmI;

    public ap() {
    }

    public ap(int n2, b b2, int n3) {
        this.ddA = n2;
        this.aca = b2;
        this.bmI = n3;
    }

    @Override
    public void a(ak ak2) {
        this.ddA = ak2.afw();
        this.aca = ak2.afu();
        this.bmI = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.ddA);
        ak2.ak(this.aca);
        ak2.writeByte(this.bmI);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getBreakerId() {
        return this.ddA;
    }

    public b yl() {
        return this.aca;
    }

    public int getProgress() {
        return this.bmI;
    }
}

