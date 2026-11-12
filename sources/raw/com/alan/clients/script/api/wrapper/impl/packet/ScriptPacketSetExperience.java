/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ag;

public class ScriptPacketSetExperience
extends ScriptPacket<ag> {
    public ScriptPacketSetExperience(ag ag2) {
        super(ag2);
    }

    public float getExperienceBar() {
        return ((ag)this.wrapped).aha();
    }

    public int getLevel() {
        return ((ag)this.wrapped).getLevel();
    }

    public int getTotalExperience() {
        return ((ag)this.wrapped).getTotalExperience();
    }
}

