/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketFactory;
import hackclient.rise.fh;

public class ScriptPacketReceiveEvent
extends CancellableScriptEvent<fh> {
    private ScriptPacket<?> wrappedPacket;

    public ScriptPacketReceiveEvent(fh fh2) {
        super(fh2);
        this.wrappedPacket = ScriptPacketFactory.wrap(fh2.dq());
    }

    public String getPacketName() {
        return ((fh)this.wrapped).dq().getClass().getSimpleName();
    }

    public String getPacketClassName() {
        return ((fh)this.wrapped).dq().getClass().getName();
    }

    public boolean isPacket(String string) {
        return this.wrappedPacket.isType(string);
    }

    public ScriptPacket<?> getPacket() {
        return this.wrappedPacket;
    }

    @Override
    public String getHandlerName() {
        return "onPacketReceive";
    }
}

