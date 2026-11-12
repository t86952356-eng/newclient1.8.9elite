/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketFactory;
import hackclient.rise.fi;

public class ScriptPacketSendEvent
extends CancellableScriptEvent<fi> {
    private ScriptPacket<?> wrappedPacket;

    public ScriptPacketSendEvent(fi fi2) {
        super(fi2);
        this.wrappedPacket = ScriptPacketFactory.wrap(fi2.dq());
    }

    public String getPacketName() {
        return ((fi)this.wrapped).dq().getClass().getSimpleName();
    }

    public String getPacketClassName() {
        return ((fi)this.wrapped).dq().getClass().getName();
    }

    public boolean isPacket(String string) {
        return this.wrappedPacket.isType(string);
    }

    public ScriptPacket<?> getPacket() {
        return this.wrappedPacket;
    }

    @Override
    public String getHandlerName() {
        return "onPacketSend";
    }
}

