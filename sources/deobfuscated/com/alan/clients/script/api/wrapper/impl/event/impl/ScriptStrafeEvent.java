/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import rise.event.impl.StrafeEvent;

public class ScriptStrafeEvent
extends CancellableScriptEvent<StrafeEvent> {
    public ScriptStrafeEvent(StrafeEvent strafeEvent) {
        super(strafeEvent);
    }

    public void setForward(float f2) {
        ((StrafeEvent)this.wrapped).setForward(f2);
    }

    public void setStrafe(float f2) {
        ((StrafeEvent)this.wrapped).setStrafe(f2);
    }

    public void setFriction(float f2) {
        ((StrafeEvent)this.wrapped).setFriction(f2);
    }

    public void setYaw(float f2) {
        ((StrafeEvent)this.wrapped).setYaw(f2);
    }

    public float getForward() {
        return ((StrafeEvent)this.wrapped).getForward();
    }

    public float getStrafe() {
        return ((StrafeEvent)this.wrapped).getStrafe();
    }

    public float getFriction() {
        return ((StrafeEvent)this.wrapped).getFriction();
    }

    public float getYaw() {
        return ((StrafeEvent)this.wrapped).getYaw();
    }

    public void setSpeed(double d2, double d3) {
        ((StrafeEvent)this.wrapped).setSpeed(d2, d3);
    }

    public void setSpeed(double d2) {
        ((StrafeEvent)this.wrapped).setSpeed(d2);
    }

    @Override
    public String getHandlerName() {
        return "onStrafe";
    }
}

