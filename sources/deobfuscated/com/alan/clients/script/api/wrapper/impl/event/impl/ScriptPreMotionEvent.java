/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import rise.event.impl.PreMotionEvent;

public class ScriptPreMotionEvent
extends CancellableScriptEvent<PreMotionEvent> {
    public ScriptPreMotionEvent(PreMotionEvent preMotionEvent) {
        super(preMotionEvent);
    }

    public void setPosX(double d2) {
        ((PreMotionEvent)this.wrapped).setPosX(d2);
    }

    public void setPosY(double d2) {
        ((PreMotionEvent)this.wrapped).setPosY(d2);
    }

    public void setPosZ(double d2) {
        ((PreMotionEvent)this.wrapped).setPosZ(d2);
    }

    public void setYaw(float f2) {
        ((PreMotionEvent)this.wrapped).setYaw(f2);
    }

    public void setPitch(float f2) {
        ((PreMotionEvent)this.wrapped).setPitch(f2);
    }

    public void setOnGround(boolean bl2) {
        ((PreMotionEvent)this.wrapped).setOnGround(bl2);
    }

    public void setSprinting(boolean bl2) {
        ((PreMotionEvent)this.wrapped).setSprinting(bl2);
    }

    public double getPosX() {
        return ((PreMotionEvent)this.wrapped).getPosX();
    }

    public double getPosY() {
        return ((PreMotionEvent)this.wrapped).getPosY();
    }

    public double getPosZ() {
        return ((PreMotionEvent)this.wrapped).getPosZ();
    }

    public float getYaw() {
        return ((PreMotionEvent)this.wrapped).getYaw();
    }

    public float getPitch() {
        return ((PreMotionEvent)this.wrapped).getPitch();
    }

    public boolean isOnGround() {
        return ((PreMotionEvent)this.wrapped).isOnGround();
    }

    public boolean isSprinting() {
        return ((PreMotionEvent)this.wrapped).isSprinting();
    }

    @Override
    public String getHandlerName() {
        return "onPreMotion";
    }
}

