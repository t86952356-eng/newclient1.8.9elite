/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class e
implements aj<a> {
    private int entityID;
    private int equipmentSlot;
    private co jV;

    public e() {
    }

    public e(int n2, int n3, co co2) {
        this.entityID = n2;
        this.equipmentSlot = n3;
        this.jV = co2 == null ? null : co2.aeg();
    }

    @Override
    public void a(ak ak2) {
        this.entityID = ak2.afw();
        this.equipmentSlot = ak2.readShort();
        this.jV = ak2.afA();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityID);
        ak2.writeShort(this.equipmentSlot);
        ak2.aO(this.jV);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public co bO() {
        return this.jV;
    }

    public int getEntityID() {
        return this.entityID;
    }

    public int getEquipmentSlot() {
        return this.equipmentSlot;
    }
}

