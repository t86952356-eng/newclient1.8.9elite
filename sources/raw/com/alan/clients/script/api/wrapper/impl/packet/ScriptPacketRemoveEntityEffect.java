/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.af;

public class ScriptPacketRemoveEntityEffect
extends ScriptPacket<af> {
    public ScriptPacketRemoveEntityEffect(af af2) {
        super(af2);
    }

    public int getEntityId() {
        return ((af)this.wrapped).getEntityId();
    }

    public int getEffectId() {
        return ((af)this.wrapped).getEffectId();
    }
}

