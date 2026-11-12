/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.q;

public class ScriptPacketSpawnMob
extends ScriptPacket<q> {
    public ScriptPacketSpawnMob(q q2) {
        super(q2);
    }

    public int getEntityId() {
        return ((q)this.wrapped).getEntityID();
    }

    public int getEntityType() {
        return ((q)this.wrapped).getEntityType();
    }

    public double getX() {
        return (double)((q)this.wrapped).wt() / 32.0;
    }

    public double getY() {
        return (double)((q)this.wrapped).wu() / 32.0;
    }

    public double getZ() {
        return (double)((q)this.wrapped).wx() / 32.0;
    }

    public double getVelocityX() {
        return (double)((q)this.wrapped).agJ() / 8000.0;
    }

    public double getVelocityY() {
        return (double)((q)this.wrapped).agK() / 8000.0;
    }

    public double getVelocityZ() {
        return (double)((q)this.wrapped).agL() / 8000.0;
    }

    public float getYaw() {
        return (float)((q)this.wrapped).agx() * 360.0f / 256.0f;
    }

    public float getPitch() {
        return (float)((q)this.wrapped).agy() * 360.0f / 256.0f;
    }

    public float getHeadPitch() {
        return (float)((q)this.wrapped).agM() * 360.0f / 256.0f;
    }
}

