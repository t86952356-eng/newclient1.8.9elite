/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.d;

public class ScriptPacketTimeUpdate
extends ScriptPacket<d> {
    public ScriptPacketTimeUpdate(d d2) {
        super(d2);
    }

    public long getTotalWorldTime() {
        return ((d)this.wrapped).getTotalWorldTime();
    }

    public long getWorldTime() {
        return ((d)this.wrapped).getWorldTime();
    }
}

