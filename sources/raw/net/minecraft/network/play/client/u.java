/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class u
implements aj<b> {
    private int cSL;
    private int dbF;

    public u() {
    }

    public u(int n2, int n3) {
        this.cSL = n2;
        this.dbF = n3;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.cSL = ak2.readByte();
        this.dbF = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
        ak2.writeByte(this.dbF);
    }

    public int getWindowId() {
        return this.cSL;
    }

    public int getButton() {
        return this.dbF;
    }
}

