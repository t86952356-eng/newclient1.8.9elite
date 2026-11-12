/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import hackclient.rise.ei;

public class ScriptPreMotionEvent
extends CancellableScriptEvent<ei> {
    public ScriptPreMotionEvent(ei ei2) {
        super(ei2);
    }

    public void setPosX(double d2) {
        ((ei)this.wrapped).setPosX(d2);
    }

    public void setPosY(double d2) {
        ((ei)this.wrapped).setPosY(d2);
    }

    public void setPosZ(double d2) {
        ((ei)this.wrapped).setPosZ(d2);
    }

    public void setYaw(float f2) {
        ((ei)this.wrapped).setYaw(f2);
    }

    public void setPitch(float f2) {
        ((ei)this.wrapped).setPitch(f2);
    }

    public void setOnGround(boolean bl2) {
        ((ei)this.wrapped).setOnGround(bl2);
    }

    public void setSprinting(boolean bl2) {
        ((ei)this.wrapped).setSprinting(bl2);
    }

    public double getPosX() {
        return ((ei)this.wrapped).getPosX();
    }

    public double getPosY() {
        return ((ei)this.wrapped).getPosY();
    }

    public double getPosZ() {
        return ((ei)this.wrapped).getPosZ();
    }

    public float getYaw() {
        return ((ei)this.wrapped).getYaw();
    }

    public float getPitch() {
        return ((ei)this.wrapped).getPitch();
    }

    public boolean isOnGround() {
        return ((ei)this.wrapped).isOnGround();
    }

    public boolean isSprinting() {
        return ((ei)this.wrapped).isSprinting();
    }

    @Override
    public String getHandlerName() {
        return "onPreMotion";
    }
}

