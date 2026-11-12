/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package net.minecraft.network.play.client;

import lombok.Generated;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class k
implements aj<b> {
    private static final net.minecraft.util.b dbg = new net.minecraft.util.b(-1, -1, -1);
    private net.minecraft.util.b aca;
    private int dbh;
    private co aeQ;
    public float dbi;
    public float dbj;
    public float dbk;

    public k() {
    }

    public k(co co2) {
        this(dbg, 255, co2, 0.0f, 0.0f, 0.0f);
    }

    public k(net.minecraft.util.b b2, int n2, co co2, float f2, float f3, float f4) {
        this.aca = b2;
        this.dbh = n2;
        this.aeQ = co2 != null ? co2.aeg() : null;
        this.dbi = f2;
        this.dbj = f3;
        this.dbk = f4;
    }

    @Override
    public void a(ak ak2) {
        this.aca = ak2.afu();
        this.dbh = ak2.readUnsignedByte();
        this.aeQ = ak2.afA();
        this.dbi = (float)ak2.readUnsignedByte() / 16.0f;
        this.dbj = (float)ak2.readUnsignedByte() / 16.0f;
        this.dbk = (float)ak2.readUnsignedByte() / 16.0f;
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.aca);
        ak2.writeByte(this.dbh);
        ak2.aO(this.aeQ);
        ak2.writeByte((int)(this.dbi * 16.0f));
        ak2.writeByte((int)(this.dbj * 16.0f));
        ak2.writeByte((int)(this.dbk * 16.0f));
    }

    @Override
    public void a(b b2) {
        b2.b(this);
    }

    public net.minecraft.util.b yl() {
        return this.aca;
    }

    public int getPlacedBlockDirection() {
        return this.dbh;
    }

    public co ls() {
        return this.aeQ;
    }

    public float afY() {
        return this.dbi;
    }

    public float afZ() {
        return this.dbj;
    }

    public float aga() {
        return this.dbk;
    }

    @Generated
    public void S(net.minecraft.util.b b2) {
        this.aca = b2;
    }

    @Generated
    public void gt(int n2) {
        this.dbh = n2;
    }

    @Generated
    public void aP(co co2) {
        this.aeQ = co2;
    }

    @Generated
    public void setFacingX(float f2) {
        this.dbi = f2;
    }

    @Generated
    public void setFacingY(float f2) {
        this.dbj = f2;
    }

    @Generated
    public void setFacingZ(float f2) {
        this.dbk = f2;
    }

    @Generated
    public float getFacingX() {
        return this.dbi;
    }

    @Generated
    public float getFacingY() {
        return this.dbj;
    }

    @Generated
    public float getFacingZ() {
        return this.dbk;
    }
}

