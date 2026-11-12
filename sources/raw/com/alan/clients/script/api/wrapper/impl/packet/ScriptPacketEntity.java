/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.v;

public class ScriptPacketEntity
extends ScriptPacket<v> {
    public ScriptPacketEntity(v v2) {
        super(v2);
    }

    public int getEntityId() {
        return ((v)this.wrapped).l(ScriptPacketEntity.MC.bgF) != null ? ((v)this.wrapped).l(ScriptPacketEntity.MC.bgF).getEntityId() : -1;
    }

    public boolean isOnGround() {
        return ((v)this.wrapped).agV();
    }
}

