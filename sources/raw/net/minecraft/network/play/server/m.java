/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class m
implements aj<a> {
    private int crw;
    private int bif;

    public m() {
    }

    public m(c c2, int n2) {
        this.crw = c2.getEntityId();
        this.bif = n2;
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.bif = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.writeByte(this.bif);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityID() {
        return this.crw;
    }

    public int getAnimationType() {
        return this.bif;
    }
}

