/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.ScriptModule;
import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.ModuleToggleEvent;

public class ScriptModuleToggleEvent
extends ScriptEvent<ModuleToggleEvent> {
    public ScriptModuleToggleEvent(ModuleToggleEvent moduleToggleEvent) {
        super(moduleToggleEvent);
    }

    public ScriptModule getModule() {
        return new ScriptModule(((ModuleToggleEvent)this.wrapped).dl());
    }

    @Override
    public String getHandlerName() {
        return "onModuleToggle";
    }
}

