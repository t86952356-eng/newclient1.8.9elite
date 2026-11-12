/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bh;

public class ScriptPacketStatistics
extends ScriptPacket<bh> {
    public ScriptPacketStatistics(bh bh2) {
        super(bh2);
    }

    public int getEntryCount() {
        return ((bh)this.wrapped).ahM() != null ? ((bh)this.wrapped).ahM().size() : 0;
    }
}

