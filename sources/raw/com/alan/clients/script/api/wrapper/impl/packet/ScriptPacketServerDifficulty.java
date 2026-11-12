/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bu;

public class ScriptPacketServerDifficulty
extends ScriptPacket<bu> {
    public ScriptPacketServerDifficulty(bu bu2) {
        super(bu2);
    }

    public String getDifficulty() {
        return ((bu)this.wrapped).agm() != null ? ((bu)this.wrapped).agm().ava() : "";
    }

    public boolean isDifficultyLocked() {
        return ((bu)this.wrapped).isDifficultyLocked();
    }
}

