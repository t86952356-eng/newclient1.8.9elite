/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ac;

public class ScriptPacketEntityAttach
extends ScriptPacket<ac> {
    public ScriptPacketEntityAttach(ac ac2) {
        super(ac2);
    }

    public int getLeash() {
        return ((ac)this.wrapped).getLeash();
    }

    public int getEntityId() {
        return ((ac)this.wrapped).getEntityId();
    }

    public int getVehicleEntityId() {
        return ((ac)this.wrapped).getVehicleEntityId();
    }
}

