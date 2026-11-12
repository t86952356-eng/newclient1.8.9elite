/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.bg;

public class ScriptPacketSignEditorOpen
extends ScriptPacket<bg> {
    public ScriptPacketSignEditorOpen(bg bg2) {
        super(bg2);
    }

    public ScriptBlockPos getSignPosition() {
        return new ScriptBlockPos(((bg)this.wrapped).ahL());
    }
}

