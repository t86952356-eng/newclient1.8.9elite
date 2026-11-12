/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.i;

public class ScriptPacketPlayerPosLook
extends ScriptPacket<i> {
    public ScriptPacketPlayerPosLook(i i2) {
        super(i2);
    }

    public double getX() {
        return ((i)this.wrapped).getX();
    }

    public double getY() {
        return ((i)this.wrapped).getY();
    }

    public double getZ() {
        return ((i)this.wrapped).getZ();
    }

    public float getYaw() {
        return ((i)this.wrapped).getYaw();
    }

    public float getPitch() {
        return ((i)this.wrapped).getPitch();
    }

    public void setX(double d2) {
        ((i)this.wrapped).x = d2;
    }

    public void setY(double d2) {
        ((i)this.wrapped).y = d2;
    }

    public void setZ(double d2) {
        ((i)this.wrapped).z = d2;
    }

    public void setYaw(float f2) {
        ((i)this.wrapped).gZ = f2;
    }

    public void setPitch(float f2) {
        ((i)this.wrapped).ha = f2;
    }
}

