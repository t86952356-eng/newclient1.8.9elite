/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.s;

public class ScriptPacketSpawnXPOrb
extends ScriptPacket<s> {
    public ScriptPacketSpawnXPOrb(s s2) {
        super(s2);
    }

    public int getEntityId() {
        return ((s)this.wrapped).getEntityID();
    }

    public double getX() {
        return (double)((s)this.wrapped).wt() / 32.0;
    }

    public double getY() {
        return (double)((s)this.wrapped).wu() / 32.0;
    }

    public double getZ() {
        return (double)((s)this.wrapped).wx() / 32.0;
    }

    public int getXPValue() {
        return ((s)this.wrapped).getXPValue();
    }
}

