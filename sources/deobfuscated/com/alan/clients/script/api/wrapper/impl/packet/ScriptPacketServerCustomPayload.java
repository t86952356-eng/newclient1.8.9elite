/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bs;

public class ScriptPacketServerCustomPayload
extends ScriptPacket<bs> {
    public ScriptPacketServerCustomPayload(bs bs2) {
        super(bs2);
    }

    public String getChannelName() {
        return ((bs)this.wrapped).getChannelName();
    }
}

