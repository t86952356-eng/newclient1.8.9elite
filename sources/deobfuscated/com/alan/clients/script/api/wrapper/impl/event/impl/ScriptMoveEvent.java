/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import rise.event.impl.MoveEvent;

public class ScriptMoveEvent
extends CancellableScriptEvent<MoveEvent> {
    public ScriptMoveEvent(MoveEvent moveEvent) {
        super(moveEvent);
    }

    public void setX(double d2) {
        ((MoveEvent)this.wrapped).setPosX(d2);
    }

    public void setY(double d2) {
        ((MoveEvent)this.wrapped).setPosY(d2);
    }

    public void setZ(double d2) {
        ((MoveEvent)this.wrapped).setPosZ(d2);
    }

    public double getX() {
        return ((MoveEvent)this.wrapped).getPosX();
    }

    public double getY() {
        return ((MoveEvent)this.wrapped).getPosY();
    }

    public double getZ() {
        return ((MoveEvent)this.wrapped).getPosZ();
    }

    @Override
    public String getHandlerName() {
        return "onMove";
    }
}

