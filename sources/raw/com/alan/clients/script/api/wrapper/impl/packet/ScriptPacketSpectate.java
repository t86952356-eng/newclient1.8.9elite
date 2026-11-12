/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import java.lang.reflect.Field;
import net.minecraft.network.play.client.ac;

public class ScriptPacketSpectate
extends ScriptPacket<ac> {
    public ScriptPacketSpectate(ac ac2) {
        super(ac2);
    }

    public String getEntityUUID() {
        try {
            Field field = ((ac)this.wrapped).getClass().getDeclaredField("id");
            field.setAccessible(true);
            Object object = field.get(this.wrapped);
            return object != null ? object.toString() : "";
        }
        catch (Exception exception) {
            return "";
        }
    }
}

