/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.as;

public class ScriptPacketEffect
extends ScriptPacket<as> {
    public ScriptPacketEffect(as as2) {
        super(as2);
    }

    public int getSoundType() {
        return ((as)this.wrapped).getSoundType();
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((as)this.wrapped).ahq());
    }

    public int getSoundData() {
        return ((as)this.wrapped).getSoundData();
    }

    public boolean isSoundServerwide() {
        return ((as)this.wrapped).isSoundServerwide();
    }
}

