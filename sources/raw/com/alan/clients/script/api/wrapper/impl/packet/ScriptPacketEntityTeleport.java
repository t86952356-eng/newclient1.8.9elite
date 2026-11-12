/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.z;

public class ScriptPacketEntityTeleport
extends ScriptPacket<z> {
    public ScriptPacketEntityTeleport(z z2) {
        super(z2);
    }

    public int getEntityId() {
        return ((z)this.wrapped).getEntityId();
    }

    public double getX() {
        return (double)((z)this.wrapped).wt() / 32.0;
    }

    public double getY() {
        return (double)((z)this.wrapped).wu() / 32.0;
    }

    public double getZ() {
        return (double)((z)this.wrapped).wx() / 32.0;
    }

    public float getYaw() {
        return (float)((z)this.wrapped).agx() * 360.0f / 256.0f;
    }

    public float getPitch() {
        return (float)((z)this.wrapped).agy() * 360.0f / 256.0f;
    }

    public boolean isOnGround() {
        return ((z)this.wrapped).agV();
    }
}

