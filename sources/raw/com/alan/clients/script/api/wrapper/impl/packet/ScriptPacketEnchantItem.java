/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.u;

public class ScriptPacketEnchantItem
extends ScriptPacket<u> {
    public ScriptPacketEnchantItem(u u2) {
        super(u2);
    }

    public int getWindowId() {
        return ((u)this.wrapped).getWindowId();
    }

    public int getButton() {
        return ((u)this.wrapped).getButton();
    }
}

