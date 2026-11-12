/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.o;

public class ScriptPacketCollectItem
extends ScriptPacket<o> {
    public ScriptPacketCollectItem(o o2) {
        super(o2);
    }

    public int getCollectedItemEntityId() {
        return ((o)this.wrapped).agA();
    }

    public int getCollectorEntityId() {
        return ((o)this.wrapped).getEntityID();
    }
}

