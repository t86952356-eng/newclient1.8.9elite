/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bv;

public class ScriptPacketCombatEvent
extends ScriptPacket<bv> {
    public ScriptPacketCombatEvent(bv bv2) {
        super(bv2);
    }

    public String getEventType() {
        return ((bv)this.wrapped).dfe != null ? ((bv)this.wrapped).dfe.name() : "";
    }

    public int getPlayerId() {
        return ((bv)this.wrapped).dff;
    }

    public int getEntityId() {
        return ((bv)this.wrapped).dfg;
    }
}

