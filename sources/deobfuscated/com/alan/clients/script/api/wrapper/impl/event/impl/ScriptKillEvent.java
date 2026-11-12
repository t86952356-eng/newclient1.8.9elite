/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.ScriptEntity;
import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.KillEvent;

public class ScriptKillEvent
extends ScriptEvent<KillEvent> {
    public ScriptEntity getEntity() {
        return new ScriptEntity(((KillEvent)this.wrapped).dk());
    }

    public ScriptKillEvent(KillEvent killEvent) {
        super(killEvent);
    }

    @Override
    public String getHandlerName() {
        return "onKill";
    }
}

