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
    private int dda;
    private int crw;
    private int ddb;

    public ac() {
    }

    public ac(int n2, c c2, c c3) {
        this.dda = n2;
        this.crw = c2.getEntityId();
        this.ddb = c3 != null ? c3.getEntityId() : -1;
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.readInt();
        this.ddb = ak2.readInt();
        this.dda = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.crw);
        ak2.writeInt(this.ddb);
        ak2.writeByte(this.dda);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getLeash() {
        return this.dda;
    }

    public int getEntityId() {
        return this.crw;
    }

    public int getVehicleEntityId() {
        return this.ddb;
    }
}

