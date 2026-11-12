/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class ac
implements aj<a> {
    private int leash;
    private int entityId;
    private int vehicleEntityId;

    public ac() {
    }

    public ac(int n2, c c2, c c3) {
        this.leash = n2;
        this.entityId = c2.getEntityId();
        this.vehicleEntityId = c3 != null ? c3.getEntityId() : -1;
    }

    @Override
    public void a(ak ak2) {
        this.entityId = ak2.readInt();
        this.vehicleEntityId = ak2.readInt();
        this.leash = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.entityId);
        ak2.writeInt(this.vehicleEntityId);
        ak2.writeByte(this.leash);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getLeash() {
        return this.leash;
    }

    public int getEntityId() {
        return this.entityId;
    }

    public int getVehicleEntityId() {
        return this.vehicleEntityId;
    }
}

