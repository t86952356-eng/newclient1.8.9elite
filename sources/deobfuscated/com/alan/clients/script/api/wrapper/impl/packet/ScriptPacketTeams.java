/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.br;

public class ScriptPacketTeams
extends ScriptPacket<br> {
    public ScriptPacketTeams(br br2) {
        super(br2);
    }

    public String getName() {
        return ((br)this.wrapped).aid();
    }

    public String getDisplayName() {
        return ((br)this.wrapped).aie();
    }

    public String getPrefix() {
        return ((br)this.wrapped).aif();
    }

    public String getSuffix() {
        return ((br)this.wrapped).aig();
    }

    public int getAction() {
        return ((br)this.wrapped).aii();
    }

    public int getPlayerCount() {
        return ((br)this.wrapped).aih() != null ? ((br)this.wrapped).aih().size() : 0;
    }

    public int getFriendlyFireMode() {
        return ((br)this.wrapped).aij();
    }
}

