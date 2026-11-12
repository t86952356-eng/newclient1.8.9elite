/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bq;

public class ScriptPacketDisplayScoreboard
extends ScriptPacket<bq> {
    public ScriptPacketDisplayScoreboard(bq bq2) {
        super(bq2);
    }

    public int getPosition() {
        return ((bq)this.wrapped).getPosition();
    }

    public String getScoreName() {
        return ((bq)this.wrapped).getScoreName();
    }

    public void setPosition(int n2) {
        ((bq)this.wrapped).setPosition(n2);
    }

    public void setScoreName(String string) {
        ((bq)this.wrapped).setScoreName(string);
    }
}

