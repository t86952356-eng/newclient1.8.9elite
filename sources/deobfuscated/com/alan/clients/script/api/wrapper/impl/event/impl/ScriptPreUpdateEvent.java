/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.PreUpdateEvent;

public class ScriptPreUpdateEvent
extends ScriptEvent<PreUpdateEvent> {
    public ScriptPreUpdateEvent(PreUpdateEvent preUpdateEvent) {
        super(preUpdateEvent);
    }

    @Override
    public String getHandlerName() {
        return "onPreUpdate";
    }
}

