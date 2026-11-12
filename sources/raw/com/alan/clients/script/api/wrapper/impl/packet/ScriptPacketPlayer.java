/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.e;

public class ScriptPacketPlayer
extends ScriptPacket<e> {
    public ScriptPacketPlayer(e e2) {
        super(e2);
    }

    public boolean isOnGround() {
        return ((e)this.wrapped).isOnGround();
    }

    public boolean isMoving() {
        return ((e)this.wrapped).isMoving();
    }

    public boolean isRotating() {
        return ((e)this.wrapped).afV();
    }

    public void setOnGround(boolean bl2) {
        ((e)this.wrapped).setOnGround(bl2);
    }

    public double getX() {
        return ((e)this.wrapped).afS();
    }

    public double getY() {
        return ((e)this.wrapped).afT();
    }

    public double getZ() {
        return ((e)this.wrapped).afU();
    }

    public float getYaw() {
        return ((e)this.wrapped).getYaw();
    }

    public float getPitch() {
        return ((e)this.wrapped).getPitch();
    }
}

