/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bd;
import net.minecraft.util.ba;

public class ScriptPacketServerUpdateSign
extends ScriptPacket<bd> {
    public ScriptPacketServerUpdateSign(bd bd2) {
        super(bd2);
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((bd)this.wrapped).Ab());
    }

    public String getLine(int n2) {
        ba[] baArray = ((bd)this.wrapped).age();
        return n2 >= 0 && n2 < baArray.length ? baArray[n2].arq() : "";
    }
}

