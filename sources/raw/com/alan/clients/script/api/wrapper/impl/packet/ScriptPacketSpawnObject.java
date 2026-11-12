/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.p;

public class ScriptPacketSpawnObject
extends ScriptPacket<p> {
    public ScriptPacketSpawnObject(p p2) {
        super(p2);
    }

    public int getEntityId() {
        return ((p)this.wrapped).getEntityID();
    }

    public int getObjectType() {
        return ((p)this.wrapped).agG();
    }

    public double getX() {
        return (double)((p)this.wrapped).wt() / 32.0;
    }

    public double getY() {
        return (double)((p)this.wrapped).wu() / 32.0;
    }

    public double getZ() {
        return (double)((p)this.wrapped).wx() / 32.0;
    }

    public double getSpeedX() {
        return (double)((p)this.wrapped).agB() / 8000.0;
    }

    public double getSpeedY() {
        return (double)((p)this.wrapped).agC() / 8000.0;
    }

    public double getSpeedZ() {
        return (double)((p)this.wrapped).agD() / 8000.0;
    }
}

