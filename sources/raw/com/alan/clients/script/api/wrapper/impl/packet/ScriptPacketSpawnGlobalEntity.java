/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.aw;

public class ScriptPacketSpawnGlobalEntity
extends ScriptPacket<aw> {
    public ScriptPacketSpawnGlobalEntity(aw aw2) {
        super(aw2);
    }

    public int getEntityId() {
        return ((aw)this.wrapped).ahw();
    }

    public double getX() {
        return (double)((aw)this.wrapped).ahx() / 32.0;
    }

    public double getY() {
        return (double)((aw)this.wrapped).ahy() / 32.0;
    }

    public double getZ() {
        return (double)((aw)this.wrapped).ahz() / 32.0;
    }

    public int getEntityType() {
        return ((aw)this.wrapped).ahA();
    }
}

