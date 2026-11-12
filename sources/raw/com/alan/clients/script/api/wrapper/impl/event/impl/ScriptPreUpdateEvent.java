/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.ej;

public class ScriptPreUpdateEvent
extends ScriptEvent<ej> {
    public ScriptPreUpdateEvent(ej ej2) {
        super(ej2);
    }

    @Override
    public String getHandlerName() {
        return "onPreUpdate";
    }
}

