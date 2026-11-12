/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.v;
import net.minecraft.util.ba;

public class ScriptPacketUpdateSign
extends ScriptPacket<v> {
    public ScriptPacketUpdateSign(v v2) {
        super(v2);
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((v)this.wrapped).yl());
    }

    public String getLine(int n2) {
        ba[] baArray = ((v)this.wrapped).age();
        return n2 >= 0 && n2 < baArray.length ? baArray[n2].arq() : "";
    }
}

