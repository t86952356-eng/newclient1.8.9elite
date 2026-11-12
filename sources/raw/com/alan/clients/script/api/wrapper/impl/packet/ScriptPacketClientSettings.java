/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.y;

public class ScriptPacketClientSettings
extends ScriptPacket<y> {
    public ScriptPacketClientSettings(y y2) {
        super(y2);
    }

    public String getLanguage() {
        return ((y)this.wrapped).agg();
    }

    public String getChatVisibility() {
        return ((y)this.wrapped).act().name();
    }

    public boolean isColorsEnabled() {
        return ((y)this.wrapped).isColorsEnabled();
    }

    public int getModelPartFlags() {
        return ((y)this.wrapped).getModelPartFlags();
    }
}

