/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import java.lang.reflect.Field;
import net.minecraft.network.play.server.ab;

public class ScriptPacketEntityStatus
extends ScriptPacket<ab> {
    public ScriptPacketEntityStatus(ab ab2) {
        super(ab2);
    }

    public int getEntityId() {
        try {
            Field field = ((ab)this.wrapped).getClass().getDeclaredField("entityId");
            field.setAccessible(true);
            return field.getInt(this.wrapped);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public byte getOpCode() {
        return ((ab)this.wrapped).getOpCode();
    }
}

