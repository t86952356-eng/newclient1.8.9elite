/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bn;

public class ScriptPacketScoreboardObjective
extends ScriptPacket<bn> {
    public ScriptPacketScoreboardObjective(bn bn2) {
        super(bn2);
    }

    public String getObjectiveName() {
        return ((bn)this.wrapped).getObjectiveName();
    }

    public String getObjectiveValue() {
        return ((bn)this.wrapped).getObjectiveValue();
    }

    public int getAction() {
        return ((bn)this.wrapped).ahS();
    }
}

