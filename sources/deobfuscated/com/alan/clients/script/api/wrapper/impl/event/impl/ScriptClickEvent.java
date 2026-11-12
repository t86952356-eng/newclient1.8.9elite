/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.ClickEvent;

public class ScriptClickEvent
extends ScriptEvent<ClickEvent> {
    public ScriptClickEvent(ClickEvent clickEvent) {
        super(clickEvent);
    }

    @Override
    public String getHandlerName() {
        return "onClick";
    }
}

