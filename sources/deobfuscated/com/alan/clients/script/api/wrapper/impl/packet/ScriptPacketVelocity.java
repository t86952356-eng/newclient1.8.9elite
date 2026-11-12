/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.t;

public class ScriptPacketVelocity
extends ScriptPacket<t> {
    public ScriptPacketVelocity(t t2) {
        super(t2);
    }

    public int getEntityID() {
        return ((t)this.wrapped).getEntityID();
    }

    public int getMotionXRaw() {
        return ((t)this.wrapped).dcR;
    }

    public int getMotionYRaw() {
        return ((t)this.wrapped).dcS;
    }

    public int getMotionZRaw() {
        return ((t)this.wrapped).dcT;
    }

    public double getMotionX() {
        return (double)((t)this.wrapped).dcR / 8000.0;
    }

    public double getMotionY() {
        return (double)((t)this.wrapped).dcS / 8000.0;
    }

    public double getMotionZ() {
        return (double)((t)this.wrapped).dcT / 8000.0;
    }

    public void setMotionX(double d2) {
        ((t)this.wrapped).dcR = (int)(d2 * 8000.0);
    }

    public void setMotionY(double d2) {
        ((t)this.wrapped).dcS = (int)(d2 * 8000.0);
    }

    public void setMotionZ(double d2) {
        ((t)this.wrapped).dcT = (int)(d2 * 8000.0);
    }

    public void setMotionXRaw(int n2) {
        ((t)this.wrapped).dcR = n2;
    }

    public void setMotionYRaw(int n2) {
        ((t)this.wrapped).dcS = n2;
    }

    public void setMotionZRaw(int n2) {
        ((t)this.wrapped).dcT = n2;
    }
}

