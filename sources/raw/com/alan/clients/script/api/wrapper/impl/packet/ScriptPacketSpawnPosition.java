/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.f;

public class ScriptPacketSpawnPosition
extends ScriptPacket<f> {
    public ScriptPacketSpawnPosition(f f2) {
        super(f2);
    }

    public ScriptBlockPos getSpawnPosition() {
        return new ScriptBlockPos(((f)this.wrapped).agp());
    }
}

