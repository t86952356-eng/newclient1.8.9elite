/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ap;

public class ScriptPacketBlockBreakAnim
extends ScriptPacket<ap> {
    public ScriptPacketBlockBreakAnim(ap ap2) {
        super(ap2);
    }

    public int getBreakerId() {
        return ((ap)this.wrapped).getBreakerId();
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((ap)this.wrapped).yl());
    }

    public int getProgress() {
        return ((ap)this.wrapped).getProgress();
    }
}

