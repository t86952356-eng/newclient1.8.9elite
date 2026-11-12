/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.ScriptEntity;
import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.ex;

public class ScriptKillEvent
extends ScriptEvent<ex> {
    public ScriptEntity getEntity() {
        return new ScriptEntity(((ex)this.wrapped).dk());
    }

    public ScriptKillEvent(ex ex2) {
        super(ex2);
    }

    @Override
    public String getHandlerName() {
        return "onKill";
    }
}

