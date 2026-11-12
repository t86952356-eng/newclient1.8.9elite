/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bc;

public class ScriptPacketServerTransaction
extends ScriptPacket<bc> {
    public ScriptPacketServerTransaction(bc bc2) {
        super(bc2);
    }

    public int getWindowId() {
        return ((bc)this.wrapped).getWindowId();
    }

    public short getActionNumber() {
        return ((bc)this.wrapped).getActionNumber();
    }

    public boolean isAccepted() {
        return ((bc)this.wrapped).ahJ();
    }
}

