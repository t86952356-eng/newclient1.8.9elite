/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.e;

public class ScriptPacketEntityEquipment
extends ScriptPacket<e> {
    public ScriptPacketEntityEquipment(e e2) {
        super(e2);
    }

    public int getEntityId() {
        return ((e)this.wrapped).getEntityID();
    }

    public int getEquipmentSlot() {
        return ((e)this.wrapped).getEquipmentSlot();
    }
}

