/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.an;

public class ScriptPacketBlockChange
extends ScriptPacket<an> {
    public ScriptPacketBlockChange(an an2) {
        super(an2);
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((an)this.wrapped).ahk());
    }
}

