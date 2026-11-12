/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class ay
implements aj<a> {
    private int cSL;

    public ay() {
    }

    public ay(int n2) {
        this.cSL = n2;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.cSL = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
    }
}

