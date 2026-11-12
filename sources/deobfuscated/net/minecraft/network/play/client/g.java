/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.ak;
import net.minecraft.network.play.client.e;

public class g
extends e {
    public g() {
        this.rotating = true;
    }

    public g(float f2, float f3, boolean bl2) {
        this.yaw = f2;
        this.pitch = f3;
        this.onGround = bl2;
        this.rotating = true;
    }

    @Override
    public void a(ak ak2) {
        this.yaw = ak2.readFloat();
        this.pitch = ak2.readFloat();
        super.a(ak2);
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.yaw);
        ak2.writeFloat(this.pitch);
        super.b(ak2);
    }
}

