/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.ab;

public class ScriptPacketCustomPayload
extends ScriptPacket<ab> {
    public ScriptPacketCustomPayload(ab ab2) {
        super(ab2);
    }

    public String getChannelName() {
        return ((ab)this.wrapped).getChannelName();
    }

    public void setChannel(String string) {
        ((ab)this.wrapped).setChannel(string);
    }
}

