/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.fe;

public class ScriptTickEvent
extends ScriptEvent<fe> {
    public ScriptTickEvent(fe fe2) {
        super(fe2);
    }

    @Override
    public String getHandlerName() {
        return "onTick";
    }
}

