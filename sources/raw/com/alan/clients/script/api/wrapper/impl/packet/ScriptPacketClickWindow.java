/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.r;

public class ScriptPacketClickWindow
extends ScriptPacket<r> {
    public ScriptPacketClickWindow(r r2) {
        super(r2);
    }

    public int getWindowId() {
        return ((r)this.wrapped).getWindowId();
    }

    public int getSlotId() {
        return ((r)this.wrapped).getSlotId();
    }

    public int getUsedButton() {
        return ((r)this.wrapped).getUsedButton();
    }

    public short getActionNumber() {
        return ((r)this.wrapped).getActionNumber();
    }

    public int getMode() {
        return ((r)this.wrapped).getMode();
    }
}

