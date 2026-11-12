/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.ak;
import net.minecraft.network.play.server.v;

public class y
extends v {
    public y() {
        this.dcY = true;
    }

    public y(int n2, byte by2, byte by3, byte by4, byte by5, byte by6, boolean bl2) {
        super(n2);
        this.dcV = by2;
        this.dcW = by3;
        this.dcX = by4;
        this.dcy = by5;
        this.dcz = by6;
        this.aO = bl2;
        this.dcY = true;
    }

    @Override
    public void a(ak ak2) {
        super.a(ak2);
        this.dcV = ak2.readByte();
        this.dcW = ak2.readByte();
        this.dcX = ak2.readByte();
        this.dcy = ak2.readByte();
        this.dcz = ak2.readByte();
        this.aO = ak2.readBoolean();
    }

    @Override
    public void b(ak ak2) {
        super.b(ak2);
        ak2.writeByte(this.dcV);
        ak2.writeByte(this.dcW);
        ak2.writeByte(this.dcX);
        ak2.writeByte(this.dcy);
        ak2.writeByte(this.dcz);
        ak2.writeBoolean(this.aO);
    }
}

