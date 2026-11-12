/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.cf;

public class ScriptPacketUpdateEntityNBT
extends ScriptPacket<cf> {
    public ScriptPacketUpdateEntityNBT(cf cf2) {
        super(cf2);
    }

    public int getEntityId() {
        return ((cf)this.wrapped).l(ScriptPacketUpdateEntityNBT.MC.bgF) != null ? ((cf)this.wrapped).l(ScriptPacketUpdateEntityNBT.MC.bgF).getEntityId() : -1;
    }
}

