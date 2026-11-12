/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bb;

public class ScriptPacketWindowProperty
extends ScriptPacket<bb> {
    public ScriptPacketWindowProperty(bb bb2) {
        super(bb2);
    }

    public int getWindowId() {
        return ((bb)this.wrapped).getWindowId();
    }

    public int getPropertyIndex() {
        return ((bb)this.wrapped).ahH();
    }

    public int getPropertyValue() {
        return ((bb)this.wrapped).ahI();
    }
}

