/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptMoveInputEvent;
import hackclient.rise.di;
import lombok.Generated;

public class MoveInputEvent
implements di {
    private float forward;
    private float strafe;
    private boolean jump;
    private boolean sneak;
    private double sneakSlowDownMultiplier;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptMoveInputEvent(this);
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
    public boolean isJump() {
        return this.jump;
    }

    @Generated
    public boolean isSneak() {
        return this.sneak;
    }

    @Generated
    public double getSneakSlowDownMultiplier() {
        return this.sneakSlowDownMultiplier;
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
    public void setJump(boolean bl2) {
        this.jump = bl2;
    }

    @Generated
    public void setSneak(boolean bl2) {
        this.sneak = bl2;
    }

    @Generated
    public void setSneakSlowDownMultiplier(double d2) {
        this.sneakSlowDownMultiplier = d2;
    }

    @Generated
    public MoveInputEvent(float f2, float f3, boolean bl2, boolean bl3, double d2) {
        this.forward = f2;
        this.strafe = f3;
        this.jump = bl2;
        this.sneak = bl3;
        this.sneakSlowDownMultiplier = d2;
    }
}

