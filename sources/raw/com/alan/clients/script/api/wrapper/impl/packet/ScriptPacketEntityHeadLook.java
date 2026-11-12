/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.aa;

public class ScriptPacketEntityHeadLook
extends ScriptPacket<aa> {
    public ScriptPacketEntityHeadLook(aa aa2) {
        super(aa2);
    }

    public int getEntityId() {
        return ((aa)this.wrapped).l(ScriptPacketEntityHeadLook.MC.bgF) != null ? ((aa)this.wrapped).l(ScriptPacketEntityHeadLook.MC.bgF).getEntityId() : -1;
    }

    public float getYaw() {
        return (float)((aa)this.wrapped).agx() * 360.0f / 256.0f;
    }
}

