/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.f;

public class ScriptPacketPosition
extends ScriptPacket<f> {
    public ScriptPacketPosition(f f2) {
        super(f2);
    }

    public double getX() {
        return ((f)this.wrapped).afS();
    }

    public double getY() {
        return ((f)this.wrapped).afT();
    }

    public double getZ() {
        return ((f)this.wrapped).afU();
    }

    public boolean isOnGround() {
        return ((f)this.wrapped).isOnGround();
    }

    public void setX(double d2) {
        ((f)this.wrapped).x = d2;
    }

    public void setY(double d2) {
        ((f)this.wrapped).y = d2;
    }

    public void setZ(double d2) {
        ((f)this.wrapped).z = d2;
    }

    public void setOnGround(boolean bl2) {
        ((f)this.wrapped).setOnGround(bl2);
    }
}

