/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.a;

public class ScriptPacketServerKeepAlive
extends ScriptPacket<a> {
    public ScriptPacketServerKeepAlive(a a2) {
        super(a2);
    }

    public int getId() {
        return ((a)this.wrapped).agl();
    }
}

