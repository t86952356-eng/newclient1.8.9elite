/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptPreMotionEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class ei
extends dh {
    private double gW;
    private double gX;
    private double gY;
    private float gZ;
    private float ha;
    private boolean aO;
    private boolean jx;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptPreMotionEvent(this);
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
    public boolean isOnGround() {
        return this.aO;
    }

    @Generated
    public boolean isSprinting() {
        return this.jx;
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
    public void setOnGround(boolean bl2) {
        this.aO = bl2;
    }

    @Generated
    public void setSprinting(boolean bl2) {
        this.jx = bl2;
    }

    @Generated
    public ei(double d2, double d3, double d4, float f2, float f3, boolean bl2, boolean bl3) {
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        this.gZ = f2;
        this.ha = f3;
        this.aO = bl2;
        this.jx = bl3;
    }
}

