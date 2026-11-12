/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class l
implements aj<b> {
    private int dbl;

    public l() {
    }

    public l(int n2) {
        this.dbl = n2;
    }

    @Override
    public void a(ak ak2) {
        this.dbl = ak2.readShort();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeShort(this.dbl);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public int getSlotId() {
        return this.dbl;
    }
}

