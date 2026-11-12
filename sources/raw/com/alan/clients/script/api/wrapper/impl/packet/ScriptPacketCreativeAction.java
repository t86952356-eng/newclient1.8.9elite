/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.t;

public class ScriptPacketCreativeAction
extends ScriptPacket<t> {
    public ScriptPacketCreativeAction(t t2) {
        super(t2);
    }

    public int getSlotId() {
        return ((t)this.wrapped).getSlotId();
    }
}

