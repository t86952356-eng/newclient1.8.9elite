/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.g;

public class ScriptPacketLook
extends ScriptPacket<g> {
    public ScriptPacketLook(g g2) {
        super(g2);
    }

    public float getYaw() {
        return ((g)this.wrapped).getYaw();
    }

    public float getPitch() {
        return ((g)this.wrapped).getPitch();
    }

    public boolean isOnGround() {
        return ((g)this.wrapped).isOnGround();
    }

    public void setYaw(float f2) {
        ((g)this.wrapped).yaw = f2;
    }

    public void setPitch(float f2) {
        ((g)this.wrapped).pitch = f2;
    }

    public void setOnGround(boolean bl2) {
        ((g)this.wrapped).setOnGround(bl2);
    }
}

