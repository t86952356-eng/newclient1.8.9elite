/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.m;

public class ScriptPacketServerAnimation
extends ScriptPacket<m> {
    public ScriptPacketServerAnimation(m m2) {
        super(m2);
    }

    public int getEntityId() {
        return ((m)this.wrapped).getEntityID();
    }

    public int getAnimationType() {
        return ((m)this.wrapped).getAnimationType();
    }
}

