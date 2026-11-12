/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptStrafeEvent;
import hackclient.rise.aea;
import hackclient.rise.aii;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class eo
extends dh
implements aea {
    private float jp;
    private float jq;
    private float jC;
    private float gZ;

    public void setSpeed(double d2, double d3) {
        this.setFriction((float)(this.getForward() != 0.0f && this.getStrafe() != 0.0f ? d2 * (double)0.98f : d2));
        eo.aER.bgK.ud *= d3;
        eo.aER.bgK.uf *= d3;
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
        return this.jp;
    }

    @Generated
    public float getStrafe() {
        return this.jq;
    }

    @Generated
    public float getFriction() {
        return this.jC;
    }

    @Generated
    public float getYaw() {
        return this.gZ;
    }

    @Generated
    public void setForward(float f2) {
        this.jp = f2;
    }

    @Generated
    public void setStrafe(float f2) {
        this.jq = f2;
    }

    @Generated
    public void setFriction(float f2) {
        this.jC = f2;
    }

    @Generated
    public void setYaw(float f2) {
        this.gZ = f2;
    }

    @Generated
    public eo(float f2, float f3, float f4, float f5) {
        this.jp = f2;
        this.jq = f3;
        this.jC = f4;
        this.gZ = f5;
    }
}

