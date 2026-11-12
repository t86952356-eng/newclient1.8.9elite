/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bx;

public class ScriptPacketCamera
extends ScriptPacket<bx> {
    public ScriptPacketCamera(bx bx2) {
        super(bx2);
    }

    public int getEntityId() {
        return ((bx)this.wrapped).l(ScriptPacketCamera.MC.bgF) != null ? ((bx)this.wrapped).l(ScriptPacketCamera.MC.bgF).getEntityId() : -1;
    }
}

