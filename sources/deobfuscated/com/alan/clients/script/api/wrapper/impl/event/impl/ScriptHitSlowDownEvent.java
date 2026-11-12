/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.HitSlowDownEvent;

public class ScriptHitSlowDownEvent
extends ScriptEvent<HitSlowDownEvent> {
    public ScriptHitSlowDownEvent(HitSlowDownEvent hitSlowDownEvent) {
        super(hitSlowDownEvent);
    }

    public void setSlowDown(double d2) {
        ((HitSlowDownEvent)this.wrapped).setSlowDown(d2);
    }

    public void setSprint(boolean bl2) {
        ((HitSlowDownEvent)this.wrapped).setSprint(bl2);
    }

    public double getSlowDown() {
        return ((HitSlowDownEvent)this.wrapped).getSlowDown();
    }

    public boolean isSprint() {
        return ((HitSlowDownEvent)this.wrapped).isSprint();
    }

    @Override
    public String getHandlerName() {
        return "onHitSlowDown";
    }
}

