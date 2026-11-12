/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.ak;
import net.minecraft.network.play.server.v;

public class x
extends v {
    public x() {
        this.dcY = true;
    }

    public x(int n2, byte by2, byte by3, boolean bl2) {
        super(n2);
        this.dcy = by2;
        this.dcz = by3;
        this.dcY = true;
        this.aO = bl2;
    }

    @Override
    public void a(ak ak2) {
        super.a(ak2);
        this.dcy = ak2.readByte();
        this.dcz = ak2.readByte();
        this.aO = ak2.readBoolean();
    }

    @Override
    public void b(ak ak2) {
        super.b(ak2);
        ak2.writeByte(this.dcy);
        ak2.writeByte(this.dcz);
        ak2.writeBoolean(this.aO);
    }
}

