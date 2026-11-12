/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ah;

public class ScriptPacketEntityProperties
extends ScriptPacket<ah> {
    public ScriptPacketEntityProperties(ah ah2) {
        super(ah2);
    }

    public int getEntityId() {
        return ((ah)this.wrapped).getEntityId();
    }
}

