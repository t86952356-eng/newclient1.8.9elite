/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ax;

public class ScriptPacketOpenWindow
extends ScriptPacket<ax> {
    public ScriptPacketOpenWindow(ax ax2) {
        super(ax2);
    }

    public int getWindowId() {
        return ((ax)this.wrapped).getWindowId();
    }

    public String getGuiId() {
        return ((ax)this.wrapped).getGuiId();
    }

    public String getWindowTitle() {
        return ((ax)this.wrapped).ahB() != null ? ((ax)this.wrapped).ahB().arq() : "";
    }

    public int getSlotCount() {
        return ((ax)this.wrapped).getSlotCount();
    }

    public boolean hasSlots() {
        return ((ax)this.wrapped).hasSlots();
    }
}

