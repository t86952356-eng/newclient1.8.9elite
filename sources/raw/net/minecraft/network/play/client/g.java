/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.ak;
import net.minecraft.network.play.client.e;

public class g
extends e {
    public g() {
        this.nS = true;
    }

    public g(float f2, float f3, boolean bl2) {
        this.gZ = f2;
        this.ha = f3;
        this.aO = bl2;
        this.nS = true;
    }

    @Override
    public void a(ak ak2) {
        this.gZ = ak2.readFloat();
        this.ha = ak2.readFloat();
        super.a(ak2);
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.gZ);
        ak2.writeFloat(this.ha);
        super.b(ak2);
    }
}

