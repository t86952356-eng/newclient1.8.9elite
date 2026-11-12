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
    private double gW;
    private double gX;
    private double gY;
    private float gZ;
    private float ha;

    @Generated
    public e dn() {
        return this.jO;
    }

    @Generated
    public double getPosX() {
        return this.gW;
    }

    @Generated
    public double getPosY() {
        return this.gX;
    }

    @Generated
    public double getPosZ() {
        return this.gY;
    }

    @Generated
    public float getYaw() {
        return this.gZ;
    }

    @Generated
    public float getPitch() {
        return this.ha;
    }

    @Generated
    public void a(e e2) {
        this.jO = e2;
    }

    @Generated
    public void setPosX(double d2) {
        this.gW = d2;
    }

    @Generated
    public void setPosY(double d2) {
        this.gX = d2;
    }

    @Generated
    public void setPosZ(double d2) {
        this.gY = d2;
    }

    @Generated
    public void setYaw(float f2) {
        this.gZ = f2;
    }

    @Generated
    public void setPitch(float f2) {
        this.ha = f2;
    }

    @Generated
    public fd(e e2, double d2, double d3, double d4, float f2, float f3) {
        this.jO = e2;
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        this.gZ = f2;
        this.ha = f3;
    }
}

