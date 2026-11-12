/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.h;

public class ScriptPacketRespawn
extends ScriptPacket<h> {
    public ScriptPacketRespawn(h h2) {
        super(h2);
    }

    public int getDimensionId() {
        return ((h)this.wrapped).agq();
    }

    public String getDifficulty() {
        return ((h)this.wrapped).agm().ava();
    }

    public String getGameType() {
        return ((h)this.wrapped).If().getName();
    }
}

