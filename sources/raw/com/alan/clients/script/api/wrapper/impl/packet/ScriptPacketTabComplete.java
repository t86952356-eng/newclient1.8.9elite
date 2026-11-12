/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.x;

public class ScriptPacketTabComplete
extends ScriptPacket<x> {
    public ScriptPacketTabComplete(x x2) {
        super(x2);
    }

    public String getMessage() {
        return ((x)this.wrapped).getMessage();
    }

    public ScriptBlockPos getTargetBlock() {
        return ((x)this.wrapped).agf() != null ? new ScriptBlockPos(((x)this.wrapped).agf()) : null;
    }
}

