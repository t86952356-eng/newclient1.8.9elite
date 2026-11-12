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
    public float yaw;
    public float pitch;
    public boolean onGround;
    public boolean moving;
    public boolean rotating;

    public e() {
    }

    public e(boolean bl2) {
        this.onGround = bl2;
    }

    @Override
    public void a(b b2) {
        b2.c(this);
    }

    @Override
    public void a(ak ak2) {
        this.onGround = ak2.readUnsignedByte() != 0;
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.onGround ? 1 : 0);
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
        return this.yaw;
    }

    public float getPitch() {
        return this.pitch;
    }

    public boolean isOnGround() {
        return this.onGround;
    }

    public boolean isMoving() {
        return this.moving;
    }

    public boolean afV() {
        return this.rotating;
    }

    public void bO(boolean bl2) {
        this.moving = bl2;
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
        this.yaw = f2;
    }

    public void setPitch(float f2) {
        this.pitch = f2;
    }

    public void setOnGround(boolean bl2) {
        this.onGround = bl2;
    }

    public boolean isRotating() {
        return this.rotating;
    }

    public void bP(boolean bl2) {
        this.rotating = bl2;
    }
}

