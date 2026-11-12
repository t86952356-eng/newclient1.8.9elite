/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.s;

public class ScriptPacketTransaction
extends ScriptPacket<s> {
    public ScriptPacketTransaction(s s2) {
        super(s2);
    }

    public int getWindowId() {
        return ((s)this.wrapped).getWindowId();
    }

    public short getUid() {
        return ((s)this.wrapped).getUid();
    }

    public void setWindowId(int n2) {
        ((s)this.wrapped).setWindowId(n2);
    }

    public void setUid(short s2) {
        ((s)this.wrapped).setUid(s2);
    }

    public void setAccepted(boolean bl2) {
        ((s)this.wrapped).setAccepted(bl2);
    }
}

