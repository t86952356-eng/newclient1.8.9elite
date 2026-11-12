/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.j;
import net.minecraft.util.ao;

public class i
implements aj<b> {
    private net.minecraft.util.b aca;
    private ao aWT;
    private j daY;

    public i() {
    }

    public i(j j2, net.minecraft.util.b b2, ao ao2) {
        this.daY = j2;
        this.aca = b2;
        this.aWT = ao2;
    }

    @Override
    public void a(ak ak2) {
        this.daY = ak2.k(j.class);
        this.aca = ak2.afu();
        this.aWT = ao.hy(ak2.readUnsignedByte());
    }

    @Override
    public void b(ak ak2) {
        ak2.b(this.daY);
        ak2.ak(this.aca);
        ak2.writeByte(this.aWT.OY());
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public net.minecraft.util.b yl() {
        return this.aca;
    }

    public ao yx() {
        return this.aWT;
    }

    public j afW() {
        return this.daY;
    }
}

