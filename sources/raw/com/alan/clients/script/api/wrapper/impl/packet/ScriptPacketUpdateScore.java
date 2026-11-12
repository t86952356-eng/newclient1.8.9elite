/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bo;

public class ScriptPacketUpdateScore
extends ScriptPacket<bo> {
    public ScriptPacketUpdateScore(bo bo2) {
        super(bo2);
    }

    public String getPlayerName() {
        return ((bo)this.wrapped).getPlayerName();
    }

    public String getObjectiveName() {
        return ((bo)this.wrapped).getObjectiveName();
    }

    public int getScoreValue() {
        return ((bo)this.wrapped).getScoreValue();
    }

    public String getAction() {
        return ((bo)this.wrapped).ahU() != null ? ((bo)this.wrapped).ahU().name() : "";
    }
}

