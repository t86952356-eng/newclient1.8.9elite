/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.b;

public class ScriptPacketChatMessage
extends ScriptPacket<b> {
    public ScriptPacketChatMessage(b b2) {
        super(b2);
    }

    public String getMessage() {
        return ((b)this.wrapped).getMessage();
    }
}

