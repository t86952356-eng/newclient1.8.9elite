/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketFactory;
import rise.event.impl.PacketSendEvent;

public class ScriptPacketSendEvent
extends CancellableScriptEvent<PacketSendEvent> {
    private ScriptPacket<?> packet;

    public ScriptPacketSendEvent(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
        this.packet = ScriptPacketFactory.wrap(packetSendEvent.dq());
    }

    public String getPacketName() {
        return ((PacketSendEvent)this.wrapped).dq().getClass().getSimpleName();
    }

    public String getPacketClassName() {
        return ((PacketSendEvent)this.wrapped).dq().getClass().getName();
    }

    public boolean isPacket(String string) {
        return this.packet.isType(string);
    }

    public ScriptPacket<?> getPacket() {
        return this.packet;
    }

    @Override
    public String getHandlerName() {
        return "onPacketSend";
    }
}

