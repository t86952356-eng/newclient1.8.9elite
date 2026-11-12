/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ao;

public class ScriptPacketBlockAction
extends ScriptPacket<ao> {
    public ScriptPacketBlockAction(ao ao2) {
        super(ao2);
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((ao)this.wrapped).ahk());
    }

    public int getData1() {
        return ((ao)this.wrapped).getData1();
    }

    public int getData2() {
        return ((ao)this.wrapped).getData2();
    }
}

