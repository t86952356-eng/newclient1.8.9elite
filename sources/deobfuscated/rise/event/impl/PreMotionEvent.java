/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptPreMotionEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class PreMotionEvent
extends dh {
    private double posX;
    private double posY;
    private double posZ;
    private float yaw;
    private float pitch;
    private boolean onGround;
    private boolean sprinting;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptPreMotionEvent(this);
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
    public boolean isOnGround() {
        return this.onGround;
    }

    @Generated
    public boolean isSprinting() {
        return this.sprinting;
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
    public void setOnGround(boolean bl2) {
        this.onGround = bl2;
    }

    @Generated
    public void setSprinting(boolean bl2) {
        this.sprinting = bl2;
    }

    @Generated
    public PreMotionEvent(double d2, double d3, double d4, float f2, float f3, boolean bl2, boolean bl3) {
        this.posX = d2;
        this.posY = d3;
        this.posZ = d4;
        this.yaw = f2;
        this.pitch = f3;
        this.onGround = bl2;
        this.sprinting = bl3;
    }
}

