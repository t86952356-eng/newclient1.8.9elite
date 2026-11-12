/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.bt;

public class z
implements aj<a> {
    public int entityId;
    public int dcO;
    public int dcP;
    public int dcQ;
    public byte dcy;
    public byte dcz;
    public boolean aO;

    public z() {
    }

    public z(c c2) {
        this.entityId = c2.getEntityId();
        this.dcO = bt.aF(c2.gW * 32.0);
        this.dcP = bt.aF(c2.gX * 32.0);
        this.dcQ = bt.aF(c2.gY * 32.0);
        this.dcy = (byte)(c2.pl * 256.0f / 360.0f);
        this.dcz = (byte)(c2.pm * 256.0f / 360.0f);
        this.aO = c2.aO;
    }

    public z(int n2, int n3, int n4, int n5, byte by2, byte by3, boolean bl2) {
        this.entityId = n2;
        this.dcO = n3;
        this.dcP = n4;
        this.dcQ = n5;
        this.dcy = by2;
        this.dcz = by3;
        this.aO = bl2;
    }

    @Override
    public void a(ak ak2) {
        this.entityId = ak2.afw();
        this.dcO = ak2.readInt();
        this.dcP = ak2.readInt();
        this.dcQ = ak2.readInt();
        this.dcy = ak2.readByte();
        this.dcz = ak2.readByte();
        this.aO = ak2.readBoolean();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityId);
        ak2.writeInt(this.dcO);
        ak2.writeInt(this.dcP);
        ak2.writeInt(this.dcQ);
        ak2.writeByte(this.dcy);
        ak2.writeByte(this.dcz);
        ak2.writeBoolean(this.aO);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityId() {
        return this.entityId;
    }

    public int wt() {
        return this.dcO;
    }

    public int wu() {
        return this.dcP;
    }

    public int wx() {
        return this.dcQ;
    }

    public byte agx() {
        return this.dcy;
    }

    public byte agy() {
        return this.dcz;
    }

    public boolean agV() {
        return this.aO;
    }
}

