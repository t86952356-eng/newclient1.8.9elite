/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package net.minecraft.network.play.server;

import lombok.Generated;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.w;

public class aa
implements aj<a> {
    private int entityId;
    private byte dcy;

    public aa() {
    }

    public aa(c c2, byte by2) {
        this.entityId = c2.getEntityId();
        this.dcy = by2;
    }

    @Override
    public void a(ak ak2) {
        this.entityId = ak2.afw();
        this.dcy = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityId);
        ak2.writeByte(this.dcy);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public c l(w w2) {
        return w2.cn(this.entityId);
    }

    @Generated
    public int getEntityId() {
        return this.entityId;
    }

    @Generated
    public byte agx() {
        return this.dcy;
    }
}

