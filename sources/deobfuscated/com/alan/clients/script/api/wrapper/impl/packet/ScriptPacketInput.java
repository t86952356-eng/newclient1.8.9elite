/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.p;

public class ScriptPacketInput
extends ScriptPacket<p> {
    public ScriptPacketInput(p p2) {
        super(p2);
    }

    public float getStrafeSpeed() {
        return ((p)this.wrapped).getStrafeSpeed();
    }

    public float getForwardSpeed() {
        return ((p)this.wrapped).getForwardSpeed();
    }

    public boolean isJumping() {
        return ((p)this.wrapped).isJumping();
    }

    public boolean isSneaking() {
        return ((p)this.wrapped).isSneaking();
    }
}

