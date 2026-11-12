/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptStrafeEvent;
import hackclient.rise.aii;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;
import rise.util.InstanceAccess;

public final class StrafeEvent
extends dh
implements InstanceAccess {
    private float forward;
    private float strafe;
    private float friction;
    private float yaw;

    public void setSpeed(double d2, double d3) {
        this.setFriction((float)(this.getForward() != 0.0f && this.getStrafe() != 0.0f ? d2 * (double)0.98f : d2));
        StrafeEvent.aER.bgK.ud *= d3;
        StrafeEvent.aER.bgK.uf *= d3;
    }

    public void setSpeed(double d2) {
        this.setFriction((float)(this.getForward() != 0.0f && this.getStrafe() != 0.0f ? d2 * (double)0.98f : d2));
        aii.stop();
    }

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptStrafeEvent(this);
    }

    @Generated
    public float getForward() {
        return this.forward;
    }

    @Generated
    public float getStrafe() {
        return this.strafe;
    }

    @Generated
    public float getFriction() {
        return this.friction;
    }

    @Generated
    public float getYaw() {
        return this.yaw;
    }

    @Generated
    public void setForward(float f2) {
        this.forward = f2;
    }

    @Generated
    public void setStrafe(float f2) {
        this.strafe = f2;
    }

    @Generated
    public void setFriction(float f2) {
        this.friction = f2;
    }

    @Generated
    public void setYaw(float f2) {
        this.yaw = f2;
    }

    @Generated
    public StrafeEvent(float f2, float f3, float f4, float f5) {
        this.forward = f2;
        this.strafe = f3;
        this.friction = f4;
        this.yaw = f5;
    }
}

