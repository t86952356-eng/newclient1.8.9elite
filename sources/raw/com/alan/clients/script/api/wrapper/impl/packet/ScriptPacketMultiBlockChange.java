/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.al;

public class ScriptPacketMultiBlockChange
extends ScriptPacket<al> {
    public ScriptPacketMultiBlockChange(al al2) {
        super(al2);
    }

    public int getChangedBlockCount() {
        return ((al)this.wrapped).ahi() != null ? ((al)this.wrapped).ahi().length : 0;
    }
}

