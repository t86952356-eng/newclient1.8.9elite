/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.c;

public class ScriptPacketUseEntity
extends ScriptPacket<c> {
    public ScriptPacketUseEntity(c c2) {
        super(c2);
    }

    public String getAction() {
        return ((c)this.wrapped).afQ().name();
    }

    public double getHitVecX() {
        return ((c)this.wrapped).kI() != null ? ((c)this.wrapped).kI().dAG : 0.0;
    }

    public double getHitVecY() {
        return ((c)this.wrapped).kI() != null ? ((c)this.wrapped).kI().dAH : 0.0;
    }

    public double getHitVecZ() {
        return ((c)this.wrapped).kI() != null ? ((c)this.wrapped).kI().dAI : 0.0;
    }
}

