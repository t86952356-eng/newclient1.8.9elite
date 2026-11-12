/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.av;

public class ScriptPacketChangeGameState
extends ScriptPacket<av> {
    public ScriptPacketChangeGameState(av av2) {
        super(av2);
    }

    public int getGameState() {
        return ((av)this.wrapped).getGameState();
    }

    public float getValue() {
        return ((av)this.wrapped).ahv();
    }
}

