/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import java.lang.reflect.Field;
import net.minecraft.network.play.client.l;

public class ScriptPacketHeldItem
extends ScriptPacket<l> {
    public ScriptPacketHeldItem(l l2) {
        super(l2);
    }

    public int getSlotId() {
        return ((l)this.wrapped).getSlotId();
    }

    public void setSlotId(int n2) {
        try {
            Field field = ((l)this.wrapped).getClass().getDeclaredField("slotId");
            field.setAccessible(true);
            field.setInt(this.wrapped, n2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

