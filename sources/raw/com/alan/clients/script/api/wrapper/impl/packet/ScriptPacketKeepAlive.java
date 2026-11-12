/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.a;

public class ScriptPacketKeepAlive
extends ScriptPacket<a> {
    public ScriptPacketKeepAlive(a a2) {
        super(a2);
    }

    public int getKey() {
        return ((a)this.wrapped).getKey();
    }

    public void setKey(int n2) {
        ((a)this.wrapped).key = n2;
    }
}

