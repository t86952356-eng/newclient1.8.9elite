/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class r
implements aj<b> {
    private int cSL;
    private int dbl;
    private int dbA;
    private short dbB;
    private co dbC;
    private int bLu;

    public r() {
    }

    public r(int n2, int n3, int n4, int n5, co co2, short s2) {
        this.cSL = n2;
        this.dbl = n3;
        this.dbA = n4;
        this.dbC = co2 != null ? co2.aeg() : null;
        this.dbB = s2;
        this.bLu = n5;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.cSL = ak2.readByte();
        this.dbl = ak2.readShort();
        this.dbA = ak2.readByte();
        this.dbB = ak2.readShort();
        this.bLu = ak2.readByte();
        this.dbC = ak2.afA();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
        ak2.writeShort(this.dbl);
        ak2.writeByte(this.dbA);
        ak2.writeShort(this.dbB);
        ak2.writeByte(this.bLu);
        ak2.aO(this.dbC);
    }

    public int getWindowId() {
        return this.cSL;
    }

    public int getSlotId() {
        return this.dbl;
    }

    public int getUsedButton() {
        return this.dbA;
    }

    public short getActionNumber() {
        return this.dbB;
    }

    public co agd() {
        return this.dbC;
    }

    public int getMode() {
        return this.bLu;
    }
}

