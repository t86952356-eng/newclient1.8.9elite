/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ad;

public class ScriptPacketEntityMetadata
extends ScriptPacket<ad> {
    public ScriptPacketEntityMetadata(ad ad2) {
        super(ad2);
    }

    public int getEntityId() {
        return ((ad)this.wrapped).getEntityId();
    }
}

