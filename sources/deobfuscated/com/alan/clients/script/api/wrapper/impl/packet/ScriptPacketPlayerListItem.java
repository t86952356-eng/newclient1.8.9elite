/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bi;

public class ScriptPacketPlayerListItem
extends ScriptPacket<bi> {
    public ScriptPacketPlayerListItem(bi bi2) {
        super(bi2);
    }

    public String getAction() {
        return ((bi)this.wrapped).ahO() != null ? ((bi)this.wrapped).ahO().name() : "";
    }

    public int getEntryCount() {
        return ((bi)this.wrapped).ahN() != null ? ((bi)this.wrapped).ahN().size() : 0;
    }
}

