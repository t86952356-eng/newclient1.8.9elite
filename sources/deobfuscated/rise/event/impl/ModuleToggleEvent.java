/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptModuleToggleEvent;
import hackclient.rise.di;
import lombok.Generated;
import rise.module.Module;

public final class ModuleToggleEvent
implements di {
    private Module cg;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptModuleToggleEvent(this);
    }

    @Generated
    public Module dl() {
        return this.cg;
    }

    @Generated
    public ModuleToggleEvent(Module module) {
        this.cg = module;
    }
}

