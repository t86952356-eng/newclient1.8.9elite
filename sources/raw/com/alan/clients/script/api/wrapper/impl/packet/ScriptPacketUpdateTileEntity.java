/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bf;

public class ScriptPacketUpdateTileEntity
extends ScriptPacket<bf> {
    public ScriptPacketUpdateTileEntity(bf bf2) {
        super(bf2);
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((bf)this.wrapped).Ab());
    }

    public int getTileEntityType() {
        return ((bf)this.wrapped).getTileEntityType();
    }
}

