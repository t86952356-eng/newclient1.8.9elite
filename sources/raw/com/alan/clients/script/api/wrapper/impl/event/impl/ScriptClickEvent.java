/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.dr;

public class ScriptClickEvent
extends ScriptEvent<dr> {
    public ScriptClickEvent(dr dr2) {
        super(dr2);
    }

    @Override
    public String getHandlerName() {
        return "onClick";
    }
}

