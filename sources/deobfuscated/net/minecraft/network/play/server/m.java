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
    private int entityID;
    private int animationType;

    public m() {
    }

    public m(c c2, int n2) {
        this.entityID = c2.getEntityId();
        this.animationType = n2;
    }

    @Override
    public void a(ak ak2) {
        this.entityID = ak2.afw();
        this.animationType = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityID);
        ak2.writeByte(this.animationType);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityID() {
        return this.entityID;
    }

    public int getAnimationType() {
        return this.animationType;
    }
}

