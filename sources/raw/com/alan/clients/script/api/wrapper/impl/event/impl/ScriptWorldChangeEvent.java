/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.fg;

public class ScriptWorldChangeEvent
extends ScriptEvent<fg> {
    public ScriptWorldChangeEvent(fg fg2) {
        super(fg2);
    }

    @Override
    public String getHandlerName() {
        return "onWorldChange";
    }
}

