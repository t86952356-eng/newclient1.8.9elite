/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import rise.event.impl.SlowDownEvent;

public class ScriptSlowDownEvent
extends CancellableScriptEvent<SlowDownEvent> {
    public ScriptSlowDownEvent(SlowDownEvent slowDownEvent) {
        super(slowDownEvent);
    }

    public void setStrafeMultiplier(float f2) {
        ((SlowDownEvent)this.wrapped).setStrafeMultiplier(f2);
    }

    public void setForwardMultiplier(float f2) {
        ((SlowDownEvent)this.wrapped).setStrafeMultiplier(f2);
    }

    public float getStrafeMultiplier() {
        return ((SlowDownEvent)this.wrapped).getStrafeMultiplier();
    }

    public float getForwardMultiplier() {
        return ((SlowDownEvent)this.wrapped).getForwardMultiplier();
    }

    @Override
    public String getHandlerName() {
        return "onSlowDown";
    }
}

