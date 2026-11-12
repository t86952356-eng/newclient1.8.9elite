/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bm;

public class ScriptPacketServerTabComplete
extends ScriptPacket<bm> {
    public ScriptPacketServerTabComplete(bm bm2) {
        super(bm2);
    }

    public int getMatchCount() {
        return ((bm)this.wrapped).ahR() != null ? ((bm)this.wrapped).ahR().length : 0;
    }

    public String getMatch(int n2) {
        String[] stringArray = ((bm)this.wrapped).ahR();
        return stringArray != null && n2 >= 0 && n2 < stringArray.length ? stringArray[n2] : "";
    }
}

