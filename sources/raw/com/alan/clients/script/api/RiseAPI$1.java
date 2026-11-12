/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.RiseAPI;
import com.alan.clients.script.api.wrapper.impl.ScriptModule;
import hackclient.rise.gi;
import hackclient.rise.gl;
import java.util.concurrent.atomic.AtomicReference;

class RiseAPI$1
extends gi {
    final /* synthetic */ AtomicReference val$scriptModuleReference;

    RiseAPI$1(RiseAPI riseAPI, gl gl2, AtomicReference atomicReference) {
        this.val$scriptModuleReference = atomicReference;
        super(gl2);
    }

    @Override
    public void onEnable() {
        ScriptModule scriptModule = (ScriptModule)this.val$scriptModuleReference.get();
        if (scriptModule == null) {
            return;
        }
        scriptModule.call("onEnable", new Object[0]);
    }

    @Override
    public void onDisable() {
        ScriptModule scriptModule = (ScriptModule)this.val$scriptModuleReference.get();
        if (scriptModule == null) {
            return;
        }
        scriptModule.call("onDisable", new Object[0]);
    }
}

