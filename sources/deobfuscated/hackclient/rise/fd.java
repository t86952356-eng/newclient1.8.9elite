/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.dh;
import lombok.Generated;
import net.minecraft.network.play.client.e;

public final class fd
extends dh {
    private e jO;
    private double posX;
    private double posY;
    private double posZ;
    private float yaw;
    private float pitch;

    @Generated
    public e dn() {
        return this.jO;
    }

    @Generated
    public double getPosX() {
        return this.posX;
    }

    @Generated
    public double getPosY() {
        return this.posY;
    }

    @Generated
    public double getPosZ() {
        return this.posZ;
    }

    @Generated
    public float getYaw() {
        return this.yaw;
    }

    @Generated
    public float getPitch() {
        return this.pitch;
    }

    @Generated
    public void a(e e2) {
        this.jO = e2;
    }

    @Generated
    public void setPosX(double d2) {
        this.posX = d2;
    }

    @Generated
    public void setPosY(double d2) {
        this.posY = d2;
    }

    @Generated
    public void setPosZ(double d2) {
        this.posZ = d2;
    }

    @Generated
    public void setYaw(float f2) {
        this.yaw = f2;
    }

    @Generated
    public void setPitch(float f2) {
        this.pitch = f2;
    }

    @Generated
    public fd(e e2, double d2, double d3, double d4, float f2, float f3) {
        this.jO = e2;
        this.posX = d2;
        this.posY = d3;
        this.posZ = d4;
        this.yaw = f2;
        this.pitch = f3;
    }
}

