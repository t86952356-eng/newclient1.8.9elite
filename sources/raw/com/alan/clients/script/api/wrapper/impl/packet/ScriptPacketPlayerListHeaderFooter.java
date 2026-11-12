/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.cd;

public class ScriptPacketPlayerListHeaderFooter
extends ScriptPacket<cd> {
    public ScriptPacketPlayerListHeaderFooter(cd cd2) {
        super(cd2);
    }

    public String getHeader() {
        return ((cd)this.wrapped).aiu() != null ? ((cd)this.wrapped).aiu().arq() : "";
    }

    public String getFooter() {
        return ((cd)this.wrapped).aiv() != null ? ((cd)this.wrapped).aiv().arq() : "";
    }
}

