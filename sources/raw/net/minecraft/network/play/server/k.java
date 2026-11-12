/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class k
implements aj<a> {
    private int dcu;

    public k() {
    }

    public k(int n2) {
        this.dcu = n2;
    }

    @Override
    public void a(ak ak2) {
        this.dcu = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.dcu);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getHeldItemHotbarIndex() {
        return this.dcu;
    }
}

