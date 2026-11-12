/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.dh;

public abstract class CancellableScriptEvent<T extends dh>
extends ScriptEvent<T> {
    public CancellableScriptEvent(T t2) {
        super(t2);
    }

    public boolean isCancelled() {
        return ((dh)this.wrapped).isCancelled();
    }

    public void setCancelled(boolean bl2) {
        ((dh)this.wrapped).setCancelled(bl2);
    }
}

