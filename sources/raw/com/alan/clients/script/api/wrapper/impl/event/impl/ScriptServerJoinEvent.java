/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.fa;

public class ScriptServerJoinEvent
extends ScriptEvent<fa> {
    public ScriptServerJoinEvent(fa fa2) {
        super(fa2);
    }

    public String getIp() {
        return ((fa)this.wrapped).getIp();
    }

    public int getPort() {
        return ((fa)this.wrapped).getPort();
    }

    @Override
    public String getHandlerName() {
        return "onServerJoin";
    }
}

