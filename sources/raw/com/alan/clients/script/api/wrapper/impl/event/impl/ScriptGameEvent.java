/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.ew;

public class ScriptGameEvent
extends ScriptEvent<ew> {
    public ScriptGameEvent(ew ew2) {
        super(ew2);
    }

    @Override
    public String getHandlerName() {
        return "onGame";
    }
}

