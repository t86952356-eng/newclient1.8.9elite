/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.n;

public class ScriptPacketEntityAction
extends ScriptPacket<n> {
    public ScriptPacketEntityAction(n n2) {
        super(n2);
    }

    public String getAction() {
        return ((n)this.wrapped).agb().name();
    }

    public int getAuxData() {
        return ((n)this.wrapped).getAuxData();
    }
}

