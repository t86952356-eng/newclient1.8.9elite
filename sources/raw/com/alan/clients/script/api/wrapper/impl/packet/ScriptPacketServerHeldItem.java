/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.k;

public class ScriptPacketServerHeldItem
extends ScriptPacket<k> {
    public ScriptPacketServerHeldItem(k k2) {
        super(k2);
    }

    public int getHeldItemHotbarIndex() {
        return ((k)this.wrapped).getHeldItemHotbarIndex();
    }
}

