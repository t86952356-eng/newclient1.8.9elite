/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.c;

public class ScriptPacketChat
extends ScriptPacket<c> {
    public ScriptPacketChat(c c2) {
        super(c2);
    }

    public String getText() {
        return ((c)this.wrapped).DM().arq();
    }

    public String getFormattedText() {
        return ((c)this.wrapped).DM().getFormattedText();
    }

    public byte getChatType() {
        return ((c)this.wrapped).ago();
    }

    public boolean isChat() {
        return ((c)this.wrapped).isChat();
    }
}

