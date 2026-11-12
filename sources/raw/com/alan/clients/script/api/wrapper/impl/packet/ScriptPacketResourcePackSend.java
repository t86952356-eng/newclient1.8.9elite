/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ce;

public class ScriptPacketResourcePackSend
extends ScriptPacket<ce> {
    public ScriptPacketResourcePackSend(ce ce2) {
        super(ce2);
    }

    public String getURL() {
        return ((ce)this.wrapped).getURL();
    }

    public String getHash() {
        return ((ce)this.wrapped).getHash();
    }
}

