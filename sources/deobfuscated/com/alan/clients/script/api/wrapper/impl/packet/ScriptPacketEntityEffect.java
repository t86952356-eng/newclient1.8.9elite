/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ae;

public class ScriptPacketEntityEffect
extends ScriptPacket<ae> {
    public ScriptPacketEntityEffect(ae ae2) {
        super(ae2);
    }

    public int getEntityId() {
        return ((ae)this.wrapped).getEntityId();
    }

    public byte getEffectId() {
        return ((ae)this.wrapped).getEffectId();
    }

    public byte getAmplifier() {
        return ((ae)this.wrapped).getAmplifier();
    }

    public int getDuration() {
        return ((ae)this.wrapped).getDuration();
    }

    public boolean isAmbient() {
        return ((ae)this.wrapped).agZ();
    }
}

