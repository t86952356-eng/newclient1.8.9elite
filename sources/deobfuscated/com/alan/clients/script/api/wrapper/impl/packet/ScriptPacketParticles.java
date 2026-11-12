/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.au;

public class ScriptPacketParticles
extends ScriptPacket<au> {
    public ScriptPacketParticles(au au2) {
        super(au2);
    }

    public String getParticleType() {
        return ((au)this.wrapped).Zw() != null ? ((au)this.wrapped).Zw().asX() : "";
    }

    public float getX() {
        return (float)((au)this.wrapped).ahr();
    }

    public float getY() {
        return (float)((au)this.wrapped).ahs();
    }

    public float getZ() {
        return (float)((au)this.wrapped).aht();
    }

    public float getXOffset() {
        return ((au)this.wrapped).getXOffset();
    }

    public float getYOffset() {
        return ((au)this.wrapped).getYOffset();
    }

    public float getZOffset() {
        return ((au)this.wrapped).getZOffset();
    }

    public float getParticleSpeed() {
        return ((au)this.wrapped).getParticleSpeed();
    }

    public int getParticleCount() {
        return ((au)this.wrapped).getParticleCount();
    }

    public boolean isLongDistance() {
        return ((au)this.wrapped).isLongDistance();
    }
}

