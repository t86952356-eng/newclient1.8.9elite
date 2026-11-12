/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.ScriptModule;
import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.ey;

public class ScriptModuleToggleEvent
extends ScriptEvent<ey> {
    public ScriptModuleToggleEvent(ey ey2) {
        super(ey2);
    }

    public ScriptModule getModule() {
        return new ScriptModule(((ey)this.wrapped).dl());
    }

    @Override
    public String getHandlerName() {
        return "onModuleToggle";
    }
}

