/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.h;

public class ScriptPacketPosLook
extends ScriptPacket<h> {
    public ScriptPacketPosLook(h h2) {
        super(h2);
    }

    public double getX() {
        return ((h)this.wrapped).afS();
    }

    public double getY() {
        return ((h)this.wrapped).afT();
    }

    public double getZ() {
        return ((h)this.wrapped).afU();
    }

    public float getYaw() {
        return ((h)this.wrapped).getYaw();
    }

    public float getPitch() {
        return ((h)this.wrapped).getPitch();
    }

    public boolean isOnGround() {
        return ((h)this.wrapped).isOnGround();
    }

    public void setX(double d2) {
        ((h)this.wrapped).x = d2;
    }

    public void setY(double d2) {
        ((h)this.wrapped).y = d2;
    }

    public void setZ(double d2) {
        ((h)this.wrapped).z = d2;
    }

    public void setYaw(float f2) {
        ((h)this.wrapped).yaw = f2;
    }

    public void setPitch(float f2) {
        ((h)this.wrapped).pitch = f2;
    }

    public void setOnGround(boolean bl2) {
        ((h)this.wrapped).setOnGround(bl2);
    }
}

