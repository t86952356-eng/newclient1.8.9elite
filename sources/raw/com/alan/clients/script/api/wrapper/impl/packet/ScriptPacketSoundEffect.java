/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.at;

public class ScriptPacketSoundEffect
extends ScriptPacket<at> {
    public ScriptPacketSoundEffect(at at2) {
        super(at2);
    }

    public String getSoundName() {
        return ((at)this.wrapped).getSoundName();
    }

    public double getX() {
        return ((at)this.wrapped).getX();
    }

    public double getY() {
        return ((at)this.wrapped).getY();
    }

    public double getZ() {
        return ((at)this.wrapped).getZ();
    }

    public float getVolume() {
        return ((at)this.wrapped).getVolume();
    }

    public float getPitch() {
        return ((at)this.wrapped).getPitch();
    }
}

