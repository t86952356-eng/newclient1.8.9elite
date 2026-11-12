/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.ak;
import net.minecraft.network.play.client.e;

public class h
extends e {
    public h() {
        this.daX = true;
        this.nS = true;
    }

    public h(double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
        this.gZ = f2;
        this.ha = f3;
        this.aO = bl2;
        this.nS = true;
        this.daX = true;
    }

    @Override
    public void a(ak ak2) {
        this.x = ak2.readDouble();
        this.y = ak2.readDouble();
        this.z = ak2.readDouble();
        this.gZ = ak2.readFloat();
        this.ha = ak2.readFloat();
        super.a(ak2);
    }

    @Override
    public void b(ak ak2) {
        ak2.writeDouble(this.x);
        ak2.writeDouble(this.y);
        ak2.writeDouble(this.z);
        ak2.writeFloat(this.gZ);
        ak2.writeFloat(this.ha);
        super.b(ak2);
    }
}

