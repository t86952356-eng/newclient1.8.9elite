/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.dz;

public class ScriptMoveInputEvent
extends ScriptEvent<dz> {
    public ScriptMoveInputEvent(dz dz2) {
        super(dz2);
    }

    public void setForward(float f2) {
        ((dz)this.wrapped).setForward(f2);
    }

    public void setStrafe(float f2) {
        ((dz)this.wrapped).setStrafe(f2);
    }

    public void setJump(boolean bl2) {
        ((dz)this.wrapped).setJump(bl2);
    }

    public void setSneak(boolean bl2) {
        ((dz)this.wrapped).setSneak(bl2);
    }

    public void setSneakSlowDownMultiplier(double d2) {
        ((dz)this.wrapped).setSneakSlowDownMultiplier(d2);
    }

    public float getForward() {
        return ((dz)this.wrapped).getForward();
    }

    public float getStrafe() {
        return ((dz)this.wrapped).getStrafe();
    }

    public boolean isJump() {
        return ((dz)this.wrapped).isJump();
    }

    public boolean isSneak() {
        return ((dz)this.wrapped).isSneak();
    }

    public double getSneakSlowDownMultiplier() {
        return ((dz)this.wrapped).getSneakSlowDownMultiplier();
    }

    @Override
    public String getHandlerName() {
        return "onMoveInput";
    }
}

