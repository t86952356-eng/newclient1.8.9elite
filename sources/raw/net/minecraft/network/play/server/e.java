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
    private int dbm;
    private int dcg;
    private co jV;

    public e() {
    }

    public e(int n2, int n3, co co2) {
        this.dbm = n2;
        this.dcg = n3;
        this.jV = co2 == null ? null : co2.aeg();
    }

    @Override
    public void a(ak ak2) {
        this.dbm = ak2.afw();
        this.dcg = ak2.readShort();
        this.jV = ak2.afA();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dbm);
        ak2.writeShort(this.dcg);
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
        return this.dbm;
    }

    public int getEquipmentSlot() {
        return this.dcg;
    }
}

