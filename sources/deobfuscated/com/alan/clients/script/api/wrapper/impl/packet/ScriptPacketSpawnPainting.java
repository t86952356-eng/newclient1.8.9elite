/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.r;

public class ScriptPacketSpawnPainting
extends ScriptPacket<r> {
    public ScriptPacketSpawnPainting(r r2) {
        super(r2);
    }

    public int getEntityId() {
        return ((r)this.wrapped).getEntityID();
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((r)this.wrapped).yl());
    }

    public int getFacing() {
        return ((r)this.wrapped).yx().asA();
    }

    public String getTitle() {
        return ((r)this.wrapped).getTitle();
    }
}

