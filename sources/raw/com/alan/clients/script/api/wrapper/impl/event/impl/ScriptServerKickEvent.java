/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.fb;

public class ScriptServerKickEvent
extends ScriptEvent<fb> {
    public ScriptServerKickEvent(fb fb2) {
        super(fb2);
    }

    public String[] getReason() {
        return ((fb)this.wrapped).dm().toArray(new String[0]);
    }

    @Override
    public String getHandlerName() {
        return "onServerKick";
    }
}

