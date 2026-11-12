/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.l;

public class ScriptPacketUseBed
extends ScriptPacket<l> {
    public ScriptPacketUseBed(l l2) {
        super(l2);
    }

    public ScriptBlockPos getBedPosition() {
        return new ScriptBlockPos(((l)this.wrapped).agu());
    }
}

