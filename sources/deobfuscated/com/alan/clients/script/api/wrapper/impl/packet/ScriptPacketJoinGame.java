/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.b;

public class ScriptPacketJoinGame
extends ScriptPacket<b> {
    public ScriptPacketJoinGame(b b2) {
        super(b2);
    }

    public int getEntityId() {
        return ((b)this.wrapped).getEntityId();
    }

    public boolean isHardcoreMode() {
        return ((b)this.wrapped).isHardcoreMode();
    }

    public String getGameType() {
        return ((b)this.wrapped).If().getName();
    }

    public int getDimension() {
        return ((b)this.wrapped).getDimension();
    }

    public String getDifficulty() {
        return ((b)this.wrapped).agm().ava();
    }

    public int getMaxPlayers() {
        return ((b)this.wrapped).getMaxPlayers();
    }

    public boolean isReducedDebugInfo() {
        return ((b)this.wrapped).isReducedDebugInfo();
    }
}

