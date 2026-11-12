/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bt;

public class ScriptPacketDisconnect
extends ScriptPacket<bt> {
    public ScriptPacketDisconnect(bt bt2) {
        super(bt2);
    }

    public String getReason() {
        return ((bt)this.wrapped).aim() != null ? ((bt)this.wrapped).aim().arq() : "";
    }
}

