/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.g;

public class ScriptPacketUpdateHealth
extends ScriptPacket<g> {
    public ScriptPacketUpdateHealth(g g2) {
        super(g2);
    }

    public float getHealth() {
        return ((g)this.wrapped).getHealth();
    }

    public int getFoodLevel() {
        return ((g)this.wrapped).getFoodLevel();
    }

    public float getSaturationLevel() {
        return ((g)this.wrapped).getSaturationLevel();
    }
}

