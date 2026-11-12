/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.z;

public class ScriptPacketClientStatus
extends ScriptPacket<z> {
    public ScriptPacketClientStatus(z z2) {
        super(z2);
    }

    public String getStatus() {
        return ((z)this.wrapped).agh().name();
    }
}

