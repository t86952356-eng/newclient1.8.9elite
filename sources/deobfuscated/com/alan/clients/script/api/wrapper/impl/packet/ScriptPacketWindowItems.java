/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ba;

public class ScriptPacketWindowItems
extends ScriptPacket<ba> {
    public ScriptPacketWindowItems(ba ba2) {
        super(ba2);
    }

    public int getWindowId() {
        return ((ba)this.wrapped).ahF();
    }

    public int getItemCount() {
        return ((ba)this.wrapped).ahG() != null ? ((ba)this.wrapped).ahG().length : 0;
    }
}

