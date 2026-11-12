/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import hackclient.rise.ez;

public class ScriptMoveEvent
extends CancellableScriptEvent<ez> {
    public ScriptMoveEvent(ez ez2) {
        super(ez2);
    }

    public void setX(double d2) {
        ((ez)this.wrapped).setPosX(d2);
    }

    public void setY(double d2) {
        ((ez)this.wrapped).setPosY(d2);
    }

    public void setZ(double d2) {
        ((ez)this.wrapped).setPosZ(d2);
    }

    public double getX() {
        return ((ez)this.wrapped).getPosX();
    }

    public double getY() {
        return ((ez)this.wrapped).getPosY();
    }

    public double getZ() {
        return ((ez)this.wrapped).getPosZ();
    }

    @Override
    public String getHandlerName() {
        return "onMove";
    }
}

