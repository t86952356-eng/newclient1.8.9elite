/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import hackclient.rise.di;

public abstract class ScriptEvent<T extends di>
extends ScriptWrapper<T> {
    public ScriptEvent(T t2) {
        super(t2);
    }

    public abstract String getHandlerName();
}

