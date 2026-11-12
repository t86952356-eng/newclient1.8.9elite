/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketFactory;
import rise.event.impl.PacketReceiveEvent;

public class ScriptPacketReceiveEvent
extends CancellableScriptEvent<PacketReceiveEvent> {
    private ScriptPacket<?> packet;

    public ScriptPacketReceiveEvent(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
        this.packet = ScriptPacketFactory.wrap(packetReceiveEvent.dq());
    }

    public String getPacketName() {
        return ((PacketReceiveEvent)this.wrapped).dq().getClass().getSimpleName();
    }

    public String getPacketClassName() {
        return ((PacketReceiveEvent)this.wrapped).dq().getClass().getName();
    }

    public boolean isPacket(String string) {
        return this.packet.isType(string);
    }

    public ScriptPacket<?> getPacket() {
        return this.packet;
    }

    @Override
    public String getHandlerName() {
        return "onPacketReceive";
    }
}

