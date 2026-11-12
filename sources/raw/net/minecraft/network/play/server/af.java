/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.potion.d;

public class af
implements aj<a> {
    private int crw;
    private int cqw;

    public af() {
    }

    public af(int n2, d d2) {
        this.crw = n2;
        this.cqw = d2.aje();
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.cqw = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.writeByte(this.cqw);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityId() {
        return this.crw;
    }

    public int getEffectId() {
        return this.cqw;
    }
}

