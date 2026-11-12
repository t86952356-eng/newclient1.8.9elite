/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.i;

public class ScriptPacketDigging
extends ScriptPacket<i> {
    public ScriptPacketDigging(i i2) {
        super(i2);
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((i)this.wrapped).yl());
    }

    public int getFacing() {
        return ((i)this.wrapped).yx().OY();
    }

    public String getStatus() {
        return ((i)this.wrapped).afW().name();
    }
}

