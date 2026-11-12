/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.TickEvent;

public class ScriptTickEvent
extends ScriptEvent<TickEvent> {
    public ScriptTickEvent(TickEvent tickEvent) {
        super(tickEvent);
    }

    @Override
    public String getHandlerName() {
        return "onTick";
    }
}

