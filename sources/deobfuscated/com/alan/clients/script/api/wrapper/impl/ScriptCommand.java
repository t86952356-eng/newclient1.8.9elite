/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.ScriptHandlerWrapper;
import hackclient.rise.s;
import rise.Client;

public final class ScriptCommand
extends ScriptHandlerWrapper<s> {
    public ScriptCommand(s s2) {
        super(s2);
    }

    public void unregister() {
        Client.a.i().aQ().remove(this.wrapped);
    }

    public String getName() {
        return ((s)this.wrapped).getExpressions()[0];
    }

    public String getDescription() {
        return ((s)this.wrapped).getDescription();
    }
}

