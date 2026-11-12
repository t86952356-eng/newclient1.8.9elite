/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.aj;

public class ScriptPacketChunkData
extends ScriptPacket<aj> {
    public ScriptPacketChunkData(aj aj2) {
        super(aj2);
    }

    public int getChunkX() {
        return ((aj)this.wrapped).getChunkX();
    }

    public int getChunkZ() {
        return ((aj)this.wrapped).getChunkZ();
    }

    public boolean isFullChunk() {
        return ((aj)this.wrapped).ahh();
    }
}

