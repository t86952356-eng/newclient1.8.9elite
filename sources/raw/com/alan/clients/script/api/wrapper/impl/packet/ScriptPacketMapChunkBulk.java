/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.aq;

public class ScriptPacketMapChunkBulk
extends ScriptPacket<aq> {
    public ScriptPacketMapChunkBulk(aq aq2) {
        super(aq2);
    }

    public int getChunkCount() {
        return ((aq)this.wrapped).getChunkCount();
    }
}

