/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.ak;
import net.minecraft.network.play.client.e;

public class f
extends e {
    public f() {
        this.moving = true;
    }

    public f(double d2, double d3, double d4, boolean bl2) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
        this.onGround = bl2;
        this.moving = true;
    }

    @Override
    public void a(ak ak2) {
        this.x = ak2.readDouble();
        this.y = ak2.readDouble();
        this.z = ak2.readDouble();
        super.a(ak2);
    }

    @Override
    public void b(ak ak2) {
        ak2.writeDouble(this.x);
        ak2.writeDouble(this.y);
        ak2.writeDouble(this.z);
        super.b(ak2);
    }
}

