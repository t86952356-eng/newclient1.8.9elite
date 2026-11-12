/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.ca;

public class ScriptPacketTitle
extends ScriptPacket<ca> {
    public ScriptPacketTitle(ca ca2) {
        super(ca2);
    }

    @Override
    public String getType() {
        return ((ca)this.wrapped).aip() != null ? ((ca)this.wrapped).aip().name() : "";
    }

    public String getMessage() {
        return ((ca)this.wrapped).aiq() != null ? ((ca)this.wrapped).aiq().arq() : "";
    }

    public int getFadeInTime() {
        return ((ca)this.wrapped).getFadeInTime();
    }

    public int getDisplayTime() {
        return ((ca)this.wrapped).getDisplayTime();
    }

    public int getFadeOutTime() {
        return ((ca)this.wrapped).getFadeOutTime();
    }
}

