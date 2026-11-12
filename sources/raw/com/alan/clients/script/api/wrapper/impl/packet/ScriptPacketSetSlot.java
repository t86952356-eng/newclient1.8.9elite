/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.az;

public class ScriptPacketSetSlot
extends ScriptPacket<az> {
    public ScriptPacketSetSlot(az az2) {
        super(az2);
    }

    public int getWindowId() {
        return ((az)this.wrapped).ahC();
    }

    public int getSlotId() {
        return ((az)this.wrapped).ahD();
    }
}

