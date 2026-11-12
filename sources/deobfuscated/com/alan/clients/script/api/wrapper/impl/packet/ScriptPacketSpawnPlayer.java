/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.n;

public class ScriptPacketSpawnPlayer
extends ScriptPacket<n> {
    public ScriptPacketSpawnPlayer(n n2) {
        super(n2);
    }

    public int getEntityId() {
        return ((n)this.wrapped).getEntityID();
    }

    public String getPlayerUUID() {
        return ((n)this.wrapped).agw() != null ? ((n)this.wrapped).agw().toString() : "";
    }

    public double getX() {
        return (double)((n)this.wrapped).wt() / 32.0;
    }

    public double getY() {
        return (double)((n)this.wrapped).wu() / 32.0;
    }

    public double getZ() {
        return (double)((n)this.wrapped).wx() / 32.0;
    }

    public float getYaw() {
        return (float)((n)this.wrapped).agx() * 360.0f / 256.0f;
    }

    public float getPitch() {
        return (float)((n)this.wrapped).agy() * 360.0f / 256.0f;
    }
}

