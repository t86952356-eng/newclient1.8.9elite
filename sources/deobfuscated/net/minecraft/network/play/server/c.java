/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package net.minecraft.network.play.server;

import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.ba;

public class c
implements aj<a> {
    private ba bpB;
    private byte dcd;

    public c() {
    }

    public c(ba ba2) {
        this(ba2, 1);
    }

    public c(ba ba2, byte by2) {
        this.bpB = ba2;
        this.dcd = by2;
    }

    @Override
    public void a(ak ak2) {
        this.bpB = ak2.afv();
        this.dcd = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.j(this.bpB);
        ak2.writeByte(this.dcd);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public ba DM() {
        return this.bpB;
    }

    public boolean isChat() {
        return this.dcd == 1 || this.dcd == 2;
    }

    public byte ago() {
        return this.dcd;
    }

    @Generated
    public void l(ba ba2) {
        this.bpB = ba2;
    }

    @Generated
    public void c(byte by2) {
        this.dcd = by2;
    }
}

