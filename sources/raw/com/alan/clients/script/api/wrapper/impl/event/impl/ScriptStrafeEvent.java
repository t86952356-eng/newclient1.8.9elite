/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import hackclient.rise.eo;

public class ScriptStrafeEvent
extends CancellableScriptEvent<eo> {
    public ScriptStrafeEvent(eo eo2) {
        super(eo2);
    }

    public void setForward(float f2) {
        ((eo)this.wrapped).setForward(f2);
    }

    public void setStrafe(float f2) {
        ((eo)this.wrapped).setStrafe(f2);
    }

    public void setFriction(float f2) {
        ((eo)this.wrapped).setFriction(f2);
    }

    public void setYaw(float f2) {
        ((eo)this.wrapped).setYaw(f2);
    }

    public float getForward() {
        return ((eo)this.wrapped).getForward();
    }

    public float getStrafe() {
        return ((eo)this.wrapped).getStrafe();
    }

    public float getFriction() {
        return ((eo)this.wrapped).getFriction();
    }

    public float getYaw() {
        return ((eo)this.wrapped).getYaw();
    }

    public void setSpeed(double d2, double d3) {
        ((eo)this.wrapped).setSpeed(d2, d3);
    }

    public void setSpeed(double d2) {
        ((eo)this.wrapped).setSpeed(d2);
    }

    @Override
    public String getHandlerName() {
        return "onStrafe";
    }
}

