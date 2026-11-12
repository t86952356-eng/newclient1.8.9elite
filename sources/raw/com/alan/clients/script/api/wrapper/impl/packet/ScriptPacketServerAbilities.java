/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bl;

public class ScriptPacketServerAbilities
extends ScriptPacket<bl> {
    public ScriptPacketServerAbilities(bl bl2) {
        super(bl2);
    }

    public boolean isInvulnerable() {
        return ((bl)this.wrapped).isInvulnerable();
    }

    public boolean isFlying() {
        return ((bl)this.wrapped).isFlying();
    }

    public boolean isAllowFlying() {
        return ((bl)this.wrapped).isAllowFlying();
    }

    public boolean isCreativeMode() {
        return ((bl)this.wrapped).isCreativeMode();
    }

    public float getFlySpeed() {
        return ((bl)this.wrapped).getFlySpeed();
    }

    public float getWalkSpeed() {
        return ((bl)this.wrapped).getWalkSpeed();
    }
}

