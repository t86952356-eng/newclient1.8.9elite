/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.cc;

public class ScriptPacketSetCompressionLevel
extends ScriptPacket<cc> {
    public ScriptPacketSetCompressionLevel(cc cc2) {
        super(cc2);
    }

    public int getThreshold() {
        return ((cc)this.wrapped).ait();
    }
}

