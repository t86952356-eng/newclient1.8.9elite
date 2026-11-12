/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class e
implements aj<b> {
    public double x;
    public double y;
    public double z;
    public float gZ;
    public float ha;
    public boolean aO;
    public boolean daX;
    public boolean nS;

    public e() {
    }

    public e(boolean bl2) {
        this.aO = bl2;
    }

    @Override
    public void a(b b2) {
        b2.c(this);
    }

    @Override
    public void a(ak ak2) {
        this.aO = ak2.readUnsignedByte() != 0;
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.aO ? 1 : 0);
    }

    public double afS() {
        return this.x;
    }

    public double afT() {
        return this.y;
    }

    public double afU() {
        return this.z;
    }

    public float getYaw() {
        return this.gZ;
    }

    public float getPitch() {
        return this.ha;
    }

    public boolean isOnGround() {
        return this.aO;
    }

    public boolean isMoving() {
        return this.daX;
    }

    public boolean afV() {
        return this.nS;
    }

    public void bO(boolean bl2) {
        this.daX = bl2;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double d2) {
        this.x = d2;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double d2) {
        this.y = d2;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double d2) {
        this.z = d2;
    }

    public void setYaw(float f2) {
        this.gZ = f2;
    }

    public void setPitch(float f2) {
        this.ha = f2;
    }

    public void setOnGround(boolean bl2) {
        this.aO = bl2;
    }

    public boolean isRotating() {
        return this.nS;
    }

    public void bP(boolean bl2) {
        this.nS = bl2;
    }
}

