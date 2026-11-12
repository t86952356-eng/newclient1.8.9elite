/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.GameEvent;

public class ScriptGameEvent
extends ScriptEvent<GameEvent> {
    public ScriptGameEvent(GameEvent gameEvent) {
        super(gameEvent);
    }

    @Override
    public String getHandlerName() {
        return "onGame";
    }
}

